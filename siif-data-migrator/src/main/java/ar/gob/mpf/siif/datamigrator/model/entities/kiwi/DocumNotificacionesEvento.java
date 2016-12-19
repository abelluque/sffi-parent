package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_notificaciones_eventos database table.
 * 
 */
// @Entity
// @Table(name="docum_notificaciones_eventos")
@NamedQuery(name="DocumNotificacionesEvento.findAll", query="SELECT d FROM DocumNotificacionesEvento d")
public class DocumNotificacionesEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dnev_code")
	private int dnevCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Lob
	@Column(name="dnev_observacion")
	private String dnevObservacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dnev_tstamp")
	private Date dnevTstamp;

	@Column(name="dno_code")
	private int dnoCode;

	@Column(name="dno_estado")
	private String dnoEstado;

	@Column(name="use_code")
	private String useCode;

	public DocumNotificacionesEvento() {
	}

	public int getDnevCode() {
		return this.dnevCode;
	}

	public void setDnevCode(int dnevCode) {
		this.dnevCode = dnevCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getDnevObservacion() {
		return this.dnevObservacion;
	}

	public void setDnevObservacion(String dnevObservacion) {
		this.dnevObservacion = dnevObservacion;
	}

	public Date getDnevTstamp() {
		return this.dnevTstamp;
	}

	public void setDnevTstamp(Date dnevTstamp) {
		this.dnevTstamp = dnevTstamp;
	}

	public int getDnoCode() {
		return this.dnoCode;
	}

	public void setDnoCode(int dnoCode) {
		this.dnoCode = dnoCode;
	}

	public String getDnoEstado() {
		return this.dnoEstado;
	}

	public void setDnoEstado(String dnoEstado) {
		this.dnoEstado = dnoEstado;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}