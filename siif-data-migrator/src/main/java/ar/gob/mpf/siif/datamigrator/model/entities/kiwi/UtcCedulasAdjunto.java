package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the utc_cedulas_adjuntos database table.
 * 
 */
// @Entity
// @Table(name="utc_cedulas_adjuntos")
@NamedQuery(name="UtcCedulasAdjunto.findAll", query="SELECT u FROM UtcCedulasAdjunto u")
public class UtcCedulasAdjunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cad_code")
	private int cadCode;

	@Column(name="cad_archivo")
	private String cadArchivo;

	@Column(name="cad_observacion")
	private String cadObservacion;

	@Column(name="cad_tipo")
	private String cadTipo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cad_tstamp")
	private Date cadTstamp;

	@Column(name="ced_code")
	private int cedCode;

	@Column(name="use_code")
	private String useCode;

	public UtcCedulasAdjunto() {
	}

	public int getCadCode() {
		return this.cadCode;
	}

	public void setCadCode(int cadCode) {
		this.cadCode = cadCode;
	}

	public String getCadArchivo() {
		return this.cadArchivo;
	}

	public void setCadArchivo(String cadArchivo) {
		this.cadArchivo = cadArchivo;
	}

	public String getCadObservacion() {
		return this.cadObservacion;
	}

	public void setCadObservacion(String cadObservacion) {
		this.cadObservacion = cadObservacion;
	}

	public String getCadTipo() {
		return this.cadTipo;
	}

	public void setCadTipo(String cadTipo) {
		this.cadTipo = cadTipo;
	}

	public Date getCadTstamp() {
		return this.cadTstamp;
	}

	public void setCadTstamp(Date cadTstamp) {
		this.cadTstamp = cadTstamp;
	}

	public int getCedCode() {
		return this.cedCode;
	}

	public void setCedCode(int cedCode) {
		this.cedCode = cedCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}