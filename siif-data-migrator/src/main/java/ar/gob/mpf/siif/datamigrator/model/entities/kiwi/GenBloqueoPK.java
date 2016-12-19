package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the gen_bloqueos database table.
 * 
 */
@Embeddable
public class GenBloqueoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="gbl_tabla")
	private String gblTabla;

	@Column(name="gbl_code")
	private String gblCode;

	public GenBloqueoPK() {
	}
	public String getGblTabla() {
		return this.gblTabla;
	}
	public void setGblTabla(String gblTabla) {
		this.gblTabla = gblTabla;
	}
	public String getGblCode() {
		return this.gblCode;
	}
	public void setGblCode(String gblCode) {
		this.gblCode = gblCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof GenBloqueoPK)) {
			return false;
		}
		GenBloqueoPK castOther = (GenBloqueoPK)other;
		return 
			this.gblTabla.equals(castOther.gblTabla)
			&& this.gblCode.equals(castOther.gblCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.gblTabla.hashCode();
		hash = hash * prime + this.gblCode.hashCode();
		
		return hash;
	}
}