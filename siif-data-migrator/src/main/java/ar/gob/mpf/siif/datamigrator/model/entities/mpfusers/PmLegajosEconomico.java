package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pm_legajos_economicos database table.
 * 
 */
// @Entity
// @Table(name="pm_legajos_economicos")
@NamedQuery(name="PmLegajosEconomico.findAll", query="SELECT p FROM PmLegajosEconomico p")
public class PmLegajosEconomico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ple_code")
	private int pleCode;

	@Column(name="actuacion_interna")
	private int actuacionInterna;

	@Column(name="app_estado")
	private String appEstado;

	@Column(name="app_historial_uid")
	private String appHistorialUid;

	@Column(name="app_index")
	private int appIndex;

	@Column(name="app_number")
	private int appNumber;

	@Column(name="app_pin")
	private String appPin;

	@Column(name="app_uid")
	private String appUid;

	@Column(name="ple_caratula")
	private String pleCaratula;

	@Column(name="ple_control")
	private String pleControl;

	@Column(name="ple_estado")
	private String pleEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ple_fecha")
	private Date pleFecha;

	@Column(name="ple_observacion")
	private String pleObservacion;

	@Column(name="ple_parentesco")
	private String pleParentesco;

	@Column(name="ple_persona")
	private String plePersona;

	@Column(name="ple_pertenece")
	private String plePertenece;

	@Column(name="ple_relacionado")
	private String pleRelacionado;

	@Column(name="ptr_code")
	private int ptrCode;

	@Column(name="use_code")
	private int useCode;

	@Column(name="usf_code")
	private int usfCode;

	public PmLegajosEconomico() {
	}

	public int getPleCode() {
		return this.pleCode;
	}

	public void setPleCode(int pleCode) {
		this.pleCode = pleCode;
	}

	public int getActuacionInterna() {
		return this.actuacionInterna;
	}

	public void setActuacionInterna(int actuacionInterna) {
		this.actuacionInterna = actuacionInterna;
	}

	public String getAppEstado() {
		return this.appEstado;
	}

	public void setAppEstado(String appEstado) {
		this.appEstado = appEstado;
	}

	public String getAppHistorialUid() {
		return this.appHistorialUid;
	}

	public void setAppHistorialUid(String appHistorialUid) {
		this.appHistorialUid = appHistorialUid;
	}

	public int getAppIndex() {
		return this.appIndex;
	}

	public void setAppIndex(int appIndex) {
		this.appIndex = appIndex;
	}

	public int getAppNumber() {
		return this.appNumber;
	}

	public void setAppNumber(int appNumber) {
		this.appNumber = appNumber;
	}

	public String getAppPin() {
		return this.appPin;
	}

	public void setAppPin(String appPin) {
		this.appPin = appPin;
	}

	public String getAppUid() {
		return this.appUid;
	}

	public void setAppUid(String appUid) {
		this.appUid = appUid;
	}

	public String getPleCaratula() {
		return this.pleCaratula;
	}

	public void setPleCaratula(String pleCaratula) {
		this.pleCaratula = pleCaratula;
	}

	public String getPleControl() {
		return this.pleControl;
	}

	public void setPleControl(String pleControl) {
		this.pleControl = pleControl;
	}

	public String getPleEstado() {
		return this.pleEstado;
	}

	public void setPleEstado(String pleEstado) {
		this.pleEstado = pleEstado;
	}

	public Date getPleFecha() {
		return this.pleFecha;
	}

	public void setPleFecha(Date pleFecha) {
		this.pleFecha = pleFecha;
	}

	public String getPleObservacion() {
		return this.pleObservacion;
	}

	public void setPleObservacion(String pleObservacion) {
		this.pleObservacion = pleObservacion;
	}

	public String getPleParentesco() {
		return this.pleParentesco;
	}

	public void setPleParentesco(String pleParentesco) {
		this.pleParentesco = pleParentesco;
	}

	public String getPlePersona() {
		return this.plePersona;
	}

	public void setPlePersona(String plePersona) {
		this.plePersona = plePersona;
	}

	public String getPlePertenece() {
		return this.plePertenece;
	}

	public void setPlePertenece(String plePertenece) {
		this.plePertenece = plePertenece;
	}

	public String getPleRelacionado() {
		return this.pleRelacionado;
	}

	public void setPleRelacionado(String pleRelacionado) {
		this.pleRelacionado = pleRelacionado;
	}

	public int getPtrCode() {
		return this.ptrCode;
	}

	public void setPtrCode(int ptrCode) {
		this.ptrCode = ptrCode;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

	public int getUsfCode() {
		return this.usfCode;
	}

	public void setUsfCode(int usfCode) {
		this.usfCode = usfCode;
	}

}