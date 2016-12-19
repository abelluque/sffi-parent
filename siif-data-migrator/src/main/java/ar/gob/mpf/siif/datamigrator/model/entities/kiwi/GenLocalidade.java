package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_localidades database table.
 * 
 */
// @Entity
// @Table(name="gen_localidades")
@NamedQuery(name="GenLocalidade.findAll", query="SELECT g FROM GenLocalidade g")
public class GenLocalidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="glo_code")
	private int gloCode;

	@Column(name="glo_localidad")
	private String gloLocalidad;

	@Column(name="pro_code")
	private int proCode;

	public GenLocalidade() {
	}

	public int getGloCode() {
		return this.gloCode;
	}

	public void setGloCode(int gloCode) {
		this.gloCode = gloCode;
	}

	public String getGloLocalidad() {
		return this.gloLocalidad;
	}

	public void setGloLocalidad(String gloLocalidad) {
		this.gloLocalidad = gloLocalidad;
	}

	public int getProCode() {
		return this.proCode;
	}

	public void setProCode(int proCode) {
		this.proCode = proCode;
	}

}