package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sec_users_subrogancias_historial database table.
 * 
 */
// @Entity
// @Table(name="sec_users_subrogancias_historial")
@NamedQuery(name="SecUsersSubroganciasHistorial.findAll", query="SELECT s FROM SecUsersSubroganciasHistorial s")
public class SecUsersSubroganciasHistorial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="subh_aal_codigo_subrogada")
	private int subhAalCodigoSubrogada;

	@Column(name="subh_code")
	private int subhCode;

	@Column(name="subh_fecha_fin")
	private int subhFechaFin;

	@Column(name="subh_fecha_inicio")
	private int subhFechaInicio;

	@Column(name="subh_use_code_subrogante")
	private int subhUseCodeSubrogante;

	public SecUsersSubroganciasHistorial() {
	}

	public int getSubhAalCodigoSubrogada() {
		return this.subhAalCodigoSubrogada;
	}

	public void setSubhAalCodigoSubrogada(int subhAalCodigoSubrogada) {
		this.subhAalCodigoSubrogada = subhAalCodigoSubrogada;
	}

	public int getSubhCode() {
		return this.subhCode;
	}

	public void setSubhCode(int subhCode) {
		this.subhCode = subhCode;
	}

	public int getSubhFechaFin() {
		return this.subhFechaFin;
	}

	public void setSubhFechaFin(int subhFechaFin) {
		this.subhFechaFin = subhFechaFin;
	}

	public int getSubhFechaInicio() {
		return this.subhFechaInicio;
	}

	public void setSubhFechaInicio(int subhFechaInicio) {
		this.subhFechaInicio = subhFechaInicio;
	}

	public int getSubhUseCodeSubrogante() {
		return this.subhUseCodeSubrogante;
	}

	public void setSubhUseCodeSubrogante(int subhUseCodeSubrogante) {
		this.subhUseCodeSubrogante = subhUseCodeSubrogante;
	}

}