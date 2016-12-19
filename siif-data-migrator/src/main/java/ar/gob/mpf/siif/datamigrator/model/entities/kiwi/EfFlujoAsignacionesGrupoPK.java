package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ef_flujo_asignaciones_grupos database table.
 * 
 */
@Embeddable
public class EfFlujoAsignacionesGrupoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="dep_zona")
	private String depZona;

	@Column(name="art_grupo")
	private String artGrupo;

	public EfFlujoAsignacionesGrupoPK() {
	}
	public String getDepZona() {
		return this.depZona;
	}
	public void setDepZona(String depZona) {
		this.depZona = depZona;
	}
	public String getArtGrupo() {
		return this.artGrupo;
	}
	public void setArtGrupo(String artGrupo) {
		this.artGrupo = artGrupo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EfFlujoAsignacionesGrupoPK)) {
			return false;
		}
		EfFlujoAsignacionesGrupoPK castOther = (EfFlujoAsignacionesGrupoPK)other;
		return 
			this.depZona.equals(castOther.depZona)
			&& this.artGrupo.equals(castOther.artGrupo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.depZona.hashCode();
		hash = hash * prime + this.artGrupo.hashCode();
		
		return hash;
	}
}