package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ofavyt_intervenciones_eventos database table.
 * 
 */
// @Entity
// @Table(name="ofavyt_intervenciones_eventos")
@NamedQuery(name="OfavytIntervencionesEvento.findAll", query="SELECT o FROM OfavytIntervencionesEvento o")
public class OfavytIntervencionesEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OfavytIntervencionesEventoPK id;

	@Column(name="oie_agente")
	private int oieAgente;

	@Column(name="oie_cambios")
	private String oieCambios;

	@Column(name="oie_estado")
	private String oieEstado;

	@Column(name="oie_observacion")
	private String oieObservacion;

	@Column(name="oie_ofavyt")
	private int oieOfavyt;

	@Column(name="oie_supervisor")
	private int oieSupervisor;

	@Column(name="use_code")
	private String useCode;

	public OfavytIntervencionesEvento() {
	}

	public OfavytIntervencionesEventoPK getId() {
		return this.id;
	}

	public void setId(OfavytIntervencionesEventoPK id) {
		this.id = id;
	}

	public int getOieAgente() {
		return this.oieAgente;
	}

	public void setOieAgente(int oieAgente) {
		this.oieAgente = oieAgente;
	}

	public String getOieCambios() {
		return this.oieCambios;
	}

	public void setOieCambios(String oieCambios) {
		this.oieCambios = oieCambios;
	}

	public String getOieEstado() {
		return this.oieEstado;
	}

	public void setOieEstado(String oieEstado) {
		this.oieEstado = oieEstado;
	}

	public String getOieObservacion() {
		return this.oieObservacion;
	}

	public void setOieObservacion(String oieObservacion) {
		this.oieObservacion = oieObservacion;
	}

	public int getOieOfavyt() {
		return this.oieOfavyt;
	}

	public void setOieOfavyt(int oieOfavyt) {
		this.oieOfavyt = oieOfavyt;
	}

	public int getOieSupervisor() {
		return this.oieSupervisor;
	}

	public void setOieSupervisor(int oieSupervisor) {
		this.oieSupervisor = oieSupervisor;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}