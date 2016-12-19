package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the den_cuestionario_tipo_dependencias database table.
 * 
 */
@Embeddable
public class DenCuestionarioTipoDependenciaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="dcu_code")
	private int dcuCode;

	@Column(name="dep_tipo")
	private String depTipo;

	public DenCuestionarioTipoDependenciaPK() {
	}
	public int getDcuCode() {
		return this.dcuCode;
	}
	public void setDcuCode(int dcuCode) {
		this.dcuCode = dcuCode;
	}
	public String getDepTipo() {
		return this.depTipo;
	}
	public void setDepTipo(String depTipo) {
		this.depTipo = depTipo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DenCuestionarioTipoDependenciaPK)) {
			return false;
		}
		DenCuestionarioTipoDependenciaPK castOther = (DenCuestionarioTipoDependenciaPK)other;
		return 
			(this.dcuCode == castOther.dcuCode)
			&& this.depTipo.equals(castOther.depTipo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dcuCode;
		hash = hash * prime + this.depTipo.hashCode();
		
		return hash;
	}
}