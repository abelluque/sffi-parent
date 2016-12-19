package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the nper_personas_eventos database table.
 * 
 */
// @Entity
// @Table(name="nper_personas_eventos")
@NamedQuery(name="NperPersonasEvento.findAll", query="SELECT n FROM NperPersonasEvento n")
public class NperPersonasEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pev_code")
	private int pevCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="per_code")
	private int perCode;

	@Column(name="pev_deleted")
	private String pevDeleted;

	@Column(name="pev_descripcion")
	private String pevDescripcion;

	@Column(name="pev_evento")
	private String pevEvento;

	@Column(name="pev_evento_code")
	private int pevEventoCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pev_fecha_hora")
	private Date pevFechaHora;

	@Column(name="pev_link")
	private String pevLink;

	@Column(name="pev_rol")
	private String pevRol;

	@Column(name="use_code")
	private String useCode;

	public NperPersonasEvento() {
	}

	public int getPevCode() {
		return this.pevCode;
	}

	public void setPevCode(int pevCode) {
		this.pevCode = pevCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public String getPevDeleted() {
		return this.pevDeleted;
	}

	public void setPevDeleted(String pevDeleted) {
		this.pevDeleted = pevDeleted;
	}

	public String getPevDescripcion() {
		return this.pevDescripcion;
	}

	public void setPevDescripcion(String pevDescripcion) {
		this.pevDescripcion = pevDescripcion;
	}

	public String getPevEvento() {
		return this.pevEvento;
	}

	public void setPevEvento(String pevEvento) {
		this.pevEvento = pevEvento;
	}

	public int getPevEventoCode() {
		return this.pevEventoCode;
	}

	public void setPevEventoCode(int pevEventoCode) {
		this.pevEventoCode = pevEventoCode;
	}

	public Date getPevFechaHora() {
		return this.pevFechaHora;
	}

	public void setPevFechaHora(Date pevFechaHora) {
		this.pevFechaHora = pevFechaHora;
	}

	public String getPevLink() {
		return this.pevLink;
	}

	public void setPevLink(String pevLink) {
		this.pevLink = pevLink;
	}

	public String getPevRol() {
		return this.pevRol;
	}

	public void setPevRol(String pevRol) {
		this.pevRol = pevRol;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}