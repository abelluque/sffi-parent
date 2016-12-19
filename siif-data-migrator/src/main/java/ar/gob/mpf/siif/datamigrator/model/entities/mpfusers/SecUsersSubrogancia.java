package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sec_users_subrogancias database table.
 * 
 */
// @Entity
// @Table(name="sec_users_subrogancias")
@NamedQuery(name="SecUsersSubrogancia.findAll", query="SELECT s FROM SecUsersSubrogancia s")
public class SecUsersSubrogancia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sub_code")
	private int subCode;

	@Column(name="sub_aal_codigo_operador")
	private int subAalCodigoOperador;

	@Column(name="sub_aal_codigo_subrogada")
	private int subAalCodigoSubrogada;

	@Column(name="sub_aal_codigo_subrogante")
	private int subAalCodigoSubrogante;

	@Column(name="sub_estado")
	private String subEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sub_fecha")
	private Date subFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sub_fecha_fin")
	private Date subFechaFin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sub_fecha_inicio")
	private Date subFechaInicio;

	@Column(name="sub_motivo")
	private String subMotivo;

	@Column(name="sub_use_code_operador")
	private int subUseCodeOperador;

	@Column(name="sub_use_code_subrogada")
	private String subUseCodeSubrogada;

	@Column(name="sub_use_code_subrogante")
	private int subUseCodeSubrogante;

	public SecUsersSubrogancia() {
	}

	public int getSubCode() {
		return this.subCode;
	}

	public void setSubCode(int subCode) {
		this.subCode = subCode;
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

	public String getSubEstado() {
		return this.subEstado;
	}

	public void setSubEstado(String subEstado) {
		this.subEstado = subEstado;
	}

	public Date getSubFecha() {
		return this.subFecha;
	}

	public void setSubFecha(Date subFecha) {
		this.subFecha = subFecha;
	}

	public Date getSubFechaFin() {
		return this.subFechaFin;
	}

	public void setSubFechaFin(Date subFechaFin) {
		this.subFechaFin = subFechaFin;
	}

	public Date getSubFechaInicio() {
		return this.subFechaInicio;
	}

	public void setSubFechaInicio(Date subFechaInicio) {
		this.subFechaInicio = subFechaInicio;
	}

	public String getSubMotivo() {
		return this.subMotivo;
	}

	public void setSubMotivo(String subMotivo) {
		this.subMotivo = subMotivo;
	}

	public int getSubUseCodeOperador() {
		return this.subUseCodeOperador;
	}

	public void setSubUseCodeOperador(int subUseCodeOperador) {
		this.subUseCodeOperador = subUseCodeOperador;
	}

	public String getSubUseCodeSubrogada() {
		return this.subUseCodeSubrogada;
	}

	public void setSubUseCodeSubrogada(String subUseCodeSubrogada) {
		this.subUseCodeSubrogada = subUseCodeSubrogada;
	}

	public int getSubUseCodeSubrogante() {
		return this.subUseCodeSubrogante;
	}

	public void setSubUseCodeSubrogante(int subUseCodeSubrogante) {
		this.subUseCodeSubrogante = subUseCodeSubrogante;
	}

}