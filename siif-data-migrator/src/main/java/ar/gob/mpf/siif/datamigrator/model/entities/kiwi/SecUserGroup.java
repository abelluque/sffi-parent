package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sec_user_groups database table.
 * 
 */
// @Entity
// @Table(name="sec_user_groups")
@NamedQuery(name="SecUserGroup.findAll", query="SELECT s FROM SecUserGroup s")
public class SecUserGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="gro_code")
	private int groCode;

	@Column(name="use_code")
	private int useCode;

	public SecUserGroup() {
	}

	public int getGroCode() {
		return this.groCode;
	}

	public void setGroCode(int groCode) {
		this.groCode = groCode;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}