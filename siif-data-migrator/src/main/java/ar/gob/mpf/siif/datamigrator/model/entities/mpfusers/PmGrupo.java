package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pm_grupos database table.
 * 
 */
// @Entity
// @Table(name="pm_grupos")
@NamedQuery(name="PmGrupo.findAll", query="SELECT p FROM PmGrupo p")
public class PmGrupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="pm_grupouid")
	private String pmGrupouid;

	@Column(name="ugr_code")
	private String ugrCode;

	public PmGrupo() {
	}

	public String getPmGrupouid() {
		return this.pmGrupouid;
	}

	public void setPmGrupouid(String pmGrupouid) {
		this.pmGrupouid = pmGrupouid;
	}

	public String getUgrCode() {
		return this.ugrCode;
	}

	public void setUgrCode(String ugrCode) {
		this.ugrCode = ugrCode;
	}

}