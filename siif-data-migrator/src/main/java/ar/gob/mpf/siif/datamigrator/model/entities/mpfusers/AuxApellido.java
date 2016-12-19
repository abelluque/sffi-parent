package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the aux_apellidos database table.
 * 
 */
@Entity
@Table(name = "aux_apellidos", schema = "mpfusers")
@NamedQuery(name = "AuxApellido.findAll", query = "SELECT a FROM AuxApellido a")
public class AuxApellido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nombre")
	private String nombre;

	public AuxApellido() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public AuxApellido(Object dbRow) {
		super();
		this.nombre = dbRow.toString();
	}

	@Override
	public String toString() {
		return "AuxApellido [nombre=" + nombre + "]";
	}

}