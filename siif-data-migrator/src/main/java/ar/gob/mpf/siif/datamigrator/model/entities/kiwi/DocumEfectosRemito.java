package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_efectos_remitos database table.
 * 
 */
// @Entity
// @Table(name="docum_efectos_remitos")
@NamedQuery(name="DocumEfectosRemito.findAll", query="SELECT d FROM DocumEfectosRemito d")
public class DocumEfectosRemito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="der_code")
	private int derCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="der_dependencia_destino")
	private int derDependenciaDestino;

	@Column(name="der_dependencia_origen")
	private int derDependenciaOrigen;

	@Lob
	@Column(name="der_observacion")
	private String derObservacion;

	@Column(name="der_tipo")
	private String derTipo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="der_tstamp")
	private Date derTstamp;

	@Column(name="der_usuario_destino")
	private String derUsuarioDestino;

	@Column(name="der_usuario_origen")
	private String derUsuarioOrigen;

	@Column(name="doc_id")
	private String docId;

	@Column(name="use_code")
	private String useCode;

	@Column(name="utr_code")
	private int utrCode;

	public DocumEfectosRemito() {
	}

	public int getDerCode() {
		return this.derCode;
	}

	public void setDerCode(int derCode) {
		this.derCode = derCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getDerDependenciaDestino() {
		return this.derDependenciaDestino;
	}

	public void setDerDependenciaDestino(int derDependenciaDestino) {
		this.derDependenciaDestino = derDependenciaDestino;
	}

	public int getDerDependenciaOrigen() {
		return this.derDependenciaOrigen;
	}

	public void setDerDependenciaOrigen(int derDependenciaOrigen) {
		this.derDependenciaOrigen = derDependenciaOrigen;
	}

	public String getDerObservacion() {
		return this.derObservacion;
	}

	public void setDerObservacion(String derObservacion) {
		this.derObservacion = derObservacion;
	}

	public String getDerTipo() {
		return this.derTipo;
	}

	public void setDerTipo(String derTipo) {
		this.derTipo = derTipo;
	}

	public Date getDerTstamp() {
		return this.derTstamp;
	}

	public void setDerTstamp(Date derTstamp) {
		this.derTstamp = derTstamp;
	}

	public String getDerUsuarioDestino() {
		return this.derUsuarioDestino;
	}

	public void setDerUsuarioDestino(String derUsuarioDestino) {
		this.derUsuarioDestino = derUsuarioDestino;
	}

	public String getDerUsuarioOrigen() {
		return this.derUsuarioOrigen;
	}

	public void setDerUsuarioOrigen(String derUsuarioOrigen) {
		this.derUsuarioOrigen = derUsuarioOrigen;
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public int getUtrCode() {
		return this.utrCode;
	}

	public void setUtrCode(int utrCode) {
		this.utrCode = utrCode;
	}

}