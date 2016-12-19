package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the docum_efectos_adjuntos_tipos database table.
 * 
 */
// @Entity
// @Table(name="docum_efectos_adjuntos_tipos")
@NamedQuery(name="DocumEfectosAdjuntosTipo.findAll", query="SELECT d FROM DocumEfectosAdjuntosTipo d")
public class DocumEfectosAdjuntosTipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dtae_code")
	private int dtaeCode;

	@Lob
	@Column(name="dtae_descripcion")
	private String dtaeDescripcion;

	@Column(name="dtae_estado")
	private String dtaeEstado;

	@Column(name="dtae_nombre")
	private String dtaeNombre;

	public DocumEfectosAdjuntosTipo() {
	}

	public int getDtaeCode() {
		return this.dtaeCode;
	}

	public void setDtaeCode(int dtaeCode) {
		this.dtaeCode = dtaeCode;
	}

	public String getDtaeDescripcion() {
		return this.dtaeDescripcion;
	}

	public void setDtaeDescripcion(String dtaeDescripcion) {
		this.dtaeDescripcion = dtaeDescripcion;
	}

	public String getDtaeEstado() {
		return this.dtaeEstado;
	}

	public void setDtaeEstado(String dtaeEstado) {
		this.dtaeEstado = dtaeEstado;
	}

	public String getDtaeNombre() {
		return this.dtaeNombre;
	}

	public void setDtaeNombre(String dtaeNombre) {
		this.dtaeNombre = dtaeNombre;
	}

}