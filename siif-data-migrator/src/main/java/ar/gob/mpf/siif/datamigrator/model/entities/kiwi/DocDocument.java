package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the doc_documents database table.
 * 
 */
// @Entity
// @Table(name="doc_documents")
@NamedQuery(name="DocDocument.findAll", query="SELECT d FROM DocDocument d")
public class DocDocument implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocDocumentPK id;

	@Column(name="acl_code")
	private int aclCode;

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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="doc_tstamp")
	private Date docTstamp;

	@Column(name="doc_version")
	private int docVersion;

	@Column(name="firma_cod_operacion")
	private String firmaCodOperacion;

	@Column(name="use_code")
	private String useCode;

	public DocDocument() {
	}

	public DocDocumentPK getId() {
		return this.id;
	}

	public void setId(DocDocumentPK id) {
		this.id = id;
	}

	public int getAclCode() {
		return this.aclCode;
	}

	public void setAclCode(int aclCode) {
		this.aclCode = aclCode;
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

	public String getFirmaCodOperacion() {
		return this.firmaCodOperacion;
	}

	public void setFirmaCodOperacion(String firmaCodOperacion) {
		this.firmaCodOperacion = firmaCodOperacion;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}