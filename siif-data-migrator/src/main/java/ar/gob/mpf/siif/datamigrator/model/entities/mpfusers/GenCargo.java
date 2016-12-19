package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

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

	@Id
	@Column(name="gca_code")
	private int gcaCode;

	@Column(name="gca_cargo")
	private String gcaCargo;

	@Column(name="gca_nivel")
	private int gcaNivel;

	@Column(name="gca_status")
	private String gcaStatus;

	public GenCargo() {
	}

	public int getGcaCode() {
		return this.gcaCode;
	}

	public void setGcaCode(int gcaCode) {
		this.gcaCode = gcaCode;
	}

	public String getGcaCargo() {
		return this.gcaCargo;
	}

	public void setGcaCargo(String gcaCargo) {
		this.gcaCargo = gcaCargo;
	}

	public int getGcaNivel() {
		return this.gcaNivel;
	}

	public void setGcaNivel(int gcaNivel) {
		this.gcaNivel = gcaNivel;
	}

	public String getGcaStatus() {
		return this.gcaStatus;
	}

	public void setGcaStatus(String gcaStatus) {
		this.gcaStatus = gcaStatus;
	}

}