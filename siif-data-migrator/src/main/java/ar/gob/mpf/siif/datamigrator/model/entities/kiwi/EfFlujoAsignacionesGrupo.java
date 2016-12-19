package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ef_flujo_asignaciones_grupos database table.
 * 
 */
// @Entity
// @Table(name="ef_flujo_asignaciones_grupos")
@NamedQuery(name="EfFlujoAsignacionesGrupo.findAll", query="SELECT e FROM EfFlujoAsignacionesGrupo e")
public class EfFlujoAsignacionesGrupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EfFlujoAsignacionesGrupoPK id;

	@Column(name="aal_codigo")
	private int aalCodigo;

	public EfFlujoAsignacionesGrupo() {
	}

	public EfFlujoAsignacionesGrupoPK getId() {
		return this.id;
	}

	public void setId(EfFlujoAsignacionesGrupoPK id) {
		this.id = id;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

}