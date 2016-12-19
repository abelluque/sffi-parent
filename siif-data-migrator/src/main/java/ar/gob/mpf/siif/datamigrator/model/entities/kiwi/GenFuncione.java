package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_funciones database table.
 * 
 */
// @Entity
// @Table(name="gen_funciones")
@NamedQuery(name="GenFuncione.findAll", query="SELECT g FROM GenFuncione g")
public class GenFuncione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="gfu_code")
	private int gfuCode;

	@Column(name="gfu_funcion")
	private int gfuFuncion;

	@Column(name="gfu_tmstamp")
	private int gfuTmstamp;

	public GenFuncione() {
	}

	public int getGfuCode() {
		return this.gfuCode;
	}

	public void setGfuCode(int gfuCode) {
		this.gfuCode = gfuCode;
	}

	public int getGfuFuncion() {
		return this.gfuFuncion;
	}

	public void setGfuFuncion(int gfuFuncion) {
		this.gfuFuncion = gfuFuncion;
	}

	public int getGfuTmstamp() {
		return this.gfuTmstamp;
	}

	public void setGfuTmstamp(int gfuTmstamp) {
		this.gfuTmstamp = gfuTmstamp;
	}

}