package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_documentos_juscaba database table.
 * 
 */
// @Entity
// @Table(name="docum_documentos_juscaba")
@NamedQuery(name="DocumDocumentosJuscaba.findAll", query="SELECT d FROM DocumDocumentosJuscaba d")
public class DocumDocumentosJuscaba implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="doc_id")
	private String docId;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="ddj_anio_juscaba")
	private String ddjAnioJuscaba;

	@Column(name="ddj_caratula_juscaba")
	private String ddjCaratulaJuscaba;

	@Column(name="ddj_codigo_juscaba")
	private String ddjCodigoJuscaba;

	@Column(name="ddj_estado")
	private String ddjEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ddj_fecha")
	private Date ddjFecha;

	@Column(name="ddj_forma_id")
	private String ddjFormaId;

	@Column(name="ddj_id_juscaba")
	private int ddjIdJuscaba;

	@Column(name="ddj_intento")
	private int ddjIntento;

	@Column(name="ddj_juzgado")
	private String ddjJuzgado;

	@Column(name="ddj_mensaje_error")
	private String ddjMensajeError;

	@Column(name="ddj_mensaje_warning")
	private String ddjMensajeWarning;

	@Column(name="ddj_nro_juscaba")
	private String ddjNroJuscaba;

	@Column(name="ddj_puntaje")
	private String ddjPuntaje;

	@Lob
	@Column(name="ddj_resultado")
	private String ddjResultado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ddj_tstamp")
	private Date ddjTstamp;

	@Column(name="use_code")
	private String useCode;

	public DocumDocumentosJuscaba() {
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

	public String getDdjAnioJuscaba() {
		return this.ddjAnioJuscaba;
	}

	public void setDdjAnioJuscaba(String ddjAnioJuscaba) {
		this.ddjAnioJuscaba = ddjAnioJuscaba;
	}

	public String getDdjCaratulaJuscaba() {
		return this.ddjCaratulaJuscaba;
	}

	public void setDdjCaratulaJuscaba(String ddjCaratulaJuscaba) {
		this.ddjCaratulaJuscaba = ddjCaratulaJuscaba;
	}

	public String getDdjCodigoJuscaba() {
		return this.ddjCodigoJuscaba;
	}

	public void setDdjCodigoJuscaba(String ddjCodigoJuscaba) {
		this.ddjCodigoJuscaba = ddjCodigoJuscaba;
	}

	public String getDdjEstado() {
		return this.ddjEstado;
	}

	public void setDdjEstado(String ddjEstado) {
		this.ddjEstado = ddjEstado;
	}

	public Date getDdjFecha() {
		return this.ddjFecha;
	}

	public void setDdjFecha(Date ddjFecha) {
		this.ddjFecha = ddjFecha;
	}

	public String getDdjFormaId() {
		return this.ddjFormaId;
	}

	public void setDdjFormaId(String ddjFormaId) {
		this.ddjFormaId = ddjFormaId;
	}

	public int getDdjIdJuscaba() {
		return this.ddjIdJuscaba;
	}

	public void setDdjIdJuscaba(int ddjIdJuscaba) {
		this.ddjIdJuscaba = ddjIdJuscaba;
	}

	public int getDdjIntento() {
		return this.ddjIntento;
	}

	public void setDdjIntento(int ddjIntento) {
		this.ddjIntento = ddjIntento;
	}

	public String getDdjJuzgado() {
		return this.ddjJuzgado;
	}

	public void setDdjJuzgado(String ddjJuzgado) {
		this.ddjJuzgado = ddjJuzgado;
	}

	public String getDdjMensajeError() {
		return this.ddjMensajeError;
	}

	public void setDdjMensajeError(String ddjMensajeError) {
		this.ddjMensajeError = ddjMensajeError;
	}

	public String getDdjMensajeWarning() {
		return this.ddjMensajeWarning;
	}

	public void setDdjMensajeWarning(String ddjMensajeWarning) {
		this.ddjMensajeWarning = ddjMensajeWarning;
	}

	public String getDdjNroJuscaba() {
		return this.ddjNroJuscaba;
	}

	public void setDdjNroJuscaba(String ddjNroJuscaba) {
		this.ddjNroJuscaba = ddjNroJuscaba;
	}

	public String getDdjPuntaje() {
		return this.ddjPuntaje;
	}

	public void setDdjPuntaje(String ddjPuntaje) {
		this.ddjPuntaje = ddjPuntaje;
	}

	public String getDdjResultado() {
		return this.ddjResultado;
	}

	public void setDdjResultado(String ddjResultado) {
		this.ddjResultado = ddjResultado;
	}

	public Date getDdjTstamp() {
		return this.ddjTstamp;
	}

	public void setDdjTstamp(Date ddjTstamp) {
		this.ddjTstamp = ddjTstamp;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}