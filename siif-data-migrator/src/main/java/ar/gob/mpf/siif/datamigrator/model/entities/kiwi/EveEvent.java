package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the eve_events database table.
 * 
 */
// @Entity
// @Table(name="eve_events")
@NamedQuery(name="EveEvent.findAll", query="SELECT e FROM EveEvent e")
public class EveEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="eve_code")
	private int eveCode;

	@Column(name="eve_error")
	private String eveError;

	@Column(name="eve_event")
	private String eveEvent;

	@Lob
	@Column(name="eve_extra_data")
	private String eveExtraData;

	@Column(name="eve_fired_by_class")
	private String eveFiredByClass;

	@Column(name="eve_fired_by_instance")
	private String eveFiredByInstance;

	@Column(name="eve_retries")
	private int eveRetries;

	@Column(name="eve_status")
	private String eveStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="eve_tstamp_fired")
	private Date eveTstampFired;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="eve_tstamp_proc")
	private Date eveTstampProc;

	public EveEvent() {
	}

	public int getEveCode() {
		return this.eveCode;
	}

	public void setEveCode(int eveCode) {
		this.eveCode = eveCode;
	}

	public String getEveError() {
		return this.eveError;
	}

	public void setEveError(String eveError) {
		this.eveError = eveError;
	}

	public String getEveEvent() {
		return this.eveEvent;
	}

	public void setEveEvent(String eveEvent) {
		this.eveEvent = eveEvent;
	}

	public String getEveExtraData() {
		return this.eveExtraData;
	}

	public void setEveExtraData(String eveExtraData) {
		this.eveExtraData = eveExtraData;
	}

	public String getEveFiredByClass() {
		return this.eveFiredByClass;
	}

	public void setEveFiredByClass(String eveFiredByClass) {
		this.eveFiredByClass = eveFiredByClass;
	}

	public String getEveFiredByInstance() {
		return this.eveFiredByInstance;
	}

	public void setEveFiredByInstance(String eveFiredByInstance) {
		this.eveFiredByInstance = eveFiredByInstance;
	}

	public int getEveRetries() {
		return this.eveRetries;
	}

	public void setEveRetries(int eveRetries) {
		this.eveRetries = eveRetries;
	}

	public String getEveStatus() {
		return this.eveStatus;
	}

	public void setEveStatus(String eveStatus) {
		this.eveStatus = eveStatus;
	}

	public Date getEveTstampFired() {
		return this.eveTstampFired;
	}

	public void setEveTstampFired(Date eveTstampFired) {
		this.eveTstampFired = eveTstampFired;
	}

	public Date getEveTstampProc() {
		return this.eveTstampProc;
	}

	public void setEveTstampProc(Date eveTstampProc) {
		this.eveTstampProc = eveTstampProc;
	}

}