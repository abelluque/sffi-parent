package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the uit_parametros_clasificacion_valores database table.
 * 
 */
// @Entity
// @Table(name="uit_parametros_clasificacion_valores")
@NamedQuery(name="UitParametrosClasificacionValore.findAll", query="SELECT u FROM UitParametrosClasificacionValore u")
public class UitParametrosClasificacionValore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="upcv_code")
	private int upcvCode;

	@Column(name="upc_clave")
	private String upcClave;

	@Column(name="upcv_aal_codigo")
	private int upcvAalCodigo;

	@Lob
	@Column(name="upcv_descripcion")
	private String upcvDescripcion;

	@Column(name="upcv_desm_code")
	private String upcvDesmCode;

	@Column(name="upcv_dest_code")
	private int upcvDestCode;

	@Column(name="upcv_estado")
	private String upcvEstado;

	public UitParametrosClasificacionValore() {
	}

	public int getUpcvCode() {
		return this.upcvCode;
	}

	public void setUpcvCode(int upcvCode) {
		this.upcvCode = upcvCode;
	}

	public String getUpcClave() {
		return this.upcClave;
	}

	public void setUpcClave(String upcClave) {
		this.upcClave = upcClave;
	}

	public int getUpcvAalCodigo() {
		return this.upcvAalCodigo;
	}

	public void setUpcvAalCodigo(int upcvAalCodigo) {
		this.upcvAalCodigo = upcvAalCodigo;
	}

	public String getUpcvDescripcion() {
		return this.upcvDescripcion;
	}

	public void setUpcvDescripcion(String upcvDescripcion) {
		this.upcvDescripcion = upcvDescripcion;
	}

	public String getUpcvDesmCode() {
		return this.upcvDesmCode;
	}

	public void setUpcvDesmCode(String upcvDesmCode) {
		this.upcvDesmCode = upcvDesmCode;
	}

	public int getUpcvDestCode() {
		return this.upcvDestCode;
	}

	public void setUpcvDestCode(int upcvDestCode) {
		this.upcvDestCode = upcvDestCode;
	}

	public String getUpcvEstado() {
		return this.upcvEstado;
	}

	public void setUpcvEstado(String upcvEstado) {
		this.upcvEstado = upcvEstado;
	}

}