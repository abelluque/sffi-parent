package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pm_legajos_economicos_tramites_documentos database table.
 * 
 */
@Embeddable
public class PmLegajosEconomicosTramitesDocumentoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ptr_code")
	private int ptrCode;

	@Column(name="utd_code")
	private int utdCode;

	public PmLegajosEconomicosTramitesDocumentoPK() {
	}
	public int getPtrCode() {
		return this.ptrCode;
	}
	public void setPtrCode(int ptrCode) {
		this.ptrCode = ptrCode;
	}
	public int getUtdCode() {
		return this.utdCode;
	}
	public void setUtdCode(int utdCode) {
		this.utdCode = utdCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PmLegajosEconomicosTramitesDocumentoPK)) {
			return false;
		}
		PmLegajosEconomicosTramitesDocumentoPK castOther = (PmLegajosEconomicosTramitesDocumentoPK)other;
		return 
			(this.ptrCode == castOther.ptrCode)
			&& (this.utdCode == castOther.utdCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ptrCode;
		hash = hash * prime + this.utdCode;
		
		return hash;
	}
}