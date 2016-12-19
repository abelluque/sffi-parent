package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the docum_tipos_adjuntos database table.
 * 
 */
// @Entity
// @Table(name="docum_tipos_adjuntos")
@NamedQuery(name="DocumTiposAdjunto.findAll", query="SELECT d FROM DocumTiposAdjunto d")
public class DocumTiposAdjunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dta_code")
	private int dtaCode;

	@Column(name="dta_activo")
	private String dtaActivo;

	@Column(name="dta_descripcion")
	private String dtaDescripcion;

	@Column(name="dta_nombre")
	private String dtaNombre;

	@Column(name="dta_obligatorio")
	private String dtaObligatorio;

	@Column(name="dta_orden")
	private int dtaOrden;

	@Column(name="dta_para_denuncia")
	private String dtaParaDenuncia;

	@Column(name="dta_persona_oblig")
	private String dtaPersonaOblig;

	public DocumTiposAdjunto() {
	}

	public int getDtaCode() {
		return this.dtaCode;
	}

	public void setDtaCode(int dtaCode) {
		this.dtaCode = dtaCode;
	}

	public String getDtaActivo() {
		return this.dtaActivo;
	}

	public void setDtaActivo(String dtaActivo) {
		this.dtaActivo = dtaActivo;
	}

	public String getDtaDescripcion() {
		return this.dtaDescripcion;
	}

	public void setDtaDescripcion(String dtaDescripcion) {
		this.dtaDescripcion = dtaDescripcion;
	}

	public String getDtaNombre() {
		return this.dtaNombre;
	}

	public void setDtaNombre(String dtaNombre) {
		this.dtaNombre = dtaNombre;
	}

	public String getDtaObligatorio() {
		return this.dtaObligatorio;
	}

	public void setDtaObligatorio(String dtaObligatorio) {
		this.dtaObligatorio = dtaObligatorio;
	}

	public int getDtaOrden() {
		return this.dtaOrden;
	}

	public void setDtaOrden(int dtaOrden) {
		this.dtaOrden = dtaOrden;
	}

	public String getDtaParaDenuncia() {
		return this.dtaParaDenuncia;
	}

	public void setDtaParaDenuncia(String dtaParaDenuncia) {
		this.dtaParaDenuncia = dtaParaDenuncia;
	}

	public String getDtaPersonaOblig() {
		return this.dtaPersonaOblig;
	}

	public void setDtaPersonaOblig(String dtaPersonaOblig) {
		this.dtaPersonaOblig = dtaPersonaOblig;
	}

}