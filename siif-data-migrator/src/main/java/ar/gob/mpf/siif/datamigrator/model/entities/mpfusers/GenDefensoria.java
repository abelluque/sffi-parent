package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_defensorias database table.
 * 
 */
// @Entity
// @Table(name="gen_defensorias")
@NamedQuery(name="GenDefensoria.findAll", query="SELECT g FROM GenDefensoria g")
public class GenDefensoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="defensoria_id")
	private int defensoriaId;

	private String defensor;

	private String direccion;

	private String email;

	private String telefono;

	public GenDefensoria() {
	}

	public int getDefensoriaId() {
		return this.defensoriaId;
	}

	public void setDefensoriaId(int defensoriaId) {
		this.defensoriaId = defensoriaId;
	}

	public String getDefensor() {
		return this.defensor;
	}

	public void setDefensor(String defensor) {
		this.defensor = defensor;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}