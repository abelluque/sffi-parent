package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the alm_almacenes database table.
 * 
 */
// @Entity
// @Table(name="alm_almacenes")
@NamedQuery(name="AlmAlmacen.findAll", query="SELECT a FROM AlmAlmacen a")
public class AlmAlmacen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="aal_actorjuscaba")
	private String aalActorjuscaba;

	@Column(name="aal_asignacion_ef_contador_salteos")
	private int aalAsignacionEfContadorSalteos;

	@Column(name="aal_asignacion_ef_orden")
	private int aalAsignacionEfOrden;

	@Column(name="aal_asignacion_ef_salteos")
	private int aalAsignacionEfSalteos;

	@Column(name="aal_categoria")
	private String aalCategoria;

	@Column(name="aal_clavearbol")
	private String aalClavearbol;

	@Column(name="aal_direccion")
	private String aalDireccion;

	@Column(name="aal_edificio")
	private String aalEdificio;

	@Column(name="aal_especializacion")
	private String aalEspecializacion;

	@Column(name="aal_fax")
	private String aalFax;

	@Column(name="aal_nivel")
	private int aalNivel;

	@Column(name="aal_nombre")
	private String aalNombre;

	@Column(name="aal_nota")
	private String aalNota;

	@Column(name="aal_padre")
	private int aalPadre;

	@Column(name="aal_pmactivo")
	private String aalPmactivo;

	@Column(name="aal_pmuid")
	private String aalPmuid;

	@Column(name="aal_status")
	private String aalStatus;

	@Column(name="aal_telefono")
	private String aalTelefono;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="aal_tstamp")
	private Date aalTstamp;

	@Column(name="acc_payroll")
	private int accPayroll;

	@Column(name="dep_email")
	private String depEmail;

	@Column(name="dep_medico")
	private String depMedico;

	@Column(name="dep_tipo")
	private String depTipo;

	@Column(name="dep_zona")
	private String depZona;

	@Column(name="occ_codigo")
	private int occCodigo;

	@Column(name="use_code")
	private String useCode;

	@Column(name="use_code_auditoria")
	private String useCodeAuditoria;

	@Column(name="use_jefe")
	private String useJefe;

	public AlmAlmacen() {
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getAalActorjuscaba() {
		return this.aalActorjuscaba;
	}

	public void setAalActorjuscaba(String aalActorjuscaba) {
		this.aalActorjuscaba = aalActorjuscaba;
	}

	public int getAalAsignacionEfContadorSalteos() {
		return this.aalAsignacionEfContadorSalteos;
	}

	public void setAalAsignacionEfContadorSalteos(int aalAsignacionEfContadorSalteos) {
		this.aalAsignacionEfContadorSalteos = aalAsignacionEfContadorSalteos;
	}

	public int getAalAsignacionEfOrden() {
		return this.aalAsignacionEfOrden;
	}

	public void setAalAsignacionEfOrden(int aalAsignacionEfOrden) {
		this.aalAsignacionEfOrden = aalAsignacionEfOrden;
	}

	public int getAalAsignacionEfSalteos() {
		return this.aalAsignacionEfSalteos;
	}

	public void setAalAsignacionEfSalteos(int aalAsignacionEfSalteos) {
		this.aalAsignacionEfSalteos = aalAsignacionEfSalteos;
	}

	public String getAalCategoria() {
		return this.aalCategoria;
	}

	public void setAalCategoria(String aalCategoria) {
		this.aalCategoria = aalCategoria;
	}

	public String getAalClavearbol() {
		return this.aalClavearbol;
	}

	public void setAalClavearbol(String aalClavearbol) {
		this.aalClavearbol = aalClavearbol;
	}

	public String getAalDireccion() {
		return this.aalDireccion;
	}

	public void setAalDireccion(String aalDireccion) {
		this.aalDireccion = aalDireccion;
	}

	public String getAalEdificio() {
		return this.aalEdificio;
	}

	public void setAalEdificio(String aalEdificio) {
		this.aalEdificio = aalEdificio;
	}

	public String getAalEspecializacion() {
		return this.aalEspecializacion;
	}

	public void setAalEspecializacion(String aalEspecializacion) {
		this.aalEspecializacion = aalEspecializacion;
	}

	public String getAalFax() {
		return this.aalFax;
	}

	public void setAalFax(String aalFax) {
		this.aalFax = aalFax;
	}

	public int getAalNivel() {
		return this.aalNivel;
	}

	public void setAalNivel(int aalNivel) {
		this.aalNivel = aalNivel;
	}

	public String getAalNombre() {
		return this.aalNombre;
	}

	public void setAalNombre(String aalNombre) {
		this.aalNombre = aalNombre;
	}

	public String getAalNota() {
		return this.aalNota;
	}

	public void setAalNota(String aalNota) {
		this.aalNota = aalNota;
	}

	public int getAalPadre() {
		return this.aalPadre;
	}

	public void setAalPadre(int aalPadre) {
		this.aalPadre = aalPadre;
	}

	public String getAalPmactivo() {
		return this.aalPmactivo;
	}

	public void setAalPmactivo(String aalPmactivo) {
		this.aalPmactivo = aalPmactivo;
	}

	public String getAalPmuid() {
		return this.aalPmuid;
	}

	public void setAalPmuid(String aalPmuid) {
		this.aalPmuid = aalPmuid;
	}

	public String getAalStatus() {
		return this.aalStatus;
	}

	public void setAalStatus(String aalStatus) {
		this.aalStatus = aalStatus;
	}

	public String getAalTelefono() {
		return this.aalTelefono;
	}

	public void setAalTelefono(String aalTelefono) {
		this.aalTelefono = aalTelefono;
	}

	public Date getAalTstamp() {
		return this.aalTstamp;
	}

	public void setAalTstamp(Date aalTstamp) {
		this.aalTstamp = aalTstamp;
	}

	public int getAccPayroll() {
		return this.accPayroll;
	}

	public void setAccPayroll(int accPayroll) {
		this.accPayroll = accPayroll;
	}

	public String getDepEmail() {
		return this.depEmail;
	}

	public void setDepEmail(String depEmail) {
		this.depEmail = depEmail;
	}

	public String getDepMedico() {
		return this.depMedico;
	}

	public void setDepMedico(String depMedico) {
		this.depMedico = depMedico;
	}

	public String getDepTipo() {
		return this.depTipo;
	}

	public void setDepTipo(String depTipo) {
		this.depTipo = depTipo;
	}

	public String getDepZona() {
		return this.depZona;
	}

	public void setDepZona(String depZona) {
		this.depZona = depZona;
	}

	public int getOccCodigo() {
		return this.occCodigo;
	}

	public void setOccCodigo(int occCodigo) {
		this.occCodigo = occCodigo;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public String getUseCodeAuditoria() {
		return this.useCodeAuditoria;
	}

	public void setUseCodeAuditoria(String useCodeAuditoria) {
		this.useCodeAuditoria = useCodeAuditoria;
	}

	public String getUseJefe() {
		return this.useJefe;
	}

	public void setUseJefe(String useJefe) {
		this.useJefe = useJefe;
	}

}