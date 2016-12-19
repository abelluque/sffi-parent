package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tab_tableros_permisos database table.
 * 
 */
// @Entity
// @Table(name="tab_tableros_permisos")
@NamedQuery(name="TabTablerosPermiso.findAll", query="SELECT t FROM TabTablerosPermiso t")
public class TabTablerosPermiso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="gro_code")
	private int groCode;

	@Column(name="tab_code")
	private int tabCode;

	public TabTablerosPermiso() {
	}

	public int getGroCode() {
		return this.groCode;
	}

	public void setGroCode(int groCode) {
		this.groCode = groCode;
	}

	public int getTabCode() {
		return this.tabCode;
	}

	public void setTabCode(int tabCode) {
		this.tabCode = tabCode;
	}

}