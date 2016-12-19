package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the eve_handlers database table.
 * 
 */
// @Entity
// @Table(name="eve_handlers")
@NamedQuery(name="EveHandler.findAll", query="SELECT e FROM EveHandler e")
public class EveHandler implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EVH_CODE")
	private int evhCode;

	@Column(name="eve_event")
	private String eveEvent;

	@Column(name="evh_handler")
	private String evhHandler;

	@Column(name="evh_priority")
	private int evhPriority;

	public EveHandler() {
	}

	public int getEvhCode() {
		return this.evhCode;
	}

	public void setEvhCode(int evhCode) {
		this.evhCode = evhCode;
	}

	public String getEveEvent() {
		return this.eveEvent;
	}

	public void setEveEvent(String eveEvent) {
		this.eveEvent = eveEvent;
	}

	public String getEvhHandler() {
		return this.evhHandler;
	}

	public void setEvhHandler(String evhHandler) {
		this.evhHandler = evhHandler;
	}

	public int getEvhPriority() {
		return this.evhPriority;
	}

	public void setEvhPriority(int evhPriority) {
		this.evhPriority = evhPriority;
	}

}