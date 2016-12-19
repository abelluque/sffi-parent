package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the gen_dependencias_especial database table.
 * 
 */
@Embeddable
public class GenDependenciasEspecialPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="use_code")
	private String useCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	public GenDependenciasEspecialPK() {
	}
	public String getUseCode() {
		return this.useCode;
	}
	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}
	public int getAalCodigo() {
		return this.aalCodigo;
	}
	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof GenDependenciasEspecialPK)) {
			return false;
		}
		GenDependenciasEspecialPK castOther = (GenDependenciasEspecialPK)other;
		return 
			this.useCode.equals(castOther.useCode)
			&& (this.aalCodigo == castOther.aalCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.useCode.hashCode();
		hash = hash * prime + this.aalCodigo;
		
		return hash;
	}
}