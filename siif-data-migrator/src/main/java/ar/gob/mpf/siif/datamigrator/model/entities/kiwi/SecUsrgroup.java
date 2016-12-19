package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sec_usrgroup database table.
 * 
 */
// @Entity
// @Table(name="sec_usrgroup")
@NamedQuery(name="SecUsrgroup.findAll", query="SELECT s FROM SecUsrgroup s")
public class SecUsrgroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ugr_code")
	private int ugrCode;

	@Column(name="ugr_name")
	private int ugrName;

	public SecUsrgroup() {
	}

	public int getUgrCode() {
		return this.ugrCode;
	}

	public void setUgrCode(int ugrCode) {
		this.ugrCode = ugrCode;
	}

	public int getUgrName() {
		return this.ugrName;
	}

	public void setUgrName(int ugrName) {
		this.ugrName = ugrName;
	}

}