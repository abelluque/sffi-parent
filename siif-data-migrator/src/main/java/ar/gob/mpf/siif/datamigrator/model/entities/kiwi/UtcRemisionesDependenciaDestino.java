package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utc_remisiones_dependencia_destino database table.
 * 
 */
// @Entity
// @Table(name="utc_remisiones_dependencia_destino")
@NamedQuery(name="UtcRemisionesDependenciaDestino.findAll", query="SELECT u FROM UtcRemisionesDependenciaDestino u")
public class UtcRemisionesDependenciaDestino implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="udd_code")
	private int uddCode;

	@Column(name="udd_activo")
	private String uddActivo;

	@Column(name="udd_descripcion")
	private String uddDescripcion;

	@Column(name="udu_code")
	private int uduCode;

	public UtcRemisionesDependenciaDestino() {
	}

	public int getUddCode() {
		return this.uddCode;
	}

	public void setUddCode(int uddCode) {
		this.uddCode = uddCode;
	}

	public String getUddActivo() {
		return this.uddActivo;
	}

	public void setUddActivo(String uddActivo) {
		this.uddActivo = uddActivo;
	}

	public String getUddDescripcion() {
		return this.uddDescripcion;
	}

	public void setUddDescripcion(String uddDescripcion) {
		this.uddDescripcion = uddDescripcion;
	}

	public int getUduCode() {
		return this.uduCode;
	}

	public void setUduCode(int uduCode) {
		this.uduCode = uduCode;
	}

}