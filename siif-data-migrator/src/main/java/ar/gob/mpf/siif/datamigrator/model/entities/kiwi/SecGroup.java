package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sec_groups database table.
 * 
 */
// @Entity
// @Table(name="sec_groups")
@NamedQuery(name="SecGroup.findAll", query="SELECT s FROM SecGroup s")
public class SecGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="gro_code")
	private int groCode;

	@Column(name="gro_name")
	private int groName;

	public SecGroup() {
	}

	public int getGroCode() {
		return this.groCode;
	}

	public void setGroCode(int groCode) {
		this.groCode = groCode;
	}

	public int getGroName() {
		return this.groName;
	}

	public void setGroName(int groName) {
		this.groName = groName;
	}

}