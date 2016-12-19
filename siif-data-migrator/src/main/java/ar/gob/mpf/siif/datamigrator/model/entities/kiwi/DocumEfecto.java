package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_efectos database table.
 * 
 */
// @Entity
// @Table(name="docum_efectos")
@NamedQuery(name="DocumEfecto.findAll", query="SELECT d FROM DocumEfecto d")
public class DocumEfecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="def_code")
	private int defCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="def_dependencia_actual")
	private int defDependenciaActual;

	@Column(name="def_dependencia_entrada")
	private int defDependenciaEntrada;

	@Lob
	@Column(name="def_fotografias")
	private String defFotografias;

	@Lob
	@Column(name="def_observacion")
	private String defObservacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="def_tstamp")
	private Date defTstamp;

	@Column(name="der_code")
	private int derCode;

	@Column(name="doc_id")
	private String docId;

	@Column(name="dte_code")
	private int dteCode;

	@Column(name="use_code")
	private String useCode;

	public DocumEfecto() {
	}

	public int getDefCode() {
		return this.defCode;
	}

	public void setDefCode(int defCode) {
		this.defCode = defCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getDefDependenciaActual() {
		return this.defDependenciaActual;
	}

	public void setDefDependenciaActual(int defDependenciaActual) {
		this.defDependenciaActual = defDependenciaActual;
	}

	public int getDefDependenciaEntrada() {
		return this.defDependenciaEntrada;
	}

	public void setDefDependenciaEntrada(int defDependenciaEntrada) {
		this.defDependenciaEntrada = defDependenciaEntrada;
	}

	public String getDefFotografias() {
		return this.defFotografias;
	}

	public void setDefFotografias(String defFotografias) {
		this.defFotografias = defFotografias;
	}

	public String getDefObservacion() {
		return this.defObservacion;
	}

	public void setDefObservacion(String defObservacion) {
		this.defObservacion = defObservacion;
	}

	public Date getDefTstamp() {
		return this.defTstamp;
	}

	public void setDefTstamp(Date defTstamp) {
		this.defTstamp = defTstamp;
	}

	public int getDerCode() {
		return this.derCode;
	}

	public void setDerCode(int derCode) {
		this.derCode = derCode;
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public int getDteCode() {
		return this.dteCode;
	}

	public void setDteCode(int dteCode) {
		this.dteCode = dteCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}