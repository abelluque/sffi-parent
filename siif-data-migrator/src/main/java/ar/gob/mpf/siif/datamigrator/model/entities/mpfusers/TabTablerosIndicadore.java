package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tab_tableros_indicadores database table.
 * 
 */
// @Entity
// @Table(name="tab_tableros_indicadores")
@NamedQuery(name="TabTablerosIndicadore.findAll", query="SELECT t FROM TabTablerosIndicadore t")
public class TabTablerosIndicadore implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TabTablerosIndicadorePK id;

	public TabTablerosIndicadore() {
	}

	public TabTablerosIndicadorePK getId() {
		return this.id;
	}

	public void setId(TabTablerosIndicadorePK id) {
		this.id = id;
	}

}