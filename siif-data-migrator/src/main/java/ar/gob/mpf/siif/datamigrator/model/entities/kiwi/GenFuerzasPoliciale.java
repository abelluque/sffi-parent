package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_fuerzas_policiales database table.
 * 
 */
// @Entity
// @Table(name="gen_fuerzas_policiales")
@NamedQuery(name="GenFuerzasPoliciale.findAll", query="SELECT g FROM GenFuerzasPoliciale g")
public class GenFuerzasPoliciale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="gfp_code")
	private int gfpCode;

	@Column(name="gfp_activo")
	private String gfpActivo;

	@Column(name="gfp_codigo")
	private String gfpCodigo;

	@Column(name="gfp_color")
	private String gfpColor;

	@Column(name="gfp_nombre")
	private String gfpNombre;

	public GenFuerzasPoliciale() {
	}

	public int getGfpCode() {
		return this.gfpCode;
	}

	public void setGfpCode(int gfpCode) {
		this.gfpCode = gfpCode;
	}

	public String getGfpActivo() {
		return this.gfpActivo;
	}

	public void setGfpActivo(String gfpActivo) {
		this.gfpActivo = gfpActivo;
	}

	public String getGfpCodigo() {
		return this.gfpCodigo;
	}

	public void setGfpCodigo(String gfpCodigo) {
		this.gfpCodigo = gfpCodigo;
	}

	public String getGfpColor() {
		return this.gfpColor;
	}

	public void setGfpColor(String gfpColor) {
		this.gfpColor = gfpColor;
	}

	public String getGfpNombre() {
		return this.gfpNombre;
	}

	public void setGfpNombre(String gfpNombre) {
		this.gfpNombre = gfpNombre;
	}

}