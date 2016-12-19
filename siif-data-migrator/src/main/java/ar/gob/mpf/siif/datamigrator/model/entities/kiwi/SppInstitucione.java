package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spp_instituciones database table.
 * 
 */
// @Entity
// @Table(name="spp_instituciones")
@NamedQuery(name="SppInstitucione.findAll", query="SELECT s FROM SppInstitucione s")
public class SppInstitucione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sin_code")
	private int sinCode;

	@Column(name="sdp_code")
	private int sdpCode;

	@Column(name="sin_altura")
	private int sinAltura;

	@Column(name="sin_barrio")
	private String sinBarrio;

	@Column(name="sin_calle")
	private String sinCalle;

	@Column(name="sin_calle_villa")
	private String sinCalleVilla;

	@Column(name="sin_casa")
	private String sinCasa;

	@Column(name="sin_cgpc")
	private String sinCgpc;

	@Column(name="sin_ciudad")
	private String sinCiudad;

	@Column(name="sin_codvie")
	private int sinCodvie;

	@Column(name="sin_contacto")
	private String sinContacto;

	@Column(name="sin_coordx")
	private float sinCoordx;

	@Column(name="sin_coordy")
	private float sinCoordy;

	@Column(name="sin_cp")
	private String sinCp;

	@Column(name="sin_depto")
	private String sinDepto;

	@Column(name="sin_email")
	private String sinEmail;

	@Column(name="sin_estado")
	private String sinEstado;

	@Column(name="sin_fax")
	private String sinFax;

	@Column(name="sin_horario")
	private String sinHorario;

	@Column(name="sin_info_adicional")
	private String sinInfoAdicional;

	@Column(name="sin_institucion")
	private String sinInstitucion;

	@Column(name="sin_localidad")
	private String sinLocalidad;

	@Column(name="sin_lote")
	private String sinLote;

	@Column(name="sin_manzana")
	private String sinManzana;

	@Column(name="sin_otro")
	private String sinOtro;

	@Column(name="sin_piso")
	private String sinPiso;

	@Column(name="sin_provincia")
	private String sinProvincia;

	@Column(name="sin_tel_fijo")
	private String sinTelFijo;

	@Column(name="sin_tel_movil")
	private String sinTelMovil;

	@Column(name="sin_tipo")
	private String sinTipo;

	@Column(name="sin_tipo_domicilio")
	private String sinTipoDomicilio;

	@Column(name="sin_torre")
	private String sinTorre;

	@Column(name="sin_villa")
	private int sinVilla;

	@Column(name="sin_web")
	private String sinWeb;

	public SppInstitucione() {
	}

	public int getSinCode() {
		return this.sinCode;
	}

	public void setSinCode(int sinCode) {
		this.sinCode = sinCode;
	}

	public int getSdpCode() {
		return this.sdpCode;
	}

	public void setSdpCode(int sdpCode) {
		this.sdpCode = sdpCode;
	}

	public int getSinAltura() {
		return this.sinAltura;
	}

	public void setSinAltura(int sinAltura) {
		this.sinAltura = sinAltura;
	}

	public String getSinBarrio() {
		return this.sinBarrio;
	}

	public void setSinBarrio(String sinBarrio) {
		this.sinBarrio = sinBarrio;
	}

	public String getSinCalle() {
		return this.sinCalle;
	}

	public void setSinCalle(String sinCalle) {
		this.sinCalle = sinCalle;
	}

	public String getSinCalleVilla() {
		return this.sinCalleVilla;
	}

	public void setSinCalleVilla(String sinCalleVilla) {
		this.sinCalleVilla = sinCalleVilla;
	}

	public String getSinCasa() {
		return this.sinCasa;
	}

	public void setSinCasa(String sinCasa) {
		this.sinCasa = sinCasa;
	}

	public String getSinCgpc() {
		return this.sinCgpc;
	}

	public void setSinCgpc(String sinCgpc) {
		this.sinCgpc = sinCgpc;
	}

	public String getSinCiudad() {
		return this.sinCiudad;
	}

	public void setSinCiudad(String sinCiudad) {
		this.sinCiudad = sinCiudad;
	}

	public int getSinCodvie() {
		return this.sinCodvie;
	}

	public void setSinCodvie(int sinCodvie) {
		this.sinCodvie = sinCodvie;
	}

	public String getSinContacto() {
		return this.sinContacto;
	}

	public void setSinContacto(String sinContacto) {
		this.sinContacto = sinContacto;
	}

	public float getSinCoordx() {
		return this.sinCoordx;
	}

	public void setSinCoordx(float sinCoordx) {
		this.sinCoordx = sinCoordx;
	}

	public float getSinCoordy() {
		return this.sinCoordy;
	}

	public void setSinCoordy(float sinCoordy) {
		this.sinCoordy = sinCoordy;
	}

	public String getSinCp() {
		return this.sinCp;
	}

	public void setSinCp(String sinCp) {
		this.sinCp = sinCp;
	}

	public String getSinDepto() {
		return this.sinDepto;
	}

	public void setSinDepto(String sinDepto) {
		this.sinDepto = sinDepto;
	}

	public String getSinEmail() {
		return this.sinEmail;
	}

	public void setSinEmail(String sinEmail) {
		this.sinEmail = sinEmail;
	}

	public String getSinEstado() {
		return this.sinEstado;
	}

	public void setSinEstado(String sinEstado) {
		this.sinEstado = sinEstado;
	}

	public String getSinFax() {
		return this.sinFax;
	}

	public void setSinFax(String sinFax) {
		this.sinFax = sinFax;
	}

	public String getSinHorario() {
		return this.sinHorario;
	}

	public void setSinHorario(String sinHorario) {
		this.sinHorario = sinHorario;
	}

	public String getSinInfoAdicional() {
		return this.sinInfoAdicional;
	}

	public void setSinInfoAdicional(String sinInfoAdicional) {
		this.sinInfoAdicional = sinInfoAdicional;
	}

	public String getSinInstitucion() {
		return this.sinInstitucion;
	}

	public void setSinInstitucion(String sinInstitucion) {
		this.sinInstitucion = sinInstitucion;
	}

	public String getSinLocalidad() {
		return this.sinLocalidad;
	}

	public void setSinLocalidad(String sinLocalidad) {
		this.sinLocalidad = sinLocalidad;
	}

	public String getSinLote() {
		return this.sinLote;
	}

	public void setSinLote(String sinLote) {
		this.sinLote = sinLote;
	}

	public String getSinManzana() {
		return this.sinManzana;
	}

	public void setSinManzana(String sinManzana) {
		this.sinManzana = sinManzana;
	}

	public String getSinOtro() {
		return this.sinOtro;
	}

	public void setSinOtro(String sinOtro) {
		this.sinOtro = sinOtro;
	}

	public String getSinPiso() {
		return this.sinPiso;
	}

	public void setSinPiso(String sinPiso) {
		this.sinPiso = sinPiso;
	}

	public String getSinProvincia() {
		return this.sinProvincia;
	}

	public void setSinProvincia(String sinProvincia) {
		this.sinProvincia = sinProvincia;
	}

	public String getSinTelFijo() {
		return this.sinTelFijo;
	}

	public void setSinTelFijo(String sinTelFijo) {
		this.sinTelFijo = sinTelFijo;
	}

	public String getSinTelMovil() {
		return this.sinTelMovil;
	}

	public void setSinTelMovil(String sinTelMovil) {
		this.sinTelMovil = sinTelMovil;
	}

	public String getSinTipo() {
		return this.sinTipo;
	}

	public void setSinTipo(String sinTipo) {
		this.sinTipo = sinTipo;
	}

	public String getSinTipoDomicilio() {
		return this.sinTipoDomicilio;
	}

	public void setSinTipoDomicilio(String sinTipoDomicilio) {
		this.sinTipoDomicilio = sinTipoDomicilio;
	}

	public String getSinTorre() {
		return this.sinTorre;
	}

	public void setSinTorre(String sinTorre) {
		this.sinTorre = sinTorre;
	}

	public int getSinVilla() {
		return this.sinVilla;
	}

	public void setSinVilla(int sinVilla) {
		this.sinVilla = sinVilla;
	}

	public String getSinWeb() {
		return this.sinWeb;
	}

	public void setSinWeb(String sinWeb) {
		this.sinWeb = sinWeb;
	}

}