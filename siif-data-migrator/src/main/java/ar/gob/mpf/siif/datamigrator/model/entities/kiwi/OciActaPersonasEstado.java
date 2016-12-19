package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oci_acta_personas_estados database table.
 * 
 */
// @Entity
// @Table(name="oci_acta_personas_estados")
@NamedQuery(name="OciActaPersonasEstado.findAll", query="SELECT o FROM OciActaPersonasEstado o")
public class OciActaPersonasEstado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oes_code")
	private int oesCode;

	@Column(name="oes_descripcion")
	private String oesDescripcion;

	public OciActaPersonasEstado() {
	}

	public int getOesCode() {
		return this.oesCode;
	}

	public void setOesCode(int oesCode) {
		this.oesCode = oesCode;
	}

	public String getOesDescripcion() {
		return this.oesDescripcion;
	}

	public void setOesDescripcion(String oesDescripcion) {
		this.oesDescripcion = oesDescripcion;
	}

}