package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oci_tipo_antecedente database table.
 * 
 */
// @Entity
// @Table(name="oci_tipo_antecedente")
@NamedQuery(name="OciTipoAntecedente.findAll", query="SELECT o FROM OciTipoAntecedente o")
public class OciTipoAntecedente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ota_code")
	private int otaCode;

	@Column(name="oor_code")
	private int oorCode;

	@Column(name="ota_activo")
	private String otaActivo;

	@Column(name="ota_descripcion")
	private String otaDescripcion;

	@Column(name="ota_titulo")
	private String otaTitulo;

	public OciTipoAntecedente() {
	}

	public int getOtaCode() {
		return this.otaCode;
	}

	public void setOtaCode(int otaCode) {
		this.otaCode = otaCode;
	}

	public int getOorCode() {
		return this.oorCode;
	}

	public void setOorCode(int oorCode) {
		this.oorCode = oorCode;
	}

	public String getOtaActivo() {
		return this.otaActivo;
	}

	public void setOtaActivo(String otaActivo) {
		this.otaActivo = otaActivo;
	}

	public String getOtaDescripcion() {
		return this.otaDescripcion;
	}

	public void setOtaDescripcion(String otaDescripcion) {
		this.otaDescripcion = otaDescripcion;
	}

	public String getOtaTitulo() {
		return this.otaTitulo;
	}

	public void setOtaTitulo(String otaTitulo) {
		this.otaTitulo = otaTitulo;
	}

}