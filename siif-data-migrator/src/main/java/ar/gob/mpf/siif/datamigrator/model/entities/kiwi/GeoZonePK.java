package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the geo_zone database table.
 * 
 */
@Embeddable
public class GeoZonePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="gla_code")
	private int glaCode;

	@Column(name="gzo_code")
	private int gzoCode;

	public GeoZonePK() {
	}
	public int getGlaCode() {
		return this.glaCode;
	}
	public void setGlaCode(int glaCode) {
		this.glaCode = glaCode;
	}
	public int getGzoCode() {
		return this.gzoCode;
	}
	public void setGzoCode(int gzoCode) {
		this.gzoCode = gzoCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof GeoZonePK)) {
			return false;
		}
		GeoZonePK castOther = (GeoZonePK)other;
		return 
			(this.glaCode == castOther.glaCode)
			&& (this.gzoCode == castOther.gzoCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.glaCode;
		hash = hash * prime + this.gzoCode;
		
		return hash;
	}
}