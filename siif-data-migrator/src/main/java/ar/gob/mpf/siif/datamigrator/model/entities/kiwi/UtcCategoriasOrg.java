package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utc_categorias_orgs database table.
 * 
 */
// @Entity
// @Table(name="utc_categorias_orgs")
@NamedQuery(name="UtcCategoriasOrg.findAll", query="SELECT u FROM UtcCategoriasOrg u")
public class UtcCategoriasOrg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="uco_code")
	private int ucoCode;

	@Column(name="uco_activo")
	private String ucoActivo;

	@Column(name="uco_altura")
	private int ucoAltura;

	@Column(name="uco_calle_nombre")
	private String ucoCalleNombre;

	@Column(name="uco_contacto")
	private String ucoContacto;

	@Column(name="uco_coordx")
	private float ucoCoordx;

	@Column(name="uco_coordy")
	private float ucoCoordy;

	@Column(name="uco_cp")
	private String ucoCp;

	@Column(name="uco_dpto")
	private String ucoDpto;

	@Column(name="uco_email")
	private String ucoEmail;

	@Column(name="uco_fax")
	private String ucoFax;

	@Column(name="uco_horario")
	private String ucoHorario;

	@Column(name="uco_localidad")
	private String ucoLocalidad;

	@Column(name="uco_nombre")
	private String ucoNombre;

	@Column(name="uco_piso")
	private String ucoPiso;

	@Column(name="uco_tel_fijo")
	private String ucoTelFijo;

	@Column(name="uco_tel_movil")
	private String ucoTelMovil;

	@Column(name="uco_tiempo_esperado")
	private int ucoTiempoEsperado;

	@Column(name="uco_web")
	private String ucoWeb;

	public UtcCategoriasOrg() {
	}

	public int getUcoCode() {
		return this.ucoCode;
	}

	public void setUcoCode(int ucoCode) {
		this.ucoCode = ucoCode;
	}

	public String getUcoActivo() {
		return this.ucoActivo;
	}

	public void setUcoActivo(String ucoActivo) {
		this.ucoActivo = ucoActivo;
	}

	public int getUcoAltura() {
		return this.ucoAltura;
	}

	public void setUcoAltura(int ucoAltura) {
		this.ucoAltura = ucoAltura;
	}

	public String getUcoCalleNombre() {
		return this.ucoCalleNombre;
	}

	public void setUcoCalleNombre(String ucoCalleNombre) {
		this.ucoCalleNombre = ucoCalleNombre;
	}

	public String getUcoContacto() {
		return this.ucoContacto;
	}

	public void setUcoContacto(String ucoContacto) {
		this.ucoContacto = ucoContacto;
	}

	public float getUcoCoordx() {
		return this.ucoCoordx;
	}

	public void setUcoCoordx(float ucoCoordx) {
		this.ucoCoordx = ucoCoordx;
	}

	public float getUcoCoordy() {
		return this.ucoCoordy;
	}

	public void setUcoCoordy(float ucoCoordy) {
		this.ucoCoordy = ucoCoordy;
	}

	public String getUcoCp() {
		return this.ucoCp;
	}

	public void setUcoCp(String ucoCp) {
		this.ucoCp = ucoCp;
	}

	public String getUcoDpto() {
		return this.ucoDpto;
	}

	public void setUcoDpto(String ucoDpto) {
		this.ucoDpto = ucoDpto;
	}

	public String getUcoEmail() {
		return this.ucoEmail;
	}

	public void setUcoEmail(String ucoEmail) {
		this.ucoEmail = ucoEmail;
	}

	public String getUcoFax() {
		return this.ucoFax;
	}

	public void setUcoFax(String ucoFax) {
		this.ucoFax = ucoFax;
	}

	public String getUcoHorario() {
		return this.ucoHorario;
	}

	public void setUcoHorario(String ucoHorario) {
		this.ucoHorario = ucoHorario;
	}

	public String getUcoLocalidad() {
		return this.ucoLocalidad;
	}

	public void setUcoLocalidad(String ucoLocalidad) {
		this.ucoLocalidad = ucoLocalidad;
	}

	public String getUcoNombre() {
		return this.ucoNombre;
	}

	public void setUcoNombre(String ucoNombre) {
		this.ucoNombre = ucoNombre;
	}

	public String getUcoPiso() {
		return this.ucoPiso;
	}

	public void setUcoPiso(String ucoPiso) {
		this.ucoPiso = ucoPiso;
	}

	public String getUcoTelFijo() {
		return this.ucoTelFijo;
	}

	public void setUcoTelFijo(String ucoTelFijo) {
		this.ucoTelFijo = ucoTelFijo;
	}

	public String getUcoTelMovil() {
		return this.ucoTelMovil;
	}

	public void setUcoTelMovil(String ucoTelMovil) {
		this.ucoTelMovil = ucoTelMovil;
	}

	public int getUcoTiempoEsperado() {
		return this.ucoTiempoEsperado;
	}

	public void setUcoTiempoEsperado(int ucoTiempoEsperado) {
		this.ucoTiempoEsperado = ucoTiempoEsperado;
	}

	public String getUcoWeb() {
		return this.ucoWeb;
	}

	public void setUcoWeb(String ucoWeb) {
		this.ucoWeb = ucoWeb;
	}

}