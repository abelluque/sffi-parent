package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the docum_tipos_movimientos database table.
 * 
 */
// @Entity
// @Table(name="docum_tipos_movimientos")
@NamedQuery(name="DocumTiposMovimiento.findAll", query="SELECT d FROM DocumTiposMovimiento d")
public class DocumTiposMovimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tmov_code")
	private int tmovCode;

	@Column(name="tmov_activo")
	private String tmovActivo;

	@Column(name="tmov_clave")
	private String tmovClave;

	@Column(name="tmov_descripcion")
	private String tmovDescripcion;

	public DocumTiposMovimiento() {
	}

	public int getTmovCode() {
		return this.tmovCode;
	}

	public void setTmovCode(int tmovCode) {
		this.tmovCode = tmovCode;
	}

	public String getTmovActivo() {
		return this.tmovActivo;
	}

	public void setTmovActivo(String tmovActivo) {
		this.tmovActivo = tmovActivo;
	}

	public String getTmovClave() {
		return this.tmovClave;
	}

	public void setTmovClave(String tmovClave) {
		this.tmovClave = tmovClave;
	}

	public String getTmovDescripcion() {
		return this.tmovDescripcion;
	}

	public void setTmovDescripcion(String tmovDescripcion) {
		this.tmovDescripcion = tmovDescripcion;
	}

}