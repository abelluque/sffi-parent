package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pm_legajos_economicos_tramites_documentos database table.
 * 
 */
// @Entity
// @Table(name="pm_legajos_economicos_tramites_documentos")
@NamedQuery(name="PmLegajosEconomicosTramitesDocumento.findAll", query="SELECT p FROM PmLegajosEconomicosTramitesDocumento p")
public class PmLegajosEconomicosTramitesDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PmLegajosEconomicosTramitesDocumentoPK id;

	@Column(name="ptd_grupo")
	private String ptdGrupo;

	@Column(name="ptd_obligatorio")
	private String ptdObligatorio;

	@Column(name="ptd_parentesco")
	private String ptdParentesco;

	@Column(name="ptd_pertenece")
	private String ptdPertenece;

	public PmLegajosEconomicosTramitesDocumento() {
	}

	public PmLegajosEconomicosTramitesDocumentoPK getId() {
		return this.id;
	}

	public void setId(PmLegajosEconomicosTramitesDocumentoPK id) {
		this.id = id;
	}

	public String getPtdGrupo() {
		return this.ptdGrupo;
	}

	public void setPtdGrupo(String ptdGrupo) {
		this.ptdGrupo = ptdGrupo;
	}

	public String getPtdObligatorio() {
		return this.ptdObligatorio;
	}

	public void setPtdObligatorio(String ptdObligatorio) {
		this.ptdObligatorio = ptdObligatorio;
	}

	public String getPtdParentesco() {
		return this.ptdParentesco;
	}

	public void setPtdParentesco(String ptdParentesco) {
		this.ptdParentesco = ptdParentesco;
	}

	public String getPtdPertenece() {
		return this.ptdPertenece;
	}

	public void setPtdPertenece(String ptdPertenece) {
		this.ptdPertenece = ptdPertenece;
	}

}