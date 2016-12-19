package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ocmarc_mediaciones_personas database table.
 * 
 */
@Embeddable
public class OcmarcMediacionesPersonaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ocm_code")
	private int ocmCode;

	@Column(name="per_code")
	private int perCode;

	public OcmarcMediacionesPersonaPK() {
	}
	public int getOcmCode() {
		return this.ocmCode;
	}
	public void setOcmCode(int ocmCode) {
		this.ocmCode = ocmCode;
	}
	public int getPerCode() {
		return this.perCode;
	}
	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OcmarcMediacionesPersonaPK)) {
			return false;
		}
		OcmarcMediacionesPersonaPK castOther = (OcmarcMediacionesPersonaPK)other;
		return 
			(this.ocmCode == castOther.ocmCode)
			&& (this.perCode == castOther.perCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ocmCode;
		hash = hash * prime + this.perCode;
		
		return hash;
	}
}