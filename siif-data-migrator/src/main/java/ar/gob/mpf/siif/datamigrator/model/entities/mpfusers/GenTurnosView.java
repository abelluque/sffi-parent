package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the gen_turnos_view database table.
 * 
 */
// @Entity
// @Table(name="gen_turnos_view")
@NamedQuery(name="GenTurnosView.findAll", query="SELECT g FROM GenTurnosView g")
public class GenTurnosView implements Serializable {
	private static final long serialVersionUID = 1L;

	private int anio;

	private String comisarias;

	private String defensor;

	@Column(name="defensoria_direccion")
	private String defensoriaDireccion;

	@Column(name="defensoria_id")
	private String defensoriaId;

	@Column(name="defensoria_tel")
	private String defensoriaTel;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_desde")
	private Date fechaDesde;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_hasta")
	private Date fechaHasta;

	private String fiscal;

	@Column(name="fiscal_cel")
	private String fiscalCel;

	@Column(name="fiscalia_id")
	private int fiscaliaId;

	@Column(name="fiscalia_sec")
	private String fiscaliaSec;

	@Column(name="fiscalia_sec_cel")
	private String fiscaliaSecCel;

	private String juez;

	@Column(name="juzgado_direccion")
	private String juzgadoDireccion;

	@Column(name="juzgado_id")
	private String juzgadoId;

	@Column(name="juzgado_sec")
	private String juzgadoSec;

	@Column(name="juzgado_sec_tel")
	private String juzgadoSecTel;

	@Column(name="juzgado_tel")
	private String juzgadoTel;

	private int mes;

	private String zona;

	public GenTurnosView() {
	}

	public int getAnio() {
		return this.anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getComisarias() {
		return this.comisarias;
	}

	public void setComisarias(String comisarias) {
		this.comisarias = comisarias;
	}

	public String getDefensor() {
		return this.defensor;
	}

	public void setDefensor(String defensor) {
		this.defensor = defensor;
	}

	public String getDefensoriaDireccion() {
		return this.defensoriaDireccion;
	}

	public void setDefensoriaDireccion(String defensoriaDireccion) {
		this.defensoriaDireccion = defensoriaDireccion;
	}

	public String getDefensoriaId() {
		return this.defensoriaId;
	}

	public void setDefensoriaId(String defensoriaId) {
		this.defensoriaId = defensoriaId;
	}

	public String getDefensoriaTel() {
		return this.defensoriaTel;
	}

	public void setDefensoriaTel(String defensoriaTel) {
		this.defensoriaTel = defensoriaTel;
	}

	public Date getFechaDesde() {
		return this.fechaDesde;
	}

	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public Date getFechaHasta() {
		return this.fechaHasta;
	}

	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	public String getFiscal() {
		return this.fiscal;
	}

	public void setFiscal(String fiscal) {
		this.fiscal = fiscal;
	}

	public String getFiscalCel() {
		return this.fiscalCel;
	}

	public void setFiscalCel(String fiscalCel) {
		this.fiscalCel = fiscalCel;
	}

	public int getFiscaliaId() {
		return this.fiscaliaId;
	}

	public void setFiscaliaId(int fiscaliaId) {
		this.fiscaliaId = fiscaliaId;
	}

	public String getFiscaliaSec() {
		return this.fiscaliaSec;
	}

	public void setFiscaliaSec(String fiscaliaSec) {
		this.fiscaliaSec = fiscaliaSec;
	}

	public String getFiscaliaSecCel() {
		return this.fiscaliaSecCel;
	}

	public void setFiscaliaSecCel(String fiscaliaSecCel) {
		this.fiscaliaSecCel = fiscaliaSecCel;
	}

	public String getJuez() {
		return this.juez;
	}

	public void setJuez(String juez) {
		this.juez = juez;
	}

	public String getJuzgadoDireccion() {
		return this.juzgadoDireccion;
	}

	public void setJuzgadoDireccion(String juzgadoDireccion) {
		this.juzgadoDireccion = juzgadoDireccion;
	}

	public String getJuzgadoId() {
		return this.juzgadoId;
	}

	public void setJuzgadoId(String juzgadoId) {
		this.juzgadoId = juzgadoId;
	}

	public String getJuzgadoSec() {
		return this.juzgadoSec;
	}

	public void setJuzgadoSec(String juzgadoSec) {
		this.juzgadoSec = juzgadoSec;
	}

	public String getJuzgadoSecTel() {
		return this.juzgadoSecTel;
	}

	public void setJuzgadoSecTel(String juzgadoSecTel) {
		this.juzgadoSecTel = juzgadoSecTel;
	}

	public String getJuzgadoTel() {
		return this.juzgadoTel;
	}

	public void setJuzgadoTel(String juzgadoTel) {
		this.juzgadoTel = juzgadoTel;
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String getZona() {
		return this.zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

}