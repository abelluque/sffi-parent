package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_efectos_eventos database table.
 * 
 */
// @Entity
// @Table(name="docum_efectos_eventos")
@NamedQuery(name="DocumEfectosEvento.findAll", query="SELECT d FROM DocumEfectosEvento d")
public class DocumEfectosEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dee_code")
	private int deeCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="dee_tipo")
	private String deeTipo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dee_tstamp")
	private Date deeTstamp;

	@Column(name="def_code")
	private int defCode;

	@Column(name="der_code")
	private int derCode;

	@Column(name="use_code")
	private String useCode;

	public DocumEfectosEvento() {
	}

	public int getDeeCode() {
		return this.deeCode;
	}

	public void setDeeCode(int deeCode) {
		this.deeCode = deeCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getDeeTipo() {
		return this.deeTipo;
	}

	public void setDeeTipo(String deeTipo) {
		this.deeTipo = deeTipo;
	}

	public Date getDeeTstamp() {
		return this.deeTstamp;
	}

	public void setDeeTstamp(Date deeTstamp) {
		this.deeTstamp = deeTstamp;
	}

	public int getDefCode() {
		return this.defCode;
	}

	public void setDefCode(int defCode) {
		this.defCode = defCode;
	}

	public int getDerCode() {
		return this.derCode;
	}

	public void setDerCode(int derCode) {
		this.derCode = derCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}