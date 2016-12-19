package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the spp_informes_previos database table.
 * 
 */
// @Entity
// @Table(name="spp_informes_previos")
@NamedQuery(name="SppInformesPrevio.findAll", query="SELECT s FROM SppInformesPrevio s")
public class SppInformesPrevio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sip_code")
	private int sipCode;

	@Column(name="pco_code")
	private int pcoCode;

	@Column(name="pdc_code")
	private int pdcCode;

	@Column(name="pdo_code")
	private int pdoCode;

	@Column(name="per_code")
	private int perCode;

	@Column(name="sip_aal_codigo_alta")
	private int sipAalCodigoAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sip_date")
	private Date sipDate;

	@Column(name="sip_doc_id")
	private String sipDocId;

	@Column(name="sip_doc_nro")
	private int sipDocNro;

	@Column(name="sip_doc_tipo")
	private String sipDocTipo;

	@Column(name="sip_estado")
	private String sipEstado;

	@Column(name="sip_fiscalia_responsable")
	private int sipFiscaliaResponsable;

	@Column(name="sip_informe")
	private String sipInforme;

	@Column(name="sip_informe_nombre")
	private String sipInformeNombre;

	@Lob
	@Column(name="sip_observacion")
	private String sipObservacion;

	@Column(name="sip_use_code_alta")
	private String sipUseCodeAlta;

	@Column(name="sti_code")
	private int stiCode;

	public SppInformesPrevio() {
	}

	public int getSipCode() {
		return this.sipCode;
	}

	public void setSipCode(int sipCode) {
		this.sipCode = sipCode;
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

	public int getSipAalCodigoAlta() {
		return this.sipAalCodigoAlta;
	}

	public void setSipAalCodigoAlta(int sipAalCodigoAlta) {
		this.sipAalCodigoAlta = sipAalCodigoAlta;
	}

	public Date getSipDate() {
		return this.sipDate;
	}

	public void setSipDate(Date sipDate) {
		this.sipDate = sipDate;
	}

	public String getSipDocId() {
		return this.sipDocId;
	}

	public void setSipDocId(String sipDocId) {
		this.sipDocId = sipDocId;
	}

	public int getSipDocNro() {
		return this.sipDocNro;
	}

	public void setSipDocNro(int sipDocNro) {
		this.sipDocNro = sipDocNro;
	}

	public String getSipDocTipo() {
		return this.sipDocTipo;
	}

	public void setSipDocTipo(String sipDocTipo) {
		this.sipDocTipo = sipDocTipo;
	}

	public String getSipEstado() {
		return this.sipEstado;
	}

	public void setSipEstado(String sipEstado) {
		this.sipEstado = sipEstado;
	}

	public int getSipFiscaliaResponsable() {
		return this.sipFiscaliaResponsable;
	}

	public void setSipFiscaliaResponsable(int sipFiscaliaResponsable) {
		this.sipFiscaliaResponsable = sipFiscaliaResponsable;
	}

	public String getSipInforme() {
		return this.sipInforme;
	}

	public void setSipInforme(String sipInforme) {
		this.sipInforme = sipInforme;
	}

	public String getSipInformeNombre() {
		return this.sipInformeNombre;
	}

	public void setSipInformeNombre(String sipInformeNombre) {
		this.sipInformeNombre = sipInformeNombre;
	}

	public String getSipObservacion() {
		return this.sipObservacion;
	}

	public void setSipObservacion(String sipObservacion) {
		this.sipObservacion = sipObservacion;
	}

	public String getSipUseCodeAlta() {
		return this.sipUseCodeAlta;
	}

	public void setSipUseCodeAlta(String sipUseCodeAlta) {
		this.sipUseCodeAlta = sipUseCodeAlta;
	}

	public int getStiCode() {
		return this.stiCode;
	}

	public void setStiCode(int stiCode) {
		this.stiCode = stiCode;
	}

}