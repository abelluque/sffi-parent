package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the spp_suspensiones_de_proceso_informes database table.
 * 
 */
// @Entity
// @Table(name="spp_suspensiones_de_proceso_informes")
@NamedQuery(name="SppSuspensionesDeProcesoInforme.findAll", query="SELECT s FROM SppSuspensionesDeProcesoInforme s")
public class SppSuspensionesDeProcesoInforme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sin_code")
	private int sinCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="sin_acceso")
	private String sinAcceso;

	@Column(name="sin_archivo")
	private String sinArchivo;

	@Column(name="sin_doc_nro_juscaba")
	private String sinDocNroJuscaba;

	@Column(name="sin_enviar_juscaba")
	private String sinEnviarJuscaba;

	@Column(name="sin_estado")
	private String sinEstado;

	@Column(name="sin_estado_juscaba")
	private String sinEstadoJuscaba;

	@Column(name="sin_etiquetas")
	private String sinEtiquetas;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sin_fecha_alta")
	private Date sinFechaAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sin_fecha_aprobada")
	private Date sinFechaAprobada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sin_fecha_en_juscaba")
	private Date sinFechaEnJuscaba;

	@Column(name="sin_juscaba_actorlegal")
	private String sinJuscabaActorlegal;

	@Column(name="sin_juscaba_login")
	private String sinJuscabaLogin;

	@Column(name="sin_observacion")
	private String sinObservacion;

	@Column(name="sin_revision")
	private String sinRevision;

	@Lob
	@Column(name="sin_texto")
	private String sinTexto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sin_tstamp")
	private Date sinTstamp;

	@Column(name="spj_id")
	private int spjId;

	@Column(name="ssp_code")
	private int sspCode;

	@Column(name="sti_acceso")
	private String stiAcceso;

	@Column(name="sti_code")
	private int stiCode;

	@Column(name="sti_enviar_juscaba")
	private String stiEnviarJuscaba;

	@Column(name="sti_revision")
	private String stiRevision;

	@Column(name="use_code")
	private int useCode;

	public SppSuspensionesDeProcesoInforme() {
	}

	public int getSinCode() {
		return this.sinCode;
	}

	public void setSinCode(int sinCode) {
		this.sinCode = sinCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getSinAcceso() {
		return this.sinAcceso;
	}

	public void setSinAcceso(String sinAcceso) {
		this.sinAcceso = sinAcceso;
	}

	public String getSinArchivo() {
		return this.sinArchivo;
	}

	public void setSinArchivo(String sinArchivo) {
		this.sinArchivo = sinArchivo;
	}

	public String getSinDocNroJuscaba() {
		return this.sinDocNroJuscaba;
	}

	public void setSinDocNroJuscaba(String sinDocNroJuscaba) {
		this.sinDocNroJuscaba = sinDocNroJuscaba;
	}

	public String getSinEnviarJuscaba() {
		return this.sinEnviarJuscaba;
	}

	public void setSinEnviarJuscaba(String sinEnviarJuscaba) {
		this.sinEnviarJuscaba = sinEnviarJuscaba;
	}

	public String getSinEstado() {
		return this.sinEstado;
	}

	public void setSinEstado(String sinEstado) {
		this.sinEstado = sinEstado;
	}

	public String getSinEstadoJuscaba() {
		return this.sinEstadoJuscaba;
	}

	public void setSinEstadoJuscaba(String sinEstadoJuscaba) {
		this.sinEstadoJuscaba = sinEstadoJuscaba;
	}

	public String getSinEtiquetas() {
		return this.sinEtiquetas;
	}

	public void setSinEtiquetas(String sinEtiquetas) {
		this.sinEtiquetas = sinEtiquetas;
	}

	public Date getSinFechaAlta() {
		return this.sinFechaAlta;
	}

	public void setSinFechaAlta(Date sinFechaAlta) {
		this.sinFechaAlta = sinFechaAlta;
	}

	public Date getSinFechaAprobada() {
		return this.sinFechaAprobada;
	}

	public void setSinFechaAprobada(Date sinFechaAprobada) {
		this.sinFechaAprobada = sinFechaAprobada;
	}

	public Date getSinFechaEnJuscaba() {
		return this.sinFechaEnJuscaba;
	}

	public void setSinFechaEnJuscaba(Date sinFechaEnJuscaba) {
		this.sinFechaEnJuscaba = sinFechaEnJuscaba;
	}

	public String getSinJuscabaActorlegal() {
		return this.sinJuscabaActorlegal;
	}

	public void setSinJuscabaActorlegal(String sinJuscabaActorlegal) {
		this.sinJuscabaActorlegal = sinJuscabaActorlegal;
	}

	public String getSinJuscabaLogin() {
		return this.sinJuscabaLogin;
	}

	public void setSinJuscabaLogin(String sinJuscabaLogin) {
		this.sinJuscabaLogin = sinJuscabaLogin;
	}

	public String getSinObservacion() {
		return this.sinObservacion;
	}

	public void setSinObservacion(String sinObservacion) {
		this.sinObservacion = sinObservacion;
	}

	public String getSinRevision() {
		return this.sinRevision;
	}

	public void setSinRevision(String sinRevision) {
		this.sinRevision = sinRevision;
	}

	public String getSinTexto() {
		return this.sinTexto;
	}

	public void setSinTexto(String sinTexto) {
		this.sinTexto = sinTexto;
	}

	public Date getSinTstamp() {
		return this.sinTstamp;
	}

	public void setSinTstamp(Date sinTstamp) {
		this.sinTstamp = sinTstamp;
	}

	public int getSpjId() {
		return this.spjId;
	}

	public void setSpjId(int spjId) {
		this.spjId = spjId;
	}

	public int getSspCode() {
		return this.sspCode;
	}

	public void setSspCode(int sspCode) {
		this.sspCode = sspCode;
	}

	public String getStiAcceso() {
		return this.stiAcceso;
	}

	public void setStiAcceso(String stiAcceso) {
		this.stiAcceso = stiAcceso;
	}

	public int getStiCode() {
		return this.stiCode;
	}

	public void setStiCode(int stiCode) {
		this.stiCode = stiCode;
	}

	public String getStiEnviarJuscaba() {
		return this.stiEnviarJuscaba;
	}

	public void setStiEnviarJuscaba(String stiEnviarJuscaba) {
		this.stiEnviarJuscaba = stiEnviarJuscaba;
	}

	public String getStiRevision() {
		return this.stiRevision;
	}

	public void setStiRevision(String stiRevision) {
		this.stiRevision = stiRevision;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}