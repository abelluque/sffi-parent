package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_botones_user database table.
 * 
 */
// @Entity
// @Table(name="gen_botones_user")
@NamedQuery(name="GenBotonesUser.findAll", query="SELECT g FROM GenBotonesUser g")
public class GenBotonesUser implements Serializable {
	private static final long serialVersionUID = 1L;

	private int botonera;

	@Column(name="gba_id")
	private int gbaId;

	private int orden;

	@Column(name="use_code")
	private int useCode;

	public GenBotonesUser() {
	}

	public int getBotonera() {
		return this.botonera;
	}

	public void setBotonera(int botonera) {
		this.botonera = botonera;
	}

	public int getGbaId() {
		return this.gbaId;
	}

	public void setGbaId(int gbaId) {
		this.gbaId = gbaId;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}