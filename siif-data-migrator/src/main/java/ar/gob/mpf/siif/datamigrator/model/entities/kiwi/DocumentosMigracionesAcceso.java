package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the documentos_migraciones_accesos database table.
 * 
 */
// @Entity
// @Table(name="documentos_migraciones_accesos")
@NamedQuery(name="DocumentosMigracionesAcceso.findAll", query="SELECT d FROM DocumentosMigracionesAcceso d")
public class DocumentosMigracionesAcceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="utma_code")
	private int utmaCode;

	@Column(name="utma_aal_codigo")
	private int utmaAalCodigo;

	@Column(name="utma_doc_id")
	private String utmaDocId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="utma_tstamp")
	private Date utmaTstamp;

	@Column(name="utma_uco_code")
	private int utmaUcoCode;

	@Column(name="utma_use_code")
	private String utmaUseCode;

	@Column(name="utma_utr_code")
	private int utmaUtrCode;

	@Column(name="utma_utt_code")
	private int utmaUttCode;

	public DocumentosMigracionesAcceso() {
	}

	public int getUtmaCode() {
		return this.utmaCode;
	}

	public void setUtmaCode(int utmaCode) {
		this.utmaCode = utmaCode;
	}

	public int getUtmaAalCodigo() {
		return this.utmaAalCodigo;
	}

	public void setUtmaAalCodigo(int utmaAalCodigo) {
		this.utmaAalCodigo = utmaAalCodigo;
	}

	public String getUtmaDocId() {
		return this.utmaDocId;
	}

	public void setUtmaDocId(String utmaDocId) {
		this.utmaDocId = utmaDocId;
	}

	public Date getUtmaTstamp() {
		return this.utmaTstamp;
	}

	public void setUtmaTstamp(Date utmaTstamp) {
		this.utmaTstamp = utmaTstamp;
	}

	public int getUtmaUcoCode() {
		return this.utmaUcoCode;
	}

	public void setUtmaUcoCode(int utmaUcoCode) {
		this.utmaUcoCode = utmaUcoCode;
	}

	public String getUtmaUseCode() {
		return this.utmaUseCode;
	}

	public void setUtmaUseCode(String utmaUseCode) {
		this.utmaUseCode = utmaUseCode;
	}

	public int getUtmaUtrCode() {
		return this.utmaUtrCode;
	}

	public void setUtmaUtrCode(int utmaUtrCode) {
		this.utmaUtrCode = utmaUtrCode;
	}

	public int getUtmaUttCode() {
		return this.utmaUttCode;
	}

	public void setUtmaUttCode(int utmaUttCode) {
		this.utmaUttCode = utmaUttCode;
	}

}