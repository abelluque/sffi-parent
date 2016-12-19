package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nper_tipos_adjuntos database table.
 * 
 */
// @Entity
// @Table(name="nper_tipos_adjuntos")
@NamedQuery(name="NperTiposAdjunto.findAll", query="SELECT n FROM NperTiposAdjunto n")
public class NperTiposAdjunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pta_code")
	private int ptaCode;

	@Column(name="pta_deleted")
	private String ptaDeleted;

	@Column(name="pta_tipo")
	private String ptaTipo;

	public NperTiposAdjunto() {
	}

	public int getPtaCode() {
		return this.ptaCode;
	}

	public void setPtaCode(int ptaCode) {
		this.ptaCode = ptaCode;
	}

	public String getPtaDeleted() {
		return this.ptaDeleted;
	}

	public void setPtaDeleted(String ptaDeleted) {
		this.ptaDeleted = ptaDeleted;
	}

	public String getPtaTipo() {
		return this.ptaTipo;
	}

	public void setPtaTipo(String ptaTipo) {
		this.ptaTipo = ptaTipo;
	}

}