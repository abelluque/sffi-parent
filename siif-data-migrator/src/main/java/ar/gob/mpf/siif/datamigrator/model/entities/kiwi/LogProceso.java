package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the log_procesos database table.
 * 
 */
// @Entity
// @Table(name="log_procesos")
@NamedQuery(name="LogProceso.findAll", query="SELECT l FROM LogProceso l")
public class LogProceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="lpr_code")
	private int lprCode;

	@Lob
	@Column(name="lpr_log")
	private String lprLog;

	@Column(name="lpr_process")
	private String lprProcess;

	@Column(name="lpr_status")
	private String lprStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="lpr_tstamp")
	private Date lprTstamp;

	public LogProceso() {
	}

	public int getLprCode() {
		return this.lprCode;
	}

	public void setLprCode(int lprCode) {
		this.lprCode = lprCode;
	}

	public String getLprLog() {
		return this.lprLog;
	}

	public void setLprLog(String lprLog) {
		this.lprLog = lprLog;
	}

	public String getLprProcess() {
		return this.lprProcess;
	}

	public void setLprProcess(String lprProcess) {
		this.lprProcess = lprProcess;
	}

	public String getLprStatus() {
		return this.lprStatus;
	}

	public void setLprStatus(String lprStatus) {
		this.lprStatus = lprStatus;
	}

	public Date getLprTstamp() {
		return this.lprTstamp;
	}

	public void setLprTstamp(Date lprTstamp) {
		this.lprTstamp = lprTstamp;
	}

}