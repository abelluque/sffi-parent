package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tsj_jueces database table.
 * 
 */
// @Entity
// @Table(name="tsj_jueces")
@NamedQuery(name="TsjJuece.findAll", query="SELECT t FROM TsjJuece t")
public class TsjJuece implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="jue_code")
	private int jueCode;

	@Column(name="jue_activo")
	private String jueActivo;

	@Column(name="jue_nombre")
	private String jueNombre;

	public TsjJuece() {
	}

	public int getJueCode() {
		return this.jueCode;
	}

	public void setJueCode(int jueCode) {
		this.jueCode = jueCode;
	}

	public String getJueActivo() {
		return this.jueActivo;
	}

	public void setJueActivo(String jueActivo) {
		this.jueActivo = jueActivo;
	}

	public String getJueNombre() {
		return this.jueNombre;
	}

	public void setJueNombre(String jueNombre) {
		this.jueNombre = jueNombre;
	}

}