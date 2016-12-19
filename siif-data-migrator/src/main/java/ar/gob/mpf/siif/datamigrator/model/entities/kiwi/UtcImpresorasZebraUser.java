package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utc_impresoras_zebra_users database table.
 * 
 */
// @Entity
// @Table(name="utc_impresoras_zebra_users")
@NamedQuery(name="UtcImpresorasZebraUser.findAll", query="SELECT u FROM UtcImpresorasZebraUser u")
public class UtcImpresorasZebraUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UtcImpresorasZebraUserPK id;

	public UtcImpresorasZebraUser() {
	}

	public UtcImpresorasZebraUserPK getId() {
		return this.id;
	}

	public void setId(UtcImpresorasZebraUserPK id) {
		this.id = id;
	}

}