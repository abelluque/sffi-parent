package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ofavyt_tipos_intervenciones database table.
 * 
 */
// @Entity
// @Table(name="ofavyt_tipos_intervenciones")
@NamedQuery(name="OfavytTiposIntervencione.findAll", query="SELECT o FROM OfavytTiposIntervencione o")
public class OfavytTiposIntervencione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ots_code")
	private int otsCode;

	@Column(name="ocs_code")
	private int ocsCode;

	@Column(name="ots_activo")
	private String otsActivo;

	@Column(name="ots_intervencion")
	private String otsIntervencion;

	@Column(name="ots_requiere_persona")
	private String otsRequierePersona;

	@Column(name="ots_tipo_agente")
	private String otsTipoAgente;

	public OfavytTiposIntervencione() {
	}

	public int getOtsCode() {
		return this.otsCode;
	}

	public void setOtsCode(int otsCode) {
		this.otsCode = otsCode;
	}

	public int getOcsCode() {
		return this.ocsCode;
	}

	public void setOcsCode(int ocsCode) {
		this.ocsCode = ocsCode;
	}

	public String getOtsActivo() {
		return this.otsActivo;
	}

	public void setOtsActivo(String otsActivo) {
		this.otsActivo = otsActivo;
	}

	public String getOtsIntervencion() {
		return this.otsIntervencion;
	}

	public void setOtsIntervencion(String otsIntervencion) {
		this.otsIntervencion = otsIntervencion;
	}

	public String getOtsRequierePersona() {
		return this.otsRequierePersona;
	}

	public void setOtsRequierePersona(String otsRequierePersona) {
		this.otsRequierePersona = otsRequierePersona;
	}

	public String getOtsTipoAgente() {
		return this.otsTipoAgente;
	}

	public void setOtsTipoAgente(String otsTipoAgente) {
		this.otsTipoAgente = otsTipoAgente;
	}

}