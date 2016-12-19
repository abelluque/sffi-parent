package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the docum_traductor_juscaba_pasos database table.
 * 
 */
// @Entity
// @Table(name="docum_traductor_juscaba_pasos")
@NamedQuery(name="DocumTraductorJuscabaPaso.findAll", query="SELECT d FROM DocumTraductorJuscabaPaso d")
public class DocumTraductorJuscabaPaso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dtjp_id")
	private int dtjpId;

	@Column(name="dtjp_acciones")
	private String dtjpAcciones;

	@Column(name="dtjp_dep_tipo")
	private String dtjpDepTipo;

	@Column(name="dtjp_desm_clave")
	private String dtjpDesmClave;

	@Column(name="dtjp_dest_clave")
	private String dtjpDestClave;

	@Column(name="dtjp_etapa")
	private String dtjpEtapa;

	@Column(name="dtjp_etapa_clave")
	private String dtjpEtapaClave;

	@Column(name="dtjp_evaluar_destino")
	private String dtjpEvaluarDestino;

	@Column(name="dtjp_paso_id")
	private int dtjpPasoId;

	@Column(name="dtjp_paso_id_label")
	private String dtjpPasoIdLabel;

	@Column(name="dtjp_tmov_clave")
	private String dtjpTmovClave;

	public DocumTraductorJuscabaPaso() {
	}

	public int getDtjpId() {
		return this.dtjpId;
	}

	public void setDtjpId(int dtjpId) {
		this.dtjpId = dtjpId;
	}

	public String getDtjpAcciones() {
		return this.dtjpAcciones;
	}

	public void setDtjpAcciones(String dtjpAcciones) {
		this.dtjpAcciones = dtjpAcciones;
	}

	public String getDtjpDepTipo() {
		return this.dtjpDepTipo;
	}

	public void setDtjpDepTipo(String dtjpDepTipo) {
		this.dtjpDepTipo = dtjpDepTipo;
	}

	public String getDtjpDesmClave() {
		return this.dtjpDesmClave;
	}

	public void setDtjpDesmClave(String dtjpDesmClave) {
		this.dtjpDesmClave = dtjpDesmClave;
	}

	public String getDtjpDestClave() {
		return this.dtjpDestClave;
	}

	public void setDtjpDestClave(String dtjpDestClave) {
		this.dtjpDestClave = dtjpDestClave;
	}

	public String getDtjpEtapa() {
		return this.dtjpEtapa;
	}

	public void setDtjpEtapa(String dtjpEtapa) {
		this.dtjpEtapa = dtjpEtapa;
	}

	public String getDtjpEtapaClave() {
		return this.dtjpEtapaClave;
	}

	public void setDtjpEtapaClave(String dtjpEtapaClave) {
		this.dtjpEtapaClave = dtjpEtapaClave;
	}

	public String getDtjpEvaluarDestino() {
		return this.dtjpEvaluarDestino;
	}

	public void setDtjpEvaluarDestino(String dtjpEvaluarDestino) {
		this.dtjpEvaluarDestino = dtjpEvaluarDestino;
	}

	public int getDtjpPasoId() {
		return this.dtjpPasoId;
	}

	public void setDtjpPasoId(int dtjpPasoId) {
		this.dtjpPasoId = dtjpPasoId;
	}

	public String getDtjpPasoIdLabel() {
		return this.dtjpPasoIdLabel;
	}

	public void setDtjpPasoIdLabel(String dtjpPasoIdLabel) {
		this.dtjpPasoIdLabel = dtjpPasoIdLabel;
	}

	public String getDtjpTmovClave() {
		return this.dtjpTmovClave;
	}

	public void setDtjpTmovClave(String dtjpTmovClave) {
		this.dtjpTmovClave = dtjpTmovClave;
	}

}