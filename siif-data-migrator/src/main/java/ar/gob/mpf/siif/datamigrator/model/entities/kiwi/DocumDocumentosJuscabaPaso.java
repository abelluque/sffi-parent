package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_documentos_juscaba_pasos database table.
 * 
 */
// @Entity
// @Table(name="docum_documentos_juscaba_pasos")
@NamedQuery(name="DocumDocumentosJuscabaPaso.findAll", query="SELECT d FROM DocumDocumentosJuscabaPaso d")
public class DocumDocumentosJuscabaPaso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ddjp_id")
	private int ddjpId;

	@Column(name="ddj_id_juscaba")
	private int ddjIdJuscaba;

	@Column(name="ddjp_actor_id")
	private int ddjpActorId;

	@Column(name="ddjp_actor_rol_id_dest")
	private int ddjpActorRolIdDest;

	@Column(name="ddjp_actor_rol_id_dest_label")
	private String ddjpActorRolIdDestLabel;

	@Column(name="ddjp_actor_rol_id_orig")
	private int ddjpActorRolIdOrig;

	@Column(name="ddjp_actor_rol_id_orig_label")
	private String ddjpActorRolIdOrigLabel;

	@Column(name="ddjp_actor_rol_id_procesal")
	private int ddjpActorRolIdProcesal;

	@Column(name="ddjp_actor_rol_id_procesal_label")
	private String ddjpActorRolIdProcesalLabel;

	@Column(name="ddjp_exped_id_label")
	private String ddjpExpedIdLabel;

	@Temporal(TemporalType.DATE)
	@Column(name="ddjp_fec_creado")
	private Date ddjpFecCreado;

	@Temporal(TemporalType.DATE)
	@Column(name="ddjp_fec_firmado")
	private Date ddjpFecFirmado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ddjp_fecha_actualizacion")
	private Date ddjpFechaActualizacion;

	@Column(name="ddjp_firma")
	private String ddjpFirma;

	@Column(name="ddjp_id_paso")
	private int ddjpIdPaso;

	@Column(name="ddjp_observa")
	private String ddjpObserva;

	@Column(name="ddjp_proceso")
	private String ddjpProceso;

	@Column(name="ddjp_proceso_vencimiento")
	private String ddjpProcesoVencimiento;

	@Column(name="ddjp_t_acceso_id")
	private int ddjpTAccesoId;

	@Column(name="ddjp_t_acceso_id_label")
	private String ddjpTAccesoIdLabel;

	@Column(name="ddjp_t_paso_id")
	private int ddjpTPasoId;

	@Column(name="ddjp_t_paso_id_label")
	private String ddjpTPasoIdLabel;

	@Lob
	@Column(name="ddjp_texto")
	private String ddjpTexto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ddjp_timestamp")
	private Date ddjpTimestamp;

	@Column(name="ddjp_usuario")
	private String ddjpUsuario;

	@Column(name="doc_code")
	private int docCode;

	@Column(name="doc_id")
	private String docId;

	@Column(name="dtip_code")
	private String dtipCode;

	public DocumDocumentosJuscabaPaso() {
	}

	public int getDdjpId() {
		return this.ddjpId;
	}

	public void setDdjpId(int ddjpId) {
		this.ddjpId = ddjpId;
	}

	public int getDdjIdJuscaba() {
		return this.ddjIdJuscaba;
	}

	public void setDdjIdJuscaba(int ddjIdJuscaba) {
		this.ddjIdJuscaba = ddjIdJuscaba;
	}

	public int getDdjpActorId() {
		return this.ddjpActorId;
	}

	public void setDdjpActorId(int ddjpActorId) {
		this.ddjpActorId = ddjpActorId;
	}

	public int getDdjpActorRolIdDest() {
		return this.ddjpActorRolIdDest;
	}

	public void setDdjpActorRolIdDest(int ddjpActorRolIdDest) {
		this.ddjpActorRolIdDest = ddjpActorRolIdDest;
	}

	public String getDdjpActorRolIdDestLabel() {
		return this.ddjpActorRolIdDestLabel;
	}

	public void setDdjpActorRolIdDestLabel(String ddjpActorRolIdDestLabel) {
		this.ddjpActorRolIdDestLabel = ddjpActorRolIdDestLabel;
	}

	public int getDdjpActorRolIdOrig() {
		return this.ddjpActorRolIdOrig;
	}

	public void setDdjpActorRolIdOrig(int ddjpActorRolIdOrig) {
		this.ddjpActorRolIdOrig = ddjpActorRolIdOrig;
	}

	public String getDdjpActorRolIdOrigLabel() {
		return this.ddjpActorRolIdOrigLabel;
	}

	public void setDdjpActorRolIdOrigLabel(String ddjpActorRolIdOrigLabel) {
		this.ddjpActorRolIdOrigLabel = ddjpActorRolIdOrigLabel;
	}

	public int getDdjpActorRolIdProcesal() {
		return this.ddjpActorRolIdProcesal;
	}

	public void setDdjpActorRolIdProcesal(int ddjpActorRolIdProcesal) {
		this.ddjpActorRolIdProcesal = ddjpActorRolIdProcesal;
	}

	public String getDdjpActorRolIdProcesalLabel() {
		return this.ddjpActorRolIdProcesalLabel;
	}

	public void setDdjpActorRolIdProcesalLabel(String ddjpActorRolIdProcesalLabel) {
		this.ddjpActorRolIdProcesalLabel = ddjpActorRolIdProcesalLabel;
	}

	public String getDdjpExpedIdLabel() {
		return this.ddjpExpedIdLabel;
	}

	public void setDdjpExpedIdLabel(String ddjpExpedIdLabel) {
		this.ddjpExpedIdLabel = ddjpExpedIdLabel;
	}

	public Date getDdjpFecCreado() {
		return this.ddjpFecCreado;
	}

	public void setDdjpFecCreado(Date ddjpFecCreado) {
		this.ddjpFecCreado = ddjpFecCreado;
	}

	public Date getDdjpFecFirmado() {
		return this.ddjpFecFirmado;
	}

	public void setDdjpFecFirmado(Date ddjpFecFirmado) {
		this.ddjpFecFirmado = ddjpFecFirmado;
	}

	public Date getDdjpFechaActualizacion() {
		return this.ddjpFechaActualizacion;
	}

	public void setDdjpFechaActualizacion(Date ddjpFechaActualizacion) {
		this.ddjpFechaActualizacion = ddjpFechaActualizacion;
	}

	public String getDdjpFirma() {
		return this.ddjpFirma;
	}

	public void setDdjpFirma(String ddjpFirma) {
		this.ddjpFirma = ddjpFirma;
	}

	public int getDdjpIdPaso() {
		return this.ddjpIdPaso;
	}

	public void setDdjpIdPaso(int ddjpIdPaso) {
		this.ddjpIdPaso = ddjpIdPaso;
	}

	public String getDdjpObserva() {
		return this.ddjpObserva;
	}

	public void setDdjpObserva(String ddjpObserva) {
		this.ddjpObserva = ddjpObserva;
	}

	public String getDdjpProceso() {
		return this.ddjpProceso;
	}

	public void setDdjpProceso(String ddjpProceso) {
		this.ddjpProceso = ddjpProceso;
	}

	public String getDdjpProcesoVencimiento() {
		return this.ddjpProcesoVencimiento;
	}

	public void setDdjpProcesoVencimiento(String ddjpProcesoVencimiento) {
		this.ddjpProcesoVencimiento = ddjpProcesoVencimiento;
	}

	public int getDdjpTAccesoId() {
		return this.ddjpTAccesoId;
	}

	public void setDdjpTAccesoId(int ddjpTAccesoId) {
		this.ddjpTAccesoId = ddjpTAccesoId;
	}

	public String getDdjpTAccesoIdLabel() {
		return this.ddjpTAccesoIdLabel;
	}

	public void setDdjpTAccesoIdLabel(String ddjpTAccesoIdLabel) {
		this.ddjpTAccesoIdLabel = ddjpTAccesoIdLabel;
	}

	public int getDdjpTPasoId() {
		return this.ddjpTPasoId;
	}

	public void setDdjpTPasoId(int ddjpTPasoId) {
		this.ddjpTPasoId = ddjpTPasoId;
	}

	public String getDdjpTPasoIdLabel() {
		return this.ddjpTPasoIdLabel;
	}

	public void setDdjpTPasoIdLabel(String ddjpTPasoIdLabel) {
		this.ddjpTPasoIdLabel = ddjpTPasoIdLabel;
	}

	public String getDdjpTexto() {
		return this.ddjpTexto;
	}

	public void setDdjpTexto(String ddjpTexto) {
		this.ddjpTexto = ddjpTexto;
	}

	public Date getDdjpTimestamp() {
		return this.ddjpTimestamp;
	}

	public void setDdjpTimestamp(Date ddjpTimestamp) {
		this.ddjpTimestamp = ddjpTimestamp;
	}

	public String getDdjpUsuario() {
		return this.ddjpUsuario;
	}

	public void setDdjpUsuario(String ddjpUsuario) {
		this.ddjpUsuario = ddjpUsuario;
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

	public String getDtipCode() {
		return this.dtipCode;
	}

	public void setDtipCode(String dtipCode) {
		this.dtipCode = dtipCode;
	}

}