package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

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

	@Column(name="gps_code")
	private int gpsCode;

	@Column(name="gps_iso2")
	private int gpsIso2;

	@Column(name="gps_iso3")
	private int gpsIso3;

	@Column(name="gps_isonum")
	private int gpsIsonum;

	@Column(name="gps_nombre")
	private int gpsNombre;

	public GenPais() {
	}

	public int getGpsCode() {
		return this.gpsCode;
	}

	public void setGpsCode(int gpsCode) {
		this.gpsCode = gpsCode;
	}

	public int getGpsIso2() {
		return this.gpsIso2;
	}

	public void setGpsIso2(int gpsIso2) {
		this.gpsIso2 = gpsIso2;
	}

	public int getGpsIso3() {
		return this.gpsIso3;
	}

	public void setGpsIso3(int gpsIso3) {
		this.gpsIso3 = gpsIso3;
	}

	public int getGpsIsonum() {
		return this.gpsIsonum;
	}

	public void setGpsIsonum(int gpsIsonum) {
		this.gpsIsonum = gpsIsonum;
	}

	public int getGpsNombre() {
		return this.gpsNombre;
	}

	public void setGpsNombre(int gpsNombre) {
		this.gpsNombre = gpsNombre;
	}

}