package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spp_informes_previos_articulos database table.
 * 
 */
// @Entity
// @Table(name="spp_informes_previos_articulos")
@NamedQuery(name="SppInformesPreviosArticulo.findAll", query="SELECT s FROM SppInformesPreviosArticulo s")
public class SppInformesPreviosArticulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sipa_code")
	private int sipaCode;

	@Column(name="sip_code")
	private int sipCode;

	@Column(name="sipa_art_code")
	private int sipaArtCode;

	@Column(name="sipa_mat_code")
	private int sipaMatCode;

	public SppInformesPreviosArticulo() {
	}

	public int getSipaCode() {
		return this.sipaCode;
	}

	public void setSipaCode(int sipaCode) {
		this.sipaCode = sipaCode;
	}

	public int getSipCode() {
		return this.sipCode;
	}

	public void setSipCode(int sipCode) {
		this.sipCode = sipCode;
	}

	public int getSipaArtCode() {
		return this.sipaArtCode;
	}

	public void setSipaArtCode(int sipaArtCode) {
		this.sipaArtCode = sipaArtCode;
	}

	public int getSipaMatCode() {
		return this.sipaMatCode;
	}

	public void setSipaMatCode(int sipaMatCode) {
		this.sipaMatCode = sipaMatCode;
	}

}