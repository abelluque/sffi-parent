package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utc_medios database table.
 * 
 */
// @Entity
// @Table(name="utc_medios")
@NamedQuery(name="UtcMedio.findAll", query="SELECT u FROM UtcMedio u")
public class UtcMedio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ume_code")
	private int umeCode;

	@Column(name="ume_adjunto_obligatorio")
	private String umeAdjuntoObligatorio;

	@Column(name="ume_estado")
	private String umeEstado;

	@Column(name="ume_medio")
	private String umeMedio;

	@Column(name="ume_observacion_obligatoria")
	private String umeObservacionObligatoria;

	public UtcMedio() {
	}

	public int getUmeCode() {
		return this.umeCode;
	}

	public void setUmeCode(int umeCode) {
		this.umeCode = umeCode;
	}

	public String getUmeAdjuntoObligatorio() {
		return this.umeAdjuntoObligatorio;
	}

	public void setUmeAdjuntoObligatorio(String umeAdjuntoObligatorio) {
		this.umeAdjuntoObligatorio = umeAdjuntoObligatorio;
	}

	public String getUmeEstado() {
		return this.umeEstado;
	}

	public void setUmeEstado(String umeEstado) {
		this.umeEstado = umeEstado;
	}

	public String getUmeMedio() {
		return this.umeMedio;
	}

	public void setUmeMedio(String umeMedio) {
		this.umeMedio = umeMedio;
	}

	public String getUmeObservacionObligatoria() {
		return this.umeObservacionObligatoria;
	}

	public void setUmeObservacionObligatoria(String umeObservacionObligatoria) {
		this.umeObservacionObligatoria = umeObservacionObligatoria;
	}

}