package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nper_tipos_extras database table.
 * 
 */
// @Entity
// @Table(name="nper_tipos_extras")
@NamedQuery(name="NperTiposExtra.findAll", query="SELECT n FROM NperTiposExtra n")
public class NperTiposExtra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pte_code")
	private int pteCode;

	@Column(name="pte_deleted")
	private String pteDeleted;

	@Column(name="pte_nro_orden")
	private int pteNroOrden;

	@Column(name="pte_tipo")
	private String pteTipo;

	@Column(name="pte_titulo")
	private String pteTitulo;

	public NperTiposExtra() {
	}

	public int getPteCode() {
		return this.pteCode;
	}

	public void setPteCode(int pteCode) {
		this.pteCode = pteCode;
	}

	public String getPteDeleted() {
		return this.pteDeleted;
	}

	public void setPteDeleted(String pteDeleted) {
		this.pteDeleted = pteDeleted;
	}

	public int getPteNroOrden() {
		return this.pteNroOrden;
	}

	public void setPteNroOrden(int pteNroOrden) {
		this.pteNroOrden = pteNroOrden;
	}

	public String getPteTipo() {
		return this.pteTipo;
	}

	public void setPteTipo(String pteTipo) {
		this.pteTipo = pteTipo;
	}

	public String getPteTitulo() {
		return this.pteTitulo;
	}

	public void setPteTitulo(String pteTitulo) {
		this.pteTitulo = pteTitulo;
	}

}