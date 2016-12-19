package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the docum_notas_users database table.
 * 
 */
@Embeddable
public class DocumNotasUserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="doc_id")
	private String docId;

	@Column(name="use_code")
	private String useCode;

	public DocumNotasUserPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DocumNotasUserPK)) {
			return false;
		}
		DocumNotasUserPK castOther = (DocumNotasUserPK)other;
		return 
			this.docId.equals(castOther.docId)
			&& this.useCode.equals(castOther.useCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.docId.hashCode();
		hash = hash * prime + this.useCode.hashCode();
		
		return hash;
	}
}