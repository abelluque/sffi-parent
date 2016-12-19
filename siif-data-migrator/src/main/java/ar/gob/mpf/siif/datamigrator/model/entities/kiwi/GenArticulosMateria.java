package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_articulos_materias database table.
 * 
 */
// @Entity
// @Table(name="gen_articulos_materias")
@NamedQuery(name="GenArticulosMateria.findAll", query="SELECT g FROM GenArticulosMateria g")
public class GenArticulosMateria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="gam_code")
	private int gamCode;

	@Column(name="gam_activo")
	private String gamActivo;

	@Column(name="gam_descripcion")
	private String gamDescripcion;

	@Column(name="gam_prioridad")
	private int gamPrioridad;

	public GenArticulosMateria() {
	}

	public int getGamCode() {
		return this.gamCode;
	}

	public void setGamCode(int gamCode) {
		this.gamCode = gamCode;
	}

	public String getGamActivo() {
		return this.gamActivo;
	}

	public void setGamActivo(String gamActivo) {
		this.gamActivo = gamActivo;
	}

	public String getGamDescripcion() {
		return this.gamDescripcion;
	}

	public void setGamDescripcion(String gamDescripcion) {
		this.gamDescripcion = gamDescripcion;
	}

	public int getGamPrioridad() {
		return this.gamPrioridad;
	}

	public void setGamPrioridad(int gamPrioridad) {
		this.gamPrioridad = gamPrioridad;
	}

}