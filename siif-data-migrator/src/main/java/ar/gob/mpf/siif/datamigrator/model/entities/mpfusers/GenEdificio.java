package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the gen_edificios database table.
 * 
 */
// @Entity
// @Table(name="gen_edificios")
@NamedQuery(name="GenEdificio.findAll", query="SELECT g FROM GenEdificio g")
public class GenEdificio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ged_code")
	private int gedCode;

	@Column(name="ged_edificio")
	private String gedEdificio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ged_tmstamp")
	private Date gedTmstamp;

	public GenEdificio() {
	}

	public int getGedCode() {
		return this.gedCode;
	}

	public void setGedCode(int gedCode) {
		this.gedCode = gedCode;
	}

	public String getGedEdificio() {
		return this.gedEdificio;
	}

	public void setGedEdificio(String gedEdificio) {
		this.gedEdificio = gedEdificio;
	}

	public Date getGedTmstamp() {
		return this.gedTmstamp;
	}

	public void setGedTmstamp(Date gedTmstamp) {
		this.gedTmstamp = gedTmstamp;
	}

}