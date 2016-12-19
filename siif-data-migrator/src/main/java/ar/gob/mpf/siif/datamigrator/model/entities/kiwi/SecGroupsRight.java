package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sec_groups_rights database table.
 * 
 */
// @Entity
// @Table(name="sec_groups_rights")
@NamedQuery(name="SecGroupsRight.findAll", query="SELECT s FROM SecGroupsRight s")
public class SecGroupsRight implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="gro_code")
	private int groCode;

	@Column(name="rig_name")
	private int rigName;

	public SecGroupsRight() {
	}

	public int getGroCode() {
		return this.groCode;
	}

	public void setGroCode(int groCode) {
		this.groCode = groCode;
	}

	public int getRigName() {
		return this.rigName;
	}

	public void setRigName(int rigName) {
		this.rigName = rigName;
	}

}