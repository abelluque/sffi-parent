package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

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

	@Column(name="ind_code")
	private int indCode;

	@Column(name="tab_code")
	private int tabCode;

	public TabTablerosIndicadore() {
	}

	public int getIndCode() {
		return this.indCode;
	}

	public void setIndCode(int indCode) {
		this.indCode = indCode;
	}

	public int getTabCode() {
		return this.tabCode;
	}

	public void setTabCode(int tabCode) {
		this.tabCode = tabCode;
	}

}