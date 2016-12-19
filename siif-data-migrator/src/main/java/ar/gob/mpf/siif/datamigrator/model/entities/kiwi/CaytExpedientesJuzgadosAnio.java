package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cayt_expedientes_juzgados_anio database table.
 * 
 */
// @Entity
// @Table(name="cayt_expedientes_juzgados_anio")
@NamedQuery(name="CaytExpedientesJuzgadosAnio.findAll", query="SELECT c FROM CaytExpedientesJuzgadosAnio c")
public class CaytExpedientesJuzgadosAnio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cea_anio")
	private int ceaAnio;

	@Column(name="cea_cantidad")
	private int ceaCantidad;

	public CaytExpedientesJuzgadosAnio() {
	}

	public int getCeaAnio() {
		return this.ceaAnio;
	}

	public void setCeaAnio(int ceaAnio) {
		this.ceaAnio = ceaAnio;
	}

	public int getCeaCantidad() {
		return this.ceaCantidad;
	}

	public void setCeaCantidad(int ceaCantidad) {
		this.ceaCantidad = ceaCantidad;
	}

}