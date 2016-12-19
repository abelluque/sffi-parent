package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pm_licencias_capacitacion database table.
 * 
 */
// @Entity
// @Table(name="pm_licencias_capacitacion")
@NamedQuery(name="PmLicenciasCapacitacion.findAll", query="SELECT p FROM PmLicenciasCapacitacion p")
public class PmLicenciasCapacitacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int lemid;

	@Column(name="app_number")
	private int appNumber;

	@Column(name="app_uid")
	private String appUid;

	private String codigo;

	private String estado;

	@Temporal(TemporalType.DATE)
	private Date fecdesde;

	@Temporal(TemporalType.DATE)
	private Date fechasta;

	@Temporal(TemporalType.DATE)
	private Date fecotorga;

	private String licencia;

	private String nombre;

	private String observ;

	@Column(name="pm_observ")
	private String pmObserv;

	private int solid;

	private int tiplicid;

	public PmLicenciasCapacitacion() {
	}

	public int getLemid() {
		return this.lemid;
	}

	public void setLemid(int lemid) {
		this.lemid = lemid;
	}

	public int getAppNumber() {
		return this.appNumber;
	}

	public void setAppNumber(int appNumber) {
		this.appNumber = appNumber;
	}

	public String getAppUid() {
		return this.appUid;
	}

	public void setAppUid(String appUid) {
		this.appUid = appUid;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecdesde() {
		return this.fecdesde;
	}

	public void setFecdesde(Date fecdesde) {
		this.fecdesde = fecdesde;
	}

	public Date getFechasta() {
		return this.fechasta;
	}

	public void setFechasta(Date fechasta) {
		this.fechasta = fechasta;
	}

	public Date getFecotorga() {
		return this.fecotorga;
	}

	public void setFecotorga(Date fecotorga) {
		this.fecotorga = fecotorga;
	}

	public String getLicencia() {
		return this.licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObserv() {
		return this.observ;
	}

	public void setObserv(String observ) {
		this.observ = observ;
	}

	public String getPmObserv() {
		return this.pmObserv;
	}

	public void setPmObserv(String pmObserv) {
		this.pmObserv = pmObserv;
	}

	public int getSolid() {
		return this.solid;
	}

	public void setSolid(int solid) {
		this.solid = solid;
	}

	public int getTiplicid() {
		return this.tiplicid;
	}

	public void setTiplicid(int tiplicid) {
		this.tiplicid = tiplicid;
	}

}