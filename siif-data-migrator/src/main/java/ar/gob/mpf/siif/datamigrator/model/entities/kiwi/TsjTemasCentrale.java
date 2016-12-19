package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tsj_temas_centrales database table.
 * 
 */
// @Entity
// @Table(name="tsj_temas_centrales")
@NamedQuery(name="TsjTemasCentrale.findAll", query="SELECT t FROM TsjTemasCentrale t")
public class TsjTemasCentrale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ttc_code")
	private int ttcCode;

	@Column(name="ttc_activo")
	private String ttcActivo;

	@Column(name="ttc_valor")
	private String ttcValor;

	public TsjTemasCentrale() {
	}

	public int getTtcCode() {
		return this.ttcCode;
	}

	public void setTtcCode(int ttcCode) {
		this.ttcCode = ttcCode;
	}

	public String getTtcActivo() {
		return this.ttcActivo;
	}

	public void setTtcActivo(String ttcActivo) {
		this.ttcActivo = ttcActivo;
	}

	public String getTtcValor() {
		return this.ttcValor;
	}

	public void setTtcValor(String ttcValor) {
		this.ttcValor = ttcValor;
	}

}