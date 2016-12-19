package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the docum_documentos_alertas_usuarios database table.
 * 
 */
// @Entity
// @Table(name="docum_documentos_alertas_usuarios")
@NamedQuery(name="DocumDocumentosAlertasUsuario.findAll", query="SELECT d FROM DocumDocumentosAlertasUsuario d")
public class DocumDocumentosAlertasUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="aal_codigo")
	private String aalCodigo;

	private int intimados;

	private int probation;

	private int requeridos;

	@Column(name="sin_intimar")
	private int sinIntimar;

	public DocumDocumentosAlertasUsuario() {
	}

	public String getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(String aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getIntimados() {
		return this.intimados;
	}

	public void setIntimados(int intimados) {
		this.intimados = intimados;
	}

	public int getProbation() {
		return this.probation;
	}

	public void setProbation(int probation) {
		this.probation = probation;
	}

	public int getRequeridos() {
		return this.requeridos;
	}

	public void setRequeridos(int requeridos) {
		this.requeridos = requeridos;
	}

	public int getSinIntimar() {
		return this.sinIntimar;
	}

	public void setSinIntimar(int sinIntimar) {
		this.sinIntimar = sinIntimar;
	}

}