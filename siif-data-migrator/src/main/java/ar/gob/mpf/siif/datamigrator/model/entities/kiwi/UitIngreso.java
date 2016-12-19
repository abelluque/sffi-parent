package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the uit_ingresos database table.
 * 
 */
// @Entity
// @Table(name="uit_ingresos")
@NamedQuery(name="UitIngreso.findAll", query="SELECT u FROM UitIngreso u")
public class UitIngreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="uin_code")
	private int uinCode;

	@Column(name="doc_code")
	private String docCode;

	@Column(name="doc_id")
	private String docId;

	@Column(name="doc_padre")
	private String docPadre;

	@Column(name="dtip_code")
	private String dtipCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_aprobacion")
	private Date fechaAprobacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_asignacion")
	private Date fechaAsignacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_clasificacion")
	private Date fechaClasificacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_ingreso")
	private Date fechaIngreso;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_resenia")
	private Date fechaResenia;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vencimiento_analisis")
	private Date fechaVencimientoAnalisis;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vencimiento_asignacion")
	private Date fechaVencimientoAsignacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_vinculacion_lugar")
	private Date fechaVinculacionLugar;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_vinculacion_nombre")
	private Date fechaVinculacionNombre;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_vinculacion_persona")
	private Date fechaVinculacionPersona;

	private String origen;

	@Column(name="origen_aal_codigo")
	private int origenAalCodigo;

	@Column(name="uin_aal_codigo")
	private int uinAalCodigo;

	@Column(name="uin_agente_asignado")
	private String uinAgenteAsignado;

	@Column(name="uin_autorizacion_tiempo")
	private String uinAutorizacionTiempo;

	@Lob
	@Column(name="uin_data_clasificacion")
	private String uinDataClasificacion;

	@Column(name="uin_destino_dependencia")
	private int uinDestinoDependencia;

	@Column(name="uin_destino_estado")
	private String uinDestinoEstado;

	@Column(name="uin_destino_motivo")
	private String uinDestinoMotivo;

	@Column(name="uin_destino_tipo")
	private String uinDestinoTipo;

	@Column(name="uin_estado")
	private String uinEstado;

	@Column(name="uin_estado_motivo")
	private String uinEstadoMotivo;

	@Column(name="uin_etiquetas")
	private String uinEtiquetas;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="uin_fecha_convalidacion")
	private Date uinFechaConvalidacion;

	@Lob
	@Column(name="uin_fundamentacion")
	private String uinFundamentacion;

	@Column(name="uin_observaciones")
	private String uinObservaciones;

	@Column(name="uin_para_convalidar")
	private String uinParaConvalidar;

	@Column(name="uin_resultado_convalidacion")
	private String uinResultadoConvalidacion;

	@Column(name="uin_tiempo_analisis")
	private int uinTiempoAnalisis;

	@Column(name="uin_tiempo_analisis_fundamentacion")
	private String uinTiempoAnalisisFundamentacion;

	@Column(name="uin_tiempo_excedido_fundamentacion")
	private String uinTiempoExcedidoFundamentacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="uin_tstamp")
	private Date uinTstamp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="uin_vencimiento_convalidacion")
	private Date uinVencimientoConvalidacion;

	@Column(name="use_code_aprobacion")
	private int useCodeAprobacion;

	@Column(name="use_code_asignacion")
	private int useCodeAsignacion;

	@Column(name="use_code_clasificacion")
	private int useCodeClasificacion;

	@Column(name="use_code_ingreso")
	private int useCodeIngreso;

	@Column(name="use_code_resenia")
	private int useCodeResenia;

	@Column(name="use_code_tstamp")
	private int useCodeTstamp;

	@Column(name="use_code_vinculacion_lugar")
	private int useCodeVinculacionLugar;

	@Column(name="use_code_vinculacion_nombre")
	private int useCodeVinculacionNombre;

	@Column(name="use_code_vinculacion_persona")
	private int useCodeVinculacionPersona;

	public UitIngreso() {
	}

	public int getUinCode() {
		return this.uinCode;
	}

	public void setUinCode(int uinCode) {
		this.uinCode = uinCode;
	}

	public String getDocCode() {
		return this.docCode;
	}

	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getDocPadre() {
		return this.docPadre;
	}

	public void setDocPadre(String docPadre) {
		this.docPadre = docPadre;
	}

	public String getDtipCode() {
		return this.dtipCode;
	}

	public void setDtipCode(String dtipCode) {
		this.dtipCode = dtipCode;
	}

	public Date getFechaAprobacion() {
		return this.fechaAprobacion;
	}

	public void setFechaAprobacion(Date fechaAprobacion) {
		this.fechaAprobacion = fechaAprobacion;
	}

	public Date getFechaAsignacion() {
		return this.fechaAsignacion;
	}

	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

	public Date getFechaClasificacion() {
		return this.fechaClasificacion;
	}

	public void setFechaClasificacion(Date fechaClasificacion) {
		this.fechaClasificacion = fechaClasificacion;
	}

	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaResenia() {
		return this.fechaResenia;
	}

	public void setFechaResenia(Date fechaResenia) {
		this.fechaResenia = fechaResenia;
	}

	public Date getFechaVencimientoAnalisis() {
		return this.fechaVencimientoAnalisis;
	}

	public void setFechaVencimientoAnalisis(Date fechaVencimientoAnalisis) {
		this.fechaVencimientoAnalisis = fechaVencimientoAnalisis;
	}

	public Date getFechaVencimientoAsignacion() {
		return this.fechaVencimientoAsignacion;
	}

	public void setFechaVencimientoAsignacion(Date fechaVencimientoAsignacion) {
		this.fechaVencimientoAsignacion = fechaVencimientoAsignacion;
	}

	public Date getFechaVinculacionLugar() {
		return this.fechaVinculacionLugar;
	}

	public void setFechaVinculacionLugar(Date fechaVinculacionLugar) {
		this.fechaVinculacionLugar = fechaVinculacionLugar;
	}

	public Date getFechaVinculacionNombre() {
		return this.fechaVinculacionNombre;
	}

	public void setFechaVinculacionNombre(Date fechaVinculacionNombre) {
		this.fechaVinculacionNombre = fechaVinculacionNombre;
	}

	public Date getFechaVinculacionPersona() {
		return this.fechaVinculacionPersona;
	}

	public void setFechaVinculacionPersona(Date fechaVinculacionPersona) {
		this.fechaVinculacionPersona = fechaVinculacionPersona;
	}

	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getOrigenAalCodigo() {
		return this.origenAalCodigo;
	}

	public void setOrigenAalCodigo(int origenAalCodigo) {
		this.origenAalCodigo = origenAalCodigo;
	}

	public int getUinAalCodigo() {
		return this.uinAalCodigo;
	}

	public void setUinAalCodigo(int uinAalCodigo) {
		this.uinAalCodigo = uinAalCodigo;
	}

	public String getUinAgenteAsignado() {
		return this.uinAgenteAsignado;
	}

	public void setUinAgenteAsignado(String uinAgenteAsignado) {
		this.uinAgenteAsignado = uinAgenteAsignado;
	}

	public String getUinAutorizacionTiempo() {
		return this.uinAutorizacionTiempo;
	}

	public void setUinAutorizacionTiempo(String uinAutorizacionTiempo) {
		this.uinAutorizacionTiempo = uinAutorizacionTiempo;
	}

	public String getUinDataClasificacion() {
		return this.uinDataClasificacion;
	}

	public void setUinDataClasificacion(String uinDataClasificacion) {
		this.uinDataClasificacion = uinDataClasificacion;
	}

	public int getUinDestinoDependencia() {
		return this.uinDestinoDependencia;
	}

	public void setUinDestinoDependencia(int uinDestinoDependencia) {
		this.uinDestinoDependencia = uinDestinoDependencia;
	}

	public String getUinDestinoEstado() {
		return this.uinDestinoEstado;
	}

	public void setUinDestinoEstado(String uinDestinoEstado) {
		this.uinDestinoEstado = uinDestinoEstado;
	}

	public String getUinDestinoMotivo() {
		return this.uinDestinoMotivo;
	}

	public void setUinDestinoMotivo(String uinDestinoMotivo) {
		this.uinDestinoMotivo = uinDestinoMotivo;
	}

	public String getUinDestinoTipo() {
		return this.uinDestinoTipo;
	}

	public void setUinDestinoTipo(String uinDestinoTipo) {
		this.uinDestinoTipo = uinDestinoTipo;
	}

	public String getUinEstado() {
		return this.uinEstado;
	}

	public void setUinEstado(String uinEstado) {
		this.uinEstado = uinEstado;
	}

	public String getUinEstadoMotivo() {
		return this.uinEstadoMotivo;
	}

	public void setUinEstadoMotivo(String uinEstadoMotivo) {
		this.uinEstadoMotivo = uinEstadoMotivo;
	}

	public String getUinEtiquetas() {
		return this.uinEtiquetas;
	}

	public void setUinEtiquetas(String uinEtiquetas) {
		this.uinEtiquetas = uinEtiquetas;
	}

	public Date getUinFechaConvalidacion() {
		return this.uinFechaConvalidacion;
	}

	public void setUinFechaConvalidacion(Date uinFechaConvalidacion) {
		this.uinFechaConvalidacion = uinFechaConvalidacion;
	}

	public String getUinFundamentacion() {
		return this.uinFundamentacion;
	}

	public void setUinFundamentacion(String uinFundamentacion) {
		this.uinFundamentacion = uinFundamentacion;
	}

	public String getUinObservaciones() {
		return this.uinObservaciones;
	}

	public void setUinObservaciones(String uinObservaciones) {
		this.uinObservaciones = uinObservaciones;
	}

	public String getUinParaConvalidar() {
		return this.uinParaConvalidar;
	}

	public void setUinParaConvalidar(String uinParaConvalidar) {
		this.uinParaConvalidar = uinParaConvalidar;
	}

	public String getUinResultadoConvalidacion() {
		return this.uinResultadoConvalidacion;
	}

	public void setUinResultadoConvalidacion(String uinResultadoConvalidacion) {
		this.uinResultadoConvalidacion = uinResultadoConvalidacion;
	}

	public int getUinTiempoAnalisis() {
		return this.uinTiempoAnalisis;
	}

	public void setUinTiempoAnalisis(int uinTiempoAnalisis) {
		this.uinTiempoAnalisis = uinTiempoAnalisis;
	}

	public String getUinTiempoAnalisisFundamentacion() {
		return this.uinTiempoAnalisisFundamentacion;
	}

	public void setUinTiempoAnalisisFundamentacion(String uinTiempoAnalisisFundamentacion) {
		this.uinTiempoAnalisisFundamentacion = uinTiempoAnalisisFundamentacion;
	}

	public String getUinTiempoExcedidoFundamentacion() {
		return this.uinTiempoExcedidoFundamentacion;
	}

	public void setUinTiempoExcedidoFundamentacion(String uinTiempoExcedidoFundamentacion) {
		this.uinTiempoExcedidoFundamentacion = uinTiempoExcedidoFundamentacion;
	}

	public Date getUinTstamp() {
		return this.uinTstamp;
	}

	public void setUinTstamp(Date uinTstamp) {
		this.uinTstamp = uinTstamp;
	}

	public Date getUinVencimientoConvalidacion() {
		return this.uinVencimientoConvalidacion;
	}

	public void setUinVencimientoConvalidacion(Date uinVencimientoConvalidacion) {
		this.uinVencimientoConvalidacion = uinVencimientoConvalidacion;
	}

	public int getUseCodeAprobacion() {
		return this.useCodeAprobacion;
	}

	public void setUseCodeAprobacion(int useCodeAprobacion) {
		this.useCodeAprobacion = useCodeAprobacion;
	}

	public int getUseCodeAsignacion() {
		return this.useCodeAsignacion;
	}

	public void setUseCodeAsignacion(int useCodeAsignacion) {
		this.useCodeAsignacion = useCodeAsignacion;
	}

	public int getUseCodeClasificacion() {
		return this.useCodeClasificacion;
	}

	public void setUseCodeClasificacion(int useCodeClasificacion) {
		this.useCodeClasificacion = useCodeClasificacion;
	}

	public int getUseCodeIngreso() {
		return this.useCodeIngreso;
	}

	public void setUseCodeIngreso(int useCodeIngreso) {
		this.useCodeIngreso = useCodeIngreso;
	}

	public int getUseCodeResenia() {
		return this.useCodeResenia;
	}

	public void setUseCodeResenia(int useCodeResenia) {
		this.useCodeResenia = useCodeResenia;
	}

	public int getUseCodeTstamp() {
		return this.useCodeTstamp;
	}

	public void setUseCodeTstamp(int useCodeTstamp) {
		this.useCodeTstamp = useCodeTstamp;
	}

	public int getUseCodeVinculacionLugar() {
		return this.useCodeVinculacionLugar;
	}

	public void setUseCodeVinculacionLugar(int useCodeVinculacionLugar) {
		this.useCodeVinculacionLugar = useCodeVinculacionLugar;
	}

	public int getUseCodeVinculacionNombre() {
		return this.useCodeVinculacionNombre;
	}

	public void setUseCodeVinculacionNombre(int useCodeVinculacionNombre) {
		this.useCodeVinculacionNombre = useCodeVinculacionNombre;
	}

	public int getUseCodeVinculacionPersona() {
		return this.useCodeVinculacionPersona;
	}

	public void setUseCodeVinculacionPersona(int useCodeVinculacionPersona) {
		this.useCodeVinculacionPersona = useCodeVinculacionPersona;
	}

}