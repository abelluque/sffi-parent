package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cij_tipos_informes database table.
 * 
 */
// @Entity
// @Table(name="cij_tipos_informes")
@NamedQuery(name="CijTiposInforme.findAll", query="SELECT c FROM CijTiposInforme c")
public class CijTiposInforme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cti_code")
	private int ctiCode;

	@Column(name="cti_activo")
	private String ctiActivo;

	@Column(name="cti_nombre")
	private String ctiNombre;

	public CijTiposInforme() {
	}

	public int getCtiCode() {
		return this.ctiCode;
	}

	public void setCtiCode(int ctiCode) {
		this.ctiCode = ctiCode;
	}

	public String getCtiActivo() {
		return this.ctiActivo;
	}

	public void setCtiActivo(String ctiActivo) {
		this.ctiActivo = ctiActivo;
	}

	public String getCtiNombre() {
		return this.ctiNombre;
	}

	public void setCtiNombre(String ctiNombre) {
		this.ctiNombre = ctiNombre;
	}

}