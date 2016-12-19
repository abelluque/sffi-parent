package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the utc_tramites_eventos database table.
 * 
 */
@Embeddable
public class UtcTramitesEventoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="utr_code")
	private int utrCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ute_fecha")
	private java.util.Date uteFecha;

	public UtcTramitesEventoPK() {
	}
	public int getUtrCode() {
		return this.utrCode;
	}
	public void setUtrCode(int utrCode) {
		this.utrCode = utrCode;
	}
	public java.util.Date getUteFecha() {
		return this.uteFecha;
	}
	public void setUteFecha(java.util.Date uteFecha) {
		this.uteFecha = uteFecha;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UtcTramitesEventoPK)) {
			return false;
		}
		UtcTramitesEventoPK castOther = (UtcTramitesEventoPK)other;
		return 
			(this.utrCode == castOther.utrCode)
			&& this.uteFecha.equals(castOther.uteFecha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.utrCode;
		hash = hash * prime + this.uteFecha.hashCode();
		
		return hash;
	}
}