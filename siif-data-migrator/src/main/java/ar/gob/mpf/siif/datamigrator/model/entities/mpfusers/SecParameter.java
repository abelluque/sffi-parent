package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sec_parameters database table.
 * 
 */
// @Entity
// @Table(name="sec_parameters")
@NamedQuery(name="SecParameter.findAll", query="SELECT s FROM SecParameter s")
public class SecParameter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="par_code")
	private String parCode;

	@Column(name="par_description")
	private String parDescription;

	@Column(name="par_value")
	private String parValue;

	public SecParameter() {
	}

	public String getParCode() {
		return this.parCode;
	}

	public void setParCode(String parCode) {
		this.parCode = parCode;
	}

	public String getParDescription() {
		return this.parDescription;
	}

	public void setParDescription(String parDescription) {
		this.parDescription = parDescription;
	}

	public String getParValue() {
		return this.parValue;
	}

	public void setParValue(String parValue) {
		this.parValue = parValue;
	}

}