package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_dependencias database table.
 * 
 */
// @Entity
// @Table(name="gen_dependencias")
@NamedQuery(name="GenDependencia.findAll", query="SELECT g FROM GenDependencia g")
public class GenDependencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="aal_actorjuscaba")
	private int aalActorjuscaba;

	@Column(name="aal_asignacion_ef_contador_salteos")
	private int aalAsignacionEfContadorSalteos;

	@Column(name="aal_asignacion_ef_orden")
	private int aalAsignacionEfOrden;

	@Column(name="aal_asignacion_ef_salteos")
	private int aalAsignacionEfSalteos;

	@Column(name="aal_categoria")
	private int aalCategoria;

	@Column(name="aal_clavearbol")
	private int aalClavearbol;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="aal_direccion")
	private int aalDireccion;

	@Column(name="aal_edificio")
	private int aalEdificio;

	@Column(name="aal_especializacion")
	private int aalEspecializacion;

	@Column(name="aal_fax")
	private int aalFax;

	@Column(name="aal_nivel")
	private int aalNivel;

	@Column(name="aal_nombre")
	private int aalNombre;

	@Column(name="aal_nota")
	private int aalNota;

	@Column(name="aal_padre")
	private int aalPadre;

	@Column(name="aal_pmactivo")
	private int aalPmactivo;

	@Column(name="aal_pmuid")
	private int aalPmuid;

	@Column(name="aal_status")
	private int aalStatus;

	@Column(name="aal_telefono")
	private int aalTelefono;

	@Column(name="aal_tstamp")
	private int aalTstamp;

	@Column(name="acc_payroll")
	private int accPayroll;

	@Column(name="dep_email")
	private int depEmail;

	@Column(name="dep_medico")
	private int depMedico;

	@Column(name="dep_tipo")
	private int depTipo;

	@Column(name="dep_zona")
	private int depZona;

	@Column(name="occ_codigo")
	private int occCodigo;

	@Column(name="use_code")
	private int useCode;

	@Column(name="use_code_auditoria")
	private int useCodeAuditoria;

	@Column(name="use_jefe")
	private int useJefe;

	public GenDependencia() {
	}

	public int getAalActorjuscaba() {
		return this.aalActorjuscaba;
	}

	public void setAalActorjuscaba(int aalActorjuscaba) {
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

	public int getAalCategoria() {
		return this.aalCategoria;
	}

	public void setAalCategoria(int aalCategoria) {
		this.aalCategoria = aalCategoria;
	}

	public int getAalClavearbol() {
		return this.aalClavearbol;
	}

	public void setAalClavearbol(int aalClavearbol) {
		this.aalClavearbol = aalClavearbol;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getAalDireccion() {
		return this.aalDireccion;
	}

	public void setAalDireccion(int aalDireccion) {
		this.aalDireccion = aalDireccion;
	}

	public int getAalEdificio() {
		return this.aalEdificio;
	}

	public void setAalEdificio(int aalEdificio) {
		this.aalEdificio = aalEdificio;
	}

	public int getAalEspecializacion() {
		return this.aalEspecializacion;
	}

	public void setAalEspecializacion(int aalEspecializacion) {
		this.aalEspecializacion = aalEspecializacion;
	}

	public int getAalFax() {
		return this.aalFax;
	}

	public void setAalFax(int aalFax) {
		this.aalFax = aalFax;
	}

	public int getAalNivel() {
		return this.aalNivel;
	}

	public void setAalNivel(int aalNivel) {
		this.aalNivel = aalNivel;
	}

	public int getAalNombre() {
		return this.aalNombre;
	}

	public void setAalNombre(int aalNombre) {
		this.aalNombre = aalNombre;
	}

	public int getAalNota() {
		return this.aalNota;
	}

	public void setAalNota(int aalNota) {
		this.aalNota = aalNota;
	}

	public int getAalPadre() {
		return this.aalPadre;
	}

	public void setAalPadre(int aalPadre) {
		this.aalPadre = aalPadre;
	}

	public int getAalPmactivo() {
		return this.aalPmactivo;
	}

	public void setAalPmactivo(int aalPmactivo) {
		this.aalPmactivo = aalPmactivo;
	}

	public int getAalPmuid() {
		return this.aalPmuid;
	}

	public void setAalPmuid(int aalPmuid) {
		this.aalPmuid = aalPmuid;
	}

	public int getAalStatus() {
		return this.aalStatus;
	}

	public void setAalStatus(int aalStatus) {
		this.aalStatus = aalStatus;
	}

	public int getAalTelefono() {
		return this.aalTelefono;
	}

	public void setAalTelefono(int aalTelefono) {
		this.aalTelefono = aalTelefono;
	}

	public int getAalTstamp() {
		return this.aalTstamp;
	}

	public void setAalTstamp(int aalTstamp) {
		this.aalTstamp = aalTstamp;
	}

	public int getAccPayroll() {
		return this.accPayroll;
	}

	public void setAccPayroll(int accPayroll) {
		this.accPayroll = accPayroll;
	}

	public int getDepEmail() {
		return this.depEmail;
	}

	public void setDepEmail(int depEmail) {
		this.depEmail = depEmail;
	}

	public int getDepMedico() {
		return this.depMedico;
	}

	public void setDepMedico(int depMedico) {
		this.depMedico = depMedico;
	}

	public int getDepTipo() {
		return this.depTipo;
	}

	public void setDepTipo(int depTipo) {
		this.depTipo = depTipo;
	}

	public int getDepZona() {
		return this.depZona;
	}

	public void setDepZona(int depZona) {
		this.depZona = depZona;
	}

	public int getOccCodigo() {
		return this.occCodigo;
	}

	public void setOccCodigo(int occCodigo) {
		this.occCodigo = occCodigo;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

	public int getUseCodeAuditoria() {
		return this.useCodeAuditoria;
	}

	public void setUseCodeAuditoria(int useCodeAuditoria) {
		this.useCodeAuditoria = useCodeAuditoria;
	}

	public int getUseJefe() {
		return this.useJefe;
	}

	public void setUseJefe(int useJefe) {
		this.useJefe = useJefe;
	}

}