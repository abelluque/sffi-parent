package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sec_usrgroup_users database table.
 * 
 */
// @Entity
// @Table(name="sec_usrgroup_users")
@NamedQuery(name="SecUsrgroupUser.findAll", query="SELECT s FROM SecUsrgroupUser s")
public class SecUsrgroupUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ugr_code")
	private int ugrCode;

	@Column(name="use_code")
	private int useCode;

	public SecUsrgroupUser() {
	}

	public int getUgrCode() {
		return this.ugrCode;
	}

	public void setUgrCode(int ugrCode) {
		this.ugrCode = ugrCode;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}