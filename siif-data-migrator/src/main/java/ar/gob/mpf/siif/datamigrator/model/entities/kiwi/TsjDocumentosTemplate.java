package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tsj_documentos_templates database table.
 * 
 */
// @Entity
// @Table(name="tsj_documentos_templates")
@NamedQuery(name="TsjDocumentosTemplate.findAll", query="SELECT t FROM TsjDocumentosTemplate t")
public class TsjDocumentosTemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="dte_archivo")
	private String dteArchivo;

	@Column(name="dte_code")
	private int dteCode;

	@Column(name="dte_nombre")
	private String dteNombre;

	@Column(name="dte_publico")
	private String dtePublico;

	@Column(name="dte_template")
	private String dteTemplate;

	@Lob
	@Column(name="dte_texto")
	private String dteTexto;

	@Column(name="tin_code")
	private int tinCode;

	public TsjDocumentosTemplate() {
	}

	public String getDteArchivo() {
		return this.dteArchivo;
	}

	public void setDteArchivo(String dteArchivo) {
		this.dteArchivo = dteArchivo;
	}

	public int getDteCode() {
		return this.dteCode;
	}

	public void setDteCode(int dteCode) {
		this.dteCode = dteCode;
	}

	public String getDteNombre() {
		return this.dteNombre;
	}

	public void setDteNombre(String dteNombre) {
		this.dteNombre = dteNombre;
	}

	public String getDtePublico() {
		return this.dtePublico;
	}

	public void setDtePublico(String dtePublico) {
		this.dtePublico = dtePublico;
	}

	public String getDteTemplate() {
		return this.dteTemplate;
	}

	public void setDteTemplate(String dteTemplate) {
		this.dteTemplate = dteTemplate;
	}

	public String getDteTexto() {
		return this.dteTexto;
	}

	public void setDteTexto(String dteTexto) {
		this.dteTexto = dteTexto;
	}

	public int getTinCode() {
		return this.tinCode;
	}

	public void setTinCode(int tinCode) {
		this.tinCode = tinCode;
	}

}