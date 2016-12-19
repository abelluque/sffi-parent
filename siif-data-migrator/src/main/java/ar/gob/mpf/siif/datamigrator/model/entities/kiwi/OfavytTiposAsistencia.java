package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ofavyt_tipos_asistencias database table.
 * 
 */
// @Entity
// @Table(name="ofavyt_tipos_asistencias")
@NamedQuery(name="OfavytTiposAsistencia.findAll", query="SELECT o FROM OfavytTiposAsistencia o")
public class OfavytTiposAsistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oti_code")
	private int otiCode;

	@Column(name="oca_code")
	private int ocaCode;

	@Column(name="oti_activo")
	private String otiActivo;

	@Column(name="oti_archivo_obligatorio")
	private String otiArchivoObligatorio;

	@Column(name="oti_nombre")
	private String otiNombre;

	@Column(name="oti_permiso")
	private String otiPermiso;

	@Column(name="oti_permite_medida_proteccion")
	private String otiPermiteMedidaProteccion;

	@Column(name="oti_requiere_resultado")
	private String otiRequiereResultado;

	@Column(name="oti_tipo_resultado")
	private String otiTipoResultado;

	public OfavytTiposAsistencia() {
	}

	public int getOtiCode() {
		return this.otiCode;
	}

	public void setOtiCode(int otiCode) {
		this.otiCode = otiCode;
	}

	public int getOcaCode() {
		return this.ocaCode;
	}

	public void setOcaCode(int ocaCode) {
		this.ocaCode = ocaCode;
	}

	public String getOtiActivo() {
		return this.otiActivo;
	}

	public void setOtiActivo(String otiActivo) {
		this.otiActivo = otiActivo;
	}

	public String getOtiArchivoObligatorio() {
		return this.otiArchivoObligatorio;
	}

	public void setOtiArchivoObligatorio(String otiArchivoObligatorio) {
		this.otiArchivoObligatorio = otiArchivoObligatorio;
	}

	public String getOtiNombre() {
		return this.otiNombre;
	}

	public void setOtiNombre(String otiNombre) {
		this.otiNombre = otiNombre;
	}

	public String getOtiPermiso() {
		return this.otiPermiso;
	}

	public void setOtiPermiso(String otiPermiso) {
		this.otiPermiso = otiPermiso;
	}

	public String getOtiPermiteMedidaProteccion() {
		return this.otiPermiteMedidaProteccion;
	}

	public void setOtiPermiteMedidaProteccion(String otiPermiteMedidaProteccion) {
		this.otiPermiteMedidaProteccion = otiPermiteMedidaProteccion;
	}

	public String getOtiRequiereResultado() {
		return this.otiRequiereResultado;
	}

	public void setOtiRequiereResultado(String otiRequiereResultado) {
		this.otiRequiereResultado = otiRequiereResultado;
	}

	public String getOtiTipoResultado() {
		return this.otiTipoResultado;
	}

	public void setOtiTipoResultado(String otiTipoResultado) {
		this.otiTipoResultado = otiTipoResultado;
	}

}