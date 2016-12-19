package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the docum_documentos_rol_articulo database table.
 * 
 */
@Embeddable
public class DocumDocumentosRolArticuloPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ddrp_code")
	private int ddrpCode;

	@Column(name="art_code")
	private int artCode;

	public DocumDocumentosRolArticuloPK() {
	}
	public int getDdrpCode() {
		return this.ddrpCode;
	}
	public void setDdrpCode(int ddrpCode) {
		this.ddrpCode = ddrpCode;
	}
	public int getArtCode() {
		return this.artCode;
	}
	public void setArtCode(int artCode) {
		this.artCode = artCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DocumDocumentosRolArticuloPK)) {
			return false;
		}
		DocumDocumentosRolArticuloPK castOther = (DocumDocumentosRolArticuloPK)other;
		return 
			(this.ddrpCode == castOther.ddrpCode)
			&& (this.artCode == castOther.artCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ddrpCode;
		hash = hash * prime + this.artCode;
		
		return hash;
	}
}