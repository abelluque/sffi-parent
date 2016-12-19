package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utc_tipos_tramites_categorias_orgs database table.
 * 
 */
// @Entity
// @Table(name="utc_tipos_tramites_categorias_orgs")
@NamedQuery(name="UtcTiposTramitesCategoriasOrg.findAll", query="SELECT u FROM UtcTiposTramitesCategoriasOrg u")
public class UtcTiposTramitesCategoriasOrg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="uco_code")
	private int ucoCode;

	@Column(name="uto_activo")
	private String utoActivo;

	@Column(name="uto_requiere_persona")
	private String utoRequierePersona;

	@Column(name="uto_tiempo_esperado")
	private int utoTiempoEsperado;

	@Column(name="uto_tiempo_prioridad_alto")
	private int utoTiempoPrioridadAlto;

	@Column(name="uto_tiempo_prioridad_bajo")
	private int utoTiempoPrioridadBajo;

	@Column(name="uto_tiempo_prioridad_medio")
	private int utoTiempoPrioridadMedio;

	@Column(name="utt_code")
	private int uttCode;

	public UtcTiposTramitesCategoriasOrg() {
	}

	public int getUcoCode() {
		return this.ucoCode;
	}

	public void setUcoCode(int ucoCode) {
		this.ucoCode = ucoCode;
	}

	public String getUtoActivo() {
		return this.utoActivo;
	}

	public void setUtoActivo(String utoActivo) {
		this.utoActivo = utoActivo;
	}

	public String getUtoRequierePersona() {
		return this.utoRequierePersona;
	}

	public void setUtoRequierePersona(String utoRequierePersona) {
		this.utoRequierePersona = utoRequierePersona;
	}

	public int getUtoTiempoEsperado() {
		return this.utoTiempoEsperado;
	}

	public void setUtoTiempoEsperado(int utoTiempoEsperado) {
		this.utoTiempoEsperado = utoTiempoEsperado;
	}

	public int getUtoTiempoPrioridadAlto() {
		return this.utoTiempoPrioridadAlto;
	}

	public void setUtoTiempoPrioridadAlto(int utoTiempoPrioridadAlto) {
		this.utoTiempoPrioridadAlto = utoTiempoPrioridadAlto;
	}

	public int getUtoTiempoPrioridadBajo() {
		return this.utoTiempoPrioridadBajo;
	}

	public void setUtoTiempoPrioridadBajo(int utoTiempoPrioridadBajo) {
		this.utoTiempoPrioridadBajo = utoTiempoPrioridadBajo;
	}

	public int getUtoTiempoPrioridadMedio() {
		return this.utoTiempoPrioridadMedio;
	}

	public void setUtoTiempoPrioridadMedio(int utoTiempoPrioridadMedio) {
		this.utoTiempoPrioridadMedio = utoTiempoPrioridadMedio;
	}

	public int getUttCode() {
		return this.uttCode;
	}

	public void setUttCode(int uttCode) {
		this.uttCode = uttCode;
	}

}