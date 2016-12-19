package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the org_centro_costos database table.
 * 
 */
// @Entity
// @Table(name="org_centro_costos")
@NamedQuery(name="OrgCentroCosto.findAll", query="SELECT o FROM OrgCentroCosto o")
public class OrgCentroCosto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="occ_codigo")
	private int occCodigo;

	@Column(name="occ_centro_costo")
	private String occCentroCosto;

	@Column(name="occ_payroll")
	private int occPayroll;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="occ_tmstamp")
	private Date occTmstamp;

	public OrgCentroCosto() {
	}

	public int getOccCodigo() {
		return this.occCodigo;
	}

	public void setOccCodigo(int occCodigo) {
		this.occCodigo = occCodigo;
	}

	public String getOccCentroCosto() {
		return this.occCentroCosto;
	}

	public void setOccCentroCosto(String occCentroCosto) {
		this.occCentroCosto = occCentroCosto;
	}

	public int getOccPayroll() {
		return this.occPayroll;
	}

	public void setOccPayroll(int occPayroll) {
		this.occPayroll = occPayroll;
	}

	public Date getOccTmstamp() {
		return this.occTmstamp;
	}

	public void setOccTmstamp(Date occTmstamp) {
		this.occTmstamp = occTmstamp;
	}

}