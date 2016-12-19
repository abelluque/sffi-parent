package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ocmarc_audiencias_eventos database table.
 * 
 */
@Embeddable
public class OcmarcAudienciasEventoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="oca_code")
	private int ocaCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oae_fecha")
	private java.util.Date oaeFecha;

	public OcmarcAudienciasEventoPK() {
	}
	public int getOcaCode() {
		return this.ocaCode;
	}
	public void setOcaCode(int ocaCode) {
		this.ocaCode = ocaCode;
	}
	public java.util.Date getOaeFecha() {
		return this.oaeFecha;
	}
	public void setOaeFecha(java.util.Date oaeFecha) {
		this.oaeFecha = oaeFecha;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OcmarcAudienciasEventoPK)) {
			return false;
		}
		OcmarcAudienciasEventoPK castOther = (OcmarcAudienciasEventoPK)other;
		return 
			(this.ocaCode == castOther.ocaCode)
			&& this.oaeFecha.equals(castOther.oaeFecha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ocaCode;
		hash = hash * prime + this.oaeFecha.hashCode();
		
		return hash;
	}
}