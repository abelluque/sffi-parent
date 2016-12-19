package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pm_legajos_economicos_tramites_recomendaciones database table.
 * 
 */
// @Entity
// @Table(name="pm_legajos_economicos_tramites_recomendaciones")
@NamedQuery(name="PmLegajosEconomicosTramitesRecomendacione.findAll", query="SELECT p FROM PmLegajosEconomicosTramitesRecomendacione p")
public class PmLegajosEconomicosTramitesRecomendacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PmLegajosEconomicosTramitesRecomendacionePK id;

	@Column(name="ptrec_class")
	private String ptrecClass;

	@Column(name="ptrec_recomendacion")
	private String ptrecRecomendacion;

	public PmLegajosEconomicosTramitesRecomendacione() {
	}

	public PmLegajosEconomicosTramitesRecomendacionePK getId() {
		return this.id;
	}

	public void setId(PmLegajosEconomicosTramitesRecomendacionePK id) {
		this.id = id;
	}

	public String getPtrecClass() {
		return this.ptrecClass;
	}

	public void setPtrecClass(String ptrecClass) {
		this.ptrecClass = ptrecClass;
	}

	public String getPtrecRecomendacion() {
		return this.ptrecRecomendacion;
	}

	public void setPtrecRecomendacion(String ptrecRecomendacion) {
		this.ptrecRecomendacion = ptrecRecomendacion;
	}

}