package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cij_intervenciones_eventos database table.
 * 
 */
@Embeddable
public class CijIntervencionesEventoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="cii_code")
	private int ciiCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cie_fecha")
	private java.util.Date cieFecha;

	public CijIntervencionesEventoPK() {
	}
	public int getCiiCode() {
		return this.ciiCode;
	}
	public void setCiiCode(int ciiCode) {
		this.ciiCode = ciiCode;
	}
	public java.util.Date getCieFecha() {
		return this.cieFecha;
	}
	public void setCieFecha(java.util.Date cieFecha) {
		this.cieFecha = cieFecha;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CijIntervencionesEventoPK)) {
			return false;
		}
		CijIntervencionesEventoPK castOther = (CijIntervencionesEventoPK)other;
		return 
			(this.ciiCode == castOther.ciiCode)
			&& this.cieFecha.equals(castOther.cieFecha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ciiCode;
		hash = hash * prime + this.cieFecha.hashCode();
		
		return hash;
	}
}