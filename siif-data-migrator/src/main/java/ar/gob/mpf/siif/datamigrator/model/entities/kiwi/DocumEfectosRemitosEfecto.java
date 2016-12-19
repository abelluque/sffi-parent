package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the docum_efectos_remitos_efectos database table.
 * 
 */
// @Entity
// @Table(name="docum_efectos_remitos_efectos")
@NamedQuery(name="DocumEfectosRemitosEfecto.findAll", query="SELECT d FROM DocumEfectosRemitosEfecto d")
public class DocumEfectosRemitosEfecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocumEfectosRemitosEfectoPK id;

	public DocumEfectosRemitosEfecto() {
	}

	public DocumEfectosRemitosEfectoPK getId() {
		return this.id;
	}

	public void setId(DocumEfectosRemitosEfectoPK id) {
		this.id = id;
	}

}