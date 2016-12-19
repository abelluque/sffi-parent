package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cij_diligencias_agentes database table.
 * 
 */
// @Entity
// @Table(name="cij_diligencias_agentes")
@NamedQuery(name="CijDiligenciasAgente.findAll", query="SELECT c FROM CijDiligenciasAgente c")
public class CijDiligenciasAgente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cda_code")
	private int cdaCode;

	@Column(name="cda_agente")
	private int cdaAgente;

	@Column(name="cda_avance")
	private String cdaAvance;

	@Column(name="cda_estado")
	private String cdaEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cda_tstamp")
	private Date cdaTstamp;

	@Column(name="cid_code")
	private int cidCode;

	public CijDiligenciasAgente() {
	}

	public int getCdaCode() {
		return this.cdaCode;
	}

	public void setCdaCode(int cdaCode) {
		this.cdaCode = cdaCode;
	}

	public int getCdaAgente() {
		return this.cdaAgente;
	}

	public void setCdaAgente(int cdaAgente) {
		this.cdaAgente = cdaAgente;
	}

	public String getCdaAvance() {
		return this.cdaAvance;
	}

	public void setCdaAvance(String cdaAvance) {
		this.cdaAvance = cdaAvance;
	}

	public String getCdaEstado() {
		return this.cdaEstado;
	}

	public void setCdaEstado(String cdaEstado) {
		this.cdaEstado = cdaEstado;
	}

	public Date getCdaTstamp() {
		return this.cdaTstamp;
	}

	public void setCdaTstamp(Date cdaTstamp) {
		this.cdaTstamp = cdaTstamp;
	}

	public int getCidCode() {
		return this.cidCode;
	}

	public void setCidCode(int cidCode) {
		this.cidCode = cidCode;
	}

}