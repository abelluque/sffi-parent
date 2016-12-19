package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ofavyt_tipos_asistencias_resultados database table.
 * 
 */
// @Entity
// @Table(name="ofavyt_tipos_asistencias_resultados")
@NamedQuery(name="OfavytTiposAsistenciasResultado.findAll", query="SELECT o FROM OfavytTiposAsistenciasResultado o")
public class OfavytTiposAsistenciasResultado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="oti_code")
	private int otiCode;

	@Column(name="otr_resultado")
	private String otrResultado;

	public OfavytTiposAsistenciasResultado() {
	}

	public int getOtiCode() {
		return this.otiCode;
	}

	public void setOtiCode(int otiCode) {
		this.otiCode = otiCode;
	}

	public String getOtrResultado() {
		return this.otrResultado;
	}

	public void setOtrResultado(String otrResultado) {
		this.otrResultado = otrResultado;
	}

}