package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_revisiones_adjuntos database table.
 * 
 */
// @Entity
// @Table(name="docum_revisiones_adjuntos")
@NamedQuery(name="DocumRevisionesAdjunto.findAll", query="SELECT d FROM DocumRevisionesAdjunto d")
public class DocumRevisionesAdjunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dra_code")
	private int draCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="doc_id")
	private String docId;

	@Column(name="doc_storage")
	private String docStorage;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dra_fecha")
	private Date draFecha;

	@Column(name="dra_soporte")
	private String draSoporte;

	@Column(name="dre_code")
	private int dreCode;

	@Column(name="dta_code")
	private String dtaCode;

	@Column(name="use_code")
	private String useCode;

	public DocumRevisionesAdjunto() {
	}

	public int getDraCode() {
		return this.draCode;
	}

	public void setDraCode(int draCode) {
		this.draCode = draCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getDocStorage() {
		return this.docStorage;
	}

	public void setDocStorage(String docStorage) {
		this.docStorage = docStorage;
	}

	public Date getDraFecha() {
		return this.draFecha;
	}

	public void setDraFecha(Date draFecha) {
		this.draFecha = draFecha;
	}

	public String getDraSoporte() {
		return this.draSoporte;
	}

	public void setDraSoporte(String draSoporte) {
		this.draSoporte = draSoporte;
	}

	public int getDreCode() {
		return this.dreCode;
	}

	public void setDreCode(int dreCode) {
		this.dreCode = dreCode;
	}

	public String getDtaCode() {
		return this.dtaCode;
	}

	public void setDtaCode(String dtaCode) {
		this.dtaCode = dtaCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}