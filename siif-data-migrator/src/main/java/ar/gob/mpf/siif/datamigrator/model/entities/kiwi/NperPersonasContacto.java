package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the nper_personas_contactos database table.
 * 
 */
// @Entity
// @Table(name="nper_personas_contactos")
@NamedQuery(name="NperPersonasContacto.findAll", query="SELECT n FROM NperPersonasContacto n")
public class NperPersonasContacto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pco_code")
	private int pcoCode;

	@Column(name="pco_deleted")
	private String pcoDeleted;

	@Column(name="pco_obser")
	private String pcoObser;

	@Column(name="pco_tipo")
	private String pcoTipo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pco_tstamp")
	private Date pcoTstamp;

	@Column(name="pco_valor")
	private String pcoValor;

	@Column(name="per_code")
	private int perCode;

	public NperPersonasContacto() {
	}

	public int getPcoCode() {
		return this.pcoCode;
	}

	public void setPcoCode(int pcoCode) {
		this.pcoCode = pcoCode;
	}

	public String getPcoDeleted() {
		return this.pcoDeleted;
	}

	public void setPcoDeleted(String pcoDeleted) {
		this.pcoDeleted = pcoDeleted;
	}

	public String getPcoObser() {
		return this.pcoObser;
	}

	public void setPcoObser(String pcoObser) {
		this.pcoObser = pcoObser;
	}

	public String getPcoTipo() {
		return this.pcoTipo;
	}

	public void setPcoTipo(String pcoTipo) {
		this.pcoTipo = pcoTipo;
	}

	public Date getPcoTstamp() {
		return this.pcoTstamp;
	}

	public void setPcoTstamp(Date pcoTstamp) {
		this.pcoTstamp = pcoTstamp;
	}

	public String getPcoValor() {
		return this.pcoValor;
	}

	public void setPcoValor(String pcoValor) {
		this.pcoValor = pcoValor;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

}