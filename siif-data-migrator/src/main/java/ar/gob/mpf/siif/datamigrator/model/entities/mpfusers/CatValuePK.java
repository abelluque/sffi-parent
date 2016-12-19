package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cat_value database table.
 * 
 */
@Embeddable
public class CatValuePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="vli_code", insertable=false, updatable=false)
	private String vliCode;

	@Column(name="val_value")
	private String valValue;

	public CatValuePK() {
	}
	public String getVliCode() {
		return this.vliCode;
	}
	public void setVliCode(String vliCode) {
		this.vliCode = vliCode;
	}
	public String getValValue() {
		return this.valValue;
	}
	public void setValValue(String valValue) {
		this.valValue = valValue;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CatValuePK)) {
			return false;
		}
		CatValuePK castOther = (CatValuePK)other;
		return 
			this.vliCode.equals(castOther.vliCode)
			&& this.valValue.equals(castOther.valValue);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.vliCode.hashCode();
		hash = hash * prime + this.valValue.hashCode();
		
		return hash;
	}
}