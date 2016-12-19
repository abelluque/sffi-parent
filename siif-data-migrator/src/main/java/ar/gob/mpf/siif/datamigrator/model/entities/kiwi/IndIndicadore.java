package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ind_indicadores database table.
 * 
 */
// @Entity
// @Table(name="ind_indicadores")
@NamedQuery(name="IndIndicadore.findAll", query="SELECT i FROM IndIndicadore i")
public class IndIndicadore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ind_arc_pentaho")
	private int indArcPentaho;

	@Column(name="ind_code")
	private int indCode;

	@Column(name="ind_descripcion")
	private int indDescripcion;

	@Column(name="ind_estado")
	private int indEstado;

	@Column(name="ind_nombre")
	private int indNombre;

	@Column(name="ind_sistema")
	private int indSistema;

	public IndIndicadore() {
	}

	public int getIndArcPentaho() {
		return this.indArcPentaho;
	}

	public void setIndArcPentaho(int indArcPentaho) {
		this.indArcPentaho = indArcPentaho;
	}

	public int getIndCode() {
		return this.indCode;
	}

	public void setIndCode(int indCode) {
		this.indCode = indCode;
	}

	public int getIndDescripcion() {
		return this.indDescripcion;
	}

	public void setIndDescripcion(int indDescripcion) {
		this.indDescripcion = indDescripcion;
	}

	public int getIndEstado() {
		return this.indEstado;
	}

	public void setIndEstado(int indEstado) {
		this.indEstado = indEstado;
	}

	public int getIndNombre() {
		return this.indNombre;
	}

	public void setIndNombre(int indNombre) {
		this.indNombre = indNombre;
	}

	public int getIndSistema() {
		return this.indSistema;
	}

	public void setIndSistema(int indSistema) {
		this.indSistema = indSistema;
	}

}