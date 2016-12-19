package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ofavyt_intervenciones_eventos database table.
 * 
 */
@Embeddable
public class OfavytIntervencionesEventoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="oin_code")
	private int oinCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oie_fecha")
	private java.util.Date oieFecha;

	public OfavytIntervencionesEventoPK() {
	}
	public int getOinCode() {
		return this.oinCode;
	}
	public void setOinCode(int oinCode) {
		this.oinCode = oinCode;
	}
	public java.util.Date getOieFecha() {
		return this.oieFecha;
	}
	public void setOieFecha(java.util.Date oieFecha) {
		this.oieFecha = oieFecha;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OfavytIntervencionesEventoPK)) {
			return false;
		}
		OfavytIntervencionesEventoPK castOther = (OfavytIntervencionesEventoPK)other;
		return 
			(this.oinCode == castOther.oinCode)
			&& this.oieFecha.equals(castOther.oieFecha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.oinCode;
		hash = hash * prime + this.oieFecha.hashCode();
		
		return hash;
	}
}