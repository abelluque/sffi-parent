package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the docum_documentos_actores database table.
 * 
 */
@Embeddable
public class DocumDocumentosActorePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="documento_id")
	private String documentoId;

	@Column(name="ddrp_code")
	private int ddrpCode;

	public DocumDocumentosActorePK() {
	}
	public String getDocumentoId() {
		return this.documentoId;
	}
	public void setDocumentoId(String documentoId) {
		this.documentoId = documentoId;
	}
	public int getDdrpCode() {
		return this.ddrpCode;
	}
	public void setDdrpCode(int ddrpCode) {
		this.ddrpCode = ddrpCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DocumDocumentosActorePK)) {
			return false;
		}
		DocumDocumentosActorePK castOther = (DocumDocumentosActorePK)other;
		return 
			this.documentoId.equals(castOther.documentoId)
			&& (this.ddrpCode == castOther.ddrpCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.documentoId.hashCode();
		hash = hash * prime + this.ddrpCode;
		
		return hash;
	}
}