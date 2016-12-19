package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_adjuntos_pruebas_tmp database table.
 * 
 */
// @Entity
// @Table(name="docum_adjuntos_pruebas_tmp")
@NamedQuery(name="DocumAdjuntosPruebasTmp.findAll", query="SELECT d FROM DocumAdjuntosPruebasTmp d")
public class DocumAdjuntosPruebasTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dap_code")
	private int dapCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="acl_code")
	private int aclCode;

	@Column(name="cin_inventario")
	private int cinInventario;

	@Column(name="dap_estado")
	private String dapEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dap_fecha")
	private Date dapFecha;

	@Column(name="dap_observacion")
	private String dapObservacion;

	@Column(name="dap_soporte")
	private String dapSoporte;

	@Column(name="ddrp_rol")
	private String ddrpRol;

	@Column(name="doc_code")
	private String docCode;

	@Column(name="doc_code_tmp")
	private int docCodeTmp;

	@Column(name="doc_deleted")
	private String docDeleted;

	@Column(name="doc_extension")
	private String docExtension;

	@Column(name="doc_mime")
	private String docMime;

	@Column(name="doc_name")
	private String docName;

	@Column(name="doc_note")
	private String docNote;

	@Column(name="doc_size")
	private int docSize;

	@Column(name="doc_storage")
	private String docStorage;

	@Column(name="doc_storage_tmp")
	private String docStorageTmp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="doc_tstamp")
	private Date docTstamp;

	@Column(name="doc_version")
	private int docVersion;

	@Column(name="dta_code")
	private int dtaCode;

	@Column(name="dtip_code")
	private String dtipCode;

	private String encontrado;

	@Column(name="per_code")
	private int perCode;

	@Column(name="use_code")
	private String useCode;

	@Column(name="use_code_tmp")
	private String useCodeTmp;

	public DocumAdjuntosPruebasTmp() {
	}

	public int getDapCode() {
		return this.dapCode;
	}

	public void setDapCode(int dapCode) {
		this.dapCode = dapCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getAclCode() {
		return this.aclCode;
	}

	public void setAclCode(int aclCode) {
		this.aclCode = aclCode;
	}

	public int getCinInventario() {
		return this.cinInventario;
	}

	public void setCinInventario(int cinInventario) {
		this.cinInventario = cinInventario;
	}

	public String getDapEstado() {
		return this.dapEstado;
	}

	public void setDapEstado(String dapEstado) {
		this.dapEstado = dapEstado;
	}

	public Date getDapFecha() {
		return this.dapFecha;
	}

	public void setDapFecha(Date dapFecha) {
		this.dapFecha = dapFecha;
	}

	public String getDapObservacion() {
		return this.dapObservacion;
	}

	public void setDapObservacion(String dapObservacion) {
		this.dapObservacion = dapObservacion;
	}

	public String getDapSoporte() {
		return this.dapSoporte;
	}

	public void setDapSoporte(String dapSoporte) {
		this.dapSoporte = dapSoporte;
	}

	public String getDdrpRol() {
		return this.ddrpRol;
	}

	public void setDdrpRol(String ddrpRol) {
		this.ddrpRol = ddrpRol;
	}

	public String getDocCode() {
		return this.docCode;
	}

	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}

	public int getDocCodeTmp() {
		return this.docCodeTmp;
	}

	public void setDocCodeTmp(int docCodeTmp) {
		this.docCodeTmp = docCodeTmp;
	}

	public String getDocDeleted() {
		return this.docDeleted;
	}

	public void setDocDeleted(String docDeleted) {
		this.docDeleted = docDeleted;
	}

	public String getDocExtension() {
		return this.docExtension;
	}

	public void setDocExtension(String docExtension) {
		this.docExtension = docExtension;
	}

	public String getDocMime() {
		return this.docMime;
	}

	public void setDocMime(String docMime) {
		this.docMime = docMime;
	}

	public String getDocName() {
		return this.docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocNote() {
		return this.docNote;
	}

	public void setDocNote(String docNote) {
		this.docNote = docNote;
	}

	public int getDocSize() {
		return this.docSize;
	}

	public void setDocSize(int docSize) {
		this.docSize = docSize;
	}

	public String getDocStorage() {
		return this.docStorage;
	}

	public void setDocStorage(String docStorage) {
		this.docStorage = docStorage;
	}

	public String getDocStorageTmp() {
		return this.docStorageTmp;
	}

	public void setDocStorageTmp(String docStorageTmp) {
		this.docStorageTmp = docStorageTmp;
	}

	public Date getDocTstamp() {
		return this.docTstamp;
	}

	public void setDocTstamp(Date docTstamp) {
		this.docTstamp = docTstamp;
	}

	public int getDocVersion() {
		return this.docVersion;
	}

	public void setDocVersion(int docVersion) {
		this.docVersion = docVersion;
	}

	public int getDtaCode() {
		return this.dtaCode;
	}

	public void setDtaCode(int dtaCode) {
		this.dtaCode = dtaCode;
	}

	public String getDtipCode() {
		return this.dtipCode;
	}

	public void setDtipCode(String dtipCode) {
		this.dtipCode = dtipCode;
	}

	public String getEncontrado() {
		return this.encontrado;
	}

	public void setEncontrado(String encontrado) {
		this.encontrado = encontrado;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public String getUseCodeTmp() {
		return this.useCodeTmp;
	}

	public void setUseCodeTmp(String useCodeTmp) {
		this.useCodeTmp = useCodeTmp;
	}

}