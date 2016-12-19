package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the den_cuestionario_tipo_dependencias database table.
 * 
 */
// @Entity
// @Table(name="den_cuestionario_tipo_dependencias")
@NamedQuery(name="DenCuestionarioTipoDependencia.findAll", query="SELECT d FROM DenCuestionarioTipoDependencia d")
public class DenCuestionarioTipoDependencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DenCuestionarioTipoDependenciaPK id;

	public DenCuestionarioTipoDependencia() {
	}

	public DenCuestionarioTipoDependenciaPK getId() {
		return this.id;
	}

	public void setId(DenCuestionarioTipoDependenciaPK id) {
		this.id = id;
	}

}