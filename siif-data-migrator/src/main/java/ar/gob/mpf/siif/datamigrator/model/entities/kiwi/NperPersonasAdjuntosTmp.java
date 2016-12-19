package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the nper_personas_adjuntos_tmp database table.
 * 
 */
// @Entity
// @Table(name="nper_personas_adjuntos_tmp")
@NamedQuery(name="NperPersonasAdjuntosTmp.findAll", query="SELECT n FROM NperPersonasAdjuntosTmp n")
public class NperPersonasAdjuntosTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pad_code")
	private int padCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="acl_code")
	private int aclCode;

	@Column(name="doc_code")
	private String docCode;

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

	private String encontrado;

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

	@Column(name="use_code_tmp")
	private String useCodeTmp;

	public NperPersonasAdjuntosTmp() {
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

	public int getAclCode() {
		return this.aclCode;
	}

	public void setAclCode(int aclCode) {
		this.aclCode = aclCode;
	}

	public String getDocCode() {
		return this.docCode;
	}

	public void setDocCode(String docCode) {
		this.docCode = docCode;
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

	public String getEncontrado() {
		return this.encontrado;
	}

	public void setEncontrado(String encontrado) {
		this.encontrado = encontrado;
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

	public String getUseCodeTmp() {
		return this.useCodeTmp;
	}

	public void setUseCodeTmp(String useCodeTmp) {
		this.useCodeTmp = useCodeTmp;
	}

}