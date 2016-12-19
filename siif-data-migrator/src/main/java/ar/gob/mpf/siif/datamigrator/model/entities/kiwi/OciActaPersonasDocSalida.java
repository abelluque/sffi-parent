package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the oci_acta_personas_doc_salida database table.
 * 
 */
// @Entity
// @Table(name="oci_acta_personas_doc_salida")
@NamedQuery(name="OciActaPersonasDocSalida.findAll", query="SELECT o FROM OciActaPersonasDocSalida o")
public class OciActaPersonasDocSalida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ods_code")
	private int odsCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="doc_storage")
	private String docStorage;

	@Column(name="oac_code")
	private int oacCode;

	@Column(name="oas_code")
	private int oasCode;

	@Column(name="ods_observacion")
	private String odsObservacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ods_tstamp")
	private Date odsTstamp;

	@Column(name="ope_code")
	private int opeCode;

	@Column(name="use_code")
	private String useCode;

	public OciActaPersonasDocSalida() {
	}

	public int getOdsCode() {
		return this.odsCode;
	}

	public void setOdsCode(int odsCode) {
		this.odsCode = odsCode;
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

	public int getOacCode() {
		return this.oacCode;
	}

	public void setOacCode(int oacCode) {
		this.oacCode = oacCode;
	}

	public int getOasCode() {
		return this.oasCode;
	}

	public void setOasCode(int oasCode) {
		this.oasCode = oasCode;
	}

	public String getOdsObservacion() {
		return this.odsObservacion;
	}

	public void setOdsObservacion(String odsObservacion) {
		this.odsObservacion = odsObservacion;
	}

	public Date getOdsTstamp() {
		return this.odsTstamp;
	}

	public void setOdsTstamp(Date odsTstamp) {
		this.odsTstamp = odsTstamp;
	}

	public int getOpeCode() {
		return this.opeCode;
	}

	public void setOpeCode(int opeCode) {
		this.opeCode = opeCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}