package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the oci_acta_personas_doc_entrada database table.
 * 
 */
// @Entity
// @Table(name="oci_acta_personas_doc_entrada")
@NamedQuery(name="OciActaPersonasDocEntrada.findAll", query="SELECT o FROM OciActaPersonasDocEntrada o")
public class OciActaPersonasDocEntrada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ode_code")
	private int odeCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="doc_storage")
	private String docStorage;

	@Column(name="oac_code")
	private int oacCode;

	@Column(name="oae_code")
	private int oaeCode;

	@Column(name="ode_observacion")
	private String odeObservacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ode_tstamp")
	private Date odeTstamp;

	@Column(name="ope_code")
	private int opeCode;

	@Column(name="use_code")
	private String useCode;

	public OciActaPersonasDocEntrada() {
	}

	public int getOdeCode() {
		return this.odeCode;
	}

	public void setOdeCode(int odeCode) {
		this.odeCode = odeCode;
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

	public int getOaeCode() {
		return this.oaeCode;
	}

	public void setOaeCode(int oaeCode) {
		this.oaeCode = oaeCode;
	}

	public String getOdeObservacion() {
		return this.odeObservacion;
	}

	public void setOdeObservacion(String odeObservacion) {
		this.odeObservacion = odeObservacion;
	}

	public Date getOdeTstamp() {
		return this.odeTstamp;
	}

	public void setOdeTstamp(Date odeTstamp) {
		this.odeTstamp = odeTstamp;
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