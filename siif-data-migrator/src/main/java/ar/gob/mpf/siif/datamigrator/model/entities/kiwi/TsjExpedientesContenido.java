package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tsj_expedientes_contenidos database table.
 * 
 */
// @Entity
// @Table(name="tsj_expedientes_contenidos")
@NamedQuery(name="TsjExpedientesContenido.findAll", query="SELECT t FROM TsjExpedientesContenido t")
public class TsjExpedientesContenido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="exc_code")
	private int excCode;

	@Column(name="cdo_code")
	private int cdoCode;

	@Column(name="exc_adjunto")
	private String excAdjunto;

	@Lob
	@Column(name="exc_comentario")
	private String excComentario;

	@Column(name="exc_control_calidad_necesario")
	private String excControlCalidadNecesario;

	@Column(name="exc_control_calidad_pendiente")
	private String excControlCalidadPendiente;

	@Column(name="exc_dependencia")
	private int excDependencia;

	@Column(name="exc_dictamen_anio")
	private int excDictamenAnio;

	@Column(name="exc_dictamen_nro")
	private int excDictamenNro;

	@Column(name="exc_estado")
	private String excEstado;

	@Column(name="exc_etiquetas")
	private String excEtiquetas;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exc_fecha")
	private Date excFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exc_fecha_emision")
	private Date excFechaEmision;

	@Column(name="exc_firmante")
	private String excFirmante;

	@Column(name="exc_firmante_mpf")
	private String excFirmanteMpf;

	@Column(name="exc_fojas_desde")
	private int excFojasDesde;

	@Column(name="exc_fojas_hasta")
	private int excFojasHasta;

	@Column(name="exc_fuero")
	private String excFuero;

	@Column(name="exc_nombre")
	private String excNombre;

	@Column(name="exc_sentencia_concordante")
	private String excSentenciaConcordante;

	@Column(name="exc_sentencia_expediente_finalizado")
	private String excSentenciaExpedienteFinalizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exc_sentencia_fecha_devolucion")
	private Date excSentenciaFechaDevolucion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exc_sentencia_fecha_remision")
	private Date excSentenciaFechaRemision;

	@Column(name="exc_sentencia_partedispositiva")
	private String excSentenciaPartedispositiva;

	@Lob
	@Column(name="exc_texto")
	private String excTexto;

	@Column(name="exi_code")
	private int exiCode;

	@Column(name="exp_code")
	private int expCode;

	@Column(name="tco_code")
	private int tcoCode;

	@Column(name="use_code")
	private int useCode;

	public TsjExpedientesContenido() {
	}

	public int getExcCode() {
		return this.excCode;
	}

	public void setExcCode(int excCode) {
		this.excCode = excCode;
	}

	public int getCdoCode() {
		return this.cdoCode;
	}

	public void setCdoCode(int cdoCode) {
		this.cdoCode = cdoCode;
	}

	public String getExcAdjunto() {
		return this.excAdjunto;
	}

	public void setExcAdjunto(String excAdjunto) {
		this.excAdjunto = excAdjunto;
	}

	public String getExcComentario() {
		return this.excComentario;
	}

	public void setExcComentario(String excComentario) {
		this.excComentario = excComentario;
	}

	public String getExcControlCalidadNecesario() {
		return this.excControlCalidadNecesario;
	}

	public void setExcControlCalidadNecesario(String excControlCalidadNecesario) {
		this.excControlCalidadNecesario = excControlCalidadNecesario;
	}

	public String getExcControlCalidadPendiente() {
		return this.excControlCalidadPendiente;
	}

	public void setExcControlCalidadPendiente(String excControlCalidadPendiente) {
		this.excControlCalidadPendiente = excControlCalidadPendiente;
	}

	public int getExcDependencia() {
		return this.excDependencia;
	}

	public void setExcDependencia(int excDependencia) {
		this.excDependencia = excDependencia;
	}

	public int getExcDictamenAnio() {
		return this.excDictamenAnio;
	}

	public void setExcDictamenAnio(int excDictamenAnio) {
		this.excDictamenAnio = excDictamenAnio;
	}

	public int getExcDictamenNro() {
		return this.excDictamenNro;
	}

	public void setExcDictamenNro(int excDictamenNro) {
		this.excDictamenNro = excDictamenNro;
	}

	public String getExcEstado() {
		return this.excEstado;
	}

	public void setExcEstado(String excEstado) {
		this.excEstado = excEstado;
	}

	public String getExcEtiquetas() {
		return this.excEtiquetas;
	}

	public void setExcEtiquetas(String excEtiquetas) {
		this.excEtiquetas = excEtiquetas;
	}

	public Date getExcFecha() {
		return this.excFecha;
	}

	public void setExcFecha(Date excFecha) {
		this.excFecha = excFecha;
	}

	public Date getExcFechaEmision() {
		return this.excFechaEmision;
	}

	public void setExcFechaEmision(Date excFechaEmision) {
		this.excFechaEmision = excFechaEmision;
	}

	public String getExcFirmante() {
		return this.excFirmante;
	}

	public void setExcFirmante(String excFirmante) {
		this.excFirmante = excFirmante;
	}

	public String getExcFirmanteMpf() {
		return this.excFirmanteMpf;
	}

	public void setExcFirmanteMpf(String excFirmanteMpf) {
		this.excFirmanteMpf = excFirmanteMpf;
	}

	public int getExcFojasDesde() {
		return this.excFojasDesde;
	}

	public void setExcFojasDesde(int excFojasDesde) {
		this.excFojasDesde = excFojasDesde;
	}

	public int getExcFojasHasta() {
		return this.excFojasHasta;
	}

	public void setExcFojasHasta(int excFojasHasta) {
		this.excFojasHasta = excFojasHasta;
	}

	public String getExcFuero() {
		return this.excFuero;
	}

	public void setExcFuero(String excFuero) {
		this.excFuero = excFuero;
	}

	public String getExcNombre() {
		return this.excNombre;
	}

	public void setExcNombre(String excNombre) {
		this.excNombre = excNombre;
	}

	public String getExcSentenciaConcordante() {
		return this.excSentenciaConcordante;
	}

	public void setExcSentenciaConcordante(String excSentenciaConcordante) {
		this.excSentenciaConcordante = excSentenciaConcordante;
	}

	public String getExcSentenciaExpedienteFinalizado() {
		return this.excSentenciaExpedienteFinalizado;
	}

	public void setExcSentenciaExpedienteFinalizado(String excSentenciaExpedienteFinalizado) {
		this.excSentenciaExpedienteFinalizado = excSentenciaExpedienteFinalizado;
	}

	public Date getExcSentenciaFechaDevolucion() {
		return this.excSentenciaFechaDevolucion;
	}

	public void setExcSentenciaFechaDevolucion(Date excSentenciaFechaDevolucion) {
		this.excSentenciaFechaDevolucion = excSentenciaFechaDevolucion;
	}

	public Date getExcSentenciaFechaRemision() {
		return this.excSentenciaFechaRemision;
	}

	public void setExcSentenciaFechaRemision(Date excSentenciaFechaRemision) {
		this.excSentenciaFechaRemision = excSentenciaFechaRemision;
	}

	public String getExcSentenciaPartedispositiva() {
		return this.excSentenciaPartedispositiva;
	}

	public void setExcSentenciaPartedispositiva(String excSentenciaPartedispositiva) {
		this.excSentenciaPartedispositiva = excSentenciaPartedispositiva;
	}

	public String getExcTexto() {
		return this.excTexto;
	}

	public void setExcTexto(String excTexto) {
		this.excTexto = excTexto;
	}

	public int getExiCode() {
		return this.exiCode;
	}

	public void setExiCode(int exiCode) {
		this.exiCode = exiCode;
	}

	public int getExpCode() {
		return this.expCode;
	}

	public void setExpCode(int expCode) {
		this.expCode = expCode;
	}

	public int getTcoCode() {
		return this.tcoCode;
	}

	public void setTcoCode(int tcoCode) {
		this.tcoCode = tcoCode;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}