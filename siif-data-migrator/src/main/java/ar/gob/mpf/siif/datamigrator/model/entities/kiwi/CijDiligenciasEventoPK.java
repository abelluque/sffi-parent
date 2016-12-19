package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cij_diligencias_eventos database table.
 * 
 */
@Embeddable
public class CijDiligenciasEventoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="cid_code")
	private int cidCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cde_fecha")
	private java.util.Date cdeFecha;

	public CijDiligenciasEventoPK() {
	}
	public int getCidCode() {
		return this.cidCode;
	}
	public void setCidCode(int cidCode) {
		this.cidCode = cidCode;
	}
	public java.util.Date getCdeFecha() {
		return this.cdeFecha;
	}
	public void setCdeFecha(java.util.Date cdeFecha) {
		this.cdeFecha = cdeFecha;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CijDiligenciasEventoPK)) {
			return false;
		}
		CijDiligenciasEventoPK castOther = (CijDiligenciasEventoPK)other;
		return 
			(this.cidCode == castOther.cidCode)
			&& this.cdeFecha.equals(castOther.cdeFecha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cidCode;
		hash = hash * prime + this.cdeFecha.hashCode();
		
		return hash;
	}
}