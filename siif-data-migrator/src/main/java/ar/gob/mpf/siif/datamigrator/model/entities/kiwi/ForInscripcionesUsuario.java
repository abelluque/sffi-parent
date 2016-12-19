package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the for_inscripciones_usuarios database table.
 * 
 */
// @Entity
// @Table(name="for_inscripciones_usuarios")
@NamedQuery(name="ForInscripcionesUsuario.findAll", query="SELECT f FROM ForInscripcionesUsuario f")
public class ForInscripcionesUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="fiu_code")
	private int fiuCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="fcu_code")
	private int fcuCode;

	@Column(name="fiu_estado")
	private String fiuEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fiu_tstamp")
	private Date fiuTstamp;

	@Column(name="use_code")
	private int useCode;

	public ForInscripcionesUsuario() {
	}

	public int getFiuCode() {
		return this.fiuCode;
	}

	public void setFiuCode(int fiuCode) {
		this.fiuCode = fiuCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getFcuCode() {
		return this.fcuCode;
	}

	public void setFcuCode(int fcuCode) {
		this.fcuCode = fcuCode;
	}

	public String getFiuEstado() {
		return this.fiuEstado;
	}

	public void setFiuEstado(String fiuEstado) {
		this.fiuEstado = fiuEstado;
	}

	public Date getFiuTstamp() {
		return this.fiuTstamp;
	}

	public void setFiuTstamp(Date fiuTstamp) {
		this.fiuTstamp = fiuTstamp;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}