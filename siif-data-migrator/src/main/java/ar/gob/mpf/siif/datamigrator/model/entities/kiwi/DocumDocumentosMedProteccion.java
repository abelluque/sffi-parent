package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_documentos_med_proteccion database table.
 * 
 */
// @Entity
// @Table(name="docum_documentos_med_proteccion")
@NamedQuery(name="DocumDocumentosMedProteccion.findAll", query="SELECT d FROM DocumDocumentosMedProteccion d")
public class DocumDocumentosMedProteccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dmp_code")
	private int dmpCode;

	@Column(name="dmp_doc_code")
	private int dmpDocCode;

	@Column(name="dmp_doc_dep")
	private int dmpDocDep;

	@Column(name="dmp_doc_id")
	private String dmpDocId;

	@Column(name="dmp_dtip_code")
	private String dmpDtipCode;

	@Column(name="dmp_estado")
	private String dmpEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dmp_fec_fin")
	private Date dmpFecFin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dmp_fec_ini")
	private Date dmpFecIni;

	@Column(name="dmp_fiscal")
	private int dmpFiscal;

	@Column(name="dmp_fiscal_dep")
	private int dmpFiscalDep;

	@Column(name="dmp_omp_code")
	private int dmpOmpCode;

	@Column(name="dmp_solicitante")
	private int dmpSolicitante;

	@Column(name="dmp_solicitante_dep")
	private int dmpSolicitanteDep;

	@Column(name="dmp_zona")
	private String dmpZona;

	@Column(name="pdo_code")
	private int pdoCode;

	@Column(name="per_caracter")
	private String perCaracter;

	@Column(name="per_code")
	private int perCode;

	public DocumDocumentosMedProteccion() {
	}

	public int getDmpCode() {
		return this.dmpCode;
	}

	public void setDmpCode(int dmpCode) {
		this.dmpCode = dmpCode;
	}

	public int getDmpDocCode() {
		return this.dmpDocCode;
	}

	public void setDmpDocCode(int dmpDocCode) {
		this.dmpDocCode = dmpDocCode;
	}

	public int getDmpDocDep() {
		return this.dmpDocDep;
	}

	public void setDmpDocDep(int dmpDocDep) {
		this.dmpDocDep = dmpDocDep;
	}

	public String getDmpDocId() {
		return this.dmpDocId;
	}

	public void setDmpDocId(String dmpDocId) {
		this.dmpDocId = dmpDocId;
	}

	public String getDmpDtipCode() {
		return this.dmpDtipCode;
	}

	public void setDmpDtipCode(String dmpDtipCode) {
		this.dmpDtipCode = dmpDtipCode;
	}

	public String getDmpEstado() {
		return this.dmpEstado;
	}

	public void setDmpEstado(String dmpEstado) {
		this.dmpEstado = dmpEstado;
	}

	public Date getDmpFecFin() {
		return this.dmpFecFin;
	}

	public void setDmpFecFin(Date dmpFecFin) {
		this.dmpFecFin = dmpFecFin;
	}

	public Date getDmpFecIni() {
		return this.dmpFecIni;
	}

	public void setDmpFecIni(Date dmpFecIni) {
		this.dmpFecIni = dmpFecIni;
	}

	public int getDmpFiscal() {
		return this.dmpFiscal;
	}

	public void setDmpFiscal(int dmpFiscal) {
		this.dmpFiscal = dmpFiscal;
	}

	public int getDmpFiscalDep() {
		return this.dmpFiscalDep;
	}

	public void setDmpFiscalDep(int dmpFiscalDep) {
		this.dmpFiscalDep = dmpFiscalDep;
	}

	public int getDmpOmpCode() {
		return this.dmpOmpCode;
	}

	public void setDmpOmpCode(int dmpOmpCode) {
		this.dmpOmpCode = dmpOmpCode;
	}

	public int getDmpSolicitante() {
		return this.dmpSolicitante;
	}

	public void setDmpSolicitante(int dmpSolicitante) {
		this.dmpSolicitante = dmpSolicitante;
	}

	public int getDmpSolicitanteDep() {
		return this.dmpSolicitanteDep;
	}

	public void setDmpSolicitanteDep(int dmpSolicitanteDep) {
		this.dmpSolicitanteDep = dmpSolicitanteDep;
	}

	public String getDmpZona() {
		return this.dmpZona;
	}

	public void setDmpZona(String dmpZona) {
		this.dmpZona = dmpZona;
	}

	public int getPdoCode() {
		return this.pdoCode;
	}

	public void setPdoCode(int pdoCode) {
		this.pdoCode = pdoCode;
	}

	public String getPerCaracter() {
		return this.perCaracter;
	}

	public void setPerCaracter(String perCaracter) {
		this.perCaracter = perCaracter;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

}