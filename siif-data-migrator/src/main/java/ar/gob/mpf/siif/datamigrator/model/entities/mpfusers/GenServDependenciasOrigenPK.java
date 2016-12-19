package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the gen_serv_dependencias_origen database table.
 * 
 */
@Embeddable
public class GenServDependenciasOrigenPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="gsd_code")
	private int gsdCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	public GenServDependenciasOrigenPK() {
	}
	public int getGsdCode() {
		return this.gsdCode;
	}
	public void setGsdCode(int gsdCode) {
		this.gsdCode = gsdCode;
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
		if (!(other instanceof GenServDependenciasOrigenPK)) {
			return false;
		}
		GenServDependenciasOrigenPK castOther = (GenServDependenciasOrigenPK)other;
		return 
			(this.gsdCode == castOther.gsdCode)
			&& (this.aalCodigo == castOther.aalCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.gsdCode;
		hash = hash * prime + this.aalCodigo;
		
		return hash;
	}
}