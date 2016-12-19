package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ocmarc_mediaciones_seguimientos database table.
 * 
 */
// @Entity
// @Table(name="ocmarc_mediaciones_seguimientos")
@NamedQuery(name="OcmarcMediacionesSeguimiento.findAll", query="SELECT o FROM OcmarcMediacionesSeguimiento o")
public class OcmarcMediacionesSeguimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oms_code")
	private int omsCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="ocm_code")
	private int ocmCode;

	@Column(name="oms_estado")
	private String omsEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oms_fecha")
	private Date omsFecha;

	@Column(name="oms_observacion")
	private String omsObservacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oms_tstamp")
	private Date omsTstamp;

	@Column(name="use_code")
	private String useCode;

	public OcmarcMediacionesSeguimiento() {
	}

	public int getOmsCode() {
		return this.omsCode;
	}

	public void setOmsCode(int omsCode) {
		this.omsCode = omsCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getOcmCode() {
		return this.ocmCode;
	}

	public void setOcmCode(int ocmCode) {
		this.ocmCode = ocmCode;
	}

	public String getOmsEstado() {
		return this.omsEstado;
	}

	public void setOmsEstado(String omsEstado) {
		this.omsEstado = omsEstado;
	}

	public Date getOmsFecha() {
		return this.omsFecha;
	}

	public void setOmsFecha(Date omsFecha) {
		this.omsFecha = omsFecha;
	}

	public String getOmsObservacion() {
		return this.omsObservacion;
	}

	public void setOmsObservacion(String omsObservacion) {
		this.omsObservacion = omsObservacion;
	}

	public Date getOmsTstamp() {
		return this.omsTstamp;
	}

	public void setOmsTstamp(Date omsTstamp) {
		this.omsTstamp = omsTstamp;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}