package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the nper_personas_auditoria database table.
 * 
 */
// @Entity
// @Table(name="nper_personas_auditoria")
@NamedQuery(name="NperPersonasAuditoria.findAll", query="SELECT n FROM NperPersonasAuditoria n")
public class NperPersonasAuditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pau_code")
	private int pauCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Lob
	@Column(name="pau_busqueda")
	private String pauBusqueda;

	@Lob
	@Column(name="pau_controles")
	private String pauControles;

	@Lob
	@Column(name="pau_objnue")
	private String pauObjnue;

	@Lob
	@Column(name="pau_objvie")
	private String pauObjvie;

	@Column(name="pau_operacion")
	private String pauOperacion;

	@Column(name="pau_origen")
	private String pauOrigen;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pau_tstamp")
	private Date pauTstamp;

	@Column(name="per_code")
	private int perCode;

	@Column(name="use_code")
	private String useCode;

	public NperPersonasAuditoria() {
	}

	public int getPauCode() {
		return this.pauCode;
	}

	public void setPauCode(int pauCode) {
		this.pauCode = pauCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getPauBusqueda() {
		return this.pauBusqueda;
	}

	public void setPauBusqueda(String pauBusqueda) {
		this.pauBusqueda = pauBusqueda;
	}

	public String getPauControles() {
		return this.pauControles;
	}

	public void setPauControles(String pauControles) {
		this.pauControles = pauControles;
	}

	public String getPauObjnue() {
		return this.pauObjnue;
	}

	public void setPauObjnue(String pauObjnue) {
		this.pauObjnue = pauObjnue;
	}

	public String getPauObjvie() {
		return this.pauObjvie;
	}

	public void setPauObjvie(String pauObjvie) {
		this.pauObjvie = pauObjvie;
	}

	public String getPauOperacion() {
		return this.pauOperacion;
	}

	public void setPauOperacion(String pauOperacion) {
		this.pauOperacion = pauOperacion;
	}

	public String getPauOrigen() {
		return this.pauOrigen;
	}

	public void setPauOrigen(String pauOrigen) {
		this.pauOrigen = pauOrigen;
	}

	public Date getPauTstamp() {
		return this.pauTstamp;
	}

	public void setPauTstamp(Date pauTstamp) {
		this.pauTstamp = pauTstamp;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}