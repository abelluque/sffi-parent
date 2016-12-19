package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ori_motivos_noc database table.
 * 
 */
// @Entity
// @Table(name="ori_motivos_noc")
@NamedQuery(name="OriMotivosNoc.findAll", query="SELECT o FROM OriMotivosNoc o")
public class OriMotivosNoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="omn_code")
	private int omnCode;

	@Column(name="omn_activo")
	private String omnActivo;

	@Column(name="omn_motivo")
	private String omnMotivo;

	public OriMotivosNoc() {
	}

	public int getOmnCode() {
		return this.omnCode;
	}

	public void setOmnCode(int omnCode) {
		this.omnCode = omnCode;
	}

	public String getOmnActivo() {
		return this.omnActivo;
	}

	public void setOmnActivo(String omnActivo) {
		this.omnActivo = omnActivo;
	}

	public String getOmnMotivo() {
		return this.omnMotivo;
	}

	public void setOmnMotivo(String omnMotivo) {
		this.omnMotivo = omnMotivo;
	}

}