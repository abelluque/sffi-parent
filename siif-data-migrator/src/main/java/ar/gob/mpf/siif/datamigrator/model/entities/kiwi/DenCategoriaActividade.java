package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the den_categoria_actividades database table.
 * 
 */
// @Entity
// @Table(name="den_categoria_actividades")
@NamedQuery(name="DenCategoriaActividade.findAll", query="SELECT d FROM DenCategoriaActividade d")
public class DenCategoriaActividade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dca_code")
	private int dcaCode;

	@Column(name="dca_activo")
	private String dcaActivo;

	@Column(name="dca_valor")
	private String dcaValor;

	public DenCategoriaActividade() {
	}

	public int getDcaCode() {
		return this.dcaCode;
	}

	public void setDcaCode(int dcaCode) {
		this.dcaCode = dcaCode;
	}

	public String getDcaActivo() {
		return this.dcaActivo;
	}

	public void setDcaActivo(String dcaActivo) {
		this.dcaActivo = dcaActivo;
	}

	public String getDcaValor() {
		return this.dcaValor;
	}

	public void setDcaValor(String dcaValor) {
		this.dcaValor = dcaValor;
	}

}