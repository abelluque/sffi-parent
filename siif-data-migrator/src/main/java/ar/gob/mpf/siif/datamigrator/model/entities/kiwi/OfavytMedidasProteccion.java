package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ofavyt_medidas_proteccion database table.
 * 
 */
// @Entity
// @Table(name="ofavyt_medidas_proteccion")
@NamedQuery(name="OfavytMedidasProteccion.findAll", query="SELECT o FROM OfavytMedidasProteccion o")
public class OfavytMedidasProteccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="omp_code")
	private int ompCode;

	@Column(name="omp_estado")
	private String ompEstado;

	@Column(name="omp_nombre")
	private String ompNombre;

	public OfavytMedidasProteccion() {
	}

	public int getOmpCode() {
		return this.ompCode;
	}

	public void setOmpCode(int ompCode) {
		this.ompCode = ompCode;
	}

	public String getOmpEstado() {
		return this.ompEstado;
	}

	public void setOmpEstado(String ompEstado) {
		this.ompEstado = ompEstado;
	}

	public String getOmpNombre() {
		return this.ompNombre;
	}

	public void setOmpNombre(String ompNombre) {
		this.ompNombre = ompNombre;
	}

}