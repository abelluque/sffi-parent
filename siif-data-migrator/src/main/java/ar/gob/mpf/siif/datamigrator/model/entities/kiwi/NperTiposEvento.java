package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nper_tipos_eventos database table.
 * 
 */
// @Entity
// @Table(name="nper_tipos_eventos")
@NamedQuery(name="NperTiposEvento.findAll", query="SELECT n FROM NperTiposEvento n")
public class NperTiposEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pte_evento")
	private String pteEvento;

	@Column(name="pte_code_name")
	private String pteCodeName;

	@Column(name="pte_deleted")
	private String pteDeleted;

	@Column(name="pte_descripcion")
	private String pteDescripcion;

	@Column(name="pte_link_evento")
	private String pteLinkEvento;

	@Column(name="pte_sigla")
	private String pteSigla;

	public NperTiposEvento() {
	}

	public String getPteEvento() {
		return this.pteEvento;
	}

	public void setPteEvento(String pteEvento) {
		this.pteEvento = pteEvento;
	}

	public String getPteCodeName() {
		return this.pteCodeName;
	}

	public void setPteCodeName(String pteCodeName) {
		this.pteCodeName = pteCodeName;
	}

	public String getPteDeleted() {
		return this.pteDeleted;
	}

	public void setPteDeleted(String pteDeleted) {
		this.pteDeleted = pteDeleted;
	}

	public String getPteDescripcion() {
		return this.pteDescripcion;
	}

	public void setPteDescripcion(String pteDescripcion) {
		this.pteDescripcion = pteDescripcion;
	}

	public String getPteLinkEvento() {
		return this.pteLinkEvento;
	}

	public void setPteLinkEvento(String pteLinkEvento) {
		this.pteLinkEvento = pteLinkEvento;
	}

	public String getPteSigla() {
		return this.pteSigla;
	}

	public void setPteSigla(String pteSigla) {
		this.pteSigla = pteSigla;
	}

}