package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the utc_cedulas_remitos database table.
 * 
 */
// @Entity
// @Table(name="utc_cedulas_remitos")
@NamedQuery(name="UtcCedulasRemito.findAll", query="SELECT u FROM UtcCedulasRemito u")
public class UtcCedulasRemito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cre_code")
	private int creCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cre_tstamp")
	private Date creTstamp;

	@Column(name="use_code")
	private int useCode;

	public UtcCedulasRemito() {
	}

	public int getCreCode() {
		return this.creCode;
	}

	public void setCreCode(int creCode) {
		this.creCode = creCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public Date getCreTstamp() {
		return this.creTstamp;
	}

	public void setCreTstamp(Date creTstamp) {
		this.creTstamp = creTstamp;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}