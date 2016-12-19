package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the gen_unidades database table.
 * 
 */
// @Entity
// @Table(name="gen_unidades")
@NamedQuery(name="GenUnidade.findAll", query="SELECT g FROM GenUnidade g")
public class GenUnidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="gun_code")
	private int gunCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="gun_tmstamp")
	private Date gunTmstamp;

	@Column(name="gun_unidad")
	private String gunUnidad;

	public GenUnidade() {
	}

	public int getGunCode() {
		return this.gunCode;
	}

	public void setGunCode(int gunCode) {
		this.gunCode = gunCode;
	}

	public Date getGunTmstamp() {
		return this.gunTmstamp;
	}

	public void setGunTmstamp(Date gunTmstamp) {
		this.gunTmstamp = gunTmstamp;
	}

	public String getGunUnidad() {
		return this.gunUnidad;
	}

	public void setGunUnidad(String gunUnidad) {
		this.gunUnidad = gunUnidad;
	}

}