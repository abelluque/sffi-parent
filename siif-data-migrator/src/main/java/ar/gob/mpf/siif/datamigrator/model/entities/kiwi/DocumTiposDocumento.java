package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the docum_tipos_documentos database table.
 * 
 */
// @Entity
// @Table(name="docum_tipos_documentos")
@NamedQuery(name="DocumTiposDocumento.findAll", query="SELECT d FROM DocumTiposDocumento d")
public class DocumTiposDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dtip_code")
	private String dtipCode;

	@Column(name="dtip_nombre")
	private String dtipNombre;

	public DocumTiposDocumento() {
	}

	public String getDtipCode() {
		return this.dtipCode;
	}

	public void setDtipCode(String dtipCode) {
		this.dtipCode = dtipCode;
	}

	public String getDtipNombre() {
		return this.dtipNombre;
	}

	public void setDtipNombre(String dtipNombre) {
		this.dtipNombre = dtipNombre;
	}

}