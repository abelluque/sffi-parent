package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_paises database table.
 * 
 */
// @Entity
// @Table(name="gen_paises")
@NamedQuery(name="GenPais.findAll", query="SELECT g FROM GenPais g")
public class GenPais implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="gps_code")
	private int gpsCode;

	@Column(name="gps_iso2")
	private String gpsIso2;

	@Column(name="gps_iso3")
	private String gpsIso3;

	@Column(name="gps_isonum")
	private int gpsIsonum;

	@Column(name="gps_nombre")
	private String gpsNombre;

	public GenPais() {
	}

	public int getGpsCode() {
		return this.gpsCode;
	}

	public void setGpsCode(int gpsCode) {
		this.gpsCode = gpsCode;
	}

	public String getGpsIso2() {
		return this.gpsIso2;
	}

	public void setGpsIso2(String gpsIso2) {
		this.gpsIso2 = gpsIso2;
	}

	public String getGpsIso3() {
		return this.gpsIso3;
	}

	public void setGpsIso3(String gpsIso3) {
		this.gpsIso3 = gpsIso3;
	}

	public int getGpsIsonum() {
		return this.gpsIsonum;
	}

	public void setGpsIsonum(int gpsIsonum) {
		this.gpsIsonum = gpsIsonum;
	}

	public String getGpsNombre() {
		return this.gpsNombre;
	}

	public void setGpsNombre(String gpsNombre) {
		this.gpsNombre = gpsNombre;
	}

}