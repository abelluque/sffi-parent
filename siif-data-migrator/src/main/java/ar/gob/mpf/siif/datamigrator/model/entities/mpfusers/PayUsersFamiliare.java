package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pay_users_familiares database table.
 * 
 */
// @Entity
// @Table(name="pay_users_familiares")
@NamedQuery(name="PayUsersFamiliare.findAll", query="SELECT p FROM PayUsersFamiliare p")
public class PayUsersFamiliare implements Serializable {
	private static final long serialVersionUID = 1L;

	private String apc;

	private String codigo;

	private int curso;

	@Column(name="desc_est")
	private String descEst;

	@Column(name="desc_par")
	private String descPar;

	private int estudios;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_alt")
	private Date fechaAlt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_baj")
	private Date fechaBaj;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nac")
	private Date fechaNac;

	private String gensal;

	private int identidad;

	private int invalid;

	private String nombre;

	private String numdoc;

	private int ombuid;

	private int pariente;

	private String preexis;

	private int rebimp;

	private int relacion;

	private String rut;

	private String sexo;

	@Column(name="tipo_doc")
	private int tipoDoc;

	public PayUsersFamiliare() {
	}

	public String getApc() {
		return this.apc;
	}

	public void setApc(String apc) {
		this.apc = apc;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCurso() {
		return this.curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getDescEst() {
		return this.descEst;
	}

	public void setDescEst(String descEst) {
		this.descEst = descEst;
	}

	public String getDescPar() {
		return this.descPar;
	}

	public void setDescPar(String descPar) {
		this.descPar = descPar;
	}

	public int getEstudios() {
		return this.estudios;
	}

	public void setEstudios(int estudios) {
		this.estudios = estudios;
	}

	public Date getFechaAlt() {
		return this.fechaAlt;
	}

	public void setFechaAlt(Date fechaAlt) {
		this.fechaAlt = fechaAlt;
	}

	public Date getFechaBaj() {
		return this.fechaBaj;
	}

	public void setFechaBaj(Date fechaBaj) {
		this.fechaBaj = fechaBaj;
	}

	public Date getFechaNac() {
		return this.fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getGensal() {
		return this.gensal;
	}

	public void setGensal(String gensal) {
		this.gensal = gensal;
	}

	public int getIdentidad() {
		return this.identidad;
	}

	public void setIdentidad(int identidad) {
		this.identidad = identidad;
	}

	public int getInvalid() {
		return this.invalid;
	}

	public void setInvalid(int invalid) {
		this.invalid = invalid;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumdoc() {
		return this.numdoc;
	}

	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}

	public int getOmbuid() {
		return this.ombuid;
	}

	public void setOmbuid(int ombuid) {
		this.ombuid = ombuid;
	}

	public int getPariente() {
		return this.pariente;
	}

	public void setPariente(int pariente) {
		this.pariente = pariente;
	}

	public String getPreexis() {
		return this.preexis;
	}

	public void setPreexis(String preexis) {
		this.preexis = preexis;
	}

	public int getRebimp() {
		return this.rebimp;
	}

	public void setRebimp(int rebimp) {
		this.rebimp = rebimp;
	}

	public int getRelacion() {
		return this.relacion;
	}

	public void setRelacion(int relacion) {
		this.relacion = relacion;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getTipoDoc() {
		return this.tipoDoc;
	}

	public void setTipoDoc(int tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

}