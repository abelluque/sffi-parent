package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utc_cedulas_remitos_detalles database table.
 * 
 */
// @Entity
// @Table(name="utc_cedulas_remitos_detalles")
@NamedQuery(name="UtcCedulasRemitosDetalle.findAll", query="SELECT u FROM UtcCedulasRemitosDetalle u")
public class UtcCedulasRemitosDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UtcCedulasRemitosDetallePK id;

	public UtcCedulasRemitosDetalle() {
	}

	public UtcCedulasRemitosDetallePK getId() {
		return this.id;
	}

	public void setId(UtcCedulasRemitosDetallePK id) {
		this.id = id;
	}

}