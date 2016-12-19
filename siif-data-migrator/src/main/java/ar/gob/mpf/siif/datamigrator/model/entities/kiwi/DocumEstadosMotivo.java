package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the docum_estados_motivos database table.
 * 
 */
// @Entity
// @Table(name="docum_estados_motivos")
@NamedQuery(name="DocumEstadosMotivo.findAll", query="SELECT d FROM DocumEstadosMotivo d")
public class DocumEstadosMotivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="desm_code")
	private int desmCode;

	@Column(name="desm_activo")
	private String desmActivo;

	@Column(name="desm_adjunto_obligatorio")
	private String desmAdjuntoObligatorio;

	@Column(name="desm_clave")
	private String desmClave;

	@Column(name="desm_fundamentacion")
	private String desmFundamentacion;

	@Column(name="desm_motivo")
	private String desmMotivo;

	@Column(name="dest_code")
	private int destCode;

	public DocumEstadosMotivo() {
	}

	public int getDesmCode() {
		return this.desmCode;
	}

	public void setDesmCode(int desmCode) {
		this.desmCode = desmCode;
	}

	public String getDesmActivo() {
		return this.desmActivo;
	}

	public void setDesmActivo(String desmActivo) {
		this.desmActivo = desmActivo;
	}

	public String getDesmAdjuntoObligatorio() {
		return this.desmAdjuntoObligatorio;
	}

	public void setDesmAdjuntoObligatorio(String desmAdjuntoObligatorio) {
		this.desmAdjuntoObligatorio = desmAdjuntoObligatorio;
	}

	public String getDesmClave() {
		return this.desmClave;
	}

	public void setDesmClave(String desmClave) {
		this.desmClave = desmClave;
	}

	public String getDesmFundamentacion() {
		return this.desmFundamentacion;
	}

	public void setDesmFundamentacion(String desmFundamentacion) {
		this.desmFundamentacion = desmFundamentacion;
	}

	public String getDesmMotivo() {
		return this.desmMotivo;
	}

	public void setDesmMotivo(String desmMotivo) {
		this.desmMotivo = desmMotivo;
	}

	public int getDestCode() {
		return this.destCode;
	}

	public void setDestCode(int destCode) {
		this.destCode = destCode;
	}

}