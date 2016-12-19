package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cayt_expedientes database table.
 * 
 */
// @Entity
// @Table(name="cayt_expedientes")
@NamedQuery(name="CaytExpediente.findAll", query="SELECT c FROM CaytExpediente c")
public class CaytExpediente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="exp_code")
	private int expCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="exp_actor")
	private String expActor;

	@Column(name="exp_actor_codigo")
	private int expActorCodigo;

	@Column(name="exp_agregados")
	private String expAgregados;

	@Column(name="exp_agregados_detalle")
	private String expAgregadosDetalle;

	@Column(name="exp_caratula")
	private String expCaratula;

	@Column(name="exp_codigo")
	private String expCodigo;

	@Column(name="exp_codigo_anio")
	private int expCodigoAnio;

	@Column(name="exp_codigo_letra")
	private String expCodigoLetra;

	@Column(name="exp_codigo_numero")
	private int expCodigoNumero;

	@Column(name="exp_codigo_sufijo")
	private byte expCodigoSufijo;

	@Column(name="exp_cuerpos")
	private byte expCuerpos;

	@Column(name="exp_demandado")
	private String expDemandado;

	@Column(name="exp_demandado_codigo")
	private int expDemandadoCodigo;

	@Column(name="exp_estado")
	private String expEstado;

	@Column(name="exp_estado_vista")
	private String expEstadoVista;

	@Column(name="exp_etapa")
	private String expEtapa;

	@Column(name="exp_etiquetas")
	private String expEtiquetas;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_fecha")
	private Date expFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exp_fecha_carga")
	private Date expFechaCarga;

	@Column(name="exp_fiscalia_actual")
	private int expFiscaliaActual;

	@Column(name="exp_fojas")
	private int expFojas;

	@Column(name="exp_juzgado_actual")
	private int expJuzgadoActual;

	@Column(name="exp_juzgado_inicial")
	private int expJuzgadoInicial;

	@Column(name="exp_observaciones")
	private String expObservaciones;

	@Column(name="exp_sistema_origen")
	private String expSistemaOrigen;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exp_tstamp")
	private Date expTstamp;

	@Column(name="exp_ubicacion")
	private int expUbicacion;

	@Column(name="obj_code")
	private int objCode;

	@Column(name="use_code")
	private String useCode;

	public CaytExpediente() {
	}

	public int getExpCode() {
		return this.expCode;
	}

	public void setExpCode(int expCode) {
		this.expCode = expCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getExpActor() {
		return this.expActor;
	}

	public void setExpActor(String expActor) {
		this.expActor = expActor;
	}

	public int getExpActorCodigo() {
		return this.expActorCodigo;
	}

	public void setExpActorCodigo(int expActorCodigo) {
		this.expActorCodigo = expActorCodigo;
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

	public String getExpCaratula() {
		return this.expCaratula;
	}

	public void setExpCaratula(String expCaratula) {
		this.expCaratula = expCaratula;
	}

	public String getExpCodigo() {
		return this.expCodigo;
	}

	public void setExpCodigo(String expCodigo) {
		this.expCodigo = expCodigo;
	}

	public int getExpCodigoAnio() {
		return this.expCodigoAnio;
	}

	public void setExpCodigoAnio(int expCodigoAnio) {
		this.expCodigoAnio = expCodigoAnio;
	}

	public String getExpCodigoLetra() {
		return this.expCodigoLetra;
	}

	public void setExpCodigoLetra(String expCodigoLetra) {
		this.expCodigoLetra = expCodigoLetra;
	}

	public int getExpCodigoNumero() {
		return this.expCodigoNumero;
	}

	public void setExpCodigoNumero(int expCodigoNumero) {
		this.expCodigoNumero = expCodigoNumero;
	}

	public byte getExpCodigoSufijo() {
		return this.expCodigoSufijo;
	}

	public void setExpCodigoSufijo(byte expCodigoSufijo) {
		this.expCodigoSufijo = expCodigoSufijo;
	}

	public byte getExpCuerpos() {
		return this.expCuerpos;
	}

	public void setExpCuerpos(byte expCuerpos) {
		this.expCuerpos = expCuerpos;
	}

	public String getExpDemandado() {
		return this.expDemandado;
	}

	public void setExpDemandado(String expDemandado) {
		this.expDemandado = expDemandado;
	}

	public int getExpDemandadoCodigo() {
		return this.expDemandadoCodigo;
	}

	public void setExpDemandadoCodigo(int expDemandadoCodigo) {
		this.expDemandadoCodigo = expDemandadoCodigo;
	}

	public String getExpEstado() {
		return this.expEstado;
	}

	public void setExpEstado(String expEstado) {
		this.expEstado = expEstado;
	}

	public String getExpEstadoVista() {
		return this.expEstadoVista;
	}

	public void setExpEstadoVista(String expEstadoVista) {
		this.expEstadoVista = expEstadoVista;
	}

	public String getExpEtapa() {
		return this.expEtapa;
	}

	public void setExpEtapa(String expEtapa) {
		this.expEtapa = expEtapa;
	}

	public String getExpEtiquetas() {
		return this.expEtiquetas;
	}

	public void setExpEtiquetas(String expEtiquetas) {
		this.expEtiquetas = expEtiquetas;
	}

	public Date getExpFecha() {
		return this.expFecha;
	}

	public void setExpFecha(Date expFecha) {
		this.expFecha = expFecha;
	}

	public Date getExpFechaCarga() {
		return this.expFechaCarga;
	}

	public void setExpFechaCarga(Date expFechaCarga) {
		this.expFechaCarga = expFechaCarga;
	}

	public int getExpFiscaliaActual() {
		return this.expFiscaliaActual;
	}

	public void setExpFiscaliaActual(int expFiscaliaActual) {
		this.expFiscaliaActual = expFiscaliaActual;
	}

	public int getExpFojas() {
		return this.expFojas;
	}

	public void setExpFojas(int expFojas) {
		this.expFojas = expFojas;
	}

	public int getExpJuzgadoActual() {
		return this.expJuzgadoActual;
	}

	public void setExpJuzgadoActual(int expJuzgadoActual) {
		this.expJuzgadoActual = expJuzgadoActual;
	}

	public int getExpJuzgadoInicial() {
		return this.expJuzgadoInicial;
	}

	public void setExpJuzgadoInicial(int expJuzgadoInicial) {
		this.expJuzgadoInicial = expJuzgadoInicial;
	}

	public String getExpObservaciones() {
		return this.expObservaciones;
	}

	public void setExpObservaciones(String expObservaciones) {
		this.expObservaciones = expObservaciones;
	}

	public String getExpSistemaOrigen() {
		return this.expSistemaOrigen;
	}

	public void setExpSistemaOrigen(String expSistemaOrigen) {
		this.expSistemaOrigen = expSistemaOrigen;
	}

	public Date getExpTstamp() {
		return this.expTstamp;
	}

	public void setExpTstamp(Date expTstamp) {
		this.expTstamp = expTstamp;
	}

	public int getExpUbicacion() {
		return this.expUbicacion;
	}

	public void setExpUbicacion(int expUbicacion) {
		this.expUbicacion = expUbicacion;
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