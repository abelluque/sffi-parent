package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sec_groups database table.
 * 
 */
// @Entity
// @Table(name="sec_groups")
@NamedQuery(name="SecGroup.findAll", query="SELECT s FROM SecGroup s")
public class SecGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="gro_code")
	private String groCode;

	@Column(name="gro_name")
	private String groName;

	//bi-directional many-to-many association to SecRight
	@ManyToMany(mappedBy="secGroups")
	private List<SecRight> secRights;

	public SecGroup() {
	}

	public String getGroCode() {
		return this.groCode;
	}

	public void setGroCode(String groCode) {
		this.groCode = groCode;
	}

	public String getGroName() {
		return this.groName;
	}

	public void setGroName(String groName) {
		this.groName = groName;
	}

	public List<SecRight> getSecRights() {
		return this.secRights;
	}

	public void setSecRights(List<SecRight> secRights) {
		this.secRights = secRights;
	}

}