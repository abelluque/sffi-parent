package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sec_users_subrogancias_historial database table.
 * 
 */
// @Entity
// @Table(name="sec_users_subrogancias_historial")
@NamedQuery(name="SecUsersSubroganciasHistorial.findAll", query="SELECT s FROM SecUsersSubroganciasHistorial s")
public class SecUsersSubroganciasHistorial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="subh_code")
	private int subhCode;

	@Column(name="subh_aal_codigo_subrogada")
	private int subhAalCodigoSubrogada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="subh_fecha_fin")
	private Date subhFechaFin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="subh_fecha_inicio")
	private Date subhFechaInicio;

	@Column(name="subh_use_code_subrogante")
	private int subhUseCodeSubrogante;

	public SecUsersSubroganciasHistorial() {
	}

	public int getSubhCode() {
		return this.subhCode;
	}

	public void setSubhCode(int subhCode) {
		this.subhCode = subhCode;
	}

	public int getSubhAalCodigoSubrogada() {
		return this.subhAalCodigoSubrogada;
	}

	public void setSubhAalCodigoSubrogada(int subhAalCodigoSubrogada) {
		this.subhAalCodigoSubrogada = subhAalCodigoSubrogada;
	}

	public Date getSubhFechaFin() {
		return this.subhFechaFin;
	}

	public void setSubhFechaFin(Date subhFechaFin) {
		this.subhFechaFin = subhFechaFin;
	}

	public Date getSubhFechaInicio() {
		return this.subhFechaInicio;
	}

	public void setSubhFechaInicio(Date subhFechaInicio) {
		this.subhFechaInicio = subhFechaInicio;
	}

	public int getSubhUseCodeSubrogante() {
		return this.subhUseCodeSubrogante;
	}

	public void setSubhUseCodeSubrogante(int subhUseCodeSubrogante) {
		this.subhUseCodeSubrogante = subhUseCodeSubrogante;
	}

}