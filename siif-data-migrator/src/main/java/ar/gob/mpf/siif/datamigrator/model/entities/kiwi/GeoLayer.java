package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the geo_layers database table.
 * 
 */
// @Entity
// @Table(name="geo_layers")
@NamedQuery(name="GeoLayer.findAll", query="SELECT g FROM GeoLayer g")
public class GeoLayer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="gla_code")
	private int glaCode;

	@Column(name="gla_name")
	private String glaName;

	@Column(name="gla_status")
	private String glaStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="gla_tstamp")
	private Date glaTstamp;

	@Column(name="use_code")
	private String useCode;

	public GeoLayer() {
	}

	public int getGlaCode() {
		return this.glaCode;
	}

	public void setGlaCode(int glaCode) {
		this.glaCode = glaCode;
	}

	public String getGlaName() {
		return this.glaName;
	}

	public void setGlaName(String glaName) {
		this.glaName = glaName;
	}

	public String getGlaStatus() {
		return this.glaStatus;
	}

	public void setGlaStatus(String glaStatus) {
		this.glaStatus = glaStatus;
	}

	public Date getGlaTstamp() {
		return this.glaTstamp;
	}

	public void setGlaTstamp(Date glaTstamp) {
		this.glaTstamp = glaTstamp;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}