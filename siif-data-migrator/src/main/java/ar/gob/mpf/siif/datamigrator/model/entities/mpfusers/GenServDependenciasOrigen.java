package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_serv_dependencias_origen database table.
 * 
 */
// @Entity
// @Table(name="gen_serv_dependencias_origen")
@NamedQuery(name="GenServDependenciasOrigen.findAll", query="SELECT g FROM GenServDependenciasOrigen g")
public class GenServDependenciasOrigen implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GenServDependenciasOrigenPK id;

	public GenServDependenciasOrigen() {
	}

	public GenServDependenciasOrigenPK getId() {
		return this.id;
	}

	public void setId(GenServDependenciasOrigenPK id) {
		this.id = id;
	}

}