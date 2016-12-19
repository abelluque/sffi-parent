package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the spp_suspensiones_de_proceso database table.
 * 
 */
// @Entity
// @Table(name="spp_suspensiones_de_proceso")
@NamedQuery(name="SppSuspensionesDeProceso.findAll", query="SELECT s FROM SppSuspensionesDeProceso s")
public class SppSuspensionesDeProceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ssp_code")
	private int sspCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="doc_nro_juscaba")
	private String docNroJuscaba;

	@Column(name="pco_code")
	private int pcoCode;

	@Column(name="pdc_code")
	private int pdcCode;

	@Column(name="pdo_code")
	private int pdoCode;

	@Column(name="per_code")
	private int perCode;

	@Lob
	@Column(name="ssp_acta_concesion")
	private String sspActaConcesion;

	@Column(name="ssp_doc_id")
	private String sspDocId;

	@Column(name="ssp_doc_nro")
	private int sspDocNro;

	@Column(name="ssp_doc_tipo")
	private String sspDocTipo;

	@Column(name="ssp_duracion")
	private int sspDuracion;

	@Column(name="ssp_estado")
	private String sspEstado;

	@Column(name="ssp_estado_control")
	private String sspEstadoControl;

	@Column(name="ssp_etiquetas")
	private String sspEtiquetas;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ssp_fecha_alta")
	private Date sspFechaAlta;

	@Temporal(TemporalType.DATE)
	@Column(name="ssp_fecha_concesion")
	private Date sspFechaConcesion;

	@Temporal(TemporalType.DATE)
	@Column(name="ssp_fecha_fin")
	private Date sspFechaFin;

	@Temporal(TemporalType.DATE)
	@Column(name="ssp_fecha_finalizacion")
	private Date sspFechaFinalizacion;

	@Temporal(TemporalType.DATE)
	@Column(name="ssp_fecha_inicio")
	private Date sspFechaInicio;

	@Temporal(TemporalType.DATE)
	@Column(name="ssp_fecha_prorroga")
	private Date sspFechaProrroga;

	@Column(name="ssp_fiscal")
	private String sspFiscal;

	@Column(name="ssp_fiscalia")
	private int sspFiscalia;

	@Column(name="ssp_juez")
	private String sspJuez;

	@Column(name="ssp_juzgado")
	private int sspJuzgado;

	@Column(name="ssp_juzgado_nombre")
	private String sspJuzgadoNombre;

	@Lob
	@Column(name="ssp_observacion")
	private String sspObservacion;

	@Column(name="ssp_oficina_asignada")
	private int sspOficinaAsignada;

	@Column(name="ssp_prorrogada")
	private String sspProrrogada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ssp_tstamp")
	private Date sspTstamp;

	@Column(name="use_code")
	private String useCode;

	public SppSuspensionesDeProceso() {
	}

	public int getSspCode() {
		return this.sspCode;
	}

	public void setSspCode(int sspCode) {
		this.sspCode = sspCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getDocNroJuscaba() {
		return this.docNroJuscaba;
	}

	public void setDocNroJuscaba(String docNroJuscaba) {
		this.docNroJuscaba = docNroJuscaba;
	}

	public int getPcoCode() {
		return this.pcoCode;
	}

	public void setPcoCode(int pcoCode) {
		this.pcoCode = pcoCode;
	}

	public int getPdcCode() {
		return this.pdcCode;
	}

	public void setPdcCode(int pdcCode) {
		this.pdcCode = pdcCode;
	}

	public int getPdoCode() {
		return this.pdoCode;
	}

	public void setPdoCode(int pdoCode) {
		this.pdoCode = pdoCode;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public String getSspActaConcesion() {
		return this.sspActaConcesion;
	}

	public void setSspActaConcesion(String sspActaConcesion) {
		this.sspActaConcesion = sspActaConcesion;
	}

	public String getSspDocId() {
		return this.sspDocId;
	}

	public void setSspDocId(String sspDocId) {
		this.sspDocId = sspDocId;
	}

	public int getSspDocNro() {
		return this.sspDocNro;
	}

	public void setSspDocNro(int sspDocNro) {
		this.sspDocNro = sspDocNro;
	}

	public String getSspDocTipo() {
		return this.sspDocTipo;
	}

	public void setSspDocTipo(String sspDocTipo) {
		this.sspDocTipo = sspDocTipo;
	}

	public int getSspDuracion() {
		return this.sspDuracion;
	}

	public void setSspDuracion(int sspDuracion) {
		this.sspDuracion = sspDuracion;
	}

	public String getSspEstado() {
		return this.sspEstado;
	}

	public void setSspEstado(String sspEstado) {
		this.sspEstado = sspEstado;
	}

	public String getSspEstadoControl() {
		return this.sspEstadoControl;
	}

	public void setSspEstadoControl(String sspEstadoControl) {
		this.sspEstadoControl = sspEstadoControl;
	}

	public String getSspEtiquetas() {
		return this.sspEtiquetas;
	}

	public void setSspEtiquetas(String sspEtiquetas) {
		this.sspEtiquetas = sspEtiquetas;
	}

	public Date getSspFechaAlta() {
		return this.sspFechaAlta;
	}

	public void setSspFechaAlta(Date sspFechaAlta) {
		this.sspFechaAlta = sspFechaAlta;
	}

	public Date getSspFechaConcesion() {
		return this.sspFechaConcesion;
	}

	public void setSspFechaConcesion(Date sspFechaConcesion) {
		this.sspFechaConcesion = sspFechaConcesion;
	}

	public Date getSspFechaFin() {
		return this.sspFechaFin;
	}

	public void setSspFechaFin(Date sspFechaFin) {
		this.sspFechaFin = sspFechaFin;
	}

	public Date getSspFechaFinalizacion() {
		return this.sspFechaFinalizacion;
	}

	public void setSspFechaFinalizacion(Date sspFechaFinalizacion) {
		this.sspFechaFinalizacion = sspFechaFinalizacion;
	}

	public Date getSspFechaInicio() {
		return this.sspFechaInicio;
	}

	public void setSspFechaInicio(Date sspFechaInicio) {
		this.sspFechaInicio = sspFechaInicio;
	}

	public Date getSspFechaProrroga() {
		return this.sspFechaProrroga;
	}

	public void setSspFechaProrroga(Date sspFechaProrroga) {
		this.sspFechaProrroga = sspFechaProrroga;
	}

	public String getSspFiscal() {
		return this.sspFiscal;
	}

	public void setSspFiscal(String sspFiscal) {
		this.sspFiscal = sspFiscal;
	}

	public int getSspFiscalia() {
		return this.sspFiscalia;
	}

	public void setSspFiscalia(int sspFiscalia) {
		this.sspFiscalia = sspFiscalia;
	}

	public String getSspJuez() {
		return this.sspJuez;
	}

	public void setSspJuez(String sspJuez) {
		this.sspJuez = sspJuez;
	}

	public int getSspJuzgado() {
		return this.sspJuzgado;
	}

	public void setSspJuzgado(int sspJuzgado) {
		this.sspJuzgado = sspJuzgado;
	}

	public String getSspJuzgadoNombre() {
		return this.sspJuzgadoNombre;
	}

	public void setSspJuzgadoNombre(String sspJuzgadoNombre) {
		this.sspJuzgadoNombre = sspJuzgadoNombre;
	}

	public String getSspObservacion() {
		return this.sspObservacion;
	}

	public void setSspObservacion(String sspObservacion) {
		this.sspObservacion = sspObservacion;
	}

	public int getSspOficinaAsignada() {
		return this.sspOficinaAsignada;
	}

	public void setSspOficinaAsignada(int sspOficinaAsignada) {
		this.sspOficinaAsignada = sspOficinaAsignada;
	}

	public String getSspProrrogada() {
		return this.sspProrrogada;
	}

	public void setSspProrrogada(String sspProrrogada) {
		this.sspProrrogada = sspProrrogada;
	}

	public Date getSspTstamp() {
		return this.sspTstamp;
	}

	public void setSspTstamp(Date sspTstamp) {
		this.sspTstamp = sspTstamp;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}