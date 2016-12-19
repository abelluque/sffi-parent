package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ori_institucion_serv database table.
 * 
 */
// @Entity
// @Table(name="ori_institucion_serv")
@NamedQuery(name="OriInstitucionServ.findAll", query="SELECT o FROM OriInstitucionServ o")
public class OriInstitucionServ implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="oin_code")
	private int oinCode;

	@Column(name="osv_code")
	private int osvCode;

	public OriInstitucionServ() {
	}

	public int getOinCode() {
		return this.oinCode;
	}

	public void setOinCode(int oinCode) {
		this.oinCode = oinCode;
	}

	public int getOsvCode() {
		return this.osvCode;
	}

	public void setOsvCode(int osvCode) {
		this.osvCode = osvCode;
	}

}