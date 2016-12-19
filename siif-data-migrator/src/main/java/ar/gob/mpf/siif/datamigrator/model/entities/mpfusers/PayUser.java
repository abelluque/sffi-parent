package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pay_users database table.
 * 
 */
// @Entity
// @Table(name="pay_users")
@NamedQuery(name="PayUser.findAll", query="SELECT p FROM PayUser p")
public class PayUser implements Serializable {
	private static final long serialVersionUID = 1L;

	private String apc;

	private int cargo;

	private int catego;

	private String celular;

	private int cencos;

	private int clasif;

	private String codigo;

	private String direccion;

	private int division;

	private String empresa;

	@Column(name="est_civil")
	private String estCivil;

	private String estado;

	private int estudios;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_ing")
	private Date fechaIng;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nac")
	private Date fechaNac;

	private String fono;

	private int grado;

	private int idiomas;

	private String jefe;

	private int lpago;

	private int nacion;

	private String nombre;

	private String numdoc;

	private String pmail;

	private String rut;

	private int seccion;

	private String sexo;

	@Column(name="tipo_doc")
	private int tipoDoc;

	private int titulo;

	private int ubica;

	private int unidad;

	public PayUser() {
	}

	public String getApc() {
		return this.apc;
	}

	public void setApc(String apc) {
		this.apc = apc;
	}

	public int getCargo() {
		return this.cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public int getCatego() {
		return this.catego;
	}

	public void setCatego(int catego) {
		this.catego = catego;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getCencos() {
		return this.cencos;
	}

	public void setCencos(int cencos) {
		this.cencos = cencos;
	}

	public int getClasif() {
		return this.clasif;
	}

	public void setClasif(int clasif) {
		this.clasif = clasif;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDivision() {
		return this.division;
	}

	public void setDivision(int division) {
		this.division = division;
	}

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEstCivil() {
		return this.estCivil;
	}

	public void setEstCivil(String estCivil) {
		this.estCivil = estCivil;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getEstudios() {
		return this.estudios;
	}

	public void setEstudios(int estudios) {
		this.estudios = estudios;
	}

	public Date getFechaIng() {
		return this.fechaIng;
	}

	public void setFechaIng(Date fechaIng) {
		this.fechaIng = fechaIng;
	}

	public Date getFechaNac() {
		return this.fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getFono() {
		return this.fono;
	}

	public void setFono(String fono) {
		this.fono = fono;
	}

	public int getGrado() {
		return this.grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public int getIdiomas() {
		return this.idiomas;
	}

	public void setIdiomas(int idiomas) {
		this.idiomas = idiomas;
	}

	public String getJefe() {
		return this.jefe;
	}

	public void setJefe(String jefe) {
		this.jefe = jefe;
	}

	public int getLpago() {
		return this.lpago;
	}

	public void setLpago(int lpago) {
		this.lpago = lpago;
	}

	public int getNacion() {
		return this.nacion;
	}

	public void setNacion(int nacion) {
		this.nacion = nacion;
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

	public String getPmail() {
		return this.pmail;
	}

	public void setPmail(String pmail) {
		this.pmail = pmail;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getSeccion() {
		return this.seccion;
	}

	public void setSeccion(int seccion) {
		this.seccion = seccion;
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

	public int getTitulo() {
		return this.titulo;
	}

	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}

	public int getUbica() {
		return this.ubica;
	}

	public void setUbica(int ubica) {
		this.ubica = ubica;
	}

	public int getUnidad() {
		return this.unidad;
	}

	public void setUnidad(int unidad) {
		this.unidad = unidad;
	}

}