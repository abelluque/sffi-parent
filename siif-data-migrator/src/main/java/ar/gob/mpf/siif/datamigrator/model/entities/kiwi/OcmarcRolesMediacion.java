package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ocmarc_roles_mediacion database table.
 * 
 */
// @Entity
// @Table(name="ocmarc_roles_mediacion")
@NamedQuery(name="OcmarcRolesMediacion.findAll", query="SELECT o FROM OcmarcRolesMediacion o")
public class OcmarcRolesMediacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="orm_code")
	private int ormCode;

	@Column(name="orm_rol")
	private String ormRol;

	@Column(name="orm_rol_den_equivalente")
	private String ormRolDenEquivalente;

	public OcmarcRolesMediacion() {
	}

	public int getOrmCode() {
		return this.ormCode;
	}

	public void setOrmCode(int ormCode) {
		this.ormCode = ormCode;
	}

	public String getOrmRol() {
		return this.ormRol;
	}

	public void setOrmRol(String ormRol) {
		this.ormRol = ormRol;
	}

	public String getOrmRolDenEquivalente() {
		return this.ormRolDenEquivalente;
	}

	public void setOrmRolDenEquivalente(String ormRolDenEquivalente) {
		this.ormRolDenEquivalente = ormRolDenEquivalente;
	}

}