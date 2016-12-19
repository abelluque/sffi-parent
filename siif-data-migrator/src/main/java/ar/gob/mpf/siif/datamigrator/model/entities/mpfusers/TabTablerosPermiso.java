package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

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

	@EmbeddedId
	private TabTablerosPermisoPK id;

	public TabTablerosPermiso() {
	}

	public TabTablerosPermisoPK getId() {
		return this.id;
	}

	public void setId(TabTablerosPermisoPK id) {
		this.id = id;
	}

}