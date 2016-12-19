package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the utc_impresoras_zebra_users database table.
 * 
 */
@Embeddable
public class UtcImpresorasZebraUserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="uiz_code")
	private int uizCode;

	@Column(name="use_code")
	private String useCode;

	public UtcImpresorasZebraUserPK() {
	}
	public int getUizCode() {
		return this.uizCode;
	}
	public void setUizCode(int uizCode) {
		this.uizCode = uizCode;
	}
	public String getUseCode() {
		return this.useCode;
	}
	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UtcImpresorasZebraUserPK)) {
			return false;
		}
		UtcImpresorasZebraUserPK castOther = (UtcImpresorasZebraUserPK)other;
		return 
			(this.uizCode == castOther.uizCode)
			&& this.useCode.equals(castOther.useCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.uizCode;
		hash = hash * prime + this.useCode.hashCode();
		
		return hash;
	}
}