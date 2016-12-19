package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cij_diligencias_categorias database table.
 * 
 */
// @Entity
// @Table(name="cij_diligencias_categorias")
@NamedQuery(name="CijDiligenciasCategoria.findAll", query="SELECT c FROM CijDiligenciasCategoria c")
public class CijDiligenciasCategoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cdc_code")
	private int cdcCode;

	@Column(name="cdc_activo")
	private String cdcActivo;

	@Column(name="cdc_categoria")
	private String cdcCategoria;

	public CijDiligenciasCategoria() {
	}

	public int getCdcCode() {
		return this.cdcCode;
	}

	public void setCdcCode(int cdcCode) {
		this.cdcCode = cdcCode;
	}

	public String getCdcActivo() {
		return this.cdcActivo;
	}

	public void setCdcActivo(String cdcActivo) {
		this.cdcActivo = cdcActivo;
	}

	public String getCdcCategoria() {
		return this.cdcCategoria;
	}

	public void setCdcCategoria(String cdcCategoria) {
		this.cdcCategoria = cdcCategoria;
	}

}