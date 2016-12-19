package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_notificaciones database table.
 * 
 */
// @Entity
// @Table(name="docum_notificaciones")
@NamedQuery(name="DocumNotificacione.findAll", query="SELECT d FROM DocumNotificacione d")
public class DocumNotificacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dno_code")
	private int dnoCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="ced_code")
	private int cedCode;

	@Column(name="dno_email")
	private String dnoEmail;

	@Column(name="dno_estado")
	private String dnoEstado;

	@Column(name="dno_etiquetas")
	private String dnoEtiquetas;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dno_fecha_notificacion")
	private Date dnoFechaNotificacion;

	@Column(name="dno_medio_notificacion")
	private String dnoMedioNotificacion;

	@Column(name="dno_notifico")
	private String dnoNotifico;

	@Column(name="dno_telefono")
	private String dnoTelefono;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dno_tstamp")
	private Date dnoTstamp;

	@Column(name="doc_id")
	private String docId;

	@Column(name="use_code")
	private String useCode;

	@Column(name="utr_code")
	private int utrCode;

	public DocumNotificacione() {
	}

	public int getDnoCode() {
		return this.dnoCode;
	}

	public void setDnoCode(int dnoCode) {
		this.dnoCode = dnoCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getCedCode() {
		return this.cedCode;
	}

	public void setCedCode(int cedCode) {
		this.cedCode = cedCode;
	}

	public String getDnoEmail() {
		return this.dnoEmail;
	}

	public void setDnoEmail(String dnoEmail) {
		this.dnoEmail = dnoEmail;
	}

	public String getDnoEstado() {
		return this.dnoEstado;
	}

	public void setDnoEstado(String dnoEstado) {
		this.dnoEstado = dnoEstado;
	}

	public String getDnoEtiquetas() {
		return this.dnoEtiquetas;
	}

	public void setDnoEtiquetas(String dnoEtiquetas) {
		this.dnoEtiquetas = dnoEtiquetas;
	}

	public Date getDnoFechaNotificacion() {
		return this.dnoFechaNotificacion;
	}

	public void setDnoFechaNotificacion(Date dnoFechaNotificacion) {
		this.dnoFechaNotificacion = dnoFechaNotificacion;
	}

	public String getDnoMedioNotificacion() {
		return this.dnoMedioNotificacion;
	}

	public void setDnoMedioNotificacion(String dnoMedioNotificacion) {
		this.dnoMedioNotificacion = dnoMedioNotificacion;
	}

	public String getDnoNotifico() {
		return this.dnoNotifico;
	}

	public void setDnoNotifico(String dnoNotifico) {
		this.dnoNotifico = dnoNotifico;
	}

	public String getDnoTelefono() {
		return this.dnoTelefono;
	}

	public void setDnoTelefono(String dnoTelefono) {
		this.dnoTelefono = dnoTelefono;
	}

	public Date getDnoTstamp() {
		return this.dnoTstamp;
	}

	public void setDnoTstamp(Date dnoTstamp) {
		this.dnoTstamp = dnoTstamp;
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public int getUtrCode() {
		return this.utrCode;
	}

	public void setUtrCode(int utrCode) {
		this.utrCode = utrCode;
	}

}