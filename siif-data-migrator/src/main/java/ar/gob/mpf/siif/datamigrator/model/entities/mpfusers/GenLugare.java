package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the gen_lugares database table.
 * 
 */
// @Entity
// @Table(name="gen_lugares")
@NamedQuery(name="GenLugare.findAll", query="SELECT g FROM GenLugare g")
public class GenLugare implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="glu_code")
	private int gluCode;

	@Column(name="glu_lugar")
	private String gluLugar;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="glu_tmstamp")
	private Date gluTmstamp;

	public GenLugare() {
	}

	public int getGluCode() {
		return this.gluCode;
	}

	public void setGluCode(int gluCode) {
		this.gluCode = gluCode;
	}

	public String getGluLugar() {
		return this.gluLugar;
	}

	public void setGluLugar(String gluLugar) {
		this.gluLugar = gluLugar;
	}

	public Date getGluTmstamp() {
		return this.gluTmstamp;
	}

	public void setGluTmstamp(Date gluTmstamp) {
		this.gluTmstamp = gluTmstamp;
	}

}