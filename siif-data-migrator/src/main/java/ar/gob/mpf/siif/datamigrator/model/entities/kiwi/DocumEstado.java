package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the docum_estados database table.
 * 
 */
// @Entity
// @Table(name="docum_estados")
@NamedQuery(name="DocumEstado.findAll", query="SELECT d FROM DocumEstado d")
public class DocumEstado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dest_code")
	private int destCode;

	@Column(name="dest_activo")
	private String destActivo;

	@Column(name="dest_clave")
	private String destClave;

	@Column(name="dest_descripcion")
	private String destDescripcion;

	public DocumEstado() {
	}

	public int getDestCode() {
		return this.destCode;
	}

	public void setDestCode(int destCode) {
		this.destCode = destCode;
	}

	public String getDestActivo() {
		return this.destActivo;
	}

	public void setDestActivo(String destActivo) {
		this.destActivo = destActivo;
	}

	public String getDestClave() {
		return this.destClave;
	}

	public void setDestClave(String destClave) {
		this.destClave = destClave;
	}

	public String getDestDescripcion() {
		return this.destDescripcion;
	}

	public void setDestDescripcion(String destDescripcion) {
		this.destDescripcion = destDescripcion;
	}

}