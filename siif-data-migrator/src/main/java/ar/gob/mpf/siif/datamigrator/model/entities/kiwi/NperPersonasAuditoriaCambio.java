package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nper_personas_auditoria_cambios database table.
 * 
 */
// @Entity
// @Table(name="nper_personas_auditoria_cambios")
@NamedQuery(name="NperPersonasAuditoriaCambio.findAll", query="SELECT n FROM NperPersonasAuditoriaCambio n")
public class NperPersonasAuditoriaCambio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="pau_cambio")
	private String pauCambio;

	@Column(name="pau_campo")
	private String pauCampo;

	@Column(name="pau_code")
	private int pauCode;

	@Column(name="pau_operacion")
	private String pauOperacion;

	@Column(name="pau_tabla")
	private String pauTabla;

	@Column(name="pau_tablakey")
	private String pauTablakey;

	@Column(name="pau_valornue")
	private String pauValornue;

	@Column(name="pau_valorvie")
	private String pauValorvie;

	public NperPersonasAuditoriaCambio() {
	}

	public String getPauCambio() {
		return this.pauCambio;
	}

	public void setPauCambio(String pauCambio) {
		this.pauCambio = pauCambio;
	}

	public String getPauCampo() {
		return this.pauCampo;
	}

	public void setPauCampo(String pauCampo) {
		this.pauCampo = pauCampo;
	}

	public int getPauCode() {
		return this.pauCode;
	}

	public void setPauCode(int pauCode) {
		this.pauCode = pauCode;
	}

	public String getPauOperacion() {
		return this.pauOperacion;
	}

	public void setPauOperacion(String pauOperacion) {
		this.pauOperacion = pauOperacion;
	}

	public String getPauTabla() {
		return this.pauTabla;
	}

	public void setPauTabla(String pauTabla) {
		this.pauTabla = pauTabla;
	}

	public String getPauTablakey() {
		return this.pauTablakey;
	}

	public void setPauTablakey(String pauTablakey) {
		this.pauTablakey = pauTablakey;
	}

	public String getPauValornue() {
		return this.pauValornue;
	}

	public void setPauValornue(String pauValornue) {
		this.pauValornue = pauValornue;
	}

	public String getPauValorvie() {
		return this.pauValorvie;
	}

	public void setPauValorvie(String pauValorvie) {
		this.pauValorvie = pauValorvie;
	}

}