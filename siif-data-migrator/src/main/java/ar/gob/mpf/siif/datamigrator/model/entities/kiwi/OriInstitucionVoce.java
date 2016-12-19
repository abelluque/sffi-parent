package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ori_institucion_voces database table.
 * 
 */
// @Entity
// @Table(name="ori_institucion_voces")
@NamedQuery(name="OriInstitucionVoce.findAll", query="SELECT o FROM OriInstitucionVoce o")
public class OriInstitucionVoce implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="oin_code")
	private int oinCode;

	@Column(name="ovo_code")
	private int ovoCode;

	public OriInstitucionVoce() {
	}

	public int getOinCode() {
		return this.oinCode;
	}

	public void setOinCode(int oinCode) {
		this.oinCode = oinCode;
	}

	public int getOvoCode() {
		return this.ovoCode;
	}

	public void setOvoCode(int ovoCode) {
		this.ovoCode = ovoCode;
	}

}