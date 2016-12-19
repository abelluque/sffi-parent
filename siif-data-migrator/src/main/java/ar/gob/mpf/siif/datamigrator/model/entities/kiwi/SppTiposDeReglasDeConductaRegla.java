package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spp_tipos_de_reglas_de_conducta_reglas database table.
 * 
 */
// @Entity
// @Table(name="spp_tipos_de_reglas_de_conducta_reglas")
@NamedQuery(name="SppTiposDeReglasDeConductaRegla.findAll", query="SELECT s FROM SppTiposDeReglasDeConductaRegla s")
public class SppTiposDeReglasDeConductaRegla implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SppTiposDeReglasDeConductaReglaPK id;

	@Column(name="str_orden")
	private int strOrden;

	public SppTiposDeReglasDeConductaRegla() {
	}

	public SppTiposDeReglasDeConductaReglaPK getId() {
		return this.id;
	}

	public void setId(SppTiposDeReglasDeConductaReglaPK id) {
		this.id = id;
	}

	public int getStrOrden() {
		return this.strOrden;
	}

	public void setStrOrden(int strOrden) {
		this.strOrden = strOrden;
	}

}