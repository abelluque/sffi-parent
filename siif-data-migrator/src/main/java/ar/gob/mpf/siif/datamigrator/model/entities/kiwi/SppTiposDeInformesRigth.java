package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spp_tipos_de_informes_rigths database table.
 * 
 */
// @Entity
// @Table(name="spp_tipos_de_informes_rigths")
@NamedQuery(name="SppTiposDeInformesRigth.findAll", query="SELECT s FROM SppTiposDeInformesRigth s")
public class SppTiposDeInformesRigth implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SppTiposDeInformesRigthPK id;

	public SppTiposDeInformesRigth() {
	}

	public SppTiposDeInformesRigthPK getId() {
		return this.id;
	}

	public void setId(SppTiposDeInformesRigthPK id) {
		this.id = id;
	}

}