package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the org_centro_costos database table.
 * 
 */
// @Entity
// @Table(name="org_centro_costos")
@NamedQuery(name="OrgCentroCosto.findAll", query="SELECT o FROM OrgCentroCosto o")
public class OrgCentroCosto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="occ_centro_costo")
	private int occCentroCosto;

	@Column(name="occ_codigo")
	private int occCodigo;

	@Column(name="occ_payroll")
	private int occPayroll;

	@Column(name="occ_tmstamp")
	private int occTmstamp;

	public OrgCentroCosto() {
	}

	public int getOccCentroCosto() {
		return this.occCentroCosto;
	}

	public void setOccCentroCosto(int occCentroCosto) {
		this.occCentroCosto = occCentroCosto;
	}

	public int getOccCodigo() {
		return this.occCodigo;
	}

	public void setOccCodigo(int occCodigo) {
		this.occCodigo = occCodigo;
	}

	public int getOccPayroll() {
		return this.occPayroll;
	}

	public void setOccPayroll(int occPayroll) {
		this.occPayroll = occPayroll;
	}

	public int getOccTmstamp() {
		return this.occTmstamp;
	}

	public void setOccTmstamp(int occTmstamp) {
		this.occTmstamp = occTmstamp;
	}

}