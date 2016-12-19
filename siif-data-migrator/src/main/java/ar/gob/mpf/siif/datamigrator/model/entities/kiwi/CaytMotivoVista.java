package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cayt_motivo_vista database table.
 * 
 */
// @Entity
// @Table(name="cayt_motivo_vista")
@NamedQuery(name="CaytMotivoVista.findAll", query="SELECT c FROM CaytMotivoVista c")
public class CaytMotivoVista implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mtv_code")
	private int mtvCode;

	@Column(name="mtv_activo")
	private String mtvActivo;

	@Column(name="mtv_nombre")
	private String mtvNombre;

	public CaytMotivoVista() {
	}

	public int getMtvCode() {
		return this.mtvCode;
	}

	public void setMtvCode(int mtvCode) {
		this.mtvCode = mtvCode;
	}

	public String getMtvActivo() {
		return this.mtvActivo;
	}

	public void setMtvActivo(String mtvActivo) {
		this.mtvActivo = mtvActivo;
	}

	public String getMtvNombre() {
		return this.mtvNombre;
	}

	public void setMtvNombre(String mtvNombre) {
		this.mtvNombre = mtvNombre;
	}

}