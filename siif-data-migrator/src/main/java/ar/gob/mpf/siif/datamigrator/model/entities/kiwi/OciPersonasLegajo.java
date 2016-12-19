package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the oci_personas_legajos database table.
 * 
 */
// @Entity
// @Table(name="oci_personas_legajos")
@NamedQuery(name="OciPersonasLegajo.findAll", query="SELECT o FROM OciPersonasLegajo o")
public class OciPersonasLegajo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="opl_code")
	private int oplCode;

	@Column(name="ope_code")
	private int opeCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="opl_fecha")
	private Date oplFecha;

	@Column(name="opl_legajo")
	private String oplLegajo;

	public OciPersonasLegajo() {
	}

	public int getOplCode() {
		return this.oplCode;
	}

	public void setOplCode(int oplCode) {
		this.oplCode = oplCode;
	}

	public int getOpeCode() {
		return this.opeCode;
	}

	public void setOpeCode(int opeCode) {
		this.opeCode = opeCode;
	}

	public Date getOplFecha() {
		return this.oplFecha;
	}

	public void setOplFecha(Date oplFecha) {
		this.oplFecha = oplFecha;
	}

	public String getOplLegajo() {
		return this.oplLegajo;
	}

	public void setOplLegajo(String oplLegajo) {
		this.oplLegajo = oplLegajo;
	}

}