package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ocmarc_turnos_temporal database table.
 * 
 */
// @Entity
// @Table(name="ocmarc_turnos_temporal")
@NamedQuery(name="OcmarcTurnosTemporal.findAll", query="SELECT o FROM OcmarcTurnosTemporal o")
public class OcmarcTurnosTemporal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="otu_code")
	private int otuCode;

	@Column(name="oca_code")
	private int ocaCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ott_tstamp")
	private Date ottTstamp;

	@Column(name="use_code")
	private String useCode;

	public OcmarcTurnosTemporal() {
	}

	public int getOtuCode() {
		return this.otuCode;
	}

	public void setOtuCode(int otuCode) {
		this.otuCode = otuCode;
	}

	public int getOcaCode() {
		return this.ocaCode;
	}

	public void setOcaCode(int ocaCode) {
		this.ocaCode = ocaCode;
	}

	public Date getOttTstamp() {
		return this.ottTstamp;
	}

	public void setOttTstamp(Date ottTstamp) {
		this.ottTstamp = ottTstamp;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}