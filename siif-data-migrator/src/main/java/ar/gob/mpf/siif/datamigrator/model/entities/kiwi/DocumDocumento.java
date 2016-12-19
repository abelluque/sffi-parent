package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_documentos database table.
 * 
 */
// @Entity
// @Table(name="docum_documentos")
@NamedQuery(name="DocumDocumento.findAll", query="SELECT d FROM DocumDocumento d")
public class DocumDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="doc_id")
	private String docId;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="desm_code")
	private int desmCode;

	@Column(name="dest_code")
	private int destCode;

	@Lob
	@Column(name="doc_categorias")
	private String docCategorias;

	@Column(name="doc_code")
	private int docCode;

	@Column(name="doc_en_juscaba")
	private String docEnJuscaba;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="doc_fecha")
	private Date docFecha;

	@Column(name="doc_nro_juscaba")
	private String docNroJuscaba;

	@Column(name="doc_padre")
	private String docPadre;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="doc_tstamp")
	private Date docTstamp;

	@Column(name="doc_ult_operador")
	private int docUltOperador;

	@Column(name="doc_vista")
	private String docVista;

	@Column(name="dtip_code")
	private String dtipCode;

	@Column(name="ultima_actividad_dependencia")
	private int ultimaActividadDependencia;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ultima_actividad_fecha")
	private Date ultimaActividadFecha;

	@Column(name="ultima_actividad_user")
	private String ultimaActividadUser;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ultimo_desarchivo")
	private Date ultimoDesarchivo;

	public DocumDocumento() {
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getDesmCode() {
		return this.desmCode;
	}

	public void setDesmCode(int desmCode) {
		this.desmCode = desmCode;
	}

	public int getDestCode() {
		return this.destCode;
	}

	public void setDestCode(int destCode) {
		this.destCode = destCode;
	}

	public String getDocCategorias() {
		return this.docCategorias;
	}

	public void setDocCategorias(String docCategorias) {
		this.docCategorias = docCategorias;
	}

	public int getDocCode() {
		return this.docCode;
	}

	public void setDocCode(int docCode) {
		this.docCode = docCode;
	}

	public String getDocEnJuscaba() {
		return this.docEnJuscaba;
	}

	public void setDocEnJuscaba(String docEnJuscaba) {
		this.docEnJuscaba = docEnJuscaba;
	}

	public Date getDocFecha() {
		return this.docFecha;
	}

	public void setDocFecha(Date docFecha) {
		this.docFecha = docFecha;
	}

	public String getDocNroJuscaba() {
		return this.docNroJuscaba;
	}

	public void setDocNroJuscaba(String docNroJuscaba) {
		this.docNroJuscaba = docNroJuscaba;
	}

	public String getDocPadre() {
		return this.docPadre;
	}

	public void setDocPadre(String docPadre) {
		this.docPadre = docPadre;
	}

	public Date getDocTstamp() {
		return this.docTstamp;
	}

	public void setDocTstamp(Date docTstamp) {
		this.docTstamp = docTstamp;
	}

	public int getDocUltOperador() {
		return this.docUltOperador;
	}

	public void setDocUltOperador(int docUltOperador) {
		this.docUltOperador = docUltOperador;
	}

	public String getDocVista() {
		return this.docVista;
	}

	public void setDocVista(String docVista) {
		this.docVista = docVista;
	}

	public String getDtipCode() {
		return this.dtipCode;
	}

	public void setDtipCode(String dtipCode) {
		this.dtipCode = dtipCode;
	}

	public int getUltimaActividadDependencia() {
		return this.ultimaActividadDependencia;
	}

	public void setUltimaActividadDependencia(int ultimaActividadDependencia) {
		this.ultimaActividadDependencia = ultimaActividadDependencia;
	}

	public Date getUltimaActividadFecha() {
		return this.ultimaActividadFecha;
	}

	public void setUltimaActividadFecha(Date ultimaActividadFecha) {
		this.ultimaActividadFecha = ultimaActividadFecha;
	}

	public String getUltimaActividadUser() {
		return this.ultimaActividadUser;
	}

	public void setUltimaActividadUser(String ultimaActividadUser) {
		this.ultimaActividadUser = ultimaActividadUser;
	}

	public Date getUltimoDesarchivo() {
		return this.ultimoDesarchivo;
	}

	public void setUltimoDesarchivo(Date ultimoDesarchivo) {
		this.ultimoDesarchivo = ultimoDesarchivo;
	}

}