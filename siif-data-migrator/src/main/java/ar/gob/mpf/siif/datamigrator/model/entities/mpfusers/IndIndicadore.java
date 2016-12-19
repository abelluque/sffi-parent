package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

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

	@Id
	@Column(name="ind_code")
	private int indCode;

	@Column(name="ind_arc_pentaho")
	private String indArcPentaho;

	@Column(name="ind_descripcion")
	private String indDescripcion;

	@Column(name="ind_estado")
	private String indEstado;

	@Column(name="ind_nombre")
	private String indNombre;

	@Column(name="ind_sistema")
	private String indSistema;

	public IndIndicadore() {
	}

	public int getIndCode() {
		return this.indCode;
	}

	public void setIndCode(int indCode) {
		this.indCode = indCode;
	}

	public String getIndArcPentaho() {
		return this.indArcPentaho;
	}

	public void setIndArcPentaho(String indArcPentaho) {
		this.indArcPentaho = indArcPentaho;
	}

	public String getIndDescripcion() {
		return this.indDescripcion;
	}

	public void setIndDescripcion(String indDescripcion) {
		this.indDescripcion = indDescripcion;
	}

	public String getIndEstado() {
		return this.indEstado;
	}

	public void setIndEstado(String indEstado) {
		this.indEstado = indEstado;
	}

	public String getIndNombre() {
		return this.indNombre;
	}

	public void setIndNombre(String indNombre) {
		this.indNombre = indNombre;
	}

	public String getIndSistema() {
		return this.indSistema;
	}

	public void setIndSistema(String indSistema) {
		this.indSistema = indSistema;
	}

}