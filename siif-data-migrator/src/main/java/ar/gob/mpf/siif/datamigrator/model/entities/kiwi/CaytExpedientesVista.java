package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cayt_expedientes_vistas database table.
 * 
 */
// @Entity
// @Table(name="cayt_expedientes_vistas")
@NamedQuery(name="CaytExpedientesVista.findAll", query="SELECT c FROM CaytExpedientesVista c")
public class CaytExpedientesVista implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="exv_code")
	private int exvCode;

	@Column(name="exp_code")
	private int expCode;

	@Column(name="exv_actor")
	private String exvActor;

	@Column(name="exv_actor_codigo")
	private int exvActorCodigo;

	@Column(name="exv_agregados")
	private String exvAgregados;

	@Column(name="exv_agregados_detalle")
	private String exvAgregadosDetalle;

	@Lob
	@Column(name="exv_asignacion_data")
	private String exvAsignacionData;

	@Column(name="exv_asignacion_fundamento")
	private String exvAsignacionFundamento;

	@Column(name="exv_asignacion_operador")
	private String exvAsignacionOperador;

	@Column(name="exv_asignacion_supervisor")
	private String exvAsignacionSupervisor;

	@Column(name="exv_asignacion_tipo")
	private String exvAsignacionTipo;

	@Column(name="exv_caratula")
	private String exvCaratula;

	@Column(name="exv_codigo_sufijo")
	private byte exvCodigoSufijo;

	@Column(name="exv_cuerpos")
	private int exvCuerpos;

	@Column(name="exv_demandado")
	private String exvDemandado;

	@Column(name="exv_demandado_codigo")
	private int exvDemandadoCodigo;

	@Column(name="exv_estado")
	private String exvEstado;

	@Column(name="exv_etiquetas")
	private String exvEtiquetas;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exv_fecha_asignacion_ef")
	private Date exvFechaAsignacionEf;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exv_fecha_egreso_ef")
	private Date exvFechaEgresoEf;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exv_fecha_egreso_uco")
	private Date exvFechaEgresoUco;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exv_fecha_ingreso_ef")
	private Date exvFechaIngresoEf;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exv_fecha_ingreso_uco")
	private Date exvFechaIngresoUco;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exv_fecha_pre_egreso_ef")
	private Date exvFechaPreEgresoEf;

	@Column(name="exv_fiscalia")
	private int exvFiscalia;

	@Column(name="exv_fojas")
	private int exvFojas;

	@Column(name="exv_juzgado_actual")
	private int exvJuzgadoActual;

	@Column(name="exv_motivo_vista")
	private String exvMotivoVista;

	@Column(name="exv_numero")
	private int exvNumero;

	@Column(name="exv_observaciones")
	private String exvObservaciones;

	@Column(name="exv_orden_ingreso")
	private String exvOrdenIngreso;

	@Column(name="exv_respuesta_vista")
	private String exvRespuestaVista;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exv_tstamp")
	private Date exvTstamp;

	@Column(name="exv_uco")
	private int exvUco;

	@Column(name="obj_code")
	private int objCode;

	@Column(name="use_code")
	private String useCode;

	public CaytExpedientesVista() {
	}

	public int getExvCode() {
		return this.exvCode;
	}

	public void setExvCode(int exvCode) {
		this.exvCode = exvCode;
	}

	public int getExpCode() {
		return this.expCode;
	}

	public void setExpCode(int expCode) {
		this.expCode = expCode;
	}

	public String getExvActor() {
		return this.exvActor;
	}

	public void setExvActor(String exvActor) {
		this.exvActor = exvActor;
	}

	public int getExvActorCodigo() {
		return this.exvActorCodigo;
	}

	public void setExvActorCodigo(int exvActorCodigo) {
		this.exvActorCodigo = exvActorCodigo;
	}

	public String getExvAgregados() {
		return this.exvAgregados;
	}

	public void setExvAgregados(String exvAgregados) {
		this.exvAgregados = exvAgregados;
	}

	public String getExvAgregadosDetalle() {
		return this.exvAgregadosDetalle;
	}

	public void setExvAgregadosDetalle(String exvAgregadosDetalle) {
		this.exvAgregadosDetalle = exvAgregadosDetalle;
	}

	public String getExvAsignacionData() {
		return this.exvAsignacionData;
	}

	public void setExvAsignacionData(String exvAsignacionData) {
		this.exvAsignacionData = exvAsignacionData;
	}

	public String getExvAsignacionFundamento() {
		return this.exvAsignacionFundamento;
	}

	public void setExvAsignacionFundamento(String exvAsignacionFundamento) {
		this.exvAsignacionFundamento = exvAsignacionFundamento;
	}

	public String getExvAsignacionOperador() {
		return this.exvAsignacionOperador;
	}

	public void setExvAsignacionOperador(String exvAsignacionOperador) {
		this.exvAsignacionOperador = exvAsignacionOperador;
	}

	public String getExvAsignacionSupervisor() {
		return this.exvAsignacionSupervisor;
	}

	public void setExvAsignacionSupervisor(String exvAsignacionSupervisor) {
		this.exvAsignacionSupervisor = exvAsignacionSupervisor;
	}

	public String getExvAsignacionTipo() {
		return this.exvAsignacionTipo;
	}

	public void setExvAsignacionTipo(String exvAsignacionTipo) {
		this.exvAsignacionTipo = exvAsignacionTipo;
	}

	public String getExvCaratula() {
		return this.exvCaratula;
	}

	public void setExvCaratula(String exvCaratula) {
		this.exvCaratula = exvCaratula;
	}

	public byte getExvCodigoSufijo() {
		return this.exvCodigoSufijo;
	}

	public void setExvCodigoSufijo(byte exvCodigoSufijo) {
		this.exvCodigoSufijo = exvCodigoSufijo;
	}

	public int getExvCuerpos() {
		return this.exvCuerpos;
	}

	public void setExvCuerpos(int exvCuerpos) {
		this.exvCuerpos = exvCuerpos;
	}

	public String getExvDemandado() {
		return this.exvDemandado;
	}

	public void setExvDemandado(String exvDemandado) {
		this.exvDemandado = exvDemandado;
	}

	public int getExvDemandadoCodigo() {
		return this.exvDemandadoCodigo;
	}

	public void setExvDemandadoCodigo(int exvDemandadoCodigo) {
		this.exvDemandadoCodigo = exvDemandadoCodigo;
	}

	public String getExvEstado() {
		return this.exvEstado;
	}

	public void setExvEstado(String exvEstado) {
		this.exvEstado = exvEstado;
	}

	public String getExvEtiquetas() {
		return this.exvEtiquetas;
	}

	public void setExvEtiquetas(String exvEtiquetas) {
		this.exvEtiquetas = exvEtiquetas;
	}

	public Date getExvFechaAsignacionEf() {
		return this.exvFechaAsignacionEf;
	}

	public void setExvFechaAsignacionEf(Date exvFechaAsignacionEf) {
		this.exvFechaAsignacionEf = exvFechaAsignacionEf;
	}

	public Date getExvFechaEgresoEf() {
		return this.exvFechaEgresoEf;
	}

	public void setExvFechaEgresoEf(Date exvFechaEgresoEf) {
		this.exvFechaEgresoEf = exvFechaEgresoEf;
	}

	public Date getExvFechaEgresoUco() {
		return this.exvFechaEgresoUco;
	}

	public void setExvFechaEgresoUco(Date exvFechaEgresoUco) {
		this.exvFechaEgresoUco = exvFechaEgresoUco;
	}

	public Date getExvFechaIngresoEf() {
		return this.exvFechaIngresoEf;
	}

	public void setExvFechaIngresoEf(Date exvFechaIngresoEf) {
		this.exvFechaIngresoEf = exvFechaIngresoEf;
	}

	public Date getExvFechaIngresoUco() {
		return this.exvFechaIngresoUco;
	}

	public void setExvFechaIngresoUco(Date exvFechaIngresoUco) {
		this.exvFechaIngresoUco = exvFechaIngresoUco;
	}

	public Date getExvFechaPreEgresoEf() {
		return this.exvFechaPreEgresoEf;
	}

	public void setExvFechaPreEgresoEf(Date exvFechaPreEgresoEf) {
		this.exvFechaPreEgresoEf = exvFechaPreEgresoEf;
	}

	public int getExvFiscalia() {
		return this.exvFiscalia;
	}

	public void setExvFiscalia(int exvFiscalia) {
		this.exvFiscalia = exvFiscalia;
	}

	public int getExvFojas() {
		return this.exvFojas;
	}

	public void setExvFojas(int exvFojas) {
		this.exvFojas = exvFojas;
	}

	public int getExvJuzgadoActual() {
		return this.exvJuzgadoActual;
	}

	public void setExvJuzgadoActual(int exvJuzgadoActual) {
		this.exvJuzgadoActual = exvJuzgadoActual;
	}

	public String getExvMotivoVista() {
		return this.exvMotivoVista;
	}

	public void setExvMotivoVista(String exvMotivoVista) {
		this.exvMotivoVista = exvMotivoVista;
	}

	public int getExvNumero() {
		return this.exvNumero;
	}

	public void setExvNumero(int exvNumero) {
		this.exvNumero = exvNumero;
	}

	public String getExvObservaciones() {
		return this.exvObservaciones;
	}

	public void setExvObservaciones(String exvObservaciones) {
		this.exvObservaciones = exvObservaciones;
	}

	public String getExvOrdenIngreso() {
		return this.exvOrdenIngreso;
	}

	public void setExvOrdenIngreso(String exvOrdenIngreso) {
		this.exvOrdenIngreso = exvOrdenIngreso;
	}

	public String getExvRespuestaVista() {
		return this.exvRespuestaVista;
	}

	public void setExvRespuestaVista(String exvRespuestaVista) {
		this.exvRespuestaVista = exvRespuestaVista;
	}

	public Date getExvTstamp() {
		return this.exvTstamp;
	}

	public void setExvTstamp(Date exvTstamp) {
		this.exvTstamp = exvTstamp;
	}

	public int getExvUco() {
		return this.exvUco;
	}

	public void setExvUco(int exvUco) {
		this.exvUco = exvUco;
	}

	public int getObjCode() {
		return this.objCode;
	}

	public void setObjCode(int objCode) {
		this.objCode = objCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}