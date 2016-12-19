package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the docum_efectos_tipos database table.
 * 
 */
// @Entity
// @Table(name="docum_efectos_tipos")
@NamedQuery(name="DocumEfectosTipo.findAll", query="SELECT d FROM DocumEfectosTipo d")
public class DocumEfectosTipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dte_code")
	private int dteCode;

	@Column(name="dte_clave")
	private String dteClave;

	@Lob
	@Column(name="dte_descripcion")
	private String dteDescripcion;

	@Column(name="dte_estado")
	private String dteEstado;

	@Column(name="dte_nombre")
	private String dteNombre;

	@Column(name="dte_orden")
	private int dteOrden;

	public DocumEfectosTipo() {
	}

	public int getDteCode() {
		return this.dteCode;
	}

	public void setDteCode(int dteCode) {
		this.dteCode = dteCode;
	}

	public String getDteClave() {
		return this.dteClave;
	}

	public void setDteClave(String dteClave) {
		this.dteClave = dteClave;
	}

	public String getDteDescripcion() {
		return this.dteDescripcion;
	}

	public void setDteDescripcion(String dteDescripcion) {
		this.dteDescripcion = dteDescripcion;
	}

	public String getDteEstado() {
		return this.dteEstado;
	}

	public void setDteEstado(String dteEstado) {
		this.dteEstado = dteEstado;
	}

	public String getDteNombre() {
		return this.dteNombre;
	}

	public void setDteNombre(String dteNombre) {
		this.dteNombre = dteNombre;
	}

	public int getDteOrden() {
		return this.dteOrden;
	}

	public void setDteOrden(int dteOrden) {
		this.dteOrden = dteOrden;
	}

}