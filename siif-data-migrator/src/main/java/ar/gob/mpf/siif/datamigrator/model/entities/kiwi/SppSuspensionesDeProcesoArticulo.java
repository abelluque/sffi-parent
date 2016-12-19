package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spp_suspensiones_de_proceso_articulos database table.
 * 
 */
// @Entity
// @Table(name="spp_suspensiones_de_proceso_articulos")
@NamedQuery(name="SppSuspensionesDeProcesoArticulo.findAll", query="SELECT s FROM SppSuspensionesDeProcesoArticulo s")
public class SppSuspensionesDeProcesoArticulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="spa_code")
	private int spaCode;

	@Column(name="spa_art_code")
	private int spaArtCode;

	@Column(name="spa_mat_code")
	private int spaMatCode;

	@Column(name="ssp_code")
	private int sspCode;

	public SppSuspensionesDeProcesoArticulo() {
	}

	public int getSpaCode() {
		return this.spaCode;
	}

	public void setSpaCode(int spaCode) {
		this.spaCode = spaCode;
	}

	public int getSpaArtCode() {
		return this.spaArtCode;
	}

	public void setSpaArtCode(int spaArtCode) {
		this.spaArtCode = spaArtCode;
	}

	public int getSpaMatCode() {
		return this.spaMatCode;
	}

	public void setSpaMatCode(int spaMatCode) {
		this.spaMatCode = spaMatCode;
	}

	public int getSspCode() {
		return this.sspCode;
	}

	public void setSspCode(int sspCode) {
		this.sspCode = sspCode;
	}

}