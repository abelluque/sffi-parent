package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_users_adic_ctl database table.
 * 
 */
// @Entity
// @Table(name="gen_users_adic_ctl")
@NamedQuery(name="GenUsersAdicCtl.findAll", query="SELECT g FROM GenUsersAdicCtl g")
public class GenUsersAdicCtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="gua_codcam")
	private int guaCodcam;

	@Column(name="gua_campo_mod")
	private String guaCampoMod;

	@Column(name="gua_campo_val")
	private String guaCampoVal;

	public GenUsersAdicCtl() {
	}

	public int getGuaCodcam() {
		return this.guaCodcam;
	}

	public void setGuaCodcam(int guaCodcam) {
		this.guaCodcam = guaCodcam;
	}

	public String getGuaCampoMod() {
		return this.guaCampoMod;
	}

	public void setGuaCampoMod(String guaCampoMod) {
		this.guaCampoMod = guaCampoMod;
	}

	public String getGuaCampoVal() {
		return this.guaCampoVal;
	}

	public void setGuaCampoVal(String guaCampoVal) {
		this.guaCampoVal = guaCampoVal;
	}

}