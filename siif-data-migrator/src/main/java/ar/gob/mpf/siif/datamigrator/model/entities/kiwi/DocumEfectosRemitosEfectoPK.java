package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the docum_efectos_remitos_efectos database table.
 * 
 */
@Embeddable
public class DocumEfectosRemitosEfectoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="der_code")
	private int derCode;

	@Column(name="def_code")
	private int defCode;

	public DocumEfectosRemitosEfectoPK() {
	}
	public int getDerCode() {
		return this.derCode;
	}
	public void setDerCode(int derCode) {
		this.derCode = derCode;
	}
	public int getDefCode() {
		return this.defCode;
	}
	public void setDefCode(int defCode) {
		this.defCode = defCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DocumEfectosRemitosEfectoPK)) {
			return false;
		}
		DocumEfectosRemitosEfectoPK castOther = (DocumEfectosRemitosEfectoPK)other;
		return 
			(this.derCode == castOther.derCode)
			&& (this.defCode == castOther.defCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.derCode;
		hash = hash * prime + this.defCode;
		
		return hash;
	}
}