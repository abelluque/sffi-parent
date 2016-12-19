package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_dependencias_especial database table.
 * 
 */
// @Entity
// @Table(name="gen_dependencias_especial")
@NamedQuery(name="GenDependenciasEspecial.findAll", query="SELECT g FROM GenDependenciasEspecial g")
public class GenDependenciasEspecial implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GenDependenciasEspecialPK id;

	public GenDependenciasEspecial() {
	}

	public GenDependenciasEspecialPK getId() {
		return this.id;
	}

	public void setId(GenDependenciasEspecialPK id) {
		this.id = id;
	}

}