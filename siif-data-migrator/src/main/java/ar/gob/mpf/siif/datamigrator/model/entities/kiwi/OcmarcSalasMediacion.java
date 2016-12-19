package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ocmarc_salas_mediacion database table.
 * 
 */
// @Entity
// @Table(name="ocmarc_salas_mediacion")
@NamedQuery(name="OcmarcSalasMediacion.findAll", query="SELECT o FROM OcmarcSalasMediacion o")
public class OcmarcSalasMediacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ocs_code")
	private int ocsCode;

	@Column(name="ocs_activo")
	private String ocsActivo;

	@Column(name="ocs_altura")
	private int ocsAltura;

	@Column(name="ocs_barrio")
	private String ocsBarrio;

	@Column(name="ocs_capacidad")
	private String ocsCapacidad;

	@Column(name="ocs_coordx")
	private BigDecimal ocsCoordx;

	@Column(name="ocs_coordy")
	private BigDecimal ocsCoordy;

	@Column(name="ocs_cp")
	private String ocsCp;

	@Column(name="ocs_direccion")
	private String ocsDireccion;

	@Column(name="ocs_email")
	private String ocsEmail;

	@Column(name="ocs_localidad")
	private String ocsLocalidad;

	@Column(name="ocs_nombre")
	private String ocsNombre;

	@Column(name="ocs_pmj")
	private String ocsPmj;

	@Column(name="ocs_tel_fijo")
	private String ocsTelFijo;

	@Column(name="ocs_zona")
	private String ocsZona;

	public OcmarcSalasMediacion() {
	}

	public int getOcsCode() {
		return this.ocsCode;
	}

	public void setOcsCode(int ocsCode) {
		this.ocsCode = ocsCode;
	}

	public String getOcsActivo() {
		return this.ocsActivo;
	}

	public void setOcsActivo(String ocsActivo) {
		this.ocsActivo = ocsActivo;
	}

	public int getOcsAltura() {
		return this.ocsAltura;
	}

	public void setOcsAltura(int ocsAltura) {
		this.ocsAltura = ocsAltura;
	}

	public String getOcsBarrio() {
		return this.ocsBarrio;
	}

	public void setOcsBarrio(String ocsBarrio) {
		this.ocsBarrio = ocsBarrio;
	}

	public String getOcsCapacidad() {
		return this.ocsCapacidad;
	}

	public void setOcsCapacidad(String ocsCapacidad) {
		this.ocsCapacidad = ocsCapacidad;
	}

	public BigDecimal getOcsCoordx() {
		return this.ocsCoordx;
	}

	public void setOcsCoordx(BigDecimal ocsCoordx) {
		this.ocsCoordx = ocsCoordx;
	}

	public BigDecimal getOcsCoordy() {
		return this.ocsCoordy;
	}

	public void setOcsCoordy(BigDecimal ocsCoordy) {
		this.ocsCoordy = ocsCoordy;
	}

	public String getOcsCp() {
		return this.ocsCp;
	}

	public void setOcsCp(String ocsCp) {
		this.ocsCp = ocsCp;
	}

	public String getOcsDireccion() {
		return this.ocsDireccion;
	}

	public void setOcsDireccion(String ocsDireccion) {
		this.ocsDireccion = ocsDireccion;
	}

	public String getOcsEmail() {
		return this.ocsEmail;
	}

	public void setOcsEmail(String ocsEmail) {
		this.ocsEmail = ocsEmail;
	}

	public String getOcsLocalidad() {
		return this.ocsLocalidad;
	}

	public void setOcsLocalidad(String ocsLocalidad) {
		this.ocsLocalidad = ocsLocalidad;
	}

	public String getOcsNombre() {
		return this.ocsNombre;
	}

	public void setOcsNombre(String ocsNombre) {
		this.ocsNombre = ocsNombre;
	}

	public String getOcsPmj() {
		return this.ocsPmj;
	}

	public void setOcsPmj(String ocsPmj) {
		this.ocsPmj = ocsPmj;
	}

	public String getOcsTelFijo() {
		return this.ocsTelFijo;
	}

	public void setOcsTelFijo(String ocsTelFijo) {
		this.ocsTelFijo = ocsTelFijo;
	}

	public String getOcsZona() {
		return this.ocsZona;
	}

	public void setOcsZona(String ocsZona) {
		this.ocsZona = ocsZona;
	}

}