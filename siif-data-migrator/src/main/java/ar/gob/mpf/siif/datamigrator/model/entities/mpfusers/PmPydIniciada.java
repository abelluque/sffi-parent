package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pm_pyd_iniciadas database table.
 * 
 */
// @Entity
// @Table(name="pm_pyd_iniciadas")
@NamedQuery(name="PmPydIniciada.findAll", query="SELECT p FROM PmPydIniciada p")
public class PmPydIniciada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pyd_code")
	private int pydCode;

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

	private String caratula;

	@Column(name="pres_code")
	private int presCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pyd_fecha")
	private Date pydFecha;

	private String resolucion;

	@Column(name="use_code")
	private String useCode;

	public PmPydIniciada() {
	}

	public int getPydCode() {
		return this.pydCode;
	}

	public void setPydCode(int pydCode) {
		this.pydCode = pydCode;
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

	public String getCaratula() {
		return this.caratula;
	}

	public void setCaratula(String caratula) {
		this.caratula = caratula;
	}

	public int getPresCode() {
		return this.presCode;
	}

	public void setPresCode(int presCode) {
		this.presCode = presCode;
	}

	public Date getPydFecha() {
		return this.pydFecha;
	}

	public void setPydFecha(Date pydFecha) {
		this.pydFecha = pydFecha;
	}

	public String getResolucion() {
		return this.resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}