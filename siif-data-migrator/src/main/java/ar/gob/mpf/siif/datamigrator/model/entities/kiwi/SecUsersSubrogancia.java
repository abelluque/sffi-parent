package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sec_users_subrogancias database table.
 * 
 */
// @Entity
// @Table(name="sec_users_subrogancias")
@NamedQuery(name="SecUsersSubrogancia.findAll", query="SELECT s FROM SecUsersSubrogancia s")
public class SecUsersSubrogancia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="sub_aal_codigo_operador")
	private int subAalCodigoOperador;

	@Column(name="sub_aal_codigo_subrogada")
	private int subAalCodigoSubrogada;

	@Column(name="sub_aal_codigo_subrogante")
	private int subAalCodigoSubrogante;

	@Column(name="sub_code")
	private int subCode;

	@Column(name="sub_estado")
	private int subEstado;

	@Column(name="sub_fecha")
	private int subFecha;

	@Column(name="sub_fecha_fin")
	private int subFechaFin;

	@Column(name="sub_fecha_inicio")
	private int subFechaInicio;

	@Column(name="sub_motivo")
	private int subMotivo;

	@Column(name="sub_use_code_operador")
	private int subUseCodeOperador;

	@Column(name="sub_use_code_subrogada")
	private int subUseCodeSubrogada;

	@Column(name="sub_use_code_subrogante")
	private int subUseCodeSubrogante;

	public SecUsersSubrogancia() {
	}

	public int getSubAalCodigoOperador() {
		return this.subAalCodigoOperador;
	}

	public void setSubAalCodigoOperador(int subAalCodigoOperador) {
		this.subAalCodigoOperador = subAalCodigoOperador;
	}

	public int getSubAalCodigoSubrogada() {
		return this.subAalCodigoSubrogada;
	}

	public void setSubAalCodigoSubrogada(int subAalCodigoSubrogada) {
		this.subAalCodigoSubrogada = subAalCodigoSubrogada;
	}

	public int getSubAalCodigoSubrogante() {
		return this.subAalCodigoSubrogante;
	}

	public void setSubAalCodigoSubrogante(int subAalCodigoSubrogante) {
		this.subAalCodigoSubrogante = subAalCodigoSubrogante;
	}

	public int getSubCode() {
		return this.subCode;
	}

	public void setSubCode(int subCode) {
		this.subCode = subCode;
	}

	public int getSubEstado() {
		return this.subEstado;
	}

	public void setSubEstado(int subEstado) {
		this.subEstado = subEstado;
	}

	public int getSubFecha() {
		return this.subFecha;
	}

	public void setSubFecha(int subFecha) {
		this.subFecha = subFecha;
	}

	public int getSubFechaFin() {
		return this.subFechaFin;
	}

	public void setSubFechaFin(int subFechaFin) {
		this.subFechaFin = subFechaFin;
	}

	public int getSubFechaInicio() {
		return this.subFechaInicio;
	}

	public void setSubFechaInicio(int subFechaInicio) {
		this.subFechaInicio = subFechaInicio;
	}

	public int getSubMotivo() {
		return this.subMotivo;
	}

	public void setSubMotivo(int subMotivo) {
		this.subMotivo = subMotivo;
	}

	public int getSubUseCodeOperador() {
		return this.subUseCodeOperador;
	}

	public void setSubUseCodeOperador(int subUseCodeOperador) {
		this.subUseCodeOperador = subUseCodeOperador;
	}

	public int getSubUseCodeSubrogada() {
		return this.subUseCodeSubrogada;
	}

	public void setSubUseCodeSubrogada(int subUseCodeSubrogada) {
		this.subUseCodeSubrogada = subUseCodeSubrogada;
	}

	public int getSubUseCodeSubrogante() {
		return this.subUseCodeSubrogante;
	}

	public void setSubUseCodeSubrogante(int subUseCodeSubrogante) {
		this.subUseCodeSubrogante = subUseCodeSubrogante;
	}

}