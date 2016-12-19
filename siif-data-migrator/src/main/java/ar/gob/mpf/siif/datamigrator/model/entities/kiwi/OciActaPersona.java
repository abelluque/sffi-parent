package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the oci_acta_personas database table.
 * 
 */
// @Entity
// @Table(name="oci_acta_personas")
@NamedQuery(name="OciActaPersona.findAll", query="SELECT o FROM OciActaPersona o")
public class OciActaPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="oac_code")
	private int oacCode;

	@Column(name="oap_acta_egreso")
	private String oapActaEgreso;

	@Column(name="oap_estado_persona")
	private String oapEstadoPersona;

	@Column(name="oap_estado_tramite")
	private String oapEstadoTramite;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oap_fecha")
	private Date oapFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oap_fecha_egreso")
	private Date oapFechaEgreso;

	@Column(name="oap_motivo_egreso")
	private String oapMotivoEgreso;

	@Column(name="ope_code")
	private int opeCode;

	@Column(name="use_code")
	private int useCode;

	public OciActaPersona() {
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getOacCode() {
		return this.oacCode;
	}

	public void setOacCode(int oacCode) {
		this.oacCode = oacCode;
	}

	public String getOapActaEgreso() {
		return this.oapActaEgreso;
	}

	public void setOapActaEgreso(String oapActaEgreso) {
		this.oapActaEgreso = oapActaEgreso;
	}

	public String getOapEstadoPersona() {
		return this.oapEstadoPersona;
	}

	public void setOapEstadoPersona(String oapEstadoPersona) {
		this.oapEstadoPersona = oapEstadoPersona;
	}

	public String getOapEstadoTramite() {
		return this.oapEstadoTramite;
	}

	public void setOapEstadoTramite(String oapEstadoTramite) {
		this.oapEstadoTramite = oapEstadoTramite;
	}

	public Date getOapFecha() {
		return this.oapFecha;
	}

	public void setOapFecha(Date oapFecha) {
		this.oapFecha = oapFecha;
	}

	public Date getOapFechaEgreso() {
		return this.oapFechaEgreso;
	}

	public void setOapFechaEgreso(Date oapFechaEgreso) {
		this.oapFechaEgreso = oapFechaEgreso;
	}

	public String getOapMotivoEgreso() {
		return this.oapMotivoEgreso;
	}

	public void setOapMotivoEgreso(String oapMotivoEgreso) {
		this.oapMotivoEgreso = oapMotivoEgreso;
	}

	public int getOpeCode() {
		return this.opeCode;
	}

	public void setOpeCode(int opeCode) {
		this.opeCode = opeCode;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}