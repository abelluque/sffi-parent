package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the spp_tipos_de_informes_rigths database table.
 * 
 */
@Embeddable
public class SppTiposDeInformesRigthPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="sti_code")
	private int stiCode;

	@Column(name="rig_name")
	private String rigName;

	public SppTiposDeInformesRigthPK() {
	}
	public int getStiCode() {
		return this.stiCode;
	}
	public void setStiCode(int stiCode) {
		this.stiCode = stiCode;
	}
	public String getRigName() {
		return this.rigName;
	}
	public void setRigName(String rigName) {
		this.rigName = rigName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SppTiposDeInformesRigthPK)) {
			return false;
		}
		SppTiposDeInformesRigthPK castOther = (SppTiposDeInformesRigthPK)other;
		return 
			(this.stiCode == castOther.stiCode)
			&& this.rigName.equals(castOther.rigName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.stiCode;
		hash = hash * prime + this.rigName.hashCode();
		
		return hash;
	}
}