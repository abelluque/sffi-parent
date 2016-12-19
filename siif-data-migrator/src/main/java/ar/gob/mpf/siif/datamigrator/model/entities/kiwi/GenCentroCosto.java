package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_centro_costos database table.
 * 
 */
// @Entity
// @Table(name="gen_centro_costos")
@NamedQuery(name="GenCentroCosto.findAll", query="SELECT g FROM GenCentroCosto g")
public class GenCentroCosto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="gcc_centro_costo")
	private int gccCentroCosto;

	@Column(name="gcc_code")
	private int gccCode;

	@Column(name="gcc_tmstamp")
	private int gccTmstamp;

	public GenCentroCosto() {
	}

	public int getGccCentroCosto() {
		return this.gccCentroCosto;
	}

	public void setGccCentroCosto(int gccCentroCosto) {
		this.gccCentroCosto = gccCentroCosto;
	}

	public int getGccCode() {
		return this.gccCode;
	}

	public void setGccCode(int gccCode) {
		this.gccCode = gccCode;
	}

	public int getGccTmstamp() {
		return this.gccTmstamp;
	}

	public void setGccTmstamp(int gccTmstamp) {
		this.gccTmstamp = gccTmstamp;
	}

}