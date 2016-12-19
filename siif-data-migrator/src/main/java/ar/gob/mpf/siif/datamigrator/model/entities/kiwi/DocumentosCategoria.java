package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the documentos_categorias database table.
 * 
 */
// @Entity
// @Table(name="documentos_categorias")
@NamedQuery(name="DocumentosCategoria.findAll", query="SELECT d FROM DocumentosCategoria d")
public class DocumentosCategoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dc_nombre")
	private String dcNombre;

	@Column(name="dc_agregado_manual")
	private String dcAgregadoManual;

	@Column(name="dc_ayuda")
	private String dcAyuda;

	@Column(name="dc_borrado_manual")
	private String dcBorradoManual;

	@Column(name="dc_descripcion")
	private String dcDescripcion;

	@Column(name="dc_descripcion_automatico")
	private String dcDescripcionAutomatico;

	@Column(name="dc_descripcion_propuesta")
	private String dcDescripcionPropuesta;

	@Column(name="dc_estado")
	private String dcEstado;

	@Column(name="dc_evaluacion_automatico")
	private String dcEvaluacionAutomatico;

	@Column(name="dc_evaluacion_propuesta")
	private String dcEvaluacionPropuesta;

	@Column(name="dc_script_automatico")
	private String dcScriptAutomatico;

	@Column(name="dc_script_propuesta")
	private String dcScriptPropuesta;

	public DocumentosCategoria() {
	}

	public String getDcNombre() {
		return this.dcNombre;
	}

	public void setDcNombre(String dcNombre) {
		this.dcNombre = dcNombre;
	}

	public String getDcAgregadoManual() {
		return this.dcAgregadoManual;
	}

	public void setDcAgregadoManual(String dcAgregadoManual) {
		this.dcAgregadoManual = dcAgregadoManual;
	}

	public String getDcAyuda() {
		return this.dcAyuda;
	}

	public void setDcAyuda(String dcAyuda) {
		this.dcAyuda = dcAyuda;
	}

	public String getDcBorradoManual() {
		return this.dcBorradoManual;
	}

	public void setDcBorradoManual(String dcBorradoManual) {
		this.dcBorradoManual = dcBorradoManual;
	}

	public String getDcDescripcion() {
		return this.dcDescripcion;
	}

	public void setDcDescripcion(String dcDescripcion) {
		this.dcDescripcion = dcDescripcion;
	}

	public String getDcDescripcionAutomatico() {
		return this.dcDescripcionAutomatico;
	}

	public void setDcDescripcionAutomatico(String dcDescripcionAutomatico) {
		this.dcDescripcionAutomatico = dcDescripcionAutomatico;
	}

	public String getDcDescripcionPropuesta() {
		return this.dcDescripcionPropuesta;
	}

	public void setDcDescripcionPropuesta(String dcDescripcionPropuesta) {
		this.dcDescripcionPropuesta = dcDescripcionPropuesta;
	}

	public String getDcEstado() {
		return this.dcEstado;
	}

	public void setDcEstado(String dcEstado) {
		this.dcEstado = dcEstado;
	}

	public String getDcEvaluacionAutomatico() {
		return this.dcEvaluacionAutomatico;
	}

	public void setDcEvaluacionAutomatico(String dcEvaluacionAutomatico) {
		this.dcEvaluacionAutomatico = dcEvaluacionAutomatico;
	}

	public String getDcEvaluacionPropuesta() {
		return this.dcEvaluacionPropuesta;
	}

	public void setDcEvaluacionPropuesta(String dcEvaluacionPropuesta) {
		this.dcEvaluacionPropuesta = dcEvaluacionPropuesta;
	}

	public String getDcScriptAutomatico() {
		return this.dcScriptAutomatico;
	}

	public void setDcScriptAutomatico(String dcScriptAutomatico) {
		this.dcScriptAutomatico = dcScriptAutomatico;
	}

	public String getDcScriptPropuesta() {
		return this.dcScriptPropuesta;
	}

	public void setDcScriptPropuesta(String dcScriptPropuesta) {
		this.dcScriptPropuesta = dcScriptPropuesta;
	}

}