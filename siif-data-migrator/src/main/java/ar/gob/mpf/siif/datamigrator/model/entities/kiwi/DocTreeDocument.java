package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the doc_tree_documents database table.
 * 
 */
// @Entity
// @Table(name="doc_tree_documents")
@NamedQuery(name="DocTreeDocument.findAll", query="SELECT d FROM DocTreeDocument d")
public class DocTreeDocument implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="doc_code")
	private String docCode;

	@Column(name="dtr_url")
	private String dtrUrl;

	public DocTreeDocument() {
	}

	public String getDocCode() {
		return this.docCode;
	}

	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}

	public String getDtrUrl() {
		return this.dtrUrl;
	}

	public void setDtrUrl(String dtrUrl) {
		this.dtrUrl = dtrUrl;
	}

}