package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pay_organigrama database table.
 * 
 */
// @Entity
// @Table(name="pay_organigrama")
@NamedQuery(name="PayOrganigrama.findAll", query="SELECT p FROM PayOrganigrama p")
public class PayOrganigrama implements Serializable {
	private static final long serialVersionUID = 1L;

	private String codres;

	private int depe;

	private String nivel;

	private int unidad;

	public PayOrganigrama() {
	}

	public String getCodres() {
		return this.codres;
	}

	public void setCodres(String codres) {
		this.codres = codres;
	}

	public int getDepe() {
		return this.depe;
	}

	public void setDepe(int depe) {
		this.depe = depe;
	}

	public String getNivel() {
		return this.nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getUnidad() {
		return this.unidad;
	}

	public void setUnidad(int unidad) {
		this.unidad = unidad;
	}

}