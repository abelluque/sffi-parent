package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the for_inscripciones_eventos database table.
 * 
 */
// @Entity
// @Table(name="for_inscripciones_eventos")
@NamedQuery(name="ForInscripcionesEvento.findAll", query="SELECT f FROM ForInscripcionesEvento f")
public class ForInscripcionesEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="fiuev_code")
	private int fiuevCode;

	@Column(name="fiu_code")
	private int fiuCode;

	@Column(name="fiu_estado")
	private String fiuEstado;

	@Column(name="fiuev_aal_codigo")
	private int fiuevAalCodigo;

	@Column(name="fiuev_observacion")
	private String fiuevObservacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fiuev_tstamp")
	private Date fiuevTstamp;

	@Column(name="fiuev_use_code")
	private String fiuevUseCode;

	public ForInscripcionesEvento() {
	}

	public int getFiuevCode() {
		return this.fiuevCode;
	}

	public void setFiuevCode(int fiuevCode) {
		this.fiuevCode = fiuevCode;
	}

	public int getFiuCode() {
		return this.fiuCode;
	}

	public void setFiuCode(int fiuCode) {
		this.fiuCode = fiuCode;
	}

	public String getFiuEstado() {
		return this.fiuEstado;
	}

	public void setFiuEstado(String fiuEstado) {
		this.fiuEstado = fiuEstado;
	}

	public int getFiuevAalCodigo() {
		return this.fiuevAalCodigo;
	}

	public void setFiuevAalCodigo(int fiuevAalCodigo) {
		this.fiuevAalCodigo = fiuevAalCodigo;
	}

	public String getFiuevObservacion() {
		return this.fiuevObservacion;
	}

	public void setFiuevObservacion(String fiuevObservacion) {
		this.fiuevObservacion = fiuevObservacion;
	}

	public Date getFiuevTstamp() {
		return this.fiuevTstamp;
	}

	public void setFiuevTstamp(Date fiuevTstamp) {
		this.fiuevTstamp = fiuevTstamp;
	}

	public String getFiuevUseCode() {
		return this.fiuevUseCode;
	}

	public void setFiuevUseCode(String fiuevUseCode) {
		this.fiuevUseCode = fiuevUseCode;
	}

}