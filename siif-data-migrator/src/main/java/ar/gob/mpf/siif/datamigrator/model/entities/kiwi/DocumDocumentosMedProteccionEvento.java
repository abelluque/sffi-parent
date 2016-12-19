package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_documentos_med_proteccion_eventos database table.
 * 
 */
// @Entity
// @Table(name="docum_documentos_med_proteccion_eventos")
@NamedQuery(name="DocumDocumentosMedProteccionEvento.findAll", query="SELECT d FROM DocumDocumentosMedProteccionEvento d")
public class DocumDocumentosMedProteccionEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dmpev_code")
	private int dmpevCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="dmp_code")
	private int dmpCode;

	@Column(name="dmp_estado")
	private String dmpEstado;

	@Column(name="dmp_fundamentacion")
	private String dmpFundamentacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dmpev_tstamp")
	private Date dmpevTstamp;

	@Column(name="use_code")
	private String useCode;

	public DocumDocumentosMedProteccionEvento() {
	}

	public int getDmpevCode() {
		return this.dmpevCode;
	}

	public void setDmpevCode(int dmpevCode) {
		this.dmpevCode = dmpevCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getDmpCode() {
		return this.dmpCode;
	}

	public void setDmpCode(int dmpCode) {
		this.dmpCode = dmpCode;
	}

	public String getDmpEstado() {
		return this.dmpEstado;
	}

	public void setDmpEstado(String dmpEstado) {
		this.dmpEstado = dmpEstado;
	}

	public String getDmpFundamentacion() {
		return this.dmpFundamentacion;
	}

	public void setDmpFundamentacion(String dmpFundamentacion) {
		this.dmpFundamentacion = dmpFundamentacion;
	}

	public Date getDmpevTstamp() {
		return this.dmpevTstamp;
	}

	public void setDmpevTstamp(Date dmpevTstamp) {
		this.dmpevTstamp = dmpevTstamp;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}