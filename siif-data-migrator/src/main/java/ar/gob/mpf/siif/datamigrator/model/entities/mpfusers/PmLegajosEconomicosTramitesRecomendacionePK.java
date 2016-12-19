package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pm_legajos_economicos_tramites_recomendaciones database table.
 * 
 */
@Embeddable
public class PmLegajosEconomicosTramitesRecomendacionePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ptr_code")
	private int ptrCode;

	@Column(name="ptrec_code")
	private int ptrecCode;

	public PmLegajosEconomicosTramitesRecomendacionePK() {
	}
	public int getPtrCode() {
		return this.ptrCode;
	}
	public void setPtrCode(int ptrCode) {
		this.ptrCode = ptrCode;
	}
	public int getPtrecCode() {
		return this.ptrecCode;
	}
	public void setPtrecCode(int ptrecCode) {
		this.ptrecCode = ptrecCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PmLegajosEconomicosTramitesRecomendacionePK)) {
			return false;
		}
		PmLegajosEconomicosTramitesRecomendacionePK castOther = (PmLegajosEconomicosTramitesRecomendacionePK)other;
		return 
			(this.ptrCode == castOther.ptrCode)
			&& (this.ptrecCode == castOther.ptrecCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ptrCode;
		hash = hash * prime + this.ptrecCode;
		
		return hash;
	}
}