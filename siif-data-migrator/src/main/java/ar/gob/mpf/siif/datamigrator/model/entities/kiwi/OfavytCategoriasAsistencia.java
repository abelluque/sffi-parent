package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ofavyt_categorias_asistencias database table.
 * 
 */
// @Entity
// @Table(name="ofavyt_categorias_asistencias")
@NamedQuery(name="OfavytCategoriasAsistencia.findAll", query="SELECT o FROM OfavytCategoriasAsistencia o")
public class OfavytCategoriasAsistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oca_code")
	private int ocaCode;

	@Column(name="oca_activo")
	private String ocaActivo;

	@Column(name="oca_categoria")
	private String ocaCategoria;

	public OfavytCategoriasAsistencia() {
	}

	public int getOcaCode() {
		return this.ocaCode;
	}

	public void setOcaCode(int ocaCode) {
		this.ocaCode = ocaCode;
	}

	public String getOcaActivo() {
		return this.ocaActivo;
	}

	public void setOcaActivo(String ocaActivo) {
		this.ocaActivo = ocaActivo;
	}

	public String getOcaCategoria() {
		return this.ocaCategoria;
	}

	public void setOcaCategoria(String ocaCategoria) {
		this.ocaCategoria = ocaCategoria;
	}

}