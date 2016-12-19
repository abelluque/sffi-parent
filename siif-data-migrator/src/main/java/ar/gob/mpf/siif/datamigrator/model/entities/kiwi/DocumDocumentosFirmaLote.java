package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the docum_documentos_firma_lote database table.
 * 
 */
// @Entity
// @Table(name="docum_documentos_firma_lote")
@NamedQuery(name="DocumDocumentosFirmaLote.findAll", query="SELECT d FROM DocumDocumentosFirmaLote d")
public class DocumDocumentosFirmaLote implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocumDocumentosFirmaLotePK id;

	public DocumDocumentosFirmaLote() {
	}

	public DocumDocumentosFirmaLotePK getId() {
		return this.id;
	}

	public void setId(DocumDocumentosFirmaLotePK id) {
		this.id = id;
	}

}