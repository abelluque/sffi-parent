package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the docum_tipos_adjuntos_den_obligatorios database table.
 * 
 */
// @Entity
// @Table(name="docum_tipos_adjuntos_den_obligatorios")
@NamedQuery(name="DocumTiposAdjuntosDenObligatorio.findAll", query="SELECT d FROM DocumTiposAdjuntosDenObligatorio d")
public class DocumTiposAdjuntosDenObligatorio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="dta_code")
	private int dtaCode;

	@Column(name="dta_obligatorio")
	private String dtaObligatorio;

	public DocumTiposAdjuntosDenObligatorio() {
	}

	public int getDtaCode() {
		return this.dtaCode;
	}

	public void setDtaCode(int dtaCode) {
		this.dtaCode = dtaCode;
	}

	public String getDtaObligatorio() {
		return this.dtaObligatorio;
	}

	public void setDtaObligatorio(String dtaObligatorio) {
		this.dtaObligatorio = dtaObligatorio;
	}

}