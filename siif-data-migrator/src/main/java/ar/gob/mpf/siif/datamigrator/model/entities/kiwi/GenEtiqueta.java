package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_etiquetas database table.
 * 
 */
// @Entity
// @Table(name="gen_etiquetas")
@NamedQuery(name="GenEtiqueta.findAll", query="SELECT g FROM GenEtiqueta g")
public class GenEtiqueta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="get_dominio")
	private String getDominio;

	@Column(name="get_etiquetas")
	private String getEtiquetas;

	@Column(name="get_id")
	private String getId;

	public GenEtiqueta() {
	}

	public String getGetDominio() {
		return this.getDominio;
	}

	public void setGetDominio(String getDominio) {
		this.getDominio = getDominio;
	}

	public String getGetEtiquetas() {
		return this.getEtiquetas;
	}

	public void setGetEtiquetas(String getEtiquetas) {
		this.getEtiquetas = getEtiquetas;
	}

	public String getGetId() {
		return this.getId;
	}

	public void setGetId(String getId) {
		this.getId = getId;
	}

}