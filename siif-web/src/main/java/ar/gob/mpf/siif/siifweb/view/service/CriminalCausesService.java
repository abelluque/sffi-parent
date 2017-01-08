package ar.gob.mpf.siif.siifweb.view.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.apache.commons.lang.RandomStringUtils;

import ar.gob.mpf.commons.model.entities.Actuacion;
import ar.gob.mpf.commons.model.entities.Causa;
import ar.gob.mpf.commons.model.entities.Denuncia;
import ar.gob.mpf.commons.model.entities.Imputado;
import ar.gob.mpf.commons.model.entities.Testigo;


@ManagedBean(name = "causesService")
@ApplicationScoped
public class CriminalCausesService {

	public List<Causa> createCauses(int size) {
		List<Causa> list = new ArrayList<Causa>();
		for (int i = 0; i < size; i++) {
			list.add(this.createCausa());
		}

		return list;
	}

	private Causa createCausa() {
		return new Causa(this.getNroCausa(), this.createDenuncia(), this.createImputados(),
				this.createTestigos(), this.createActuaciones());
	}

	private List<Actuacion> createActuaciones() {
		List<Actuacion> actuaciones = new ArrayList<Actuacion>();
		Actuacion actuacion = new Actuacion();
//		actuacion.setTipoActuacion("Pericia de " + this.getNombresRamdon());
		actuaciones.add(actuacion);
		
		return actuaciones;
	}

	/***
	 * Datos Mocks para DEMO
	 */

	/**
	 * Random de nro de causa
	 * 
	 * @return
	 */
	private Long getNroCausa() {
		Random random = new Random();
		return random.nextLong();
	}

	private String getNombresRamdon() {
		return RandomStringUtils.randomAlphanumeric(8);
	}

	private List<Imputado> createImputados() {
		List<Imputado> imputados = new ArrayList<Imputado>();
		Imputado imputado = new Imputado();
		imputado.setNombreImputado("Perez " + this.getNombresRamdon());
		
		Imputado imputado2 = new Imputado();
		imputado2.setNombreImputado("Gonzalez " + this.getNombresRamdon());
		
		Imputado imputado3 = new Imputado();
		imputado3.setNombreImputado("Rodriguez " + this.getNombresRamdon());
		
		imputados.add(imputado);
		imputados.add(imputado2);
		imputados.add(imputado3);
		
		return imputados;
	}

	private List<Denuncia> createDenuncia() {
		List<Denuncia> denuncias = new ArrayList<Denuncia>();
		Denuncia denuncia = new Denuncia();
		denuncia.setDelito("Robo de " + this.getNombresRamdon());
		denuncia.setDescripcion("El hecho ocurrio cuando " + this.getNombresRamdon());
		denuncias.add(denuncia);

		return denuncias;
	}

	private List<Testigo> createTestigos() {
		List<Testigo> testigos = new ArrayList<Testigo>();
		Testigo testigo = new Testigo();
		testigo.setNombreTestigo("Ramirez " + this.getNombresRamdon());
		testigos.add(testigo);

		return testigos;
	}
}
