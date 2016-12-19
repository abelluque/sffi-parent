package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the docum_notas_dependencias database table.
 * 
 */
// @Entity
// @Table(name="docum_notas_dependencias")
@NamedQuery(name="DocumNotasDependencia.findAll", query="SELECT d FROM DocumNotasDependencia d")
public class DocumNotasDependencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocumNotasDependenciaPK id;

	public DocumNotasDependencia() {
	}

	public DocumNotasDependenciaPK getId() {
		return this.id;
	}

	public void setId(DocumNotasDependenciaPK id) {
		this.id = id;
	}

}