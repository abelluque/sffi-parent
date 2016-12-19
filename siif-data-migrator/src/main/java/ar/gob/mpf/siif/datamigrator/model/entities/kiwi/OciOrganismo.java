package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oci_organismos database table.
 * 
 */
// @Entity
// @Table(name="oci_organismos")
@NamedQuery(name="OciOrganismo.findAll", query="SELECT o FROM OciOrganismo o")
public class OciOrganismo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oor_code")
	private int oorCode;

	@Column(name="oor_activo")
	private String oorActivo;

	@Column(name="oor_altura")
	private int oorAltura;

	@Column(name="oor_barrio")
	private String oorBarrio;

	@Column(name="oor_calle")
	private String oorCalle;

	@Column(name="oor_contacto")
	private String oorContacto;

	@Column(name="oor_coordx")
	private float oorCoordx;

	@Column(name="oor_coordy")
	private float oorCoordy;

	@Column(name="oor_cp")
	private int oorCp;

	@Column(name="oor_email")
	private String oorEmail;

	@Column(name="oor_localidad")
	private String oorLocalidad;

	@Column(name="oor_nombre")
	private String oorNombre;

	public OciOrganismo() {
	}

	public int getOorCode() {
		return this.oorCode;
	}

	public void setOorCode(int oorCode) {
		this.oorCode = oorCode;
	}

	public String getOorActivo() {
		return this.oorActivo;
	}

	public void setOorActivo(String oorActivo) {
		this.oorActivo = oorActivo;
	}

	public int getOorAltura() {
		return this.oorAltura;
	}

	public void setOorAltura(int oorAltura) {
		this.oorAltura = oorAltura;
	}

	public String getOorBarrio() {
		return this.oorBarrio;
	}

	public void setOorBarrio(String oorBarrio) {
		this.oorBarrio = oorBarrio;
	}

	public String getOorCalle() {
		return this.oorCalle;
	}

	public void setOorCalle(String oorCalle) {
		this.oorCalle = oorCalle;
	}

	public String getOorContacto() {
		return this.oorContacto;
	}

	public void setOorContacto(String oorContacto) {
		this.oorContacto = oorContacto;
	}

	public float getOorCoordx() {
		return this.oorCoordx;
	}

	public void setOorCoordx(float oorCoordx) {
		this.oorCoordx = oorCoordx;
	}

	public float getOorCoordy() {
		return this.oorCoordy;
	}

	public void setOorCoordy(float oorCoordy) {
		this.oorCoordy = oorCoordy;
	}

	public int getOorCp() {
		return this.oorCp;
	}

	public void setOorCp(int oorCp) {
		this.oorCp = oorCp;
	}

	public String getOorEmail() {
		return this.oorEmail;
	}

	public void setOorEmail(String oorEmail) {
		this.oorEmail = oorEmail;
	}

	public String getOorLocalidad() {
		return this.oorLocalidad;
	}

	public void setOorLocalidad(String oorLocalidad) {
		this.oorLocalidad = oorLocalidad;
	}

	public String getOorNombre() {
		return this.oorNombre;
	}

	public void setOorNombre(String oorNombre) {
		this.oorNombre = oorNombre;
	}

}