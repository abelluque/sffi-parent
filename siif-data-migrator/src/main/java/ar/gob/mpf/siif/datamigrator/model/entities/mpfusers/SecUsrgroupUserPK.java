package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sec_usrgroup_users database table.
 * 
 */
@Embeddable
public class SecUsrgroupUserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="use_code")
	private String useCode;

	@Column(name="ugr_code")
	private String ugrCode;

	public SecUsrgroupUserPK() {
	}
	public String getUseCode() {
		return this.useCode;
	}
	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}
	public String getUgrCode() {
		return this.ugrCode;
	}
	public void setUgrCode(String ugrCode) {
		this.ugrCode = ugrCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SecUsrgroupUserPK)) {
			return false;
		}
		SecUsrgroupUserPK castOther = (SecUsrgroupUserPK)other;
		return 
			this.useCode.equals(castOther.useCode)
			&& this.ugrCode.equals(castOther.ugrCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.useCode.hashCode();
		hash = hash * prime + this.ugrCode.hashCode();
		
		return hash;
	}
}