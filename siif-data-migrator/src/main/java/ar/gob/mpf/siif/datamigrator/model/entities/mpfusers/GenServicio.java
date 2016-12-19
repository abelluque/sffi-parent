package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

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

	@Id
	@Column(name="gsv_code")
	private int gsvCode;

	@Column(name="gsv_abrev")
	private String gsvAbrev;

	@Column(name="gsv_categoria")
	private String gsvCategoria;

	@Column(name="gsv_dependencias_asociadas")
	private String gsvDependenciasAsociadas;

	@Column(name="gsv_servicio")
	private String gsvServicio;

	public GenServicio() {
	}

	public int getGsvCode() {
		return this.gsvCode;
	}

	public void setGsvCode(int gsvCode) {
		this.gsvCode = gsvCode;
	}

	public String getGsvAbrev() {
		return this.gsvAbrev;
	}

	public void setGsvAbrev(String gsvAbrev) {
		this.gsvAbrev = gsvAbrev;
	}

	public String getGsvCategoria() {
		return this.gsvCategoria;
	}

	public void setGsvCategoria(String gsvCategoria) {
		this.gsvCategoria = gsvCategoria;
	}

	public String getGsvDependenciasAsociadas() {
		return this.gsvDependenciasAsociadas;
	}

	public void setGsvDependenciasAsociadas(String gsvDependenciasAsociadas) {
		this.gsvDependenciasAsociadas = gsvDependenciasAsociadas;
	}

	public String getGsvServicio() {
		return this.gsvServicio;
	}

	public void setGsvServicio(String gsvServicio) {
		this.gsvServicio = gsvServicio;
	}

}