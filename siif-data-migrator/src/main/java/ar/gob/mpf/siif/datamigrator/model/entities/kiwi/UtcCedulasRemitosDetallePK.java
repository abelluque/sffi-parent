package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the utc_cedulas_remitos_detalles database table.
 * 
 */
@Embeddable
public class UtcCedulasRemitosDetallePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="cre_code")
	private int creCode;

	@Column(name="ced_code")
	private int cedCode;

	public UtcCedulasRemitosDetallePK() {
	}
	public int getCreCode() {
		return this.creCode;
	}
	public void setCreCode(int creCode) {
		this.creCode = creCode;
	}
	public int getCedCode() {
		return this.cedCode;
	}
	public void setCedCode(int cedCode) {
		this.cedCode = cedCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UtcCedulasRemitosDetallePK)) {
			return false;
		}
		UtcCedulasRemitosDetallePK castOther = (UtcCedulasRemitosDetallePK)other;
		return 
			(this.creCode == castOther.creCode)
			&& (this.cedCode == castOther.cedCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.creCode;
		hash = hash * prime + this.cedCode;
		
		return hash;
	}
}