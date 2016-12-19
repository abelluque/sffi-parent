package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cayt_documentos_templates_dependencia database table.
 * 
 */
// @Entity
// @Table(name="cayt_documentos_templates_dependencia")
@NamedQuery(name="CaytDocumentosTemplatesDependencia.findAll", query="SELECT c FROM CaytDocumentosTemplatesDependencia c")
public class CaytDocumentosTemplatesDependencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dtd_code")
	private int dtdCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="dte_code")
	private int dteCode;

	@Lob
	@Column(name="dte_texto")
	private String dteTexto;

	public CaytDocumentosTemplatesDependencia() {
	}

	public int getDtdCode() {
		return this.dtdCode;
	}

	public void setDtdCode(int dtdCode) {
		this.dtdCode = dtdCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getDteCode() {
		return this.dteCode;
	}

	public void setDteCode(int dteCode) {
		this.dteCode = dteCode;
	}

	public String getDteTexto() {
		return this.dteTexto;
	}

	public void setDteTexto(String dteTexto) {
		this.dteTexto = dteTexto;
	}

}