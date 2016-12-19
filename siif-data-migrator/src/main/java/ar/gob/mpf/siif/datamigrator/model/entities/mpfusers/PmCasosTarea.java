package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pm_casos_tareas database table.
 * 
 */
// @Entity
// @Table(name="pm_casos_tareas")
@NamedQuery(name="PmCasosTarea.findAll", query="SELECT p FROM PmCasosTarea p")
public class PmCasosTarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codigo;

	@Column(name="campo_caratula")
	private String campoCaratula;

	@Column(name="campo_codigo")
	private String campoCodigo;

	@Column(name="campo_fecha")
	private String campoFecha;

	private String descripcion;

	@Column(name="nombre_tabla")
	private String nombreTabla;

	private String proceso;

	@Column(name="proceso_uid")
	private String procesoUid;

	@Column(name="sigla_nueva")
	private String siglaNueva;

	private String tarea;

	@Column(name="tarea_historial_uid")
	private String tareaHistorialUid;

	@Column(name="tarea_uid")
	private String tareaUid;

	@Column(name="url_link")
	private String urlLink;

	public PmCasosTarea() {
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCampoCaratula() {
		return this.campoCaratula;
	}

	public void setCampoCaratula(String campoCaratula) {
		this.campoCaratula = campoCaratula;
	}

	public String getCampoCodigo() {
		return this.campoCodigo;
	}

	public void setCampoCodigo(String campoCodigo) {
		this.campoCodigo = campoCodigo;
	}

	public String getCampoFecha() {
		return this.campoFecha;
	}

	public void setCampoFecha(String campoFecha) {
		this.campoFecha = campoFecha;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombreTabla() {
		return this.nombreTabla;
	}

	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
	}

	public String getProceso() {
		return this.proceso;
	}

	public void setProceso(String proceso) {
		this.proceso = proceso;
	}

	public String getProcesoUid() {
		return this.procesoUid;
	}

	public void setProcesoUid(String procesoUid) {
		this.procesoUid = procesoUid;
	}

	public String getSiglaNueva() {
		return this.siglaNueva;
	}

	public void setSiglaNueva(String siglaNueva) {
		this.siglaNueva = siglaNueva;
	}

	public String getTarea() {
		return this.tarea;
	}

	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

	public String getTareaHistorialUid() {
		return this.tareaHistorialUid;
	}

	public void setTareaHistorialUid(String tareaHistorialUid) {
		this.tareaHistorialUid = tareaHistorialUid;
	}

	public String getTareaUid() {
		return this.tareaUid;
	}

	public void setTareaUid(String tareaUid) {
		this.tareaUid = tareaUid;
	}

	public String getUrlLink() {
		return this.urlLink;
	}

	public void setUrlLink(String urlLink) {
		this.urlLink = urlLink;
	}

}