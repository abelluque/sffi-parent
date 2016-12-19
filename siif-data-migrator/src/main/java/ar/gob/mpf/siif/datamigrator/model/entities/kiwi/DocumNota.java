package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_notas database table.
 * 
 */
// @Entity
// @Table(name="docum_notas")
@NamedQuery(name="DocumNota.findAll", query="SELECT d FROM DocumNota d")
public class DocumNota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dno_code")
	private int dnoCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="dno_compartida")
	private String dnoCompartida;

	@Lob
	@Column(name="dno_texto")
	private String dnoTexto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dno_tstamp")
	private Date dnoTstamp;

	@Column(name="doc_id")
	private String docId;

	@Column(name="use_code")
	private String useCode;

	public DocumNota() {
	}

	public int getDnoCode() {
		return this.dnoCode;
	}

	public void setDnoCode(int dnoCode) {
		this.dnoCode = dnoCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getDnoCompartida() {
		return this.dnoCompartida;
	}

	public void setDnoCompartida(String dnoCompartida) {
		this.dnoCompartida = dnoCompartida;
	}

	public String getDnoTexto() {
		return this.dnoTexto;
	}

	public void setDnoTexto(String dnoTexto) {
		this.dnoTexto = dnoTexto;
	}

	public Date getDnoTstamp() {
		return this.dnoTstamp;
	}

	public void setDnoTstamp(Date dnoTstamp) {
		this.dnoTstamp = dnoTstamp;
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}