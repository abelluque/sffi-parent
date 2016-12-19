package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_revisiones_eventos database table.
 * 
 */
// @Entity
// @Table(name="docum_revisiones_eventos")
@NamedQuery(name="DocumRevisionesEvento.findAll", query="SELECT d FROM DocumRevisionesEvento d")
public class DocumRevisionesEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="drev_code")
	private int drevCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="dre_code")
	private int dreCode;

	@Column(name="dre_estado")
	private String dreEstado;

	@Lob
	@Column(name="drev_observacion")
	private String drevObservacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="drev_tstamp")
	private Date drevTstamp;

	@Column(name="use_code")
	private String useCode;

	public DocumRevisionesEvento() {
	}

	public int getDrevCode() {
		return this.drevCode;
	}

	public void setDrevCode(int drevCode) {
		this.drevCode = drevCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getDreCode() {
		return this.dreCode;
	}

	public void setDreCode(int dreCode) {
		this.dreCode = dreCode;
	}

	public String getDreEstado() {
		return this.dreEstado;
	}

	public void setDreEstado(String dreEstado) {
		this.dreEstado = dreEstado;
	}

	public String getDrevObservacion() {
		return this.drevObservacion;
	}

	public void setDrevObservacion(String drevObservacion) {
		this.drevObservacion = drevObservacion;
	}

	public Date getDrevTstamp() {
		return this.drevTstamp;
	}

	public void setDrevTstamp(Date drevTstamp) {
		this.drevTstamp = drevTstamp;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}