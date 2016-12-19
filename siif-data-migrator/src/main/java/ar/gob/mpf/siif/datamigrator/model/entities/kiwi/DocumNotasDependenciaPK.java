package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the docum_notas_dependencias database table.
 * 
 */
@Embeddable
public class DocumNotasDependenciaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="dno_code")
	private int dnoCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	public DocumNotasDependenciaPK() {
	}
	public int getDnoCode() {
		return this.dnoCode;
	}
	public void setDnoCode(int dnoCode) {
		this.dnoCode = dnoCode;
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
		if (!(other instanceof DocumNotasDependenciaPK)) {
			return false;
		}
		DocumNotasDependenciaPK castOther = (DocumNotasDependenciaPK)other;
		return 
			(this.dnoCode == castOther.dnoCode)
			&& (this.aalCodigo == castOther.aalCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dnoCode;
		hash = hash * prime + this.aalCodigo;
		
		return hash;
	}
}