package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spp_pasos_juscaba database table.
 * 
 */
// @Entity
// @Table(name="spp_pasos_juscaba")
@NamedQuery(name="SppPasosJuscaba.findAll", query="SELECT s FROM SppPasosJuscaba s")
public class SppPasosJuscaba implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="spj_id")
	private int spjId;

	@Column(name="dtjp_estado")
	private String dtjpEstado;

	@Column(name="spj_paso_id")
	private int spjPasoId;

	@Column(name="spj_paso_id_label")
	private String spjPasoIdLabel;

	public SppPasosJuscaba() {
	}

	public int getSpjId() {
		return this.spjId;
	}

	public void setSpjId(int spjId) {
		this.spjId = spjId;
	}

	public String getDtjpEstado() {
		return this.dtjpEstado;
	}

	public void setDtjpEstado(String dtjpEstado) {
		this.dtjpEstado = dtjpEstado;
	}

	public int getSpjPasoId() {
		return this.spjPasoId;
	}

	public void setSpjPasoId(int spjPasoId) {
		this.spjPasoId = spjPasoId;
	}

	public String getSpjPasoIdLabel() {
		return this.spjPasoIdLabel;
	}

	public void setSpjPasoIdLabel(String spjPasoIdLabel) {
		this.spjPasoIdLabel = spjPasoIdLabel;
	}

}