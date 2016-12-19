package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_conexidades database table.
 * 
 */
// @Entity
// @Table(name="docum_conexidades")
@NamedQuery(name="DocumConexidade.findAll", query="SELECT d FROM DocumConexidade d")
public class DocumConexidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dcon_code")
	private int dconCode;

	@Column(name="dcon_doc_id")
	private String dconDocId;

	@Column(name="dcon_estado")
	private String dconEstado;

	@Column(name="dcon_nota")
	private String dconNota;

	@Column(name="dcon_operador")
	private int dconOperador;

	@Column(name="dcon_tabla")
	private String dconTabla;

	@Column(name="dcon_tipo")
	private String dconTipo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dcon_tstamp")
	private Date dconTstamp;

	@Column(name="dconr_tabla")
	private String dconrTabla;

	public DocumConexidade() {
	}

	public int getDconCode() {
		return this.dconCode;
	}

	public void setDconCode(int dconCode) {
		this.dconCode = dconCode;
	}

	public String getDconDocId() {
		return this.dconDocId;
	}

	public void setDconDocId(String dconDocId) {
		this.dconDocId = dconDocId;
	}

	public String getDconEstado() {
		return this.dconEstado;
	}

	public void setDconEstado(String dconEstado) {
		this.dconEstado = dconEstado;
	}

	public String getDconNota() {
		return this.dconNota;
	}

	public void setDconNota(String dconNota) {
		this.dconNota = dconNota;
	}

	public int getDconOperador() {
		return this.dconOperador;
	}

	public void setDconOperador(int dconOperador) {
		this.dconOperador = dconOperador;
	}

	public String getDconTabla() {
		return this.dconTabla;
	}

	public void setDconTabla(String dconTabla) {
		this.dconTabla = dconTabla;
	}

	public String getDconTipo() {
		return this.dconTipo;
	}

	public void setDconTipo(String dconTipo) {
		this.dconTipo = dconTipo;
	}

	public Date getDconTstamp() {
		return this.dconTstamp;
	}

	public void setDconTstamp(Date dconTstamp) {
		this.dconTstamp = dconTstamp;
	}

	public String getDconrTabla() {
		return this.dconrTabla;
	}

	public void setDconrTabla(String dconrTabla) {
		this.dconrTabla = dconrTabla;
	}

}