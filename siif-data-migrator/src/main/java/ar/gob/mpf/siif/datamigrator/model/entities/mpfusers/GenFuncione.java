package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the gen_funciones database table.
 * 
 */
// @Entity
// @Table(name="gen_funciones")
@NamedQuery(name="GenFuncione.findAll", query="SELECT g FROM GenFuncione g")
public class GenFuncione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="gfu_code")
	private int gfuCode;

	@Column(name="gfu_funcion")
	private String gfuFuncion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="gfu_tmstamp")
	private Date gfuTmstamp;

	public GenFuncione() {
	}

	public int getGfuCode() {
		return this.gfuCode;
	}

	public void setGfuCode(int gfuCode) {
		this.gfuCode = gfuCode;
	}

	public String getGfuFuncion() {
		return this.gfuFuncion;
	}

	public void setGfuFuncion(String gfuFuncion) {
		this.gfuFuncion = gfuFuncion;
	}

	public Date getGfuTmstamp() {
		return this.gfuTmstamp;
	}

	public void setGfuTmstamp(Date gfuTmstamp) {
		this.gfuTmstamp = gfuTmstamp;
	}

}