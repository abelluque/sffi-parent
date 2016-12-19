package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the doc_tree database table.
 * 
 */
// @Entity
// @Table(name="doc_tree")
@NamedQuery(name="DocTree.findAll", query="SELECT d FROM DocTree d")
public class DocTree implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="acl_code")
	private int aclCode;

	@Column(name="dtr_note")
	private String dtrNote;

	@Column(name="dtr_url")
	private String dtrUrl;

	public DocTree() {
	}

	public int getAclCode() {
		return this.aclCode;
	}

	public void setAclCode(int aclCode) {
		this.aclCode = aclCode;
	}

	public String getDtrNote() {
		return this.dtrNote;
	}

	public void setDtrNote(String dtrNote) {
		this.dtrNote = dtrNote;
	}

	public String getDtrUrl() {
		return this.dtrUrl;
	}

	public void setDtrUrl(String dtrUrl) {
		this.dtrUrl = dtrUrl;
	}

}