package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the geo_zone database table.
 * 
 */
// @Entity
// @Table(name="geo_zone")
@NamedQuery(name="GeoZone.findAll", query="SELECT g FROM GeoZone g")
public class GeoZone implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GeoZonePK id;

	@Lob
	@Column(name="gzo_encoded")
	private String gzoEncoded;

	@Column(name="gzo_name")
	private String gzoName;

	@Column(name="gzo_status")
	private String gzoStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="gzo_tstamp")
	private Date gzoTstamp;

	@Column(name="use_code")
	private String useCode;

	public GeoZone() {
	}

	public GeoZonePK getId() {
		return this.id;
	}

	public void setId(GeoZonePK id) {
		this.id = id;
	}

	public String getGzoEncoded() {
		return this.gzoEncoded;
	}

	public void setGzoEncoded(String gzoEncoded) {
		this.gzoEncoded = gzoEncoded;
	}

	public String getGzoName() {
		return this.gzoName;
	}

	public void setGzoName(String gzoName) {
		this.gzoName = gzoName;
	}

	public String getGzoStatus() {
		return this.gzoStatus;
	}

	public void setGzoStatus(String gzoStatus) {
		this.gzoStatus = gzoStatus;
	}

	public Date getGzoTstamp() {
		return this.gzoTstamp;
	}

	public void setGzoTstamp(Date gzoTstamp) {
		this.gzoTstamp = gzoTstamp;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}