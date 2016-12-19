package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the for_cursos database table.
 * 
 */
// @Entity
// @Table(name="for_cursos")
@NamedQuery(name="ForCurso.findAll", query="SELECT f FROM ForCurso f")
public class ForCurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="fcu_code")
	private int fcuCode;

	@Column(name="fcu_agrupamiento")
	private String fcuAgrupamiento;

	@Column(name="fcu_detalle")
	private String fcuDetalle;

	@Column(name="fcu_direccion")
	private String fcuDireccion;

	@Column(name="fcu_estado")
	private String fcuEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fcu_fecha_hora_inicio")
	private Date fcuFechaHoraInicio;

	@Column(name="fcu_modalidad")
	private String fcuModalidad;

	@Column(name="fcu_nombre_curso")
	private String fcuNombreCurso;

	@Column(name="fcu_tipo_dependencia")
	private String fcuTipoDependencia;

	public ForCurso() {
	}

	public int getFcuCode() {
		return this.fcuCode;
	}

	public void setFcuCode(int fcuCode) {
		this.fcuCode = fcuCode;
	}

	public String getFcuAgrupamiento() {
		return this.fcuAgrupamiento;
	}

	public void setFcuAgrupamiento(String fcuAgrupamiento) {
		this.fcuAgrupamiento = fcuAgrupamiento;
	}

	public String getFcuDetalle() {
		return this.fcuDetalle;
	}

	public void setFcuDetalle(String fcuDetalle) {
		this.fcuDetalle = fcuDetalle;
	}

	public String getFcuDireccion() {
		return this.fcuDireccion;
	}

	public void setFcuDireccion(String fcuDireccion) {
		this.fcuDireccion = fcuDireccion;
	}

	public String getFcuEstado() {
		return this.fcuEstado;
	}

	public void setFcuEstado(String fcuEstado) {
		this.fcuEstado = fcuEstado;
	}

	public Date getFcuFechaHoraInicio() {
		return this.fcuFechaHoraInicio;
	}

	public void setFcuFechaHoraInicio(Date fcuFechaHoraInicio) {
		this.fcuFechaHoraInicio = fcuFechaHoraInicio;
	}

	public String getFcuModalidad() {
		return this.fcuModalidad;
	}

	public void setFcuModalidad(String fcuModalidad) {
		this.fcuModalidad = fcuModalidad;
	}

	public String getFcuNombreCurso() {
		return this.fcuNombreCurso;
	}

	public void setFcuNombreCurso(String fcuNombreCurso) {
		this.fcuNombreCurso = fcuNombreCurso;
	}

	public String getFcuTipoDependencia() {
		return this.fcuTipoDependencia;
	}

	public void setFcuTipoDependencia(String fcuTipoDependencia) {
		this.fcuTipoDependencia = fcuTipoDependencia;
	}

}