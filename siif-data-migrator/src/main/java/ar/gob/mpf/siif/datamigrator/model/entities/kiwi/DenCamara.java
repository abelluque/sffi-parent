package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the den_camaras database table.
 * 
 */
// @Entity
// @Table(name="den_camaras")
@NamedQuery(name="DenCamara.findAll", query="SELECT d FROM DenCamara d")
public class DenCamara implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dcm_code")
	private int dcmCode;

	@Column(name="dcm_activo")
	private String dcmActivo;

	@Column(name="dcm_contacto")
	private String dcmContacto;

	@Column(name="dcm_cp")
	private String dcmCp;

	@Column(name="dcm_domicilio")
	private String dcmDomicilio;

	@Column(name="dcm_email")
	private String dcmEmail;

	@Column(name="dcm_fax")
	private String dcmFax;

	@Column(name="dcm_localidad")
	private String dcmLocalidad;

	@Column(name="dcm_nombre")
	private String dcmNombre;

	@Column(name="dcm_tel_fijo")
	private String dcmTelFijo;

	@Column(name="dcm_tel_movil")
	private String dcmTelMovil;

	public DenCamara() {
	}

	public int getDcmCode() {
		return this.dcmCode;
	}

	public void setDcmCode(int dcmCode) {
		this.dcmCode = dcmCode;
	}

	public String getDcmActivo() {
		return this.dcmActivo;
	}

	public void setDcmActivo(String dcmActivo) {
		this.dcmActivo = dcmActivo;
	}

	public String getDcmContacto() {
		return this.dcmContacto;
	}

	public void setDcmContacto(String dcmContacto) {
		this.dcmContacto = dcmContacto;
	}

	public String getDcmCp() {
		return this.dcmCp;
	}

	public void setDcmCp(String dcmCp) {
		this.dcmCp = dcmCp;
	}

	public String getDcmDomicilio() {
		return this.dcmDomicilio;
	}

	public void setDcmDomicilio(String dcmDomicilio) {
		this.dcmDomicilio = dcmDomicilio;
	}

	public String getDcmEmail() {
		return this.dcmEmail;
	}

	public void setDcmEmail(String dcmEmail) {
		this.dcmEmail = dcmEmail;
	}

	public String getDcmFax() {
		return this.dcmFax;
	}

	public void setDcmFax(String dcmFax) {
		this.dcmFax = dcmFax;
	}

	public String getDcmLocalidad() {
		return this.dcmLocalidad;
	}

	public void setDcmLocalidad(String dcmLocalidad) {
		this.dcmLocalidad = dcmLocalidad;
	}

	public String getDcmNombre() {
		return this.dcmNombre;
	}

	public void setDcmNombre(String dcmNombre) {
		this.dcmNombre = dcmNombre;
	}

	public String getDcmTelFijo() {
		return this.dcmTelFijo;
	}

	public void setDcmTelFijo(String dcmTelFijo) {
		this.dcmTelFijo = dcmTelFijo;
	}

	public String getDcmTelMovil() {
		return this.dcmTelMovil;
	}

	public void setDcmTelMovil(String dcmTelMovil) {
		this.dcmTelMovil = dcmTelMovil;
	}

}