package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sec_sessions database table.
 * 
 */
@Embeddable
public class SecSessionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="use_code")
	private String useCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ses_tstamp")
	private java.util.Date sesTstamp;

	public SecSessionPK() {
	}
	public String getUseCode() {
		return this.useCode;
	}
	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}
	public java.util.Date getSesTstamp() {
		return this.sesTstamp;
	}
	public void setSesTstamp(java.util.Date sesTstamp) {
		this.sesTstamp = sesTstamp;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SecSessionPK)) {
			return false;
		}
		SecSessionPK castOther = (SecSessionPK)other;
		return 
			this.useCode.equals(castOther.useCode)
			&& this.sesTstamp.equals(castOther.sesTstamp);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.useCode.hashCode();
		hash = hash * prime + this.sesTstamp.hashCode();
		
		return hash;
	}
}