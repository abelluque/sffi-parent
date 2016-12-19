package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the geo_lugares database table.
 * 
 */
// @Entity
// @Table(name="geo_lugares")
@NamedQuery(name="GeoLugare.findAll", query="SELECT g FROM GeoLugare g")
public class GeoLugare implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="glu_code")
	private int gluCode;

	@Column(name="glu_altura")
	private int gluAltura;

	@Column(name="glu_barrio")
	private String gluBarrio;

	@Column(name="glu_calle")
	private int gluCalle;

	@Column(name="glu_calle_nombre")
	private String gluCalleNombre;

	@Column(name="glu_cgpc")
	private String gluCgpc;

	@Column(name="glu_coordx")
	private float gluCoordx;

	@Column(name="glu_coordy")
	private float gluCoordy;

	@Column(name="glu_nombre")
	private String gluNombre;

	@Column(name="glu_otra_denominacion")
	private String gluOtraDenominacion;

	@Column(name="glu_tipo")
	private String gluTipo;

	@Column(name="glu_zona")
	private String gluZona;

	public GeoLugare() {
	}

	public int getGluCode() {
		return this.gluCode;
	}

	public void setGluCode(int gluCode) {
		this.gluCode = gluCode;
	}

	public int getGluAltura() {
		return this.gluAltura;
	}

	public void setGluAltura(int gluAltura) {
		this.gluAltura = gluAltura;
	}

	public String getGluBarrio() {
		return this.gluBarrio;
	}

	public void setGluBarrio(String gluBarrio) {
		this.gluBarrio = gluBarrio;
	}

	public int getGluCalle() {
		return this.gluCalle;
	}

	public void setGluCalle(int gluCalle) {
		this.gluCalle = gluCalle;
	}

	public String getGluCalleNombre() {
		return this.gluCalleNombre;
	}

	public void setGluCalleNombre(String gluCalleNombre) {
		this.gluCalleNombre = gluCalleNombre;
	}

	public String getGluCgpc() {
		return this.gluCgpc;
	}

	public void setGluCgpc(String gluCgpc) {
		this.gluCgpc = gluCgpc;
	}

	public float getGluCoordx() {
		return this.gluCoordx;
	}

	public void setGluCoordx(float gluCoordx) {
		this.gluCoordx = gluCoordx;
	}

	public float getGluCoordy() {
		return this.gluCoordy;
	}

	public void setGluCoordy(float gluCoordy) {
		this.gluCoordy = gluCoordy;
	}

	public String getGluNombre() {
		return this.gluNombre;
	}

	public void setGluNombre(String gluNombre) {
		this.gluNombre = gluNombre;
	}

	public String getGluOtraDenominacion() {
		return this.gluOtraDenominacion;
	}

	public void setGluOtraDenominacion(String gluOtraDenominacion) {
		this.gluOtraDenominacion = gluOtraDenominacion;
	}

	public String getGluTipo() {
		return this.gluTipo;
	}

	public void setGluTipo(String gluTipo) {
		this.gluTipo = gluTipo;
	}

	public String getGluZona() {
		return this.gluZona;
	}

	public void setGluZona(String gluZona) {
		this.gluZona = gluZona;
	}

}