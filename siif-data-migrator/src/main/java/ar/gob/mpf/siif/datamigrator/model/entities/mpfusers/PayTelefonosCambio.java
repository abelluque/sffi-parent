package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pay_telefonos_cambios database table.
 * 
 */
// @Entity
// @Table(name="pay_telefonos_cambios")
@NamedQuery(name="PayTelefonosCambio.findAll", query="SELECT p FROM PayTelefonosCambio p")
public class PayTelefonosCambio implements Serializable {
	private static final long serialVersionUID = 1L;

	private String celular;

	private String legajo;

	private String telefono;

	public PayTelefonosCambio() {
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getLegajo() {
		return this.legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}