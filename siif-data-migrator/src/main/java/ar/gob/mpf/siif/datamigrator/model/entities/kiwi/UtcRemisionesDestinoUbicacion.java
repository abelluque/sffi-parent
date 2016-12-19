package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utc_remisiones_destino_ubicacion database table.
 * 
 */
// @Entity
// @Table(name="utc_remisiones_destino_ubicacion")
@NamedQuery(name="UtcRemisionesDestinoUbicacion.findAll", query="SELECT u FROM UtcRemisionesDestinoUbicacion u")
public class UtcRemisionesDestinoUbicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="udu_code")
	private int uduCode;

	@Column(name="udu_activo")
	private String uduActivo;

	@Column(name="udu_descripcion")
	private String uduDescripcion;

	@Column(name="udu_texto_libre")
	private String uduTextoLibre;

	public UtcRemisionesDestinoUbicacion() {
	}

	public int getUduCode() {
		return this.uduCode;
	}

	public void setUduCode(int uduCode) {
		this.uduCode = uduCode;
	}

	public String getUduActivo() {
		return this.uduActivo;
	}

	public void setUduActivo(String uduActivo) {
		this.uduActivo = uduActivo;
	}

	public String getUduDescripcion() {
		return this.uduDescripcion;
	}

	public void setUduDescripcion(String uduDescripcion) {
		this.uduDescripcion = uduDescripcion;
	}

	public String getUduTextoLibre() {
		return this.uduTextoLibre;
	}

	public void setUduTextoLibre(String uduTextoLibre) {
		this.uduTextoLibre = uduTextoLibre;
	}

}