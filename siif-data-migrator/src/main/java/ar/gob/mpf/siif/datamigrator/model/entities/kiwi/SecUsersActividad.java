package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sec_users_actividad database table.
 * 
 */
// @Entity
// @Table(name="sec_users_actividad")
@NamedQuery(name="SecUsersActividad.findAll", query="SELECT s FROM SecUsersActividad s")
public class SecUsersActividad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="use_code")
	private String useCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sua_tstamp")
	private Date suaTstamp;

	public SecUsersActividad() {
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public Date getSuaTstamp() {
		return this.suaTstamp;
	}

	public void setSuaTstamp(Date suaTstamp) {
		this.suaTstamp = suaTstamp;
	}

}