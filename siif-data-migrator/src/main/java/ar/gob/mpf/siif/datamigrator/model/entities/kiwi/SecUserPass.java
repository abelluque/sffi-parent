package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sec_user_pass database table.
 * 
 */
// @Entity
// @Table(name="sec_user_pass")
@NamedQuery(name="SecUserPass.findAll", query="SELECT s FROM SecUserPass s")
public class SecUserPass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="use_code")
	private int useCode;

	@Column(name="use_passact")
	private int usePassact;

	@Column(name="use_password")
	private int usePassword;

	public SecUserPass() {
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

	public int getUsePassact() {
		return this.usePassact;
	}

	public void setUsePassact(int usePassact) {
		this.usePassact = usePassact;
	}

	public int getUsePassword() {
		return this.usePassword;
	}

	public void setUsePassword(int usePassword) {
		this.usePassword = usePassword;
	}

}