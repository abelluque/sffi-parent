package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the spp_suspensiones_de_proceso_agenda database table.
 * 
 */
// @Entity
// @Table(name="spp_suspensiones_de_proceso_agenda")
@NamedQuery(name="SppSuspensionesDeProcesoAgenda.findAll", query="SELECT s FROM SppSuspensionesDeProcesoAgenda s")
public class SppSuspensionesDeProcesoAgenda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sag_code")
	private int sagCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sag_alta")
	private Date sagAlta;

	@Column(name="sag_estado")
	private String sagEstado;

	@Column(name="sag_etiquetas")
	private String sagEtiquetas;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sag_fecha")
	private Date sagFecha;

	@Column(name="sag_observacion")
	private String sagObservacion;

	@Column(name="sag_resultado")
	private String sagResultado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sag_tstamp")
	private Date sagTstamp;

	@Column(name="ssp_code")
	private int sspCode;

	@Column(name="stt_code")
	private int sttCode;

	@Column(name="use_code")
	private int useCode;

	public SppSuspensionesDeProcesoAgenda() {
	}

	public int getSagCode() {
		return this.sagCode;
	}

	public void setSagCode(int sagCode) {
		this.sagCode = sagCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public Date getSagAlta() {
		return this.sagAlta;
	}

	public void setSagAlta(Date sagAlta) {
		this.sagAlta = sagAlta;
	}

	public String getSagEstado() {
		return this.sagEstado;
	}

	public void setSagEstado(String sagEstado) {
		this.sagEstado = sagEstado;
	}

	public String getSagEtiquetas() {
		return this.sagEtiquetas;
	}

	public void setSagEtiquetas(String sagEtiquetas) {
		this.sagEtiquetas = sagEtiquetas;
	}

	public Date getSagFecha() {
		return this.sagFecha;
	}

	public void setSagFecha(Date sagFecha) {
		this.sagFecha = sagFecha;
	}

	public String getSagObservacion() {
		return this.sagObservacion;
	}

	public void setSagObservacion(String sagObservacion) {
		this.sagObservacion = sagObservacion;
	}

	public String getSagResultado() {
		return this.sagResultado;
	}

	public void setSagResultado(String sagResultado) {
		this.sagResultado = sagResultado;
	}

	public Date getSagTstamp() {
		return this.sagTstamp;
	}

	public void setSagTstamp(Date sagTstamp) {
		this.sagTstamp = sagTstamp;
	}

	public int getSspCode() {
		return this.sspCode;
	}

	public void setSspCode(int sspCode) {
		this.sspCode = sspCode;
	}

	public int getSttCode() {
		return this.sttCode;
	}

	public void setSttCode(int sttCode) {
		this.sttCode = sttCode;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}