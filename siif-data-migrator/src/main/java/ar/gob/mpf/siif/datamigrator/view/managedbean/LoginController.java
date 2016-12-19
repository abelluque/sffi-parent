package ar.gob.mpf.siif.datamigrator.view.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.gob.mpf.siif.datamigrator.model.DataImporterServiceImpl;

/**
 * 
 * @author Abel Luque (a-b)
 *
 */

@ManagedBean
@ViewScoped
public class LoginController implements Serializable {

	private static final long serialVersionUID = 3973801993975443027L;

	private String userName;
	private String password;

	// DATA IMPORTER
	private ClassPathXmlApplicationContext appContext;
	private DataImporterServiceImpl dataImporter;

	private List<String> mpfusersTables = new ArrayList<>();
	private List<String> kiwiTables = new ArrayList<>();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String goToHome() {

		// TODO implemet login method
		return "succes";
	}

	public DataImporterServiceImpl getDataImporter() {
		return dataImporter;
	}

	public void setDataImporterDao(DataImporterServiceImpl dataImporterDao) {
		this.dataImporter = dataImporterDao;
	}

	/**
	 * Se conecta a la BB.DD 'SIIF' y levanta la data de la tabla de prueba
	 * 'Person'.
	 */
	public String importDbInfo() {

		appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		dataImporter = (DataImporterServiceImpl) appContext.getBean("dataImporterDao");

		importData("mpfusers");
		//importData("kiwi");

		return null; //"succes";
	}

	private void importData(String dataBaseName) {
		String dbName = dataBaseName;
		System.out.println("Obtengo las tablas de '" + dbName + "'...");
		List<Object[]> tablas = dataImporter.findAllDbTables(dbName);

		for (Object[] tablaDesc : tablas) {
			String tableName = (String) tablaDesc[0];
			mpfusersTables.add(tableName);
		}
		
		System.out.println("Listado de tablas encontradas para " + dbName);
		int i = 0;
		for (String mpfusersTable : mpfusersTables) {
			System.out.println(++i + ") " + mpfusersTable);
		}
		System.out.println("Total:   " + i + " tablas en '" + dbName + "'.");
	
		
//		SOLO PRUEBO CON LA TABLA �aux_apellidos� 
//		for (String tableName : mpfusersTables) {
//			dataImporter.importTableData(dbName, tableName);
//		}
		
		dataImporter.importTableData("mpfusers", "aux_apellidos");
		dataImporter.importTableData("mpfusers", "avi_servers");
		dataImporter.importTableData("mpfusers", "cat_value_list");
		
		
	}
}