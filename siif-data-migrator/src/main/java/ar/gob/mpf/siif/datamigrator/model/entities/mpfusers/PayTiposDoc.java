package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pay_tipos_doc database table.
 * 
 */
// @Entity
// @Table(name="pay_tipos_doc")
@NamedQuery(name="PayTiposDoc.findAll", query="SELECT p FROM PayTiposDoc p")
public class PayTiposDoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codigo;

	private String descripcion;

	public PayTiposDoc() {
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}