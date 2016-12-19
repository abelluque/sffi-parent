package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sec_rights database table.
 * 
 */
// @Entity
// @Table(name="sec_rights")
@NamedQuery(name="SecRight.findAll", query="SELECT s FROM SecRight s")
public class SecRight implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="rig_check")
	private int rigCheck;

	@Column(name="rig_description")
	private int rigDescription;

	@Column(name="rig_name")
	private int rigName;

	public SecRight() {
	}

	public int getRigCheck() {
		return this.rigCheck;
	}

	public void setRigCheck(int rigCheck) {
		this.rigCheck = rigCheck;
	}

	public int getRigDescription() {
		return this.rigDescription;
	}

	public void setRigDescription(int rigDescription) {
		this.rigDescription = rigDescription;
	}

	public int getRigName() {
		return this.rigName;
	}

	public void setRigName(int rigName) {
		this.rigName = rigName;
	}

}