package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utc_tramites_eventos database table.
 * 
 */
// @Entity
// @Table(name="utc_tramites_eventos")
@NamedQuery(name="UtcTramitesEvento.findAll", query="SELECT u FROM UtcTramitesEvento u")
public class UtcTramitesEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UtcTramitesEventoPK id;

	@Column(name="use_code")
	private String useCode;

	@Column(name="ute_agente")
	private int uteAgente;

	@Column(name="ute_cambios")
	private String uteCambios;

	@Column(name="ute_estado")
	private String uteEstado;

	@Column(name="ute_estado_ant")
	private String uteEstadoAnt;

	@Column(name="ute_observacion")
	private String uteObservacion;

	@Column(name="ute_supervisor")
	private int uteSupervisor;

	public UtcTramitesEvento() {
	}

	public UtcTramitesEventoPK getId() {
		return this.id;
	}

	public void setId(UtcTramitesEventoPK id) {
		this.id = id;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public int getUteAgente() {
		return this.uteAgente;
	}

	public void setUteAgente(int uteAgente) {
		this.uteAgente = uteAgente;
	}

	public String getUteCambios() {
		return this.uteCambios;
	}

	public void setUteCambios(String uteCambios) {
		this.uteCambios = uteCambios;
	}

	public String getUteEstado() {
		return this.uteEstado;
	}

	public void setUteEstado(String uteEstado) {
		this.uteEstado = uteEstado;
	}

	public String getUteEstadoAnt() {
		return this.uteEstadoAnt;
	}

	public void setUteEstadoAnt(String uteEstadoAnt) {
		this.uteEstadoAnt = uteEstadoAnt;
	}

	public String getUteObservacion() {
		return this.uteObservacion;
	}

	public void setUteObservacion(String uteObservacion) {
		this.uteObservacion = uteObservacion;
	}

	public int getUteSupervisor() {
		return this.uteSupervisor;
	}

	public void setUteSupervisor(int uteSupervisor) {
		this.uteSupervisor = uteSupervisor;
	}

}