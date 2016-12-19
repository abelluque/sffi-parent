package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pm_legajos_economicos_tramites database table.
 * 
 */
// @Entity
// @Table(name="pm_legajos_economicos_tramites")
@NamedQuery(name="PmLegajosEconomicosTramite.findAll", query="SELECT p FROM PmLegajosEconomicosTramite p")
public class PmLegajosEconomicosTramite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ptr_code")
	private int ptrCode;

	@Column(name="ptr_asociacion")
	private String ptrAsociacion;

	@Column(name="ptr_autorizacion_laborales")
	private String ptrAutorizacionLaborales;

	@Column(name="ptr_estado")
	private String ptrEstado;

	@Column(name="ptr_nombre")
	private String ptrNombre;

	@Column(name="ptr_otro_familiar")
	private String ptrOtroFamiliar;

	@Column(name="ptr_otro_parentesco")
	private String ptrOtroParentesco;

	@Column(name="ptr_parentesco")
	private String ptrParentesco;

	@Column(name="ptr_parentesco_especial")
	private String ptrParentescoEspecial;

	@Column(name="ptr_requisitos")
	private String ptrRequisitos;

	public PmLegajosEconomicosTramite() {
	}

	public int getPtrCode() {
		return this.ptrCode;
	}

	public void setPtrCode(int ptrCode) {
		this.ptrCode = ptrCode;
	}

	public String getPtrAsociacion() {
		return this.ptrAsociacion;
	}

	public void setPtrAsociacion(String ptrAsociacion) {
		this.ptrAsociacion = ptrAsociacion;
	}

	public String getPtrAutorizacionLaborales() {
		return this.ptrAutorizacionLaborales;
	}

	public void setPtrAutorizacionLaborales(String ptrAutorizacionLaborales) {
		this.ptrAutorizacionLaborales = ptrAutorizacionLaborales;
	}

	public String getPtrEstado() {
		return this.ptrEstado;
	}

	public void setPtrEstado(String ptrEstado) {
		this.ptrEstado = ptrEstado;
	}

	public String getPtrNombre() {
		return this.ptrNombre;
	}

	public void setPtrNombre(String ptrNombre) {
		this.ptrNombre = ptrNombre;
	}

	public String getPtrOtroFamiliar() {
		return this.ptrOtroFamiliar;
	}

	public void setPtrOtroFamiliar(String ptrOtroFamiliar) {
		this.ptrOtroFamiliar = ptrOtroFamiliar;
	}

	public String getPtrOtroParentesco() {
		return this.ptrOtroParentesco;
	}

	public void setPtrOtroParentesco(String ptrOtroParentesco) {
		this.ptrOtroParentesco = ptrOtroParentesco;
	}

	public String getPtrParentesco() {
		return this.ptrParentesco;
	}

	public void setPtrParentesco(String ptrParentesco) {
		this.ptrParentesco = ptrParentesco;
	}

	public String getPtrParentescoEspecial() {
		return this.ptrParentescoEspecial;
	}

	public void setPtrParentescoEspecial(String ptrParentescoEspecial) {
		this.ptrParentescoEspecial = ptrParentescoEspecial;
	}

	public String getPtrRequisitos() {
		return this.ptrRequisitos;
	}

	public void setPtrRequisitos(String ptrRequisitos) {
		this.ptrRequisitos = ptrRequisitos;
	}

}