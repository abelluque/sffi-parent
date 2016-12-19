package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the utc_cedulas_juscaba database table.
 * 
 */
// @Entity
// @Table(name="utc_cedulas_juscaba")
@NamedQuery(name="UtcCedulasJuscaba.findAll", query="SELECT u FROM UtcCedulasJuscaba u")
public class UtcCedulasJuscaba implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ucj_code")
	private int ucjCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="ced_code")
	private String cedCode;

	@Column(name="ucj_estado")
	private String ucjEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ucj_fecha")
	private Date ucjFecha;

	@Temporal(TemporalType.DATE)
	@Column(name="ucj_fecha_carga")
	private Date ucjFechaCarga;

	@Temporal(TemporalType.DATE)
	@Column(name="ucj_fecha_creada")
	private Date ucjFechaCreada;

	@Temporal(TemporalType.DATE)
	@Column(name="ucj_fecha_emitida")
	private Date ucjFechaEmitida;

	@Column(name="ucj_fuero_id")
	private int ucjFueroId;

	@Column(name="ucj_id")
	private int ucjId;

	@Column(name="ucj_mensaje_error")
	private String ucjMensajeError;

	@Column(name="ucj_mensaje_warning")
	private String ucjMensajeWarning;

	@Column(name="ucj_numero")
	private String ucjNumero;

	@Lob
	@Column(name="ucj_resultado")
	private String ucjResultado;

	@Column(name="ucj_sector_id")
	private int ucjSectorId;

	@Column(name="ucj_sufijo")
	private String ucjSufijo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ucj_tstamp")
	private Date ucjTstamp;

	@Column(name="ucj_zona")
	private String ucjZona;

	@Column(name="ucj_zona_id")
	private int ucjZonaId;

	@Column(name="use_code")
	private String useCode;

	public UtcCedulasJuscaba() {
	}

	public int getUcjCode() {
		return this.ucjCode;
	}

	public void setUcjCode(int ucjCode) {
		this.ucjCode = ucjCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getCedCode() {
		return this.cedCode;
	}

	public void setCedCode(String cedCode) {
		this.cedCode = cedCode;
	}

	public String getUcjEstado() {
		return this.ucjEstado;
	}

	public void setUcjEstado(String ucjEstado) {
		this.ucjEstado = ucjEstado;
	}

	public Date getUcjFecha() {
		return this.ucjFecha;
	}

	public void setUcjFecha(Date ucjFecha) {
		this.ucjFecha = ucjFecha;
	}

	public Date getUcjFechaCarga() {
		return this.ucjFechaCarga;
	}

	public void setUcjFechaCarga(Date ucjFechaCarga) {
		this.ucjFechaCarga = ucjFechaCarga;
	}

	public Date getUcjFechaCreada() {
		return this.ucjFechaCreada;
	}

	public void setUcjFechaCreada(Date ucjFechaCreada) {
		this.ucjFechaCreada = ucjFechaCreada;
	}

	public Date getUcjFechaEmitida() {
		return this.ucjFechaEmitida;
	}

	public void setUcjFechaEmitida(Date ucjFechaEmitida) {
		this.ucjFechaEmitida = ucjFechaEmitida;
	}

	public int getUcjFueroId() {
		return this.ucjFueroId;
	}

	public void setUcjFueroId(int ucjFueroId) {
		this.ucjFueroId = ucjFueroId;
	}

	public int getUcjId() {
		return this.ucjId;
	}

	public void setUcjId(int ucjId) {
		this.ucjId = ucjId;
	}

	public String getUcjMensajeError() {
		return this.ucjMensajeError;
	}

	public void setUcjMensajeError(String ucjMensajeError) {
		this.ucjMensajeError = ucjMensajeError;
	}

	public String getUcjMensajeWarning() {
		return this.ucjMensajeWarning;
	}

	public void setUcjMensajeWarning(String ucjMensajeWarning) {
		this.ucjMensajeWarning = ucjMensajeWarning;
	}

	public String getUcjNumero() {
		return this.ucjNumero;
	}

	public void setUcjNumero(String ucjNumero) {
		this.ucjNumero = ucjNumero;
	}

	public String getUcjResultado() {
		return this.ucjResultado;
	}

	public void setUcjResultado(String ucjResultado) {
		this.ucjResultado = ucjResultado;
	}

	public int getUcjSectorId() {
		return this.ucjSectorId;
	}

	public void setUcjSectorId(int ucjSectorId) {
		this.ucjSectorId = ucjSectorId;
	}

	public String getUcjSufijo() {
		return this.ucjSufijo;
	}

	public void setUcjSufijo(String ucjSufijo) {
		this.ucjSufijo = ucjSufijo;
	}

	public Date getUcjTstamp() {
		return this.ucjTstamp;
	}

	public void setUcjTstamp(Date ucjTstamp) {
		this.ucjTstamp = ucjTstamp;
	}

	public String getUcjZona() {
		return this.ucjZona;
	}

	public void setUcjZona(String ucjZona) {
		this.ucjZona = ucjZona;
	}

	public int getUcjZonaId() {
		return this.ucjZonaId;
	}

	public void setUcjZonaId(int ucjZonaId) {
		this.ucjZonaId = ucjZonaId;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}