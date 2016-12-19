package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the den_juzgados database table.
 * 
 */
// @Entity
// @Table(name="den_juzgados")
@NamedQuery(name="DenJuzgado.findAll", query="SELECT d FROM DenJuzgado d")
public class DenJuzgado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="djz_code")
	private int djzCode;

	@Column(name="dcm_code")
	private int dcmCode;

	@Column(name="djz_activo")
	private String djzActivo;

	@Column(name="djz_contacto")
	private String djzContacto;

	@Column(name="djz_cp")
	private String djzCp;

	@Column(name="djz_domicilio")
	private String djzDomicilio;

	@Column(name="djz_email")
	private String djzEmail;

	@Column(name="djz_fax")
	private String djzFax;

	@Column(name="djz_localidad")
	private String djzLocalidad;

	@Column(name="djz_nombre")
	private String djzNombre;

	@Column(name="djz_tel_fijo")
	private String djzTelFijo;

	@Column(name="djz_tel_movil")
	private String djzTelMovil;

	public DenJuzgado() {
	}

	public int getDjzCode() {
		return this.djzCode;
	}

	public void setDjzCode(int djzCode) {
		this.djzCode = djzCode;
	}

	public int getDcmCode() {
		return this.dcmCode;
	}

	public void setDcmCode(int dcmCode) {
		this.dcmCode = dcmCode;
	}

	public String getDjzActivo() {
		return this.djzActivo;
	}

	public void setDjzActivo(String djzActivo) {
		this.djzActivo = djzActivo;
	}

	public String getDjzContacto() {
		return this.djzContacto;
	}

	public void setDjzContacto(String djzContacto) {
		this.djzContacto = djzContacto;
	}

	public String getDjzCp() {
		return this.djzCp;
	}

	public void setDjzCp(String djzCp) {
		this.djzCp = djzCp;
	}

	public String getDjzDomicilio() {
		return this.djzDomicilio;
	}

	public void setDjzDomicilio(String djzDomicilio) {
		this.djzDomicilio = djzDomicilio;
	}

	public String getDjzEmail() {
		return this.djzEmail;
	}

	public void setDjzEmail(String djzEmail) {
		this.djzEmail = djzEmail;
	}

	public String getDjzFax() {
		return this.djzFax;
	}

	public void setDjzFax(String djzFax) {
		this.djzFax = djzFax;
	}

	public String getDjzLocalidad() {
		return this.djzLocalidad;
	}

	public void setDjzLocalidad(String djzLocalidad) {
		this.djzLocalidad = djzLocalidad;
	}

	public String getDjzNombre() {
		return this.djzNombre;
	}

	public void setDjzNombre(String djzNombre) {
		this.djzNombre = djzNombre;
	}

	public String getDjzTelFijo() {
		return this.djzTelFijo;
	}

	public void setDjzTelFijo(String djzTelFijo) {
		this.djzTelFijo = djzTelFijo;
	}

	public String getDjzTelMovil() {
		return this.djzTelMovil;
	}

	public void setDjzTelMovil(String djzTelMovil) {
		this.djzTelMovil = djzTelMovil;
	}

}