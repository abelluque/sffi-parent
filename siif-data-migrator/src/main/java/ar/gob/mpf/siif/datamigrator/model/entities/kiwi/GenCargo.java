package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_cargos database table.
 * 
 */
// @Entity
// @Table(name="gen_cargos")
@NamedQuery(name="GenCargo.findAll", query="SELECT g FROM GenCargo g")
public class GenCargo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="gca_cargo")
	private int gcaCargo;

	@Column(name="gca_code")
	private int gcaCode;

	@Column(name="gca_nivel")
	private int gcaNivel;

	@Column(name="gca_status")
	private int gcaStatus;

	public GenCargo() {
	}

	public int getGcaCargo() {
		return this.gcaCargo;
	}

	public void setGcaCargo(int gcaCargo) {
		this.gcaCargo = gcaCargo;
	}

	public int getGcaCode() {
		return this.gcaCode;
	}

	public void setGcaCode(int gcaCode) {
		this.gcaCode = gcaCode;
	}

	public int getGcaNivel() {
		return this.gcaNivel;
	}

	public void setGcaNivel(int gcaNivel) {
		this.gcaNivel = gcaNivel;
	}

	public int getGcaStatus() {
		return this.gcaStatus;
	}

	public void setGcaStatus(int gcaStatus) {
		this.gcaStatus = gcaStatus;
	}

}