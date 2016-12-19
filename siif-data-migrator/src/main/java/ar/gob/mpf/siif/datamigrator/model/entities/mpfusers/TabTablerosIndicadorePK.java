package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tab_tableros_indicadores database table.
 * 
 */
@Embeddable
public class TabTablerosIndicadorePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="tab_code")
	private int tabCode;

	@Column(name="ind_code")
	private int indCode;

	public TabTablerosIndicadorePK() {
	}
	public int getTabCode() {
		return this.tabCode;
	}
	public void setTabCode(int tabCode) {
		this.tabCode = tabCode;
	}
	public int getIndCode() {
		return this.indCode;
	}
	public void setIndCode(int indCode) {
		this.indCode = indCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TabTablerosIndicadorePK)) {
			return false;
		}
		TabTablerosIndicadorePK castOther = (TabTablerosIndicadorePK)other;
		return 
			(this.tabCode == castOther.tabCode)
			&& (this.indCode == castOther.indCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tabCode;
		hash = hash * prime + this.indCode;
		
		return hash;
	}
}