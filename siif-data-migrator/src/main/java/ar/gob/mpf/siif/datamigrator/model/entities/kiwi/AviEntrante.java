package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the avi_entrantes database table.
 * 
 */
// @Entity
// @Table(name="avi_entrantes")
@NamedQuery(name="AviEntrante.findAll", query="SELECT a FROM AviEntrante a")
public class AviEntrante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ave_key")
	private int aveKey;

	@Column(name="ave_attachments")
	private String aveAttachments;

	@Column(name="ave_body")
	private String aveBody;

	@Column(name="ave_body_alt")
	private String aveBodyAlt;

	@Column(name="ave_from")
	private String aveFrom;

	@Column(name="ave_headers")
	private String aveHeaders;

	@Column(name="ave_status")
	private String aveStatus;

	@Column(name="ave_subject")
	private String aveSubject;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ave_tstamp")
	private Date aveTstamp;

	@Column(name="avm_key")
	private int avmKey;

	@Column(name="avs_code")
	private int avsCode;

	public AviEntrante() {
	}

	public int getAveKey() {
		return this.aveKey;
	}

	public void setAveKey(int aveKey) {
		this.aveKey = aveKey;
	}

	public String getAveAttachments() {
		return this.aveAttachments;
	}

	public void setAveAttachments(String aveAttachments) {
		this.aveAttachments = aveAttachments;
	}

	public String getAveBody() {
		return this.aveBody;
	}

	public void setAveBody(String aveBody) {
		this.aveBody = aveBody;
	}

	public String getAveBodyAlt() {
		return this.aveBodyAlt;
	}

	public void setAveBodyAlt(String aveBodyAlt) {
		this.aveBodyAlt = aveBodyAlt;
	}

	public String getAveFrom() {
		return this.aveFrom;
	}

	public void setAveFrom(String aveFrom) {
		this.aveFrom = aveFrom;
	}

	public String getAveHeaders() {
		return this.aveHeaders;
	}

	public void setAveHeaders(String aveHeaders) {
		this.aveHeaders = aveHeaders;
	}

	public String getAveStatus() {
		return this.aveStatus;
	}

	public void setAveStatus(String aveStatus) {
		this.aveStatus = aveStatus;
	}

	public String getAveSubject() {
		return this.aveSubject;
	}

	public void setAveSubject(String aveSubject) {
		this.aveSubject = aveSubject;
	}

	public Date getAveTstamp() {
		return this.aveTstamp;
	}

	public void setAveTstamp(Date aveTstamp) {
		this.aveTstamp = aveTstamp;
	}

	public int getAvmKey() {
		return this.avmKey;
	}

	public void setAvmKey(int avmKey) {
		this.avmKey = avmKey;
	}

	public int getAvsCode() {
		return this.avsCode;
	}

	public void setAvsCode(int avsCode) {
		this.avsCode = avsCode;
	}

}