package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_servicios database table.
 * 
 */
// @Entity
// @Table(name="gen_servicios")
@NamedQuery(name="GenServicio.findAll", query="SELECT g FROM GenServicio g")
public class GenServicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="gsv_abrev")
	private int gsvAbrev;

	@Column(name="gsv_categoria")
	private int gsvCategoria;

	@Column(name="gsv_code")
	private int gsvCode;

	@Column(name="gsv_dependencias_asociadas")
	private int gsvDependenciasAsociadas;

	@Column(name="gsv_servicio")
	private int gsvServicio;

	public GenServicio() {
	}

	public int getGsvAbrev() {
		return this.gsvAbrev;
	}

	public void setGsvAbrev(int gsvAbrev) {
		this.gsvAbrev = gsvAbrev;
	}

	public int getGsvCategoria() {
		return this.gsvCategoria;
	}

	public void setGsvCategoria(int gsvCategoria) {
		this.gsvCategoria = gsvCategoria;
	}

	public int getGsvCode() {
		return this.gsvCode;
	}

	public void setGsvCode(int gsvCode) {
		this.gsvCode = gsvCode;
	}

	public int getGsvDependenciasAsociadas() {
		return this.gsvDependenciasAsociadas;
	}

	public void setGsvDependenciasAsociadas(int gsvDependenciasAsociadas) {
		this.gsvDependenciasAsociadas = gsvDependenciasAsociadas;
	}

	public int getGsvServicio() {
		return this.gsvServicio;
	}

	public void setGsvServicio(int gsvServicio) {
		this.gsvServicio = gsvServicio;
	}

}