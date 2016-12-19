package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the doc_documents_tmp database table.
 * 
 */
// @Entity
// @Table(name="doc_documents_tmp")
@NamedQuery(name="DocDocumentsTmp.findAll", query="SELECT d FROM DocDocumentsTmp d")
public class DocDocumentsTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocDocumentsTmpPK id;

	@Column(name="doc_storage1")
	private String docStorage1;

	private String existe;

	public DocDocumentsTmp() {
	}

	public DocDocumentsTmpPK getId() {
		return this.id;
	}

	public void setId(DocDocumentsTmpPK id) {
		this.id = id;
	}

	public String getDocStorage1() {
		return this.docStorage1;
	}

	public void setDocStorage1(String docStorage1) {
		this.docStorage1 = docStorage1;
	}

	public String getExiste() {
		return this.existe;
	}

	public void setExiste(String existe) {
		this.existe = existe;
	}

}