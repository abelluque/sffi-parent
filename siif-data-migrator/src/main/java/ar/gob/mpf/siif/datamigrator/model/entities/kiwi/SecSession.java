package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sec_sessions database table.
 * 
 */
// @Entity
// @Table(name="sec_sessions")
@NamedQuery(name="SecSession.findAll", query="SELECT s FROM SecSession s")
public class SecSession implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SecSessionPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ses_last_access")
	private Date sesLastAccess;

	@Column(name="ses_status")
	private String sesStatus;

	@Column(name="ses_token")
	private String sesToken;

	public SecSession() {
	}

	public SecSessionPK getId() {
		return this.id;
	}

	public void setId(SecSessionPK id) {
		this.id = id;
	}

	public Date getSesLastAccess() {
		return this.sesLastAccess;
	}

	public void setSesLastAccess(Date sesLastAccess) {
		this.sesLastAccess = sesLastAccess;
	}

	public String getSesStatus() {
		return this.sesStatus;
	}

	public void setSesStatus(String sesStatus) {
		this.sesStatus = sesStatus;
	}

	public String getSesToken() {
		return this.sesToken;
	}

	public void setSesToken(String sesToken) {
		this.sesToken = sesToken;
	}

}