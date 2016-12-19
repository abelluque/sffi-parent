package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_documentos_faltas_datos database table.
 * 
 */
// @Entity
// @Table(name="docum_documentos_faltas_datos")
@NamedQuery(name="DocumDocumentosFaltasDato.findAll", query="SELECT d FROM DocumDocumentosFaltasDato d")
public class DocumDocumentosFaltasDato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	@Column(name="doc_faltas_anexo_informativo")
	private String docFaltasAnexoInformativo;

	@Column(name="doc_faltas_confirmacion_revision")
	private String docFaltasConfirmacionRevision;

	@Column(name="doc_faltas_edificio_audiencia")
	private String docFaltasEdificioAudiencia;

	@Column(name="doc_faltas_expediente_escaneado")
	private String docFaltasExpedienteEscaneado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="doc_faltas_fecha_audiencia")
	private Date docFaltasFechaAudiencia;

	@Column(name="doc_faltas_intervencion")
	private String docFaltasIntervencion;

	@Column(name="doc_faltas_intervencion_accion")
	private String docFaltasIntervencionAccion;

	@Column(name="doc_faltas_intervencion_accion_proyecto_vista")
	private String docFaltasIntervencionAccionProyectoVista;

	@Column(name="doc_faltas_intervencion_dep_destino")
	private String docFaltasIntervencionDepDestino;

	@Column(name="doc_faltas_juzgado_audiencia")
	private String docFaltasJuzgadoAudiencia;

	@Column(name="doc_faltas_para_firmar_vista")
	private String docFaltasParaFirmarVista;

	@Column(name="doc_faltas_para_revision")
	private String docFaltasParaRevision;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="doc_faltas_para_revision_fecha")
	private Date docFaltasParaRevisionFecha;

	@Column(name="doc_faltas_para_revision_usuario")
	private int docFaltasParaRevisionUsuario;

	@Column(name="doc_faltas_para_revision_vista")
	private String docFaltasParaRevisionVista;

	@Column(name="doc_faltas_vista_firmada")
	private String docFaltasVistaFirmada;

	@Column(name="doc_faltas_vista_firmada_juscaba")
	private String docFaltasVistaFirmadaJuscaba;

	@Column(name="doc_id")
	private String docId;

	public DocumDocumentosFaltasDato() {
	}

	public String getDocFaltasAnexoInformativo() {
		return this.docFaltasAnexoInformativo;
	}

	public void setDocFaltasAnexoInformativo(String docFaltasAnexoInformativo) {
		this.docFaltasAnexoInformativo = docFaltasAnexoInformativo;
	}

	public String getDocFaltasConfirmacionRevision() {
		return this.docFaltasConfirmacionRevision;
	}

	public void setDocFaltasConfirmacionRevision(String docFaltasConfirmacionRevision) {
		this.docFaltasConfirmacionRevision = docFaltasConfirmacionRevision;
	}

	public String getDocFaltasEdificioAudiencia() {
		return this.docFaltasEdificioAudiencia;
	}

	public void setDocFaltasEdificioAudiencia(String docFaltasEdificioAudiencia) {
		this.docFaltasEdificioAudiencia = docFaltasEdificioAudiencia;
	}

	public String getDocFaltasExpedienteEscaneado() {
		return this.docFaltasExpedienteEscaneado;
	}

	public void setDocFaltasExpedienteEscaneado(String docFaltasExpedienteEscaneado) {
		this.docFaltasExpedienteEscaneado = docFaltasExpedienteEscaneado;
	}

	public Date getDocFaltasFechaAudiencia() {
		return this.docFaltasFechaAudiencia;
	}

	public void setDocFaltasFechaAudiencia(Date docFaltasFechaAudiencia) {
		this.docFaltasFechaAudiencia = docFaltasFechaAudiencia;
	}

	public String getDocFaltasIntervencion() {
		return this.docFaltasIntervencion;
	}

	public void setDocFaltasIntervencion(String docFaltasIntervencion) {
		this.docFaltasIntervencion = docFaltasIntervencion;
	}

	public String getDocFaltasIntervencionAccion() {
		return this.docFaltasIntervencionAccion;
	}

	public void setDocFaltasIntervencionAccion(String docFaltasIntervencionAccion) {
		this.docFaltasIntervencionAccion = docFaltasIntervencionAccion;
	}

	public String getDocFaltasIntervencionAccionProyectoVista() {
		return this.docFaltasIntervencionAccionProyectoVista;
	}

	public void setDocFaltasIntervencionAccionProyectoVista(String docFaltasIntervencionAccionProyectoVista) {
		this.docFaltasIntervencionAccionProyectoVista = docFaltasIntervencionAccionProyectoVista;
	}

	public String getDocFaltasIntervencionDepDestino() {
		return this.docFaltasIntervencionDepDestino;
	}

	public void setDocFaltasIntervencionDepDestino(String docFaltasIntervencionDepDestino) {
		this.docFaltasIntervencionDepDestino = docFaltasIntervencionDepDestino;
	}

	public String getDocFaltasJuzgadoAudiencia() {
		return this.docFaltasJuzgadoAudiencia;
	}

	public void setDocFaltasJuzgadoAudiencia(String docFaltasJuzgadoAudiencia) {
		this.docFaltasJuzgadoAudiencia = docFaltasJuzgadoAudiencia;
	}

	public String getDocFaltasParaFirmarVista() {
		return this.docFaltasParaFirmarVista;
	}

	public void setDocFaltasParaFirmarVista(String docFaltasParaFirmarVista) {
		this.docFaltasParaFirmarVista = docFaltasParaFirmarVista;
	}

	public String getDocFaltasParaRevision() {
		return this.docFaltasParaRevision;
	}

	public void setDocFaltasParaRevision(String docFaltasParaRevision) {
		this.docFaltasParaRevision = docFaltasParaRevision;
	}

	public Date getDocFaltasParaRevisionFecha() {
		return this.docFaltasParaRevisionFecha;
	}

	public void setDocFaltasParaRevisionFecha(Date docFaltasParaRevisionFecha) {
		this.docFaltasParaRevisionFecha = docFaltasParaRevisionFecha;
	}

	public int getDocFaltasParaRevisionUsuario() {
		return this.docFaltasParaRevisionUsuario;
	}

	public void setDocFaltasParaRevisionUsuario(int docFaltasParaRevisionUsuario) {
		this.docFaltasParaRevisionUsuario = docFaltasParaRevisionUsuario;
	}

	public String getDocFaltasParaRevisionVista() {
		return this.docFaltasParaRevisionVista;
	}

	public void setDocFaltasParaRevisionVista(String docFaltasParaRevisionVista) {
		this.docFaltasParaRevisionVista = docFaltasParaRevisionVista;
	}

	public String getDocFaltasVistaFirmada() {
		return this.docFaltasVistaFirmada;
	}

	public void setDocFaltasVistaFirmada(String docFaltasVistaFirmada) {
		this.docFaltasVistaFirmada = docFaltasVistaFirmada;
	}

	public String getDocFaltasVistaFirmadaJuscaba() {
		return this.docFaltasVistaFirmadaJuscaba;
	}

	public void setDocFaltasVistaFirmadaJuscaba(String docFaltasVistaFirmadaJuscaba) {
		this.docFaltasVistaFirmadaJuscaba = docFaltasVistaFirmadaJuscaba;
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

}