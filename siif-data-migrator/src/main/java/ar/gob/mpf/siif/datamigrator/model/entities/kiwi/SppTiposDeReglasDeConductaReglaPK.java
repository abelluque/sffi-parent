package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the spp_tipos_de_reglas_de_conducta_reglas database table.
 * 
 */
@Embeddable
public class SppTiposDeReglasDeConductaReglaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="str_code")
	private int strCode;

	@Column(name="src_code")
	private int srcCode;

	public SppTiposDeReglasDeConductaReglaPK() {
	}
	public int getStrCode() {
		return this.strCode;
	}
	public void setStrCode(int strCode) {
		this.strCode = strCode;
	}
	public int getSrcCode() {
		return this.srcCode;
	}
	public void setSrcCode(int srcCode) {
		this.srcCode = srcCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SppTiposDeReglasDeConductaReglaPK)) {
			return false;
		}
		SppTiposDeReglasDeConductaReglaPK castOther = (SppTiposDeReglasDeConductaReglaPK)other;
		return 
			(this.strCode == castOther.strCode)
			&& (this.srcCode == castOther.srcCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.strCode;
		hash = hash * prime + this.srcCode;
		
		return hash;
	}
}