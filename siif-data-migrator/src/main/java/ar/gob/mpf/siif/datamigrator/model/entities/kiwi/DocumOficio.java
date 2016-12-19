package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_oficios database table.
 * 
 */
// @Entity
// @Table(name="docum_oficios")
@NamedQuery(name="DocumOficio.findAll", query="SELECT d FROM DocumOficio d")
public class DocumOficio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dof_code")
	private int dofCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="doc_code")
	private int docCode;

	@Column(name="doc_id")
	private String docId;

	@Column(name="dof_caratula")
	private String dofCaratula;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dof_creado")
	private Date dofCreado;

	@Column(name="dof_dependencia")
	private int dofDependencia;

	@Column(name="dof_dependencia_direccion")
	private String dofDependenciaDireccion;

	@Column(name="dof_dependencia_email")
	private String dofDependenciaEmail;

	@Column(name="dof_dependencia_telefono")
	private String dofDependenciaTelefono;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dof_diligenciado")
	private Date dofDiligenciado;

	@Column(name="dof_estado")
	private String dofEstado;

	@Column(name="dof_etiquetas")
	private String dofEtiquetas;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dof_firmado")
	private Date dofFirmado;

	@Column(name="dof_fiscal")
	private String dofFiscal;

	@Column(name="dof_observaciones")
	private String dofObservaciones;

	@Column(name="dof_oficio_firmado")
	private String dofOficioFirmado;

	@Column(name="dof_oficio_nombre")
	private String dofOficioNombre;

	@Column(name="dof_para_extra")
	private String dofParaExtra;

	@Column(name="dof_para_nombre")
	private String dofParaNombre;

	@Column(name="dof_para_titulo")
	private String dofParaTitulo;

	@Lob
	@Column(name="dof_primer_parrafo")
	private String dofPrimerParrafo;

	@Column(name="dof_saludo")
	private String dofSaludo;

	@Column(name="dof_suscribe")
	private String dofSuscribe;

	@Lob
	@Column(name="dof_texto")
	private String dofTexto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dof_tstamp")
	private Date dofTstamp;

	@Column(name="dtip_code")
	private String dtipCode;

	@Column(name="use_code")
	private String useCode;

	@Column(name="utr_code")
	private int utrCode;

	@Column(name="utr_estado")
	private String utrEstado;

	public DocumOficio() {
	}

	public int getDofCode() {
		return this.dofCode;
	}

	public void setDofCode(int dofCode) {
		this.dofCode = dofCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getDocCode() {
		return this.docCode;
	}

	public void setDocCode(int docCode) {
		this.docCode = docCode;
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getDofCaratula() {
		return this.dofCaratula;
	}

	public void setDofCaratula(String dofCaratula) {
		this.dofCaratula = dofCaratula;
	}

	public Date getDofCreado() {
		return this.dofCreado;
	}

	public void setDofCreado(Date dofCreado) {
		this.dofCreado = dofCreado;
	}

	public int getDofDependencia() {
		return this.dofDependencia;
	}

	public void setDofDependencia(int dofDependencia) {
		this.dofDependencia = dofDependencia;
	}

	public String getDofDependenciaDireccion() {
		return this.dofDependenciaDireccion;
	}

	public void setDofDependenciaDireccion(String dofDependenciaDireccion) {
		this.dofDependenciaDireccion = dofDependenciaDireccion;
	}

	public String getDofDependenciaEmail() {
		return this.dofDependenciaEmail;
	}

	public void setDofDependenciaEmail(String dofDependenciaEmail) {
		this.dofDependenciaEmail = dofDependenciaEmail;
	}

	public String getDofDependenciaTelefono() {
		return this.dofDependenciaTelefono;
	}

	public void setDofDependenciaTelefono(String dofDependenciaTelefono) {
		this.dofDependenciaTelefono = dofDependenciaTelefono;
	}

	public Date getDofDiligenciado() {
		return this.dofDiligenciado;
	}

	public void setDofDiligenciado(Date dofDiligenciado) {
		this.dofDiligenciado = dofDiligenciado;
	}

	public String getDofEstado() {
		return this.dofEstado;
	}

	public void setDofEstado(String dofEstado) {
		this.dofEstado = dofEstado;
	}

	public String getDofEtiquetas() {
		return this.dofEtiquetas;
	}

	public void setDofEtiquetas(String dofEtiquetas) {
		this.dofEtiquetas = dofEtiquetas;
	}

	public Date getDofFirmado() {
		return this.dofFirmado;
	}

	public void setDofFirmado(Date dofFirmado) {
		this.dofFirmado = dofFirmado;
	}

	public String getDofFiscal() {
		return this.dofFiscal;
	}

	public void setDofFiscal(String dofFiscal) {
		this.dofFiscal = dofFiscal;
	}

	public String getDofObservaciones() {
		return this.dofObservaciones;
	}

	public void setDofObservaciones(String dofObservaciones) {
		this.dofObservaciones = dofObservaciones;
	}

	public String getDofOficioFirmado() {
		return this.dofOficioFirmado;
	}

	public void setDofOficioFirmado(String dofOficioFirmado) {
		this.dofOficioFirmado = dofOficioFirmado;
	}

	public String getDofOficioNombre() {
		return this.dofOficioNombre;
	}

	public void setDofOficioNombre(String dofOficioNombre) {
		this.dofOficioNombre = dofOficioNombre;
	}

	public String getDofParaExtra() {
		return this.dofParaExtra;
	}

	public void setDofParaExtra(String dofParaExtra) {
		this.dofParaExtra = dofParaExtra;
	}

	public String getDofParaNombre() {
		return this.dofParaNombre;
	}

	public void setDofParaNombre(String dofParaNombre) {
		this.dofParaNombre = dofParaNombre;
	}

	public String getDofParaTitulo() {
		return this.dofParaTitulo;
	}

	public void setDofParaTitulo(String dofParaTitulo) {
		this.dofParaTitulo = dofParaTitulo;
	}

	public String getDofPrimerParrafo() {
		return this.dofPrimerParrafo;
	}

	public void setDofPrimerParrafo(String dofPrimerParrafo) {
		this.dofPrimerParrafo = dofPrimerParrafo;
	}

	public String getDofSaludo() {
		return this.dofSaludo;
	}

	public void setDofSaludo(String dofSaludo) {
		this.dofSaludo = dofSaludo;
	}

	public String getDofSuscribe() {
		return this.dofSuscribe;
	}

	public void setDofSuscribe(String dofSuscribe) {
		this.dofSuscribe = dofSuscribe;
	}

	public String getDofTexto() {
		return this.dofTexto;
	}

	public void setDofTexto(String dofTexto) {
		this.dofTexto = dofTexto;
	}

	public Date getDofTstamp() {
		return this.dofTstamp;
	}

	public void setDofTstamp(Date dofTstamp) {
		this.dofTstamp = dofTstamp;
	}

	public String getDtipCode() {
		return this.dtipCode;
	}

	public void setDtipCode(String dtipCode) {
		this.dtipCode = dtipCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public int getUtrCode() {
		return this.utrCode;
	}

	public void setUtrCode(int utrCode) {
		this.utrCode = utrCode;
	}

	public String getUtrEstado() {
		return this.utrEstado;
	}

	public void setUtrEstado(String utrEstado) {
		this.utrEstado = utrEstado;
	}

}