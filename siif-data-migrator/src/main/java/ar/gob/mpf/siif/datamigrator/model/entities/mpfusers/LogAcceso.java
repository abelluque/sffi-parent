package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the log_accesos database table.
 * 
 */
// @Entity
// @Table(name="log_accesos")
@NamedQuery(name="LogAcceso.findAll", query="SELECT l FROM LogAcceso l")
public class LogAcceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="lac_code")
	private int lacCode;

	@Column(name="lac_name")
	private String lacName;

	@Column(name="lac_operation")
	private String lacOperation;

	@Column(name="lac_result")
	private String lacResult;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="lac_tstamp")
	private Date lacTstamp;

	@Column(name="use_code")
	private String useCode;

	public LogAcceso() {
	}

	public int getLacCode() {
		return this.lacCode;
	}

	public void setLacCode(int lacCode) {
		this.lacCode = lacCode;
	}

	public String getLacName() {
		return this.lacName;
	}

	public void setLacName(String lacName) {
		this.lacName = lacName;
	}

	public String getLacOperation() {
		return this.lacOperation;
	}

	public void setLacOperation(String lacOperation) {
		this.lacOperation = lacOperation;
	}

	public String getLacResult() {
		return this.lacResult;
	}

	public void setLacResult(String lacResult) {
		this.lacResult = lacResult;
	}

	public Date getLacTstamp() {
		return this.lacTstamp;
	}

	public void setLacTstamp(Date lacTstamp) {
		this.lacTstamp = lacTstamp;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}