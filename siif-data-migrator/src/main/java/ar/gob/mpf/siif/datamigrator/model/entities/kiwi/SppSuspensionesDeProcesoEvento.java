package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the spp_suspensiones_de_proceso_eventos database table.
 * 
 */
// @Entity
// @Table(name="spp_suspensiones_de_proceso_eventos")
@NamedQuery(name="SppSuspensionesDeProcesoEvento.findAll", query="SELECT s FROM SppSuspensionesDeProcesoEvento s")
public class SppSuspensionesDeProcesoEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="spe_code")
	private int speCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="spe_cambios")
	private String speCambios;

	@Column(name="spe_comentarios")
	private String speComentarios;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="spe_tstamp")
	private Date speTstamp;

	@Column(name="ssp_code")
	private int sspCode;

	@Column(name="ssp_estado")
	private String sspEstado;

	@Column(name="ssp_estado_control")
	private String sspEstadoControl;

	@Column(name="use_code")
	private String useCode;

	public SppSuspensionesDeProcesoEvento() {
	}

	public int getSpeCode() {
		return this.speCode;
	}

	public void setSpeCode(int speCode) {
		this.speCode = speCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getSpeCambios() {
		return this.speCambios;
	}

	public void setSpeCambios(String speCambios) {
		this.speCambios = speCambios;
	}

	public String getSpeComentarios() {
		return this.speComentarios;
	}

	public void setSpeComentarios(String speComentarios) {
		this.speComentarios = speComentarios;
	}

	public Date getSpeTstamp() {
		return this.speTstamp;
	}

	public void setSpeTstamp(Date speTstamp) {
		this.speTstamp = speTstamp;
	}

	public int getSspCode() {
		return this.sspCode;
	}

	public void setSspCode(int sspCode) {
		this.sspCode = sspCode;
	}

	public String getSspEstado() {
		return this.sspEstado;
	}

	public void setSspEstado(String sspEstado) {
		this.sspEstado = sspEstado;
	}

	public String getSspEstadoControl() {
		return this.sspEstadoControl;
	}

	public void setSspEstadoControl(String sspEstadoControl) {
		this.sspEstadoControl = sspEstadoControl;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}