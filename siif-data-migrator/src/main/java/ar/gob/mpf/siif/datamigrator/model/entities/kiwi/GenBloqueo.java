package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the gen_bloqueos database table.
 * 
 */
// @Entity
// @Table(name="gen_bloqueos")
@NamedQuery(name="GenBloqueo.findAll", query="SELECT g FROM GenBloqueo g")
public class GenBloqueo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GenBloqueoPK id;

	@Column(name="gbl_sessid")
	private String gblSessid;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="gbl_tsini")
	private Date gblTsini;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="gbl_tstamp")
	private Date gblTstamp;

	@Column(name="use_code")
	private String useCode;

	public GenBloqueo() {
	}

	public GenBloqueoPK getId() {
		return this.id;
	}

	public void setId(GenBloqueoPK id) {
		this.id = id;
	}

	public String getGblSessid() {
		return this.gblSessid;
	}

	public void setGblSessid(String gblSessid) {
		this.gblSessid = gblSessid;
	}

	public Date getGblTsini() {
		return this.gblTsini;
	}

	public void setGblTsini(Date gblTsini) {
		this.gblTsini = gblTsini;
	}

	public Date getGblTstamp() {
		return this.gblTstamp;
	}

	public void setGblTstamp(Date gblTstamp) {
		this.gblTstamp = gblTstamp;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}