package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the den_rol_articulo database table.
 * 
 */
// @Entity
// @Table(name="den_rol_articulo")
@NamedQuery(name="DenRolArticulo.findAll", query="SELECT d FROM DenRolArticulo d")
public class DenRolArticulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DenRolArticuloPK id;

	@Column(name="art_estado")
	private String artEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="art_tstamp")
	private Date artTstamp;

	public DenRolArticulo() {
	}

	public DenRolArticuloPK getId() {
		return this.id;
	}

	public void setId(DenRolArticuloPK id) {
		this.id = id;
	}

	public String getArtEstado() {
		return this.artEstado;
	}

	public void setArtEstado(String artEstado) {
		this.artEstado = artEstado;
	}

	public Date getArtTstamp() {
		return this.artTstamp;
	}

	public void setArtTstamp(Date artTstamp) {
		this.artTstamp = artTstamp;
	}

}