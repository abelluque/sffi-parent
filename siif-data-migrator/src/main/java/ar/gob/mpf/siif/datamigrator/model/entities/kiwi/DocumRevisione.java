package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_revisiones database table.
 * 
 */
// @Entity
// @Table(name="docum_revisiones")
@NamedQuery(name="DocumRevisione.findAll", query="SELECT d FROM DocumRevisione d")
public class DocumRevisione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dre_code")
	private int dreCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="desm_code")
	private int desmCode;

	@Column(name="doc_code")
	private int docCode;

	@Column(name="doc_id")
	private String docId;

	@Lob
	@Column(name="dre_data_intervencion")
	private String dreDataIntervencion;

	@Column(name="dre_estado")
	private String dreEstado;

	@Column(name="dre_estado_intervencion")
	private String dreEstadoIntervencion;

	@Lob
	@Column(name="dre_etiquetas")
	private String dreEtiquetas;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dre_fechahora_intervencion")
	private Date dreFechahoraIntervencion;

	@Lob
	@Column(name="dre_manifesto")
	private String dreManifesto;

	@Lob
	@Column(name="dre_pruebas")
	private String drePruebas;

	@Column(name="dre_reservada")
	private String dreReservada;

	@Column(name="dre_rol_solicitante")
	private String dreRolSolicitante;

	@Lob
	@Column(name="dre_texto_dictamen")
	private String dreTextoDictamen;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dre_tstamp")
	private Date dreTstamp;

	@Column(name="dre_usecode_intervencion")
	private int dreUsecodeIntervencion;

	@Column(name="dtip_code")
	private String dtipCode;

	@Column(name="per_code")
	private int perCode;

	@Column(name="use_code")
	private String useCode;

	public DocumRevisione() {
	}

	public int getDreCode() {
		return this.dreCode;
	}

	public void setDreCode(int dreCode) {
		this.dreCode = dreCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getDesmCode() {
		return this.desmCode;
	}

	public void setDesmCode(int desmCode) {
		this.desmCode = desmCode;
	}

	public int getDocCode() {
		return this.docCode;
	}

	public void setDocCode(int docCode) {
		this.docCode = docCode;
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getDreDataIntervencion() {
		return this.dreDataIntervencion;
	}

	public void setDreDataIntervencion(String dreDataIntervencion) {
		this.dreDataIntervencion = dreDataIntervencion;
	}

	public String getDreEstado() {
		return this.dreEstado;
	}

	public void setDreEstado(String dreEstado) {
		this.dreEstado = dreEstado;
	}

	public String getDreEstadoIntervencion() {
		return this.dreEstadoIntervencion;
	}

	public void setDreEstadoIntervencion(String dreEstadoIntervencion) {
		this.dreEstadoIntervencion = dreEstadoIntervencion;
	}

	public String getDreEtiquetas() {
		return this.dreEtiquetas;
	}

	public void setDreEtiquetas(String dreEtiquetas) {
		this.dreEtiquetas = dreEtiquetas;
	}

	public Date getDreFechahoraIntervencion() {
		return this.dreFechahoraIntervencion;
	}

	public void setDreFechahoraIntervencion(Date dreFechahoraIntervencion) {
		this.dreFechahoraIntervencion = dreFechahoraIntervencion;
	}

	public String getDreManifesto() {
		return this.dreManifesto;
	}

	public void setDreManifesto(String dreManifesto) {
		this.dreManifesto = dreManifesto;
	}

	public String getDrePruebas() {
		return this.drePruebas;
	}

	public void setDrePruebas(String drePruebas) {
		this.drePruebas = drePruebas;
	}

	public String getDreReservada() {
		return this.dreReservada;
	}

	public void setDreReservada(String dreReservada) {
		this.dreReservada = dreReservada;
	}

	public String getDreRolSolicitante() {
		return this.dreRolSolicitante;
	}

	public void setDreRolSolicitante(String dreRolSolicitante) {
		this.dreRolSolicitante = dreRolSolicitante;
	}

	public String getDreTextoDictamen() {
		return this.dreTextoDictamen;
	}

	public void setDreTextoDictamen(String dreTextoDictamen) {
		this.dreTextoDictamen = dreTextoDictamen;
	}

	public Date getDreTstamp() {
		return this.dreTstamp;
	}

	public void setDreTstamp(Date dreTstamp) {
		this.dreTstamp = dreTstamp;
	}

	public int getDreUsecodeIntervencion() {
		return this.dreUsecodeIntervencion;
	}

	public void setDreUsecodeIntervencion(int dreUsecodeIntervencion) {
		this.dreUsecodeIntervencion = dreUsecodeIntervencion;
	}

	public String getDtipCode() {
		return this.dtipCode;
	}

	public void setDtipCode(String dtipCode) {
		this.dtipCode = dtipCode;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}