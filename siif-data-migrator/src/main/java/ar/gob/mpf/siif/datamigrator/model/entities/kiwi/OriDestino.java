package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ori_destinos database table.
 * 
 */
// @Entity
// @Table(name="ori_destinos")
@NamedQuery(name="OriDestino.findAll", query="SELECT o FROM OriDestino o")
public class OriDestino implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ode_code")
	private int odeCode;

	@Column(name="ode_activo")
	private String odeActivo;

	@Column(name="ode_destino")
	private String odeDestino;

	public OriDestino() {
	}

	public int getOdeCode() {
		return this.odeCode;
	}

	public void setOdeCode(int odeCode) {
		this.odeCode = odeCode;
	}

	public String getOdeActivo() {
		return this.odeActivo;
	}

	public void setOdeActivo(String odeActivo) {
		this.odeActivo = odeActivo;
	}

	public String getOdeDestino() {
		return this.odeDestino;
	}

	public void setOdeDestino(String odeDestino) {
		this.odeDestino = odeDestino;
	}

}