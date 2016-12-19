package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the oci_personas database table.
 * 
 */
// @Entity
// @Table(name="oci_personas")
@NamedQuery(name="OciPersona.findAll", query="SELECT o FROM OciPersona o")
public class OciPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ope_code")
	private int opeCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="ope_alias")
	private String opeAlias;

	@Column(name="ope_apellido")
	private String opeApellido;

	@Column(name="ope_bar_frecuente")
	private String opeBarFrecuente;

	@Column(name="ope_boca")
	private String opeBoca;

	@Column(name="ope_cejas")
	private String opeCejas;

	@Column(name="ope_estado_civil")
	private String opeEstadoCivil;

	@Column(name="ope_estatura")
	private int opeEstatura;

	@Column(name="ope_estudios")
	private String opeEstudios;

	@Temporal(TemporalType.DATE)
	@Column(name="ope_fec_nac")
	private Date opeFecNac;

	@Column(name="ope_frente")
	private String opeFrente;

	@Column(name="ope_identidad_genero")
	private String opeIdentidadGenero;

	@Column(name="ope_identificado")
	private String opeIdentificado;

	@Column(name="ope_labios")
	private String opeLabios;

	@Column(name="ope_lee")
	private String opeLee;

	@Column(name="ope_lugar_trabajo")
	private String opeLugarTrabajo;

	@Column(name="ope_marcas_particulares")
	private String opeMarcasParticulares;

	@Column(name="ope_menton")
	private String opeMenton;

	@Column(name="ope_nacido_en")
	private String opeNacidoEn;

	@Column(name="ope_nacionalidad")
	private String opeNacionalidad;

	@Column(name="ope_nariz_base")
	private String opeNarizBase;

	@Column(name="ope_nariz_dorso")
	private String opeNarizDorso;

	@Column(name="ope_nombre")
	private String opeNombre;

	@Column(name="ope_nombre_madre")
	private String opeNombreMadre;

	@Column(name="ope_nombre_padre")
	private String opeNombrePadre;

	@Column(name="ope_observacion")
	private String opeObservacion;

	@Column(name="ope_ocupacion_ant")
	private String opeOcupacionAnt;

	@Column(name="ope_ojos")
	private String opeOjos;

	@Column(name="ope_oreja")
	private String opeOreja;

	@Column(name="ope_parpados")
	private String opeParpados;

	@Column(name="ope_pelo")
	private String opePelo;

	@Column(name="ope_piel")
	private String opePiel;

	@Column(name="ope_profesion")
	private String opeProfesion;

	@Column(name="ope_sexo")
	private String opeSexo;

	@Column(name="use_code")
	private String useCode;

	public OciPersona() {
	}

	public int getOpeCode() {
		return this.opeCode;
	}

	public void setOpeCode(int opeCode) {
		this.opeCode = opeCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getOpeAlias() {
		return this.opeAlias;
	}

	public void setOpeAlias(String opeAlias) {
		this.opeAlias = opeAlias;
	}

	public String getOpeApellido() {
		return this.opeApellido;
	}

	public void setOpeApellido(String opeApellido) {
		this.opeApellido = opeApellido;
	}

	public String getOpeBarFrecuente() {
		return this.opeBarFrecuente;
	}

	public void setOpeBarFrecuente(String opeBarFrecuente) {
		this.opeBarFrecuente = opeBarFrecuente;
	}

	public String getOpeBoca() {
		return this.opeBoca;
	}

	public void setOpeBoca(String opeBoca) {
		this.opeBoca = opeBoca;
	}

	public String getOpeCejas() {
		return this.opeCejas;
	}

	public void setOpeCejas(String opeCejas) {
		this.opeCejas = opeCejas;
	}

	public String getOpeEstadoCivil() {
		return this.opeEstadoCivil;
	}

	public void setOpeEstadoCivil(String opeEstadoCivil) {
		this.opeEstadoCivil = opeEstadoCivil;
	}

	public int getOpeEstatura() {
		return this.opeEstatura;
	}

	public void setOpeEstatura(int opeEstatura) {
		this.opeEstatura = opeEstatura;
	}

	public String getOpeEstudios() {
		return this.opeEstudios;
	}

	public void setOpeEstudios(String opeEstudios) {
		this.opeEstudios = opeEstudios;
	}

	public Date getOpeFecNac() {
		return this.opeFecNac;
	}

	public void setOpeFecNac(Date opeFecNac) {
		this.opeFecNac = opeFecNac;
	}

	public String getOpeFrente() {
		return this.opeFrente;
	}

	public void setOpeFrente(String opeFrente) {
		this.opeFrente = opeFrente;
	}

	public String getOpeIdentidadGenero() {
		return this.opeIdentidadGenero;
	}

	public void setOpeIdentidadGenero(String opeIdentidadGenero) {
		this.opeIdentidadGenero = opeIdentidadGenero;
	}

	public String getOpeIdentificado() {
		return this.opeIdentificado;
	}

	public void setOpeIdentificado(String opeIdentificado) {
		this.opeIdentificado = opeIdentificado;
	}

	public String getOpeLabios() {
		return this.opeLabios;
	}

	public void setOpeLabios(String opeLabios) {
		this.opeLabios = opeLabios;
	}

	public String getOpeLee() {
		return this.opeLee;
	}

	public void setOpeLee(String opeLee) {
		this.opeLee = opeLee;
	}

	public String getOpeLugarTrabajo() {
		return this.opeLugarTrabajo;
	}

	public void setOpeLugarTrabajo(String opeLugarTrabajo) {
		this.opeLugarTrabajo = opeLugarTrabajo;
	}

	public String getOpeMarcasParticulares() {
		return this.opeMarcasParticulares;
	}

	public void setOpeMarcasParticulares(String opeMarcasParticulares) {
		this.opeMarcasParticulares = opeMarcasParticulares;
	}

	public String getOpeMenton() {
		return this.opeMenton;
	}

	public void setOpeMenton(String opeMenton) {
		this.opeMenton = opeMenton;
	}

	public String getOpeNacidoEn() {
		return this.opeNacidoEn;
	}

	public void setOpeNacidoEn(String opeNacidoEn) {
		this.opeNacidoEn = opeNacidoEn;
	}

	public String getOpeNacionalidad() {
		return this.opeNacionalidad;
	}

	public void setOpeNacionalidad(String opeNacionalidad) {
		this.opeNacionalidad = opeNacionalidad;
	}

	public String getOpeNarizBase() {
		return this.opeNarizBase;
	}

	public void setOpeNarizBase(String opeNarizBase) {
		this.opeNarizBase = opeNarizBase;
	}

	public String getOpeNarizDorso() {
		return this.opeNarizDorso;
	}

	public void setOpeNarizDorso(String opeNarizDorso) {
		this.opeNarizDorso = opeNarizDorso;
	}

	public String getOpeNombre() {
		return this.opeNombre;
	}

	public void setOpeNombre(String opeNombre) {
		this.opeNombre = opeNombre;
	}

	public String getOpeNombreMadre() {
		return this.opeNombreMadre;
	}

	public void setOpeNombreMadre(String opeNombreMadre) {
		this.opeNombreMadre = opeNombreMadre;
	}

	public String getOpeNombrePadre() {
		return this.opeNombrePadre;
	}

	public void setOpeNombrePadre(String opeNombrePadre) {
		this.opeNombrePadre = opeNombrePadre;
	}

	public String getOpeObservacion() {
		return this.opeObservacion;
	}

	public void setOpeObservacion(String opeObservacion) {
		this.opeObservacion = opeObservacion;
	}

	public String getOpeOcupacionAnt() {
		return this.opeOcupacionAnt;
	}

	public void setOpeOcupacionAnt(String opeOcupacionAnt) {
		this.opeOcupacionAnt = opeOcupacionAnt;
	}

	public String getOpeOjos() {
		return this.opeOjos;
	}

	public void setOpeOjos(String opeOjos) {
		this.opeOjos = opeOjos;
	}

	public String getOpeOreja() {
		return this.opeOreja;
	}

	public void setOpeOreja(String opeOreja) {
		this.opeOreja = opeOreja;
	}

	public String getOpeParpados() {
		return this.opeParpados;
	}

	public void setOpeParpados(String opeParpados) {
		this.opeParpados = opeParpados;
	}

	public String getOpePelo() {
		return this.opePelo;
	}

	public void setOpePelo(String opePelo) {
		this.opePelo = opePelo;
	}

	public String getOpePiel() {
		return this.opePiel;
	}

	public void setOpePiel(String opePiel) {
		this.opePiel = opePiel;
	}

	public String getOpeProfesion() {
		return this.opeProfesion;
	}

	public void setOpeProfesion(String opeProfesion) {
		this.opeProfesion = opeProfesion;
	}

	public String getOpeSexo() {
		return this.opeSexo;
	}

	public void setOpeSexo(String opeSexo) {
		this.opeSexo = opeSexo;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}