package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ocmarc_mediaciones_eventos database table.
 * 
 */
@Embeddable
public class OcmarcMediacionesEventoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ocm_code")
	private int ocmCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ome_fecha")
	private java.util.Date omeFecha;

	public OcmarcMediacionesEventoPK() {
	}
	public int getOcmCode() {
		return this.ocmCode;
	}
	public void setOcmCode(int ocmCode) {
		this.ocmCode = ocmCode;
	}
	public java.util.Date getOmeFecha() {
		return this.omeFecha;
	}
	public void setOmeFecha(java.util.Date omeFecha) {
		this.omeFecha = omeFecha;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OcmarcMediacionesEventoPK)) {
			return false;
		}
		OcmarcMediacionesEventoPK castOther = (OcmarcMediacionesEventoPK)other;
		return 
			(this.ocmCode == castOther.ocmCode)
			&& this.omeFecha.equals(castOther.omeFecha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ocmCode;
		hash = hash * prime + this.omeFecha.hashCode();
		
		return hash;
	}
}