package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oci_personas_alias database table.
 * 
 */
// @Entity
// @Table(name="oci_personas_alias")
@NamedQuery(name="OciPersonasAlia.findAll", query="SELECT o FROM OciPersonasAlia o")
public class OciPersonasAlia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="opa_code")
	private int opaCode;

	@Column(name="ope_apellido")
	private String opeApellido;

	@Column(name="ope_code")
	private int opeCode;

	@Column(name="ope_documento")
	private int opeDocumento;

	@Column(name="ope_nombre")
	private String opeNombre;

	public OciPersonasAlia() {
	}

	public int getOpaCode() {
		return this.opaCode;
	}

	public void setOpaCode(int opaCode) {
		this.opaCode = opaCode;
	}

	public String getOpeApellido() {
		return this.opeApellido;
	}

	public void setOpeApellido(String opeApellido) {
		this.opeApellido = opeApellido;
	}

	public int getOpeCode() {
		return this.opeCode;
	}

	public void setOpeCode(int opeCode) {
		this.opeCode = opeCode;
	}

	public int getOpeDocumento() {
		return this.opeDocumento;
	}

	public void setOpeDocumento(int opeDocumento) {
		this.opeDocumento = opeDocumento;
	}

	public String getOpeNombre() {
		return this.opeNombre;
	}

	public void setOpeNombre(String opeNombre) {
		this.opeNombre = opeNombre;
	}

}