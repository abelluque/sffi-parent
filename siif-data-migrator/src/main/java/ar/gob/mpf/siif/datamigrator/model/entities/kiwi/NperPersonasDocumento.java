package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the nper_personas_documentos database table.
 * 
 */
// @Entity
// @Table(name="nper_personas_documentos")
@NamedQuery(name="NperPersonasDocumento.findAll", query="SELECT n FROM NperPersonasDocumento n")
public class NperPersonasDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pdc_code")
	private int pdcCode;

	@Column(name="pdc_deleted")
	private String pdcDeleted;

	@Column(name="pdc_exhibe")
	private String pdcExhibe;

	@Column(name="pdc_nro_doc")
	private String pdcNroDoc;

	@Column(name="pdc_sexo")
	private String pdcSexo;

	@Column(name="pdc_tipo_doc")
	private String pdcTipoDoc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pdc_tstamp")
	private Date pdcTstamp;

	@Column(name="per_code")
	private int perCode;

	public NperPersonasDocumento() {
	}

	public int getPdcCode() {
		return this.pdcCode;
	}

	public void setPdcCode(int pdcCode) {
		this.pdcCode = pdcCode;
	}

	public String getPdcDeleted() {
		return this.pdcDeleted;
	}

	public void setPdcDeleted(String pdcDeleted) {
		this.pdcDeleted = pdcDeleted;
	}

	public String getPdcExhibe() {
		return this.pdcExhibe;
	}

	public void setPdcExhibe(String pdcExhibe) {
		this.pdcExhibe = pdcExhibe;
	}

	public String getPdcNroDoc() {
		return this.pdcNroDoc;
	}

	public void setPdcNroDoc(String pdcNroDoc) {
		this.pdcNroDoc = pdcNroDoc;
	}

	public String getPdcSexo() {
		return this.pdcSexo;
	}

	public void setPdcSexo(String pdcSexo) {
		this.pdcSexo = pdcSexo;
	}

	public String getPdcTipoDoc() {
		return this.pdcTipoDoc;
	}

	public void setPdcTipoDoc(String pdcTipoDoc) {
		this.pdcTipoDoc = pdcTipoDoc;
	}

	public Date getPdcTstamp() {
		return this.pdcTstamp;
	}

	public void setPdcTstamp(Date pdcTstamp) {
		this.pdcTstamp = pdcTstamp;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

}