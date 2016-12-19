package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_documentos_juscaba_pasos_actualizacion database table.
 * 
 */
// @Entity
// @Table(name="docum_documentos_juscaba_pasos_actualizacion")
@NamedQuery(name="DocumDocumentosJuscabaPasosActualizacion.findAll", query="SELECT d FROM DocumDocumentosJuscabaPasosActualizacion d")
public class DocumDocumentosJuscabaPasosActualizacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ddjpa_doc_id")
	private String ddjpaDocId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ddjpa_fecha_actualizacion")
	private Date ddjpaFechaActualizacion;

	public DocumDocumentosJuscabaPasosActualizacion() {
	}

	public String getDdjpaDocId() {
		return this.ddjpaDocId;
	}

	public void setDdjpaDocId(String ddjpaDocId) {
		this.ddjpaDocId = ddjpaDocId;
	}

	public Date getDdjpaFechaActualizacion() {
		return this.ddjpaFechaActualizacion;
	}

	public void setDdjpaFechaActualizacion(Date ddjpaFechaActualizacion) {
		this.ddjpaFechaActualizacion = ddjpaFechaActualizacion;
	}

}