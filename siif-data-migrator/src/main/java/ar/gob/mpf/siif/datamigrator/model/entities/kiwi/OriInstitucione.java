package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ori_instituciones database table.
 * 
 */
// @Entity
// @Table(name="ori_instituciones")
@NamedQuery(name="OriInstitucione.findAll", query="SELECT o FROM OriInstitucione o")
public class OriInstitucione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oin_code")
	private int oinCode;

	@Column(name="odp_code")
	private int odpCode;

	@Column(name="oin_activo")
	private String oinActivo;

	@Column(name="oin_barrio")
	private String oinBarrio;

	@Column(name="oin_calle")
	private int oinCalle;

	@Column(name="oin_cgpc")
	private String oinCgpc;

	@Column(name="oin_codvie")
	private int oinCodvie;

	@Column(name="oin_contacto")
	private String oinContacto;

	@Column(name="oin_coordx")
	private float oinCoordx;

	@Column(name="oin_coordy")
	private float oinCoordy;

	@Column(name="oin_cp")
	private String oinCp;

	@Column(name="oin_direccion")
	private String oinDireccion;

	@Column(name="oin_email")
	private String oinEmail;

	@Column(name="oin_fax")
	private String oinFax;

	@Column(name="oin_horario")
	private String oinHorario;

	@Lob
	@Column(name="oin_info_adicional")
	private String oinInfoAdicional;

	@Column(name="oin_institucion")
	private String oinInstitucion;

	@Column(name="oin_localidad")
	private String oinLocalidad;

	@Column(name="oin_num_direccion")
	private int oinNumDireccion;

	@Column(name="oin_provincia")
	private String oinProvincia;

	@Column(name="oin_tel_fijo")
	private String oinTelFijo;

	@Column(name="oin_tel_movil")
	private String oinTelMovil;

	@Column(name="oin_web")
	private String oinWeb;

	public OriInstitucione() {
	}

	public int getOinCode() {
		return this.oinCode;
	}

	public void setOinCode(int oinCode) {
		this.oinCode = oinCode;
	}

	public int getOdpCode() {
		return this.odpCode;
	}

	public void setOdpCode(int odpCode) {
		this.odpCode = odpCode;
	}

	public String getOinActivo() {
		return this.oinActivo;
	}

	public void setOinActivo(String oinActivo) {
		this.oinActivo = oinActivo;
	}

	public String getOinBarrio() {
		return this.oinBarrio;
	}

	public void setOinBarrio(String oinBarrio) {
		this.oinBarrio = oinBarrio;
	}

	public int getOinCalle() {
		return this.oinCalle;
	}

	public void setOinCalle(int oinCalle) {
		this.oinCalle = oinCalle;
	}

	public String getOinCgpc() {
		return this.oinCgpc;
	}

	public void setOinCgpc(String oinCgpc) {
		this.oinCgpc = oinCgpc;
	}

	public int getOinCodvie() {
		return this.oinCodvie;
	}

	public void setOinCodvie(int oinCodvie) {
		this.oinCodvie = oinCodvie;
	}

	public String getOinContacto() {
		return this.oinContacto;
	}

	public void setOinContacto(String oinContacto) {
		this.oinContacto = oinContacto;
	}

	public float getOinCoordx() {
		return this.oinCoordx;
	}

	public void setOinCoordx(float oinCoordx) {
		this.oinCoordx = oinCoordx;
	}

	public float getOinCoordy() {
		return this.oinCoordy;
	}

	public void setOinCoordy(float oinCoordy) {
		this.oinCoordy = oinCoordy;
	}

	public String getOinCp() {
		return this.oinCp;
	}

	public void setOinCp(String oinCp) {
		this.oinCp = oinCp;
	}

	public String getOinDireccion() {
		return this.oinDireccion;
	}

	public void setOinDireccion(String oinDireccion) {
		this.oinDireccion = oinDireccion;
	}

	public String getOinEmail() {
		return this.oinEmail;
	}

	public void setOinEmail(String oinEmail) {
		this.oinEmail = oinEmail;
	}

	public String getOinFax() {
		return this.oinFax;
	}

	public void setOinFax(String oinFax) {
		this.oinFax = oinFax;
	}

	public String getOinHorario() {
		return this.oinHorario;
	}

	public void setOinHorario(String oinHorario) {
		this.oinHorario = oinHorario;
	}

	public String getOinInfoAdicional() {
		return this.oinInfoAdicional;
	}

	public void setOinInfoAdicional(String oinInfoAdicional) {
		this.oinInfoAdicional = oinInfoAdicional;
	}

	public String getOinInstitucion() {
		return this.oinInstitucion;
	}

	public void setOinInstitucion(String oinInstitucion) {
		this.oinInstitucion = oinInstitucion;
	}

	public String getOinLocalidad() {
		return this.oinLocalidad;
	}

	public void setOinLocalidad(String oinLocalidad) {
		this.oinLocalidad = oinLocalidad;
	}

	public int getOinNumDireccion() {
		return this.oinNumDireccion;
	}

	public void setOinNumDireccion(int oinNumDireccion) {
		this.oinNumDireccion = oinNumDireccion;
	}

	public String getOinProvincia() {
		return this.oinProvincia;
	}

	public void setOinProvincia(String oinProvincia) {
		this.oinProvincia = oinProvincia;
	}

	public String getOinTelFijo() {
		return this.oinTelFijo;
	}

	public void setOinTelFijo(String oinTelFijo) {
		this.oinTelFijo = oinTelFijo;
	}

	public String getOinTelMovil() {
		return this.oinTelMovil;
	}

	public void setOinTelMovil(String oinTelMovil) {
		this.oinTelMovil = oinTelMovil;
	}

	public String getOinWeb() {
		return this.oinWeb;
	}

	public void setOinWeb(String oinWeb) {
		this.oinWeb = oinWeb;
	}

}