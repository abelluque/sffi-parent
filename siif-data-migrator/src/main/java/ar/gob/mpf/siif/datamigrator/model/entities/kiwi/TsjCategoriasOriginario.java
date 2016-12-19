package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tsj_categorias_originarios database table.
 * 
 */
// @Entity
// @Table(name="tsj_categorias_originarios")
@NamedQuery(name="TsjCategoriasOriginario.findAll", query="SELECT t FROM TsjCategoriasOriginario t")
public class TsjCategoriasOriginario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cor_code")
	private int corCode;

	@Column(name="cor_activo")
	private String corActivo;

	@Column(name="cor_nombre")
	private String corNombre;

	public TsjCategoriasOriginario() {
	}

	public int getCorCode() {
		return this.corCode;
	}

	public void setCorCode(int corCode) {
		this.corCode = corCode;
	}

	public String getCorActivo() {
		return this.corActivo;
	}

	public void setCorActivo(String corActivo) {
		this.corActivo = corActivo;
	}

	public String getCorNombre() {
		return this.corNombre;
	}

	public void setCorNombre(String corNombre) {
		this.corNombre = corNombre;
	}

}