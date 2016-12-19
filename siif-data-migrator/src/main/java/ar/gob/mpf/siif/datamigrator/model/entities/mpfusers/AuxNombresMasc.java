package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the aux_nombres_mas database table.
 * 
 */
// @Entity
// @Table(name="aux_nombres_mas")
@NamedQuery(name="AuxNombresMasc.findAll", query="SELECT a FROM AuxNombresMasc a")
public class AuxNombresMasc implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nombre;

	public AuxNombresMasc() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}