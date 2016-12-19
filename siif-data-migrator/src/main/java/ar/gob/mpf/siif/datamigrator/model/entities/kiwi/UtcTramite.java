package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the utc_tramites database table.
 * 
 */
// @Entity
// @Table(name="utc_tramites")
@NamedQuery(name="UtcTramite.findAll", query="SELECT u FROM UtcTramite u")
public class UtcTramite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="utr_code")
	private int utrCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="pco_code")
	private int pcoCode;

	@Column(name="pdc_code")
	private int pdcCode;

	@Column(name="pdo_code")
	private int pdoCode;

	@Column(name="per_caracter")
	private String perCaracter;

	@Column(name="per_code")
	private int perCode;

	@Column(name="pex_code")
	private int pexCode;

	@Column(name="uco_code")
	private int ucoCode;

	@Column(name="use_code")
	private String useCode;

	@Column(name="use_email")
	private String useEmail;

	@Column(name="use_mobile_lab")
	private String useMobileLab;

	@Column(name="use_phone_lab")
	private String usePhoneLab;

	@Column(name="utr_agente")
	private int utrAgente;

	@Temporal(TemporalType.DATE)
	@Column(name="utr_alerta")
	private Date utrAlerta;

	@Column(name="utr_alerta_enviada")
	private String utrAlertaEnviada;

	@Column(name="utr_cantidad_confecciones")
	private int utrCantidadConfecciones;

	@Column(name="utr_demorado")
	private String utrDemorado;

	@Lob
	@Column(name="utr_descripcion")
	private String utrDescripcion;

	@Column(name="utr_doc_asoc")
	private String utrDocAsoc;

	@Column(name="utr_estado")
	private String utrEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="utr_fecha")
	private Date utrFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="utr_fecha_aprobado")
	private Date utrFechaAprobado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="utr_fecha_autogestion")
	private Date utrFechaAutogestion;

	@Temporal(TemporalType.DATE)
	@Column(name="utr_fecha_citacion")
	private Date utrFechaCitacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="utr_fecha_confeccionado")
	private Date utrFechaConfeccionado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="utr_fecha_entregado")
	private Date utrFechaEntregado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="utr_fecha_enviado")
	private Date utrFechaEnviado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="utr_fecha_finalizado")
	private Date utrFechaFinalizado;

	@Column(name="utr_medio")
	private String utrMedio;

	@Column(name="utr_medio_valor")
	private String utrMedioValor;

	@Column(name="utr_nro_doc")
	private String utrNroDoc;

	@Column(name="utr_prioridad")
	private String utrPrioridad;

	@Column(name="utr_supervisor")
	private int utrSupervisor;

	@Column(name="utr_tag")
	private String utrTag;

	@Column(name="utr_tiempo_esperado")
	private int utrTiempoEsperado;

	@Column(name="utr_tipo_doc")
	private String utrTipoDoc;

	@Column(name="utr_utc")
	private int utrUtc;

	@Column(name="utt_code")
	private int uttCode;

	public UtcTramite() {
	}

	public int getUtrCode() {
		return this.utrCode;
	}

	public void setUtrCode(int utrCode) {
		this.utrCode = utrCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getPcoCode() {
		return this.pcoCode;
	}

	public void setPcoCode(int pcoCode) {
		this.pcoCode = pcoCode;
	}

	public int getPdcCode() {
		return this.pdcCode;
	}

	public void setPdcCode(int pdcCode) {
		this.pdcCode = pdcCode;
	}

	public int getPdoCode() {
		return this.pdoCode;
	}

	public void setPdoCode(int pdoCode) {
		this.pdoCode = pdoCode;
	}

	public String getPerCaracter() {
		return this.perCaracter;
	}

	public void setPerCaracter(String perCaracter) {
		this.perCaracter = perCaracter;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public int getPexCode() {
		return this.pexCode;
	}

	public void setPexCode(int pexCode) {
		this.pexCode = pexCode;
	}

	public int getUcoCode() {
		return this.ucoCode;
	}

	public void setUcoCode(int ucoCode) {
		this.ucoCode = ucoCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public String getUseEmail() {
		return this.useEmail;
	}

	public void setUseEmail(String useEmail) {
		this.useEmail = useEmail;
	}

	public String getUseMobileLab() {
		return this.useMobileLab;
	}

	public void setUseMobileLab(String useMobileLab) {
		this.useMobileLab = useMobileLab;
	}

	public String getUsePhoneLab() {
		return this.usePhoneLab;
	}

	public void setUsePhoneLab(String usePhoneLab) {
		this.usePhoneLab = usePhoneLab;
	}

	public int getUtrAgente() {
		return this.utrAgente;
	}

	public void setUtrAgente(int utrAgente) {
		this.utrAgente = utrAgente;
	}

	public Date getUtrAlerta() {
		return this.utrAlerta;
	}

	public void setUtrAlerta(Date utrAlerta) {
		this.utrAlerta = utrAlerta;
	}

	public String getUtrAlertaEnviada() {
		return this.utrAlertaEnviada;
	}

	public void setUtrAlertaEnviada(String utrAlertaEnviada) {
		this.utrAlertaEnviada = utrAlertaEnviada;
	}

	public int getUtrCantidadConfecciones() {
		return this.utrCantidadConfecciones;
	}

	public void setUtrCantidadConfecciones(int utrCantidadConfecciones) {
		this.utrCantidadConfecciones = utrCantidadConfecciones;
	}

	public String getUtrDemorado() {
		return this.utrDemorado;
	}

	public void setUtrDemorado(String utrDemorado) {
		this.utrDemorado = utrDemorado;
	}

	public String getUtrDescripcion() {
		return this.utrDescripcion;
	}

	public void setUtrDescripcion(String utrDescripcion) {
		this.utrDescripcion = utrDescripcion;
	}

	public String getUtrDocAsoc() {
		return this.utrDocAsoc;
	}

	public void setUtrDocAsoc(String utrDocAsoc) {
		this.utrDocAsoc = utrDocAsoc;
	}

	public String getUtrEstado() {
		return this.utrEstado;
	}

	public void setUtrEstado(String utrEstado) {
		this.utrEstado = utrEstado;
	}

	public Date getUtrFecha() {
		return this.utrFecha;
	}

	public void setUtrFecha(Date utrFecha) {
		this.utrFecha = utrFecha;
	}

	public Date getUtrFechaAprobado() {
		return this.utrFechaAprobado;
	}

	public void setUtrFechaAprobado(Date utrFechaAprobado) {
		this.utrFechaAprobado = utrFechaAprobado;
	}

	public Date getUtrFechaAutogestion() {
		return this.utrFechaAutogestion;
	}

	public void setUtrFechaAutogestion(Date utrFechaAutogestion) {
		this.utrFechaAutogestion = utrFechaAutogestion;
	}

	public Date getUtrFechaCitacion() {
		return this.utrFechaCitacion;
	}

	public void setUtrFechaCitacion(Date utrFechaCitacion) {
		this.utrFechaCitacion = utrFechaCitacion;
	}

	public Date getUtrFechaConfeccionado() {
		return this.utrFechaConfeccionado;
	}

	public void setUtrFechaConfeccionado(Date utrFechaConfeccionado) {
		this.utrFechaConfeccionado = utrFechaConfeccionado;
	}

	public Date getUtrFechaEntregado() {
		return this.utrFechaEntregado;
	}

	public void setUtrFechaEntregado(Date utrFechaEntregado) {
		this.utrFechaEntregado = utrFechaEntregado;
	}

	public Date getUtrFechaEnviado() {
		return this.utrFechaEnviado;
	}

	public void setUtrFechaEnviado(Date utrFechaEnviado) {
		this.utrFechaEnviado = utrFechaEnviado;
	}

	public Date getUtrFechaFinalizado() {
		return this.utrFechaFinalizado;
	}

	public void setUtrFechaFinalizado(Date utrFechaFinalizado) {
		this.utrFechaFinalizado = utrFechaFinalizado;
	}

	public String getUtrMedio() {
		return this.utrMedio;
	}

	public void setUtrMedio(String utrMedio) {
		this.utrMedio = utrMedio;
	}

	public String getUtrMedioValor() {
		return this.utrMedioValor;
	}

	public void setUtrMedioValor(String utrMedioValor) {
		this.utrMedioValor = utrMedioValor;
	}

	public String getUtrNroDoc() {
		return this.utrNroDoc;
	}

	public void setUtrNroDoc(String utrNroDoc) {
		this.utrNroDoc = utrNroDoc;
	}

	public String getUtrPrioridad() {
		return this.utrPrioridad;
	}

	public void setUtrPrioridad(String utrPrioridad) {
		this.utrPrioridad = utrPrioridad;
	}

	public int getUtrSupervisor() {
		return this.utrSupervisor;
	}

	public void setUtrSupervisor(int utrSupervisor) {
		this.utrSupervisor = utrSupervisor;
	}

	public String getUtrTag() {
		return this.utrTag;
	}

	public void setUtrTag(String utrTag) {
		this.utrTag = utrTag;
	}

	public int getUtrTiempoEsperado() {
		return this.utrTiempoEsperado;
	}

	public void setUtrTiempoEsperado(int utrTiempoEsperado) {
		this.utrTiempoEsperado = utrTiempoEsperado;
	}

	public String getUtrTipoDoc() {
		return this.utrTipoDoc;
	}

	public void setUtrTipoDoc(String utrTipoDoc) {
		this.utrTipoDoc = utrTipoDoc;
	}

	public int getUtrUtc() {
		return this.utrUtc;
	}

	public void setUtrUtc(int utrUtc) {
		this.utrUtc = utrUtc;
	}

	public int getUttCode() {
		return this.uttCode;
	}

	public void setUttCode(int uttCode) {
		this.uttCode = uttCode;
	}

}