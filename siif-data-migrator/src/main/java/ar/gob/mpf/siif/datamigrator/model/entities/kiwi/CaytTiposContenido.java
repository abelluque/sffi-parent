package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cayt_tipos_contenidos database table.
 * 
 */
// @Entity
// @Table(name="cayt_tipos_contenidos")
@NamedQuery(name="CaytTiposContenido.findAll", query="SELECT c FROM CaytTiposContenido c")
public class CaytTiposContenido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tin_code")
	private int tinCode;

	@Column(name="tin_activo")
	private String tinActivo;

	@Column(name="tin_nombre")
	private String tinNombre;

	@Column(name="tin_pendiente_sistematizacion")
	private String tinPendienteSistematizacion;

	public CaytTiposContenido() {
	}

	public int getTinCode() {
		return this.tinCode;
	}

	public void setTinCode(int tinCode) {
		this.tinCode = tinCode;
	}

	public String getTinActivo() {
		return this.tinActivo;
	}

	public void setTinActivo(String tinActivo) {
		this.tinActivo = tinActivo;
	}

	public String getTinNombre() {
		return this.tinNombre;
	}

	public void setTinNombre(String tinNombre) {
		this.tinNombre = tinNombre;
	}

	public String getTinPendienteSistematizacion() {
		return this.tinPendienteSistematizacion;
	}

	public void setTinPendienteSistematizacion(String tinPendienteSistematizacion) {
		this.tinPendienteSistematizacion = tinPendienteSistematizacion;
	}

}