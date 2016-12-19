package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the nper_personas database table.
 * 
 */
// @Entity
// @Table(name="nper_personas")
@NamedQuery(name="NperPersona.findAll", query="SELECT n FROM NperPersona n")
public class NperPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="per_code")
	private int perCode;

	@Column(name="ope_code")
	private int opeCode;

	@Column(name="per_alias")
	private String perAlias;

	@Column(name="per_apellido")
	private String perApellido;

	@Column(name="per_bloque_adicionales")
	private String perBloqueAdicionales;

	@Column(name="per_bloque_adjuntos")
	private String perBloqueAdjuntos;

	@Column(name="per_bloque_contactos")
	private String perBloqueContactos;

	@Column(name="per_bloque_documentos")
	private String perBloqueDocumentos;

	@Column(name="per_bloque_domicilios")
	private String perBloqueDomicilios;

	@Column(name="per_bloque_extras")
	private String perBloqueExtras;

	@Column(name="per_bloque_juridica")
	private String perBloqueJuridica;

	@Column(name="per_bloque_personales")
	private String perBloquePersonales;

	@Column(name="per_cant_hijos")
	private int perCantHijos;

	@Column(name="per_es_incapaz")
	private String perEsIncapaz;

	@Column(name="per_es_menor")
	private String perEsMenor;

	@Column(name="per_estado")
	private String perEstado;

	@Column(name="per_estado_civil")
	private String perEstadoCivil;

	@Column(name="per_estudios")
	private String perEstudios;

	@Temporal(TemporalType.DATE)
	@Column(name="per_fec_nac")
	private Date perFecNac;

	@Column(name="per_nacionalidad")
	private String perNacionalidad;

	@Column(name="per_nombre")
	private String perNombre;

	@Column(name="per_nombre_fantasia")
	private String perNombreFantasia;

	@Column(name="per_origen_alta")
	private String perOrigenAlta;

	@Column(name="per_padron")
	private String perPadron;

	@Column(name="per_profesion")
	private String perProfesion;

	@Column(name="per_razon_social")
	private String perRazonSocial;

	@Column(name="per_sexo")
	private String perSexo;

	@Column(name="per_situacion_laboral")
	private String perSituacionLaboral;

	@Column(name="per_situacion_vivienda")
	private String perSituacionVivienda;

	@Column(name="per_tipo")
	private String perTipo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="per_tstamp")
	private Date perTstamp;

	public NperPersona() {
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public int getOpeCode() {
		return this.opeCode;
	}

	public void setOpeCode(int opeCode) {
		this.opeCode = opeCode;
	}

	public String getPerAlias() {
		return this.perAlias;
	}

	public void setPerAlias(String perAlias) {
		this.perAlias = perAlias;
	}

	public String getPerApellido() {
		return this.perApellido;
	}

	public void setPerApellido(String perApellido) {
		this.perApellido = perApellido;
	}

	public String getPerBloqueAdicionales() {
		return this.perBloqueAdicionales;
	}

	public void setPerBloqueAdicionales(String perBloqueAdicionales) {
		this.perBloqueAdicionales = perBloqueAdicionales;
	}

	public String getPerBloqueAdjuntos() {
		return this.perBloqueAdjuntos;
	}

	public void setPerBloqueAdjuntos(String perBloqueAdjuntos) {
		this.perBloqueAdjuntos = perBloqueAdjuntos;
	}

	public String getPerBloqueContactos() {
		return this.perBloqueContactos;
	}

	public void setPerBloqueContactos(String perBloqueContactos) {
		this.perBloqueContactos = perBloqueContactos;
	}

	public String getPerBloqueDocumentos() {
		return this.perBloqueDocumentos;
	}

	public void setPerBloqueDocumentos(String perBloqueDocumentos) {
		this.perBloqueDocumentos = perBloqueDocumentos;
	}

	public String getPerBloqueDomicilios() {
		return this.perBloqueDomicilios;
	}

	public void setPerBloqueDomicilios(String perBloqueDomicilios) {
		this.perBloqueDomicilios = perBloqueDomicilios;
	}

	public String getPerBloqueExtras() {
		return this.perBloqueExtras;
	}

	public void setPerBloqueExtras(String perBloqueExtras) {
		this.perBloqueExtras = perBloqueExtras;
	}

	public String getPerBloqueJuridica() {
		return this.perBloqueJuridica;
	}

	public void setPerBloqueJuridica(String perBloqueJuridica) {
		this.perBloqueJuridica = perBloqueJuridica;
	}

	public String getPerBloquePersonales() {
		return this.perBloquePersonales;
	}

	public void setPerBloquePersonales(String perBloquePersonales) {
		this.perBloquePersonales = perBloquePersonales;
	}

	public int getPerCantHijos() {
		return this.perCantHijos;
	}

	public void setPerCantHijos(int perCantHijos) {
		this.perCantHijos = perCantHijos;
	}

	public String getPerEsIncapaz() {
		return this.perEsIncapaz;
	}

	public void setPerEsIncapaz(String perEsIncapaz) {
		this.perEsIncapaz = perEsIncapaz;
	}

	public String getPerEsMenor() {
		return this.perEsMenor;
	}

	public void setPerEsMenor(String perEsMenor) {
		this.perEsMenor = perEsMenor;
	}

	public String getPerEstado() {
		return this.perEstado;
	}

	public void setPerEstado(String perEstado) {
		this.perEstado = perEstado;
	}

	public String getPerEstadoCivil() {
		return this.perEstadoCivil;
	}

	public void setPerEstadoCivil(String perEstadoCivil) {
		this.perEstadoCivil = perEstadoCivil;
	}

	public String getPerEstudios() {
		return this.perEstudios;
	}

	public void setPerEstudios(String perEstudios) {
		this.perEstudios = perEstudios;
	}

	public Date getPerFecNac() {
		return this.perFecNac;
	}

	public void setPerFecNac(Date perFecNac) {
		this.perFecNac = perFecNac;
	}

	public String getPerNacionalidad() {
		return this.perNacionalidad;
	}

	public void setPerNacionalidad(String perNacionalidad) {
		this.perNacionalidad = perNacionalidad;
	}

	public String getPerNombre() {
		return this.perNombre;
	}

	public void setPerNombre(String perNombre) {
		this.perNombre = perNombre;
	}

	public String getPerNombreFantasia() {
		return this.perNombreFantasia;
	}

	public void setPerNombreFantasia(String perNombreFantasia) {
		this.perNombreFantasia = perNombreFantasia;
	}

	public String getPerOrigenAlta() {
		return this.perOrigenAlta;
	}

	public void setPerOrigenAlta(String perOrigenAlta) {
		this.perOrigenAlta = perOrigenAlta;
	}

	public String getPerPadron() {
		return this.perPadron;
	}

	public void setPerPadron(String perPadron) {
		this.perPadron = perPadron;
	}

	public String getPerProfesion() {
		return this.perProfesion;
	}

	public void setPerProfesion(String perProfesion) {
		this.perProfesion = perProfesion;
	}

	public String getPerRazonSocial() {
		return this.perRazonSocial;
	}

	public void setPerRazonSocial(String perRazonSocial) {
		this.perRazonSocial = perRazonSocial;
	}

	public String getPerSexo() {
		return this.perSexo;
	}

	public void setPerSexo(String perSexo) {
		this.perSexo = perSexo;
	}

	public String getPerSituacionLaboral() {
		return this.perSituacionLaboral;
	}

	public void setPerSituacionLaboral(String perSituacionLaboral) {
		this.perSituacionLaboral = perSituacionLaboral;
	}

	public String getPerSituacionVivienda() {
		return this.perSituacionVivienda;
	}

	public void setPerSituacionVivienda(String perSituacionVivienda) {
		this.perSituacionVivienda = perSituacionVivienda;
	}

	public String getPerTipo() {
		return this.perTipo;
	}

	public void setPerTipo(String perTipo) {
		this.perTipo = perTipo;
	}

	public Date getPerTstamp() {
		return this.perTstamp;
	}

	public void setPerTstamp(Date perTstamp) {
		this.perTstamp = perTstamp;
	}

}