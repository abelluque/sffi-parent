package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_documentos_movimientos database table.
 * 
 */
// @Entity
// @Table(name="docum_documentos_movimientos")
@NamedQuery(name="DocumDocumentosMovimiento.findAll", query="SELECT d FROM DocumDocumentosMovimiento d")
public class DocumDocumentosMovimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dmov_code")
	private int dmovCode;

	@Column(name="dmov_destino_tipo")
	private String dmovDestinoTipo;

	@Column(name="dmov_docum_destino")
	private String dmovDocumDestino;

	@Column(name="dmov_docum_origen")
	private String dmovDocumOrigen;

	@Column(name="dmov_estado_destino")
	private String dmovEstadoDestino;

	@Column(name="dmov_estado_origen")
	private String dmovEstadoOrigen;

	@Lob
	@Column(name="dmov_fundamentacion")
	private String dmovFundamentacion;

	@Column(name="dmov_motivo")
	private int dmovMotivo;

	@Column(name="dmov_operador")
	private int dmovOperador;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dmov_tstamp")
	private Date dmovTstamp;

	@Column(name="dmov_ubicacion_destino")
	private int dmovUbicacionDestino;

	@Column(name="dmov_ubicacion_origen")
	private int dmovUbicacionOrigen;

	@Column(name="doc_id")
	private String docId;

	@Column(name="tmov_code")
	private int tmovCode;

	public DocumDocumentosMovimiento() {
	}

	public int getDmovCode() {
		return this.dmovCode;
	}

	public void setDmovCode(int dmovCode) {
		this.dmovCode = dmovCode;
	}

	public String getDmovDestinoTipo() {
		return this.dmovDestinoTipo;
	}

	public void setDmovDestinoTipo(String dmovDestinoTipo) {
		this.dmovDestinoTipo = dmovDestinoTipo;
	}

	public String getDmovDocumDestino() {
		return this.dmovDocumDestino;
	}

	public void setDmovDocumDestino(String dmovDocumDestino) {
		this.dmovDocumDestino = dmovDocumDestino;
	}

	public String getDmovDocumOrigen() {
		return this.dmovDocumOrigen;
	}

	public void setDmovDocumOrigen(String dmovDocumOrigen) {
		this.dmovDocumOrigen = dmovDocumOrigen;
	}

	public String getDmovEstadoDestino() {
		return this.dmovEstadoDestino;
	}

	public void setDmovEstadoDestino(String dmovEstadoDestino) {
		this.dmovEstadoDestino = dmovEstadoDestino;
	}

	public String getDmovEstadoOrigen() {
		return this.dmovEstadoOrigen;
	}

	public void setDmovEstadoOrigen(String dmovEstadoOrigen) {
		this.dmovEstadoOrigen = dmovEstadoOrigen;
	}

	public String getDmovFundamentacion() {
		return this.dmovFundamentacion;
	}

	public void setDmovFundamentacion(String dmovFundamentacion) {
		this.dmovFundamentacion = dmovFundamentacion;
	}

	public int getDmovMotivo() {
		return this.dmovMotivo;
	}

	public void setDmovMotivo(int dmovMotivo) {
		this.dmovMotivo = dmovMotivo;
	}

	public int getDmovOperador() {
		return this.dmovOperador;
	}

	public void setDmovOperador(int dmovOperador) {
		this.dmovOperador = dmovOperador;
	}

	public Date getDmovTstamp() {
		return this.dmovTstamp;
	}

	public void setDmovTstamp(Date dmovTstamp) {
		this.dmovTstamp = dmovTstamp;
	}

	public int getDmovUbicacionDestino() {
		return this.dmovUbicacionDestino;
	}

	public void setDmovUbicacionDestino(int dmovUbicacionDestino) {
		this.dmovUbicacionDestino = dmovUbicacionDestino;
	}

	public int getDmovUbicacionOrigen() {
		return this.dmovUbicacionOrigen;
	}

	public void setDmovUbicacionOrigen(int dmovUbicacionOrigen) {
		this.dmovUbicacionOrigen = dmovUbicacionOrigen;
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public int getTmovCode() {
		return this.tmovCode;
	}

	public void setTmovCode(int tmovCode) {
		this.tmovCode = tmovCode;
	}

}