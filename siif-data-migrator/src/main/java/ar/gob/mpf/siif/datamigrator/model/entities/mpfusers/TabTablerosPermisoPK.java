package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tab_tableros_permisos database table.
 * 
 */
@Embeddable
public class TabTablerosPermisoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="tab_code")
	private int tabCode;

	@Column(name="gro_code")
	private String groCode;

	public TabTablerosPermisoPK() {
	}
	public int getTabCode() {
		return this.tabCode;
	}
	public void setTabCode(int tabCode) {
		this.tabCode = tabCode;
	}
	public String getGroCode() {
		return this.groCode;
	}
	public void setGroCode(String groCode) {
		this.groCode = groCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TabTablerosPermisoPK)) {
			return false;
		}
		TabTablerosPermisoPK castOther = (TabTablerosPermisoPK)other;
		return 
			(this.tabCode == castOther.tabCode)
			&& this.groCode.equals(castOther.groCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tabCode;
		hash = hash * prime + this.groCode.hashCode();
		
		return hash;
	}
}