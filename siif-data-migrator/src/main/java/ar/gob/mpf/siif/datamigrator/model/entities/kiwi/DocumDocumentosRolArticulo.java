package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_documentos_rol_articulo database table.
 * 
 */
// @Entity
// @Table(name="docum_documentos_rol_articulo")
@NamedQuery(name="DocumDocumentosRolArticulo.findAll", query="SELECT d FROM DocumDocumentosRolArticulo d")
public class DocumDocumentosRolArticulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocumDocumentosRolArticuloPK id;

	@Column(name="art_estado")
	private String artEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="art_tstamp")
	private Date artTstamp;

	public DocumDocumentosRolArticulo() {
	}

	public DocumDocumentosRolArticuloPK getId() {
		return this.id;
	}

	public void setId(DocumDocumentosRolArticuloPK id) {
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