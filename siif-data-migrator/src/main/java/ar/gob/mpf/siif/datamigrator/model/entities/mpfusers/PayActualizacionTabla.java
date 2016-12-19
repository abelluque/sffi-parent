package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the pay_actualizacion_tablas database table.
 * 
 */
// @Entity
// @Table(name="pay_actualizacion_tablas")
@NamedQuery(name="PayActualizacionTabla.findAll", query="SELECT p FROM PayActualizacionTabla p")
public class PayActualizacionTabla implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="fecha_actualizacion")
	private Timestamp fechaActualizacion;

	private String tabla;

	public PayActualizacionTabla() {
	}

	public Timestamp getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(Timestamp fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public String getTabla() {
		return this.tabla;
	}

	public void setTabla(String tabla) {
		this.tabla = tabla;
	}

}