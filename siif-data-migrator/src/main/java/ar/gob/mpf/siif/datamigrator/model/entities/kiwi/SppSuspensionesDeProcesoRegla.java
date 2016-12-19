package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the spp_suspensiones_de_proceso_reglas database table.
 * 
 */
// @Entity
// @Table(name="spp_suspensiones_de_proceso_reglas")
@NamedQuery(name="SppSuspensionesDeProcesoRegla.findAll", query="SELECT s FROM SppSuspensionesDeProcesoRegla s")
public class SppSuspensionesDeProcesoRegla implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="spr_code")
	private int sprCode;

	@Column(name="sin_code")
	private int sinCode;

	@Column(name="spr_cumplimiento")
	private String sprCumplimiento;

	@Column(name="spr_cumplimiento_juzgado")
	private String sprCumplimientoJuzgado;

	@Column(name="spr_detalle")
	private String sprDetalle;

	@Column(name="spr_estado")
	private String sprEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="spr_fecha_alta")
	private Date sprFechaAlta;

	@Column(name="spr_institucion_a_designar")
	private String sprInstitucionADesignar;

	@Column(name="spr_observaciones")
	private String sprObservaciones;

	@Column(name="spr_prorrogada")
	private String sprProrrogada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="spr_tstamp")
	private Date sprTstamp;

	@Column(name="spr_unidad_de_medida")
	private String sprUnidadDeMedida;

	@Column(name="spr_valor")
	private int sprValor;

	@Column(name="spr_valor_a_determinar")
	private String sprValorADeterminar;

	@Column(name="src_code")
	private int srcCode;

	@Column(name="ssp_code")
	private int sspCode;

	@Column(name="str_code")
	private int strCode;

	@Column(name="use_code")
	private String useCode;

	public SppSuspensionesDeProcesoRegla() {
	}

	public int getSprCode() {
		return this.sprCode;
	}

	public void setSprCode(int sprCode) {
		this.sprCode = sprCode;
	}

	public int getSinCode() {
		return this.sinCode;
	}

	public void setSinCode(int sinCode) {
		this.sinCode = sinCode;
	}

	public String getSprCumplimiento() {
		return this.sprCumplimiento;
	}

	public void setSprCumplimiento(String sprCumplimiento) {
		this.sprCumplimiento = sprCumplimiento;
	}

	public String getSprCumplimientoJuzgado() {
		return this.sprCumplimientoJuzgado;
	}

	public void setSprCumplimientoJuzgado(String sprCumplimientoJuzgado) {
		this.sprCumplimientoJuzgado = sprCumplimientoJuzgado;
	}

	public String getSprDetalle() {
		return this.sprDetalle;
	}

	public void setSprDetalle(String sprDetalle) {
		this.sprDetalle = sprDetalle;
	}

	public String getSprEstado() {
		return this.sprEstado;
	}

	public void setSprEstado(String sprEstado) {
		this.sprEstado = sprEstado;
	}

	public Date getSprFechaAlta() {
		return this.sprFechaAlta;
	}

	public void setSprFechaAlta(Date sprFechaAlta) {
		this.sprFechaAlta = sprFechaAlta;
	}

	public String getSprInstitucionADesignar() {
		return this.sprInstitucionADesignar;
	}

	public void setSprInstitucionADesignar(String sprInstitucionADesignar) {
		this.sprInstitucionADesignar = sprInstitucionADesignar;
	}

	public String getSprObservaciones() {
		return this.sprObservaciones;
	}

	public void setSprObservaciones(String sprObservaciones) {
		this.sprObservaciones = sprObservaciones;
	}

	public String getSprProrrogada() {
		return this.sprProrrogada;
	}

	public void setSprProrrogada(String sprProrrogada) {
		this.sprProrrogada = sprProrrogada;
	}

	public Date getSprTstamp() {
		return this.sprTstamp;
	}

	public void setSprTstamp(Date sprTstamp) {
		this.sprTstamp = sprTstamp;
	}

	public String getSprUnidadDeMedida() {
		return this.sprUnidadDeMedida;
	}

	public void setSprUnidadDeMedida(String sprUnidadDeMedida) {
		this.sprUnidadDeMedida = sprUnidadDeMedida;
	}

	public int getSprValor() {
		return this.sprValor;
	}

	public void setSprValor(int sprValor) {
		this.sprValor = sprValor;
	}

	public String getSprValorADeterminar() {
		return this.sprValorADeterminar;
	}

	public void setSprValorADeterminar(String sprValorADeterminar) {
		this.sprValorADeterminar = sprValorADeterminar;
	}

	public int getSrcCode() {
		return this.srcCode;
	}

	public void setSrcCode(int srcCode) {
		this.srcCode = srcCode;
	}

	public int getSspCode() {
		return this.sspCode;
	}

	public void setSspCode(int sspCode) {
		this.sspCode = sspCode;
	}

	public int getStrCode() {
		return this.strCode;
	}

	public void setStrCode(int strCode) {
		this.strCode = strCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}