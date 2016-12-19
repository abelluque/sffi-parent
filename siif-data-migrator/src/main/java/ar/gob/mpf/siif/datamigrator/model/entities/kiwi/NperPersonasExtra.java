package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the nper_personas_extras database table.
 * 
 */
// @Entity
// @Table(name="nper_personas_extras")
@NamedQuery(name="NperPersonasExtra.findAll", query="SELECT n FROM NperPersonasExtra n")
public class NperPersonasExtra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pex_code")
	private int pexCode;

	@Column(name="per_code")
	private int perCode;

	@Column(name="pex_deleted")
	private String pexDeleted;

	@Column(name="pex_obser")
	private String pexObser;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pex_tstamp")
	private Date pexTstamp;

	@Column(name="pex_valor")
	private String pexValor;

	@Column(name="pte_code")
	private int pteCode;

	public NperPersonasExtra() {
	}

	public int getPexCode() {
		return this.pexCode;
	}

	public void setPexCode(int pexCode) {
		this.pexCode = pexCode;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public String getPexDeleted() {
		return this.pexDeleted;
	}

	public void setPexDeleted(String pexDeleted) {
		this.pexDeleted = pexDeleted;
	}

	public String getPexObser() {
		return this.pexObser;
	}

	public void setPexObser(String pexObser) {
		this.pexObser = pexObser;
	}

	public Date getPexTstamp() {
		return this.pexTstamp;
	}

	public void setPexTstamp(Date pexTstamp) {
		this.pexTstamp = pexTstamp;
	}

	public String getPexValor() {
		return this.pexValor;
	}

	public void setPexValor(String pexValor) {
		this.pexValor = pexValor;
	}

	public int getPteCode() {
		return this.pteCode;
	}

	public void setPteCode(int pteCode) {
		this.pteCode = pteCode;
	}

}