package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mpf_documentos_recover database table.
 * 
 */
// @Entity
// @Table(name="mpf_documentos_recover")
@NamedQuery(name="MpfDocumentosRecover.findAll", query="SELECT m FROM MpfDocumentosRecover m")
public class MpfDocumentosRecover implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mdr_code")
	private int mdrCode;

	@Column(name="mdr_doc_existe_en_path")
	private byte mdrDocExisteEnPath;

	@Column(name="mdr_doc_existe_en_temp")
	private byte mdrDocExisteEnTemp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="mdr_doc_fecha")
	private Date mdrDocFecha;

	@Column(name="mdr_doc_name")
	private String mdrDocName;

	@Column(name="mdr_doc_path")
	private String mdrDocPath;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="mdr_fecha")
	private Date mdrFecha;

	@Column(name="mdr_sistema")
	private String mdrSistema;

	public MpfDocumentosRecover() {
	}

	public int getMdrCode() {
		return this.mdrCode;
	}

	public void setMdrCode(int mdrCode) {
		this.mdrCode = mdrCode;
	}

	public byte getMdrDocExisteEnPath() {
		return this.mdrDocExisteEnPath;
	}

	public void setMdrDocExisteEnPath(byte mdrDocExisteEnPath) {
		this.mdrDocExisteEnPath = mdrDocExisteEnPath;
	}

	public byte getMdrDocExisteEnTemp() {
		return this.mdrDocExisteEnTemp;
	}

	public void setMdrDocExisteEnTemp(byte mdrDocExisteEnTemp) {
		this.mdrDocExisteEnTemp = mdrDocExisteEnTemp;
	}

	public Date getMdrDocFecha() {
		return this.mdrDocFecha;
	}

	public void setMdrDocFecha(Date mdrDocFecha) {
		this.mdrDocFecha = mdrDocFecha;
	}

	public String getMdrDocName() {
		return this.mdrDocName;
	}

	public void setMdrDocName(String mdrDocName) {
		this.mdrDocName = mdrDocName;
	}

	public String getMdrDocPath() {
		return this.mdrDocPath;
	}

	public void setMdrDocPath(String mdrDocPath) {
		this.mdrDocPath = mdrDocPath;
	}

	public Date getMdrFecha() {
		return this.mdrFecha;
	}

	public void setMdrFecha(Date mdrFecha) {
		this.mdrFecha = mdrFecha;
	}

	public String getMdrSistema() {
		return this.mdrSistema;
	}

	public void setMdrSistema(String mdrSistema) {
		this.mdrSistema = mdrSistema;
	}

}