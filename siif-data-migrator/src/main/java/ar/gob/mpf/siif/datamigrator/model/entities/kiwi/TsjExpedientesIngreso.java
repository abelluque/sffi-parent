package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tsj_expedientes_ingresos database table.
 * 
 */
// @Entity
// @Table(name="tsj_expedientes_ingresos")
@NamedQuery(name="TsjExpedientesIngreso.findAll", query="SELECT t FROM TsjExpedientesIngreso t")
public class TsjExpedientesIngreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="exi_code")
	private int exiCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="exi_asignacion_fundamento")
	private String exiAsignacionFundamento;

	@Column(name="exi_asignacion_operador")
	private String exiAsignacionOperador;

	@Column(name="exi_asignacion_tipo")
	private String exiAsignacionTipo;

	@Column(name="exi_estado")
	private String exiEstado;

	@Column(name="exi_etiquetas")
	private String exiEtiquetas;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exi_fecha")
	private Date exiFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exi_fecha_analisis")
	private Date exiFechaAnalisis;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exi_fecha_asignacion")
	private Date exiFechaAsignacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exi_fecha_carga")
	private Date exiFechaCarga;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exi_fecha_egreso")
	private Date exiFechaEgreso;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exi_fecha_ingreso")
	private Date exiFechaIngreso;

	@Column(name="exi_fiscalia")
	private int exiFiscalia;

	@Column(name="exi_motivo_ingreso")
	private String exiMotivoIngreso;

	@Column(name="exi_numero")
	private int exiNumero;

	@Column(name="exi_observaciones")
	private String exiObservaciones;

	@Column(name="exi_plazo")
	private String exiPlazo;

	@Column(name="exi_plazo_interno")
	private int exiPlazoInterno;

	@Column(name="exi_responsable_confeccion")
	private String exiResponsableConfeccion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exi_tstamp")
	private Date exiTstamp;

	@Temporal(TemporalType.DATE)
	@Column(name="exi_vencimiento")
	private Date exiVencimiento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exi_vencimiento_interno")
	private Date exiVencimientoInterno;

	@Column(name="exp_agregados")
	private String expAgregados;

	@Column(name="exp_agregados_detalle")
	private String expAgregadosDetalle;

	@Column(name="exp_autos")
	private String expAutos;

	@Column(name="exp_caratula")
	private String expCaratula;

	@Column(name="exp_code")
	private int expCode;

	@Column(name="exp_codigo")
	private String expCodigo;

	@Column(name="exp_codigo_instancia_anterior")
	private String expCodigoInstanciaAnterior;

	@Column(name="exp_cuerpos")
	private byte expCuerpos;

	@Column(name="exp_dictamen_similares_modo")
	private String expDictamenSimilaresModo;

	@Column(name="exp_dictamen_similares_quien")
	private String expDictamenSimilaresQuien;

	@Column(name="exp_en")
	private String expEn;

	@Column(name="exp_fojas")
	private int expFojas;

	@Column(name="exp_fuero")
	private String expFuero;

	@Column(name="exp_secretaria")
	private String expSecretaria;

	@Column(name="exp_sobre")
	private String expSobre;

	@Column(name="exp_temas_centrales")
	private String expTemasCentrales;

	@Column(name="ttp_code")
	private int ttpCode;

	@Column(name="use_code")
	private String useCode;

	public TsjExpedientesIngreso() {
	}

	public int getExiCode() {
		return this.exiCode;
	}

	public void setExiCode(int exiCode) {
		this.exiCode = exiCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getExiAsignacionFundamento() {
		return this.exiAsignacionFundamento;
	}

	public void setExiAsignacionFundamento(String exiAsignacionFundamento) {
		this.exiAsignacionFundamento = exiAsignacionFundamento;
	}

	public String getExiAsignacionOperador() {
		return this.exiAsignacionOperador;
	}

	public void setExiAsignacionOperador(String exiAsignacionOperador) {
		this.exiAsignacionOperador = exiAsignacionOperador;
	}

	public String getExiAsignacionTipo() {
		return this.exiAsignacionTipo;
	}

	public void setExiAsignacionTipo(String exiAsignacionTipo) {
		this.exiAsignacionTipo = exiAsignacionTipo;
	}

	public String getExiEstado() {
		return this.exiEstado;
	}

	public void setExiEstado(String exiEstado) {
		this.exiEstado = exiEstado;
	}

	public String getExiEtiquetas() {
		return this.exiEtiquetas;
	}

	public void setExiEtiquetas(String exiEtiquetas) {
		this.exiEtiquetas = exiEtiquetas;
	}

	public Date getExiFecha() {
		return this.exiFecha;
	}

	public void setExiFecha(Date exiFecha) {
		this.exiFecha = exiFecha;
	}

	public Date getExiFechaAnalisis() {
		return this.exiFechaAnalisis;
	}

	public void setExiFechaAnalisis(Date exiFechaAnalisis) {
		this.exiFechaAnalisis = exiFechaAnalisis;
	}

	public Date getExiFechaAsignacion() {
		return this.exiFechaAsignacion;
	}

	public void setExiFechaAsignacion(Date exiFechaAsignacion) {
		this.exiFechaAsignacion = exiFechaAsignacion;
	}

	public Date getExiFechaCarga() {
		return this.exiFechaCarga;
	}

	public void setExiFechaCarga(Date exiFechaCarga) {
		this.exiFechaCarga = exiFechaCarga;
	}

	public Date getExiFechaEgreso() {
		return this.exiFechaEgreso;
	}

	public void setExiFechaEgreso(Date exiFechaEgreso) {
		this.exiFechaEgreso = exiFechaEgreso;
	}

	public Date getExiFechaIngreso() {
		return this.exiFechaIngreso;
	}

	public void setExiFechaIngreso(Date exiFechaIngreso) {
		this.exiFechaIngreso = exiFechaIngreso;
	}

	public int getExiFiscalia() {
		return this.exiFiscalia;
	}

	public void setExiFiscalia(int exiFiscalia) {
		this.exiFiscalia = exiFiscalia;
	}

	public String getExiMotivoIngreso() {
		return this.exiMotivoIngreso;
	}

	public void setExiMotivoIngreso(String exiMotivoIngreso) {
		this.exiMotivoIngreso = exiMotivoIngreso;
	}

	public int getExiNumero() {
		return this.exiNumero;
	}

	public void setExiNumero(int exiNumero) {
		this.exiNumero = exiNumero;
	}

	public String getExiObservaciones() {
		return this.exiObservaciones;
	}

	public void setExiObservaciones(String exiObservaciones) {
		this.exiObservaciones = exiObservaciones;
	}

	public String getExiPlazo() {
		return this.exiPlazo;
	}

	public void setExiPlazo(String exiPlazo) {
		this.exiPlazo = exiPlazo;
	}

	public int getExiPlazoInterno() {
		return this.exiPlazoInterno;
	}

	public void setExiPlazoInterno(int exiPlazoInterno) {
		this.exiPlazoInterno = exiPlazoInterno;
	}

	public String getExiResponsableConfeccion() {
		return this.exiResponsableConfeccion;
	}

	public void setExiResponsableConfeccion(String exiResponsableConfeccion) {
		this.exiResponsableConfeccion = exiResponsableConfeccion;
	}

	public Date getExiTstamp() {
		return this.exiTstamp;
	}

	public void setExiTstamp(Date exiTstamp) {
		this.exiTstamp = exiTstamp;
	}

	public Date getExiVencimiento() {
		return this.exiVencimiento;
	}

	public void setExiVencimiento(Date exiVencimiento) {
		this.exiVencimiento = exiVencimiento;
	}

	public Date getExiVencimientoInterno() {
		return this.exiVencimientoInterno;
	}

	public void setExiVencimientoInterno(Date exiVencimientoInterno) {
		this.exiVencimientoInterno = exiVencimientoInterno;
	}

	public String getExpAgregados() {
		return this.expAgregados;
	}

	public void setExpAgregados(String expAgregados) {
		this.expAgregados = expAgregados;
	}

	public String getExpAgregadosDetalle() {
		return this.expAgregadosDetalle;
	}

	public void setExpAgregadosDetalle(String expAgregadosDetalle) {
		this.expAgregadosDetalle = expAgregadosDetalle;
	}

	public String getExpAutos() {
		return this.expAutos;
	}

	public void setExpAutos(String expAutos) {
		this.expAutos = expAutos;
	}

	public String getExpCaratula() {
		return this.expCaratula;
	}

	public void setExpCaratula(String expCaratula) {
		this.expCaratula = expCaratula;
	}

	public int getExpCode() {
		return this.expCode;
	}

	public void setExpCode(int expCode) {
		this.expCode = expCode;
	}

	public String getExpCodigo() {
		return this.expCodigo;
	}

	public void setExpCodigo(String expCodigo) {
		this.expCodigo = expCodigo;
	}

	public String getExpCodigoInstanciaAnterior() {
		return this.expCodigoInstanciaAnterior;
	}

	public void setExpCodigoInstanciaAnterior(String expCodigoInstanciaAnterior) {
		this.expCodigoInstanciaAnterior = expCodigoInstanciaAnterior;
	}

	public byte getExpCuerpos() {
		return this.expCuerpos;
	}

	public void setExpCuerpos(byte expCuerpos) {
		this.expCuerpos = expCuerpos;
	}

	public String getExpDictamenSimilaresModo() {
		return this.expDictamenSimilaresModo;
	}

	public void setExpDictamenSimilaresModo(String expDictamenSimilaresModo) {
		this.expDictamenSimilaresModo = expDictamenSimilaresModo;
	}

	public String getExpDictamenSimilaresQuien() {
		return this.expDictamenSimilaresQuien;
	}

	public void setExpDictamenSimilaresQuien(String expDictamenSimilaresQuien) {
		this.expDictamenSimilaresQuien = expDictamenSimilaresQuien;
	}

	public String getExpEn() {
		return this.expEn;
	}

	public void setExpEn(String expEn) {
		this.expEn = expEn;
	}

	public int getExpFojas() {
		return this.expFojas;
	}

	public void setExpFojas(int expFojas) {
		this.expFojas = expFojas;
	}

	public String getExpFuero() {
		return this.expFuero;
	}

	public void setExpFuero(String expFuero) {
		this.expFuero = expFuero;
	}

	public String getExpSecretaria() {
		return this.expSecretaria;
	}

	public void setExpSecretaria(String expSecretaria) {
		this.expSecretaria = expSecretaria;
	}

	public String getExpSobre() {
		return this.expSobre;
	}

	public void setExpSobre(String expSobre) {
		this.expSobre = expSobre;
	}

	public String getExpTemasCentrales() {
		return this.expTemasCentrales;
	}

	public void setExpTemasCentrales(String expTemasCentrales) {
		this.expTemasCentrales = expTemasCentrales;
	}

	public int getTtpCode() {
		return this.ttpCode;
	}

	public void setTtpCode(int ttpCode) {
		this.ttpCode = ttpCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}