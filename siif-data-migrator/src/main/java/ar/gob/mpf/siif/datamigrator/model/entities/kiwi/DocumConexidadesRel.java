package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_conexidades_rel database table.
 * 
 */
// @Entity
// @Table(name="docum_conexidades_rel")
@NamedQuery(name="DocumConexidadesRel.findAll", query="SELECT d FROM DocumConexidadesRel d")
public class DocumConexidadesRel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dconr_code")
	private int dconrCode;

	private String conectada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cuando_conecto")
	private Date cuandoConecto;

	@Column(name="dcon_code")
	private int dconCode;

	@Column(name="dconr_codigo")
	private int dconrCodigo;

	@Column(name="dconr_codigo_rel")
	private int dconrCodigoRel;

	@Column(name="dconr_doc_id_rel")
	private String dconrDocIdRel;

	@Column(name="dconr_estado")
	private String dconrEstado;

	@Column(name="dconr_rol")
	private String dconrRol;

	@Column(name="dconr_rol_rel")
	private String dconrRolRel;

	@Column(name="dconr_tabla")
	private String dconrTabla;

	@Column(name="fundamento_conecto")
	private String fundamentoConecto;

	@Column(name="per_code")
	private int perCode;

	@Column(name="quien_conecto")
	private int quienConecto;

	public DocumConexidadesRel() {
	}

	public int getDconrCode() {
		return this.dconrCode;
	}

	public void setDconrCode(int dconrCode) {
		this.dconrCode = dconrCode;
	}

	public String getConectada() {
		return this.conectada;
	}

	public void setConectada(String conectada) {
		this.conectada = conectada;
	}

	public Date getCuandoConecto() {
		return this.cuandoConecto;
	}

	public void setCuandoConecto(Date cuandoConecto) {
		this.cuandoConecto = cuandoConecto;
	}

	public int getDconCode() {
		return this.dconCode;
	}

	public void setDconCode(int dconCode) {
		this.dconCode = dconCode;
	}

	public int getDconrCodigo() {
		return this.dconrCodigo;
	}

	public void setDconrCodigo(int dconrCodigo) {
		this.dconrCodigo = dconrCodigo;
	}

	public int getDconrCodigoRel() {
		return this.dconrCodigoRel;
	}

	public void setDconrCodigoRel(int dconrCodigoRel) {
		this.dconrCodigoRel = dconrCodigoRel;
	}

	public String getDconrDocIdRel() {
		return this.dconrDocIdRel;
	}

	public void setDconrDocIdRel(String dconrDocIdRel) {
		this.dconrDocIdRel = dconrDocIdRel;
	}

	public String getDconrEstado() {
		return this.dconrEstado;
	}

	public void setDconrEstado(String dconrEstado) {
		this.dconrEstado = dconrEstado;
	}

	public String getDconrRol() {
		return this.dconrRol;
	}

	public void setDconrRol(String dconrRol) {
		this.dconrRol = dconrRol;
	}

	public String getDconrRolRel() {
		return this.dconrRolRel;
	}

	public void setDconrRolRel(String dconrRolRel) {
		this.dconrRolRel = dconrRolRel;
	}

	public String getDconrTabla() {
		return this.dconrTabla;
	}

	public void setDconrTabla(String dconrTabla) {
		this.dconrTabla = dconrTabla;
	}

	public String getFundamentoConecto() {
		return this.fundamentoConecto;
	}

	public void setFundamentoConecto(String fundamentoConecto) {
		this.fundamentoConecto = fundamentoConecto;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public int getQuienConecto() {
		return this.quienConecto;
	}

	public void setQuienConecto(int quienConecto) {
		this.quienConecto = quienConecto;
	}

}