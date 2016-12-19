package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_dependencias_juscaba database table.
 * 
 */
// @Entity
// @Table(name="gen_dependencias_juscaba")
@NamedQuery(name="GenDependenciasJuscaba.findAll", query="SELECT g FROM GenDependenciasJuscaba g")
public class GenDependenciasJuscaba implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="aal_codigo")
	private int aalCodigo;

	private int actor_legal_ID;

	private String convenio;

	public GenDependenciasJuscaba() {
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getActor_legal_ID() {
		return this.actor_legal_ID;
	}

	public void setActor_legal_ID(int actor_legal_ID) {
		this.actor_legal_ID = actor_legal_ID;
	}

	public String getConvenio() {
		return this.convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

}