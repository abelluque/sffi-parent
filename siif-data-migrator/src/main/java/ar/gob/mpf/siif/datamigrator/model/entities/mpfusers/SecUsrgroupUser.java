package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

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

	@EmbeddedId
	private SecUsrgroupUserPK id;

	public SecUsrgroupUser() {
	}

	public SecUsrgroupUserPK getId() {
		return this.id;
	}

	public void setId(SecUsrgroupUserPK id) {
		this.id = id;
	}

}