package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the log_operaciones database table.
 * 
 */
// @Entity
// @Table(name="log_operaciones")
@NamedQuery(name="LogOperacione.findAll", query="SELECT l FROM LogOperacione l")
public class LogOperacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="lop_code")
	private int lopCode;

	@Column(name="lop_change")
	private String lopChange;

	@Column(name="lop_key")
	private String lopKey;

	@Column(name="lop_object")
	private String lopObject;

	@Column(name="lop_operation")
	private String lopOperation;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="lop_tstamp")
	private Date lopTstamp;

	@Column(name="use_code")
	private String useCode;

	public LogOperacione() {
	}

	public int getLopCode() {
		return this.lopCode;
	}

	public void setLopCode(int lopCode) {
		this.lopCode = lopCode;
	}

	public String getLopChange() {
		return this.lopChange;
	}

	public void setLopChange(String lopChange) {
		this.lopChange = lopChange;
	}

	public String getLopKey() {
		return this.lopKey;
	}

	public void setLopKey(String lopKey) {
		this.lopKey = lopKey;
	}

	public String getLopObject() {
		return this.lopObject;
	}

	public void setLopObject(String lopObject) {
		this.lopObject = lopObject;
	}

	public String getLopOperation() {
		return this.lopOperation;
	}

	public void setLopOperation(String lopOperation) {
		this.lopOperation = lopOperation;
	}

	public Date getLopTstamp() {
		return this.lopTstamp;
	}

	public void setLopTstamp(Date lopTstamp) {
		this.lopTstamp = lopTstamp;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}