package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ef_flujo_excepciones database table.
 * 
 */
@Embeddable
public class EfFlujoExcepcionePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="art_code")
	private int artCode;

	public EfFlujoExcepcionePK() {
	}
	public int getAalCodigo() {
		return this.aalCodigo;
	}
	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}
	public int getArtCode() {
		return this.artCode;
	}
	public void setArtCode(int artCode) {
		this.artCode = artCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EfFlujoExcepcionePK)) {
			return false;
		}
		EfFlujoExcepcionePK castOther = (EfFlujoExcepcionePK)other;
		return 
			(this.aalCodigo == castOther.aalCodigo)
			&& (this.artCode == castOther.artCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.aalCodigo;
		hash = hash * prime + this.artCode;
		
		return hash;
	}
}