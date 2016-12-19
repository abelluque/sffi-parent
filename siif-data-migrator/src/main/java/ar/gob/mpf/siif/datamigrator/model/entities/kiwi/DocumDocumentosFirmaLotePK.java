package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the docum_documentos_firma_lote database table.
 * 
 */
@Embeddable
public class DocumDocumentosFirmaLotePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="dfl_instancia")
	private String dflInstancia;

	@Column(name="dfl_instancia_id")
	private String dflInstanciaId;

	@Column(name="use_code")
	private String useCode;

	public DocumDocumentosFirmaLotePK() {
	}
	public String getDflInstancia() {
		return this.dflInstancia;
	}
	public void setDflInstancia(String dflInstancia) {
		this.dflInstancia = dflInstancia;
	}
	public String getDflInstanciaId() {
		return this.dflInstanciaId;
	}
	public void setDflInstanciaId(String dflInstanciaId) {
		this.dflInstanciaId = dflInstanciaId;
	}
	public String getUseCode() {
		return this.useCode;
	}
	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DocumDocumentosFirmaLotePK)) {
			return false;
		}
		DocumDocumentosFirmaLotePK castOther = (DocumDocumentosFirmaLotePK)other;
		return 
			this.dflInstancia.equals(castOther.dflInstancia)
			&& this.dflInstanciaId.equals(castOther.dflInstanciaId)
			&& this.useCode.equals(castOther.useCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dflInstancia.hashCode();
		hash = hash * prime + this.dflInstanciaId.hashCode();
		hash = hash * prime + this.useCode.hashCode();
		
		return hash;
	}
}