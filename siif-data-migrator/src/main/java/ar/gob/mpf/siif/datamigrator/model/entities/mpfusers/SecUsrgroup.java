package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

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

	@Id
	@Column(name="ugr_code")
	private String ugrCode;

	@Column(name="ugr_name")
	private String ugrName;

	public SecUsrgroup() {
	}

	public String getUgrCode() {
		return this.ugrCode;
	}

	public void setUgrCode(String ugrCode) {
		this.ugrCode = ugrCode;
	}

	public String getUgrName() {
		return this.ugrName;
	}

	public void setUgrName(String ugrName) {
		this.ugrName = ugrName;
	}

}