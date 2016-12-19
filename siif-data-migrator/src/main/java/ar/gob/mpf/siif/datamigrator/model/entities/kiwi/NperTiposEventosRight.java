package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nper_tipos_eventos_rights database table.
 * 
 */
// @Entity
// @Table(name="nper_tipos_eventos_rights")
@NamedQuery(name="NperTiposEventosRight.findAll", query="SELECT n FROM NperTiposEventosRight n")
public class NperTiposEventosRight implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="pte_evento")
	private String pteEvento;

	@Column(name="rig_name")
	private String rigName;

	public NperTiposEventosRight() {
	}

	public String getPteEvento() {
		return this.pteEvento;
	}

	public void setPteEvento(String pteEvento) {
		this.pteEvento = pteEvento;
	}

	public String getRigName() {
		return this.rigName;
	}

	public void setRigName(String rigName) {
		this.rigName = rigName;
	}

}