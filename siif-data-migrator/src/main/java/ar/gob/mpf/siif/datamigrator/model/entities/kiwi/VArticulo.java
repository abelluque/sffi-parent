package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the v_articulos database table.
 * 
 */
// @Entity
// @Table(name="v_articulos")
@NamedQuery(name="VArticulo.findAll", query="SELECT v FROM VArticulo v")
public class VArticulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="art_code")
	private int artCode;

	@Column(name="art_detalle")
	private int artDetalle;

	public VArticulo() {
	}

	public int getArtCode() {
		return this.artCode;
	}

	public void setArtCode(int artCode) {
		this.artCode = artCode;
	}

	public int getArtDetalle() {
		return this.artDetalle;
	}

	public void setArtDetalle(int artDetalle) {
		this.artDetalle = artDetalle;
	}

}