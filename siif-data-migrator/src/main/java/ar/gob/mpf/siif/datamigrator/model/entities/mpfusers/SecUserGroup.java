package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

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
	private String groCode;

	@Column(name="use_code")
	private String useCode;

	public SecUserGroup() {
	}

	public String getGroCode() {
		return this.groCode;
	}

	public void setGroCode(String groCode) {
		this.groCode = groCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}