package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oci_personas_documentos database table.
 * 
 */
// @Entity
// @Table(name="oci_personas_documentos")
@NamedQuery(name="OciPersonasDocumento.findAll", query="SELECT o FROM OciPersonasDocumento o")
public class OciPersonasDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="opdc_code")
	private int opdcCode;

	@Column(name="opd_estado_documento")
	private String opdEstadoDocumento;

	@Column(name="opd_nro_doc")
	private String opdNroDoc;

	@Column(name="opd_tipo_doc")
	private String opdTipoDoc;

	@Column(name="ope_code")
	private int opeCode;

	public OciPersonasDocumento() {
	}

	public int getOpdcCode() {
		return this.opdcCode;
	}

	public void setOpdcCode(int opdcCode) {
		this.opdcCode = opdcCode;
	}

	public String getOpdEstadoDocumento() {
		return this.opdEstadoDocumento;
	}

	public void setOpdEstadoDocumento(String opdEstadoDocumento) {
		this.opdEstadoDocumento = opdEstadoDocumento;
	}

	public String getOpdNroDoc() {
		return this.opdNroDoc;
	}

	public void setOpdNroDoc(String opdNroDoc) {
		this.opdNroDoc = opdNroDoc;
	}

	public String getOpdTipoDoc() {
		return this.opdTipoDoc;
	}

	public void setOpdTipoDoc(String opdTipoDoc) {
		this.opdTipoDoc = opdTipoDoc;
	}

	public int getOpeCode() {
		return this.opeCode;
	}

	public void setOpeCode(int opeCode) {
		this.opeCode = opeCode;
	}

}