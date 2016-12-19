package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_estudios database table.
 * 
 */
// @Entity
// @Table(name="gen_estudios")
@NamedQuery(name="GenEstudio.findAll", query="SELECT g FROM GenEstudio g")
public class GenEstudio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ges_code")
	private int gesCode;

	@Column(name="ges_estudio")
	private String gesEstudio;

	public GenEstudio() {
	}

	public int getGesCode() {
		return this.gesCode;
	}

	public void setGesCode(int gesCode) {
		this.gesCode = gesCode;
	}

	public String getGesEstudio() {
		return this.gesEstudio;
	}

	public void setGesEstudio(String gesEstudio) {
		this.gesEstudio = gesEstudio;
	}

}