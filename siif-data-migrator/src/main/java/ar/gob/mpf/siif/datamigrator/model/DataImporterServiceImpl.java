package ar.gob.mpf.siif.datamigrator.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional("siifTrxManager")
@Component
public class DataImporterServiceImpl {

	@PersistenceContext(unitName = "siif-pu")
	private EntityManager siifEntityManager;
	
	@PersistenceContext(unitName = "mpfUsers-pu")
	private EntityManager mpfUsersEntityManager;

	private List<DataImport> dataToPersist;
//	private Type jsonTokenPedidoResultadoMotivos;

	public final String DB_NAME_MPF_USERS = "mpfusers";
	public final String DB_NAME_KIWI = "kiwi";
	
	private Map<String, String> mpfUsersMappedClasses;
	private Map<String, String> kiwiMappedClasses;

	public DataImporterServiceImpl() {
		
		initMappedClasses();
	}

	/**
	 * Inicializa los Maps que contienen el mapeo de las tablas/classes.
	 */
	private void initMappedClasses() {

		mpfUsersMappedClasses = new HashMap<String, String>();
		mpfUsersMappedClasses.put("aux_apellidos", "AuxApellido");
		mpfUsersMappedClasses.put("aux_nombres_fem", "AuxNombresFem");
		mpfUsersMappedClasses.put("cat_value_list", "CatValueList");
		mpfUsersMappedClasses.put("avi_servers", "AviServer");
		
		kiwiMappedClasses = new HashMap<String, String>();
		kiwiMappedClasses.put("cat_value_list", "CatValueList");
		
	}

	@SuppressWarnings("unchecked")
	public List<Object[]> findAllDbTables(String dbName) {
		List<Object[]> tableList = new ArrayList<>();

		if (dbName != null) {
			tableList.addAll(siifEntityManager.createNativeQuery("SHOW FULL TABLES FROM " + dbName).getResultList());

		} else {
			System.err.println("\t -> NO SE ESPECIFIC� EL NOMBRE DE LA BASE DE DATOS!!");
		}

		return tableList;
	}

	@SuppressWarnings("unchecked")
	public void importTableData(String dbName, String tableName) {

		String fullTableName = new String(dbName + "." + tableName);
		System.out.println("Import data de: " + fullTableName);

		// ESTO PARA MAS ADELANTE, IMPORTAR SOLO LO QUE NO SE IMPORT� A�N,
		// BUSCANDO POR �LTIMA PK IMPORTADA.
		// Para obtener la PK, (Object[4]): "SHOW KEYS FROM
		// mpfusers.alm_almacenes WHERE Key_name = 'PRIMARY'"

		dataToPersist = new ArrayList<DataImport>();
		List<Object> rows = new ArrayList<Object>();
		
		
		// ESTO ES UNA PRUEBA INICIAL!!!
		// Usando NativeQuery, me retorna un Object (si la tabla tiene un solo campo) o Object[] (si la tabla tiene varios campos)
		// Debo reemplazar por �createQuery� usando la entidad Mapeada por Hibernate.
		
		//rows.addAll(em.createNativeQuery("SELECT * FROM " + fullTableName).getResultList());
		
		try {
			Class entityClass = getClassForTable(dbName, tableName);
			String query = new String("SELECT e FROM " + entityClass.getSimpleName() + " e ");
					
			rows.addAll(siifEntityManager.createQuery(query).getResultList());
			
			for (Object object : rows) {
				System.out.println(" Object ==>> " + object);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		// ESTO ES UNA PRUEBA INICIAL!!!		
		
		
		
		int registros = 0;
		for (Object row : rows) {

			// PRUEBA DE JSON
//			System.out.println("\t => " + row);
//			Object rowObject = createRowObject(dbName, tableName, row);

//			DataImport data = new DataImport(dbName, tableName, new Long(1), rowObject);
			DataImport data = new DataImport(dbName, tableName, new Long(1), row);

			// DESEREALIZACION DEL OBJETO JSON.
			// jsonTokenPedidoResultadoMotivos = new TypeToken<AuxApellido>(){}.getType();
			// new Gson().fromJson(filaEjemplo,
			// jsonTokenPedidoResultadoMotivos))

			System.out.println("\t row a persistir =>" + row.toString());
			dataToPersist.add(data);

			// if (row instanceof String) {
			// System.out.println("\t => " + row);
			//
			// DataImport data = new DataImport(dbName,tableName, new Long(1),
			// row.toString());
			// dataToPersist.add(data);
			//
			// } else if (row instanceof Object[]) {
			//
			// StringBuffer rowCSV = new StringBuffer();
			// Object[] rowObject = ((Object[]) row);
			//
			// int rowColumns = rowObject.length;
			//
			// for (int i = 0; i < rowColumns; i++) {
			// rowCSV.append(rowObject[i]).append(",");
			// }
			//
			// System.out.println("\t => " + rowCSV);
			// }

			registros++;
		}

		persistDataImported();

	}

	/**
	 * Crea el objeto que se va a persistir, en formato JSON. Para ello necesita obtener la clase que mapea a la tabla en cuestion.
	 * @param dbName
	 * @param tableName
	 * @param row
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	private Object createRowObject(String dbName, String tableName, Object row) {

		Object objetoCreado = null; 
		
		try {
			Class clazz = getClassForTable(dbName, tableName);
			
			Constructor[] constructores = clazz.getConstructors();
			for (Constructor constructor : constructores) {

				if (constructor.getParameterCount() == 1) {

					objetoCreado = constructor.newInstance(row);
					System.out.println("\tObjetoCreado = " + objetoCreado.toString());
				}
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (InstantiationException e) {
			e.printStackTrace();
			
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		return objetoCreado;
	}

	/**
	 * Obtiene la clase que mapea la tabla que se va a persistir.
	 * @param dbName
	 * @param tableName
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("rawtypes")
	private Class getClassForTable(String dbName, String tableName) throws ClassNotFoundException {
		
		String packageName = null;
		String className = null;

		if (DB_NAME_MPF_USERS.equals(dbName)) {
			packageName = "ar.com.stack.siif.datamigrator.model.entities.mpfusers.";
			className = mpfUsersMappedClasses.get(tableName);

		} else if (DB_NAME_KIWI.equals(dbName)) {
			packageName = "ar.com.stack.siif.datamigrator.model.entities.kiwi.";
			className = kiwiMappedClasses.get(tableName);
		}
		
		Class clazz = Class.forName(packageName + className);
		System.out.println("Se obtuvo la clase:" + packageName + className);
		return clazz;
	}

	/*
	 * Persiste en la BB.DD �siif� los datos recolectados.
	 */
	private void persistDataImported() {

		for (DataImport dataImport : dataToPersist) {
			siifEntityManager.persist(dataImport);

			System.out.println("Persistiendo... " + dataImport);
		}

	}

}