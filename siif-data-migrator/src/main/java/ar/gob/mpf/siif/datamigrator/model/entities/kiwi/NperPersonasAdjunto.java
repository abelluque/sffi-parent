package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the nper_personas_adjuntos database table.
 * 
 */
// @Entity
// @Table(name="nper_personas_adjuntos")
@NamedQuery(name="NperPersonasAdjunto.findAll", query="SELECT n FROM NperPersonasAdjunto n")
public class NperPersonasAdjunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pad_code")
	private int padCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="doc_storage")
	private String docStorage;

	@Column(name="pad_deleted")
	private String padDeleted;

	@Column(name="pad_obser")
	private String padObser;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pad_tstamp")
	private Date padTstamp;

	@Column(name="per_code")
	private int perCode;

	@Column(name="pta_code")
	private int ptaCode;

	@Column(name="use_code")
	private String useCode;

	public NperPersonasAdjunto() {
	}

	public int getPadCode() {
		return this.padCode;
	}

	public void setPadCode(int padCode) {
		this.padCode = padCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getDocStorage() {
		return this.docStorage;
	}

	public void setDocStorage(String docStorage) {
		this.docStorage = docStorage;
	}

	public String getPadDeleted() {
		return this.padDeleted;
	}

	public void setPadDeleted(String padDeleted) {
		this.padDeleted = padDeleted;
	}

	public String getPadObser() {
		return this.padObser;
	}

	public void setPadObser(String padObser) {
		this.padObser = padObser;
	}

	public Date getPadTstamp() {
		return this.padTstamp;
	}

	public void setPadTstamp(Date padTstamp) {
		this.padTstamp = padTstamp;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public int getPtaCode() {
		return this.ptaCode;
	}

	public void setPtaCode(int ptaCode) {
		this.ptaCode = ptaCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}