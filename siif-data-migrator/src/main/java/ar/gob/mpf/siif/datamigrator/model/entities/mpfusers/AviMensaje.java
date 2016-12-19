package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the avi_mensajes database table.
 * 
 */
// @Entity
// @Table(name="avi_mensajes")
@NamedQuery(name="AviMensaje.findAll", query="SELECT a FROM AviMensaje a")
public class AviMensaje implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="avm_key")
	private int avmKey;

	@Column(name="avm_attachments")
	private String avmAttachments;

	@Lob
	@Column(name="avm_body")
	private String avmBody;

	@Column(name="avm_class")
	private String avmClass;

	@Column(name="avm_code")
	private String avmCode;

	@Column(name="avm_descr")
	private String avmDescr;

	@Column(name="avm_email")
	private String avmEmail;

	@Column(name="avm_error")
	private String avmError;

	@Column(name="avm_follow_key")
	private String avmFollowKey;

	@Column(name="avm_follow_up")
	private String avmFollowUp;

	@Column(name="avm_headers")
	private String avmHeaders;

	@Column(name="avm_intentos")
	private int avmIntentos;

	@Column(name="avm_name")
	private String avmName;

	@Column(name="avm_opt")
	private String avmOpt;

	@Column(name="avm_status")
	private String avmStatus;

	@Column(name="avm_template")
	private String avmTemplate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="avm_tstamp")
	private Date avmTstamp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="avm_tstamp_send")
	private Date avmTstampSend;

	@Column(name="avm_xid")
	private String avmXid;

	@Column(name="avs_code")
	private int avsCode;

	@Column(name="tev_key")
	private int tevKey;

	public AviMensaje() {
	}

	public int getAvmKey() {
		return this.avmKey;
	}

	public void setAvmKey(int avmKey) {
		this.avmKey = avmKey;
	}

	public String getAvmAttachments() {
		return this.avmAttachments;
	}

	public void setAvmAttachments(String avmAttachments) {
		this.avmAttachments = avmAttachments;
	}

	public String getAvmBody() {
		return this.avmBody;
	}

	public void setAvmBody(String avmBody) {
		this.avmBody = avmBody;
	}

	public String getAvmClass() {
		return this.avmClass;
	}

	public void setAvmClass(String avmClass) {
		this.avmClass = avmClass;
	}

	public String getAvmCode() {
		return this.avmCode;
	}

	public void setAvmCode(String avmCode) {
		this.avmCode = avmCode;
	}

	public String getAvmDescr() {
		return this.avmDescr;
	}

	public void setAvmDescr(String avmDescr) {
		this.avmDescr = avmDescr;
	}

	public String getAvmEmail() {
		return this.avmEmail;
	}

	public void setAvmEmail(String avmEmail) {
		this.avmEmail = avmEmail;
	}

	public String getAvmError() {
		return this.avmError;
	}

	public void setAvmError(String avmError) {
		this.avmError = avmError;
	}

	public String getAvmFollowKey() {
		return this.avmFollowKey;
	}

	public void setAvmFollowKey(String avmFollowKey) {
		this.avmFollowKey = avmFollowKey;
	}

	public String getAvmFollowUp() {
		return this.avmFollowUp;
	}

	public void setAvmFollowUp(String avmFollowUp) {
		this.avmFollowUp = avmFollowUp;
	}

	public String getAvmHeaders() {
		return this.avmHeaders;
	}

	public void setAvmHeaders(String avmHeaders) {
		this.avmHeaders = avmHeaders;
	}

	public int getAvmIntentos() {
		return this.avmIntentos;
	}

	public void setAvmIntentos(int avmIntentos) {
		this.avmIntentos = avmIntentos;
	}

	public String getAvmName() {
		return this.avmName;
	}

	public void setAvmName(String avmName) {
		this.avmName = avmName;
	}

	public String getAvmOpt() {
		return this.avmOpt;
	}

	public void setAvmOpt(String avmOpt) {
		this.avmOpt = avmOpt;
	}

	public String getAvmStatus() {
		return this.avmStatus;
	}

	public void setAvmStatus(String avmStatus) {
		this.avmStatus = avmStatus;
	}

	public String getAvmTemplate() {
		return this.avmTemplate;
	}

	public void setAvmTemplate(String avmTemplate) {
		this.avmTemplate = avmTemplate;
	}

	public Date getAvmTstamp() {
		return this.avmTstamp;
	}

	public void setAvmTstamp(Date avmTstamp) {
		this.avmTstamp = avmTstamp;
	}

	public Date getAvmTstampSend() {
		return this.avmTstampSend;
	}

	public void setAvmTstampSend(Date avmTstampSend) {
		this.avmTstampSend = avmTstampSend;
	}

	public String getAvmXid() {
		return this.avmXid;
	}

	public void setAvmXid(String avmXid) {
		this.avmXid = avmXid;
	}

	public int getAvsCode() {
		return this.avsCode;
	}

	public void setAvsCode(int avsCode) {
		this.avsCode = avsCode;
	}

	public int getTevKey() {
		return this.tevKey;
	}

	public void setTevKey(int tevKey) {
		this.tevKey = tevKey;
	}

}