package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spp_tipos_de_informes database table.
 * 
 */
// @Entity
// @Table(name="spp_tipos_de_informes")
@NamedQuery(name="SppTiposDeInforme.findAll", query="SELECT s FROM SppTiposDeInforme s")
public class SppTiposDeInforme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sti_code")
	private int stiCode;

	@Column(name="spj_id")
	private int spjId;

	@Column(name="sti_acceso")
	private String stiAcceso;

	@Column(name="sti_enviar_juscaba")
	private String stiEnviarJuscaba;

	@Column(name="sti_estado")
	private String stiEstado;

	@Column(name="sti_nombre")
	private String stiNombre;

	@Column(name="sti_origen")
	private String stiOrigen;

	@Column(name="sti_revision")
	private String stiRevision;

	public SppTiposDeInforme() {
	}

	public int getStiCode() {
		return this.stiCode;
	}

	public void setStiCode(int stiCode) {
		this.stiCode = stiCode;
	}

	public int getSpjId() {
		return this.spjId;
	}

	public void setSpjId(int spjId) {
		this.spjId = spjId;
	}

	public String getStiAcceso() {
		return this.stiAcceso;
	}

	public void setStiAcceso(String stiAcceso) {
		this.stiAcceso = stiAcceso;
	}

	public String getStiEnviarJuscaba() {
		return this.stiEnviarJuscaba;
	}

	public void setStiEnviarJuscaba(String stiEnviarJuscaba) {
		this.stiEnviarJuscaba = stiEnviarJuscaba;
	}

	public String getStiEstado() {
		return this.stiEstado;
	}

	public void setStiEstado(String stiEstado) {
		this.stiEstado = stiEstado;
	}

	public String getStiNombre() {
		return this.stiNombre;
	}

	public void setStiNombre(String stiNombre) {
		this.stiNombre = stiNombre;
	}

	public String getStiOrigen() {
		return this.stiOrigen;
	}

	public void setStiOrigen(String stiOrigen) {
		this.stiOrigen = stiOrigen;
	}

	public String getStiRevision() {
		return this.stiRevision;
	}

	public void setStiRevision(String stiRevision) {
		this.stiRevision = stiRevision;
	}

}