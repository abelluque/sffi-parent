package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_documentos_intervenciones database table.
 * 
 */
// @Entity
// @Table(name="docum_documentos_intervenciones")
@NamedQuery(name="DocumDocumentosIntervencione.findAll", query="SELECT d FROM DocumDocumentosIntervencione d")
public class DocumDocumentosIntervencione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ddi_code")
	private int ddiCode;

	@Column(name="ddi_dependencia")
	private int ddiDependencia;

	@Column(name="ddi_observ")
	private String ddiObserv;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ddi_tstamp")
	private Date ddiTstamp;

	@Column(name="ddi_usuario")
	private String ddiUsuario;

	@Column(name="doc_id")
	private String docId;

	public DocumDocumentosIntervencione() {
	}

	public int getDdiCode() {
		return this.ddiCode;
	}

	public void setDdiCode(int ddiCode) {
		this.ddiCode = ddiCode;
	}

	public int getDdiDependencia() {
		return this.ddiDependencia;
	}

	public void setDdiDependencia(int ddiDependencia) {
		this.ddiDependencia = ddiDependencia;
	}

	public String getDdiObserv() {
		return this.ddiObserv;
	}

	public void setDdiObserv(String ddiObserv) {
		this.ddiObserv = ddiObserv;
	}

	public Date getDdiTstamp() {
		return this.ddiTstamp;
	}

	public void setDdiTstamp(Date ddiTstamp) {
		this.ddiTstamp = ddiTstamp;
	}

	public String getDdiUsuario() {
		return this.ddiUsuario;
	}

	public void setDdiUsuario(String ddiUsuario) {
		this.ddiUsuario = ddiUsuario;
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

}