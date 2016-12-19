package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tsj_tipos_contenido database table.
 * 
 */
// @Entity
// @Table(name="tsj_tipos_contenido")
@NamedQuery(name="TsjTiposContenido.findAll", query="SELECT t FROM TsjTiposContenido t")
public class TsjTiposContenido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tco_code")
	private int tcoCode;

	@Column(name="tco_activo")
	private String tcoActivo;

	@Column(name="tco_nombre")
	private String tcoNombre;

	@Column(name="tco_pendiente_control_calidad")
	private String tcoPendienteControlCalidad;

	@Column(name="tco_pendiente_sistematizacion")
	private String tcoPendienteSistematizacion;

	public TsjTiposContenido() {
	}

	public int getTcoCode() {
		return this.tcoCode;
	}

	public void setTcoCode(int tcoCode) {
		this.tcoCode = tcoCode;
	}

	public String getTcoActivo() {
		return this.tcoActivo;
	}

	public void setTcoActivo(String tcoActivo) {
		this.tcoActivo = tcoActivo;
	}

	public String getTcoNombre() {
		return this.tcoNombre;
	}

	public void setTcoNombre(String tcoNombre) {
		this.tcoNombre = tcoNombre;
	}

	public String getTcoPendienteControlCalidad() {
		return this.tcoPendienteControlCalidad;
	}

	public void setTcoPendienteControlCalidad(String tcoPendienteControlCalidad) {
		this.tcoPendienteControlCalidad = tcoPendienteControlCalidad;
	}

	public String getTcoPendienteSistematizacion() {
		return this.tcoPendienteSistematizacion;
	}

	public void setTcoPendienteSistematizacion(String tcoPendienteSistematizacion) {
		this.tcoPendienteSistematizacion = tcoPendienteSistematizacion;
	}

}