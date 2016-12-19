package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the gen_provincias database table.
 * 
 */
@Embeddable
public class GenProvinciaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ppr_pais")
	private String pprPais;

	@Column(name="ppr_nombre")
	private String pprNombre;

	public GenProvinciaPK() {
	}
	public String getPprPais() {
		return this.pprPais;
	}
	public void setPprPais(String pprPais) {
		this.pprPais = pprPais;
	}
	public String getPprNombre() {
		return this.pprNombre;
	}
	public void setPprNombre(String pprNombre) {
		this.pprNombre = pprNombre;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof GenProvinciaPK)) {
			return false;
		}
		GenProvinciaPK castOther = (GenProvinciaPK)other;
		return 
			this.pprPais.equals(castOther.pprPais)
			&& this.pprNombre.equals(castOther.pprNombre);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.pprPais.hashCode();
		hash = hash * prime + this.pprNombre.hashCode();
		
		return hash;
	}
}