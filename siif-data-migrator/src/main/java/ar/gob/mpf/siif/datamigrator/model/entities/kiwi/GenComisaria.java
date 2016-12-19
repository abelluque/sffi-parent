package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the gen_comisarias database table.
 * 
 */
// @Entity
// @Table(name="gen_comisarias")
@NamedQuery(name="GenComisaria.findAll", query="SELECT g FROM GenComisaria g")
public class GenComisaria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="gco_code")
	private int gcoCode;

	@Column(name="gco_altura")
	private int gcoAltura;

	@Column(name="gco_barrio")
	private String gcoBarrio;

	@Column(name="gco_cgpc")
	private String gcoCgpc;

	@Column(name="gco_contacto")
	private String gcoContacto;

	@Column(name="gco_coordx")
	private BigDecimal gcoCoordx;

	@Column(name="gco_coordy")
	private BigDecimal gcoCoordy;

	@Column(name="gco_cp")
	private String gcoCp;

	@Column(name="gco_direccion")
	private String gcoDireccion;

	@Column(name="gco_email")
	private String gcoEmail;

	@Column(name="gco_emergencias")
	private String gcoEmergencias;

	@Column(name="gco_fax")
	private String gcoFax;

	@Column(name="gco_jefe_servicios")
	private String gcoJefeServicios;

	@Column(name="gco_jurisdiccion")
	private String gcoJurisdiccion;

	@Column(name="gco_localidad")
	private String gcoLocalidad;

	@Column(name="gco_movil1")
	private String gcoMovil1;

	@Column(name="gco_movil2")
	private String gcoMovil2;

	@Column(name="gco_nombre")
	private String gcoNombre;

	@Column(name="gco_numero")
	private String gcoNumero;

	@Column(name="gco_responsable")
	private String gcoResponsable;

	@Column(name="gco_tel_fijo")
	private String gcoTelFijo;

	@Column(name="gco_tel_movil")
	private String gcoTelMovil;

	@Column(name="gco_web")
	private String gcoWeb;

	@Column(name="gco_zona")
	private String gcoZona;

	@Column(name="gfp_code")
	private int gfpCode;

	public GenComisaria() {
	}

	public int getGcoCode() {
		return this.gcoCode;
	}

	public void setGcoCode(int gcoCode) {
		this.gcoCode = gcoCode;
	}

	public int getGcoAltura() {
		return this.gcoAltura;
	}

	public void setGcoAltura(int gcoAltura) {
		this.gcoAltura = gcoAltura;
	}

	public String getGcoBarrio() {
		return this.gcoBarrio;
	}

	public void setGcoBarrio(String gcoBarrio) {
		this.gcoBarrio = gcoBarrio;
	}

	public String getGcoCgpc() {
		return this.gcoCgpc;
	}

	public void setGcoCgpc(String gcoCgpc) {
		this.gcoCgpc = gcoCgpc;
	}

	public String getGcoContacto() {
		return this.gcoContacto;
	}

	public void setGcoContacto(String gcoContacto) {
		this.gcoContacto = gcoContacto;
	}

	public BigDecimal getGcoCoordx() {
		return this.gcoCoordx;
	}

	public void setGcoCoordx(BigDecimal gcoCoordx) {
		this.gcoCoordx = gcoCoordx;
	}

	public BigDecimal getGcoCoordy() {
		return this.gcoCoordy;
	}

	public void setGcoCoordy(BigDecimal gcoCoordy) {
		this.gcoCoordy = gcoCoordy;
	}

	public String getGcoCp() {
		return this.gcoCp;
	}

	public void setGcoCp(String gcoCp) {
		this.gcoCp = gcoCp;
	}

	public String getGcoDireccion() {
		return this.gcoDireccion;
	}

	public void setGcoDireccion(String gcoDireccion) {
		this.gcoDireccion = gcoDireccion;
	}

	public String getGcoEmail() {
		return this.gcoEmail;
	}

	public void setGcoEmail(String gcoEmail) {
		this.gcoEmail = gcoEmail;
	}

	public String getGcoEmergencias() {
		return this.gcoEmergencias;
	}

	public void setGcoEmergencias(String gcoEmergencias) {
		this.gcoEmergencias = gcoEmergencias;
	}

	public String getGcoFax() {
		return this.gcoFax;
	}

	public void setGcoFax(String gcoFax) {
		this.gcoFax = gcoFax;
	}

	public String getGcoJefeServicios() {
		return this.gcoJefeServicios;
	}

	public void setGcoJefeServicios(String gcoJefeServicios) {
		this.gcoJefeServicios = gcoJefeServicios;
	}

	public String getGcoJurisdiccion() {
		return this.gcoJurisdiccion;
	}

	public void setGcoJurisdiccion(String gcoJurisdiccion) {
		this.gcoJurisdiccion = gcoJurisdiccion;
	}

	public String getGcoLocalidad() {
		return this.gcoLocalidad;
	}

	public void setGcoLocalidad(String gcoLocalidad) {
		this.gcoLocalidad = gcoLocalidad;
	}

	public String getGcoMovil1() {
		return this.gcoMovil1;
	}

	public void setGcoMovil1(String gcoMovil1) {
		this.gcoMovil1 = gcoMovil1;
	}

	public String getGcoMovil2() {
		return this.gcoMovil2;
	}

	public void setGcoMovil2(String gcoMovil2) {
		this.gcoMovil2 = gcoMovil2;
	}

	public String getGcoNombre() {
		return this.gcoNombre;
	}

	public void setGcoNombre(String gcoNombre) {
		this.gcoNombre = gcoNombre;
	}

	public String getGcoNumero() {
		return this.gcoNumero;
	}

	public void setGcoNumero(String gcoNumero) {
		this.gcoNumero = gcoNumero;
	}

	public String getGcoResponsable() {
		return this.gcoResponsable;
	}

	public void setGcoResponsable(String gcoResponsable) {
		this.gcoResponsable = gcoResponsable;
	}

	public String getGcoTelFijo() {
		return this.gcoTelFijo;
	}

	public void setGcoTelFijo(String gcoTelFijo) {
		this.gcoTelFijo = gcoTelFijo;
	}

	public String getGcoTelMovil() {
		return this.gcoTelMovil;
	}

	public void setGcoTelMovil(String gcoTelMovil) {
		this.gcoTelMovil = gcoTelMovil;
	}

	public String getGcoWeb() {
		return this.gcoWeb;
	}

	public void setGcoWeb(String gcoWeb) {
		this.gcoWeb = gcoWeb;
	}

	public String getGcoZona() {
		return this.gcoZona;
	}

	public void setGcoZona(String gcoZona) {
		this.gcoZona = gcoZona;
	}

	public int getGfpCode() {
		return this.gfpCode;
	}

	public void setGfpCode(int gfpCode) {
		this.gfpCode = gfpCode;
	}

}