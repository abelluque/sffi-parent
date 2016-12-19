package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ofavyt_intervenciones_agenda database table.
 * 
 */
// @Entity
// @Table(name="ofavyt_intervenciones_agenda")
@NamedQuery(name="OfavytIntervencionesAgenda.findAll", query="SELECT o FROM OfavytIntervencionesAgenda o")
public class OfavytIntervencionesAgenda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oia_code")
	private int oiaCode;

	@Column(name="oia_agente")
	private int oiaAgente;

	@Column(name="oia_estado")
	private String oiaEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oia_fecha")
	private Date oiaFecha;

	@Column(name="oia_observacion")
	private String oiaObservacion;

	@Column(name="oia_ofavyt")
	private int oiaOfavyt;

	@Column(name="oia_supervisor")
	private int oiaSupervisor;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oia_tstamp")
	private Date oiaTstamp;

	@Column(name="oin_code")
	private int oinCode;

	@Column(name="oti_code")
	private int otiCode;

	@Column(name="use_code")
	private String useCode;

	public OfavytIntervencionesAgenda() {
	}

	public int getOiaCode() {
		return this.oiaCode;
	}

	public void setOiaCode(int oiaCode) {
		this.oiaCode = oiaCode;
	}

	public int getOiaAgente() {
		return this.oiaAgente;
	}

	public void setOiaAgente(int oiaAgente) {
		this.oiaAgente = oiaAgente;
	}

	public String getOiaEstado() {
		return this.oiaEstado;
	}

	public void setOiaEstado(String oiaEstado) {
		this.oiaEstado = oiaEstado;
	}

	public Date getOiaFecha() {
		return this.oiaFecha;
	}

	public void setOiaFecha(Date oiaFecha) {
		this.oiaFecha = oiaFecha;
	}

	public String getOiaObservacion() {
		return this.oiaObservacion;
	}

	public void setOiaObservacion(String oiaObservacion) {
		this.oiaObservacion = oiaObservacion;
	}

	public int getOiaOfavyt() {
		return this.oiaOfavyt;
	}

	public void setOiaOfavyt(int oiaOfavyt) {
		this.oiaOfavyt = oiaOfavyt;
	}

	public int getOiaSupervisor() {
		return this.oiaSupervisor;
	}

	public void setOiaSupervisor(int oiaSupervisor) {
		this.oiaSupervisor = oiaSupervisor;
	}

	public Date getOiaTstamp() {
		return this.oiaTstamp;
	}

	public void setOiaTstamp(Date oiaTstamp) {
		this.oiaTstamp = oiaTstamp;
	}

	public int getOinCode() {
		return this.oinCode;
	}

	public void setOinCode(int oinCode) {
		this.oinCode = oinCode;
	}

	public int getOtiCode() {
		return this.otiCode;
	}

	public void setOtiCode(int otiCode) {
		this.otiCode = otiCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}