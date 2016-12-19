package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utc_tipos_tramites database table.
 * 
 */
// @Entity
// @Table(name="utc_tipos_tramites")
@NamedQuery(name="UtcTiposTramite.findAll", query="SELECT u FROM UtcTiposTramite u")
public class UtcTiposTramite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="utt_code")
	private int uttCode;

	@Column(name="utt_activo")
	private String uttActivo;

	@Column(name="utt_requiere_persona")
	private String uttRequierePersona;

	@Column(name="utt_tiempo_esperado")
	private int uttTiempoEsperado;

	@Column(name="utt_tipo_agente")
	private String uttTipoAgente;

	@Column(name="utt_tramite")
	private String uttTramite;

	public UtcTiposTramite() {
	}

	public int getUttCode() {
		return this.uttCode;
	}

	public void setUttCode(int uttCode) {
		this.uttCode = uttCode;
	}

	public String getUttActivo() {
		return this.uttActivo;
	}

	public void setUttActivo(String uttActivo) {
		this.uttActivo = uttActivo;
	}

	public String getUttRequierePersona() {
		return this.uttRequierePersona;
	}

	public void setUttRequierePersona(String uttRequierePersona) {
		this.uttRequierePersona = uttRequierePersona;
	}

	public int getUttTiempoEsperado() {
		return this.uttTiempoEsperado;
	}

	public void setUttTiempoEsperado(int uttTiempoEsperado) {
		this.uttTiempoEsperado = uttTiempoEsperado;
	}

	public String getUttTipoAgente() {
		return this.uttTipoAgente;
	}

	public void setUttTipoAgente(String uttTipoAgente) {
		this.uttTipoAgente = uttTipoAgente;
	}

	public String getUttTramite() {
		return this.uttTramite;
	}

	public void setUttTramite(String uttTramite) {
		this.uttTramite = uttTramite;
	}

}