package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ofavyt_categorias_intervenciones database table.
 * 
 */
// @Entity
// @Table(name="ofavyt_categorias_intervenciones")
@NamedQuery(name="OfavytCategoriasIntervencione.findAll", query="SELECT o FROM OfavytCategoriasIntervencione o")
public class OfavytCategoriasIntervencione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ocs_code")
	private int ocsCode;

	@Column(name="ocs_activo")
	private String ocsActivo;

	@Column(name="ocs_categoria")
	private String ocsCategoria;

	public OfavytCategoriasIntervencione() {
	}

	public int getOcsCode() {
		return this.ocsCode;
	}

	public void setOcsCode(int ocsCode) {
		this.ocsCode = ocsCode;
	}

	public String getOcsActivo() {
		return this.ocsActivo;
	}

	public void setOcsActivo(String ocsActivo) {
		this.ocsActivo = ocsActivo;
	}

	public String getOcsCategoria() {
		return this.ocsCategoria;
	}

	public void setOcsCategoria(String ocsCategoria) {
		this.ocsCategoria = ocsCategoria;
	}

}