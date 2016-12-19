package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_feriados database table.
 * 
 */
// @Entity
// @Table(name="gen_feriados")
@NamedQuery(name="GenFeriado.findAll", query="SELECT g FROM GenFeriado g")
public class GenFeriado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="gfe_fecha")
	private int gfeFecha;

	@Column(name="gfe_motivo")
	private int gfeMotivo;

	@Column(name="gfe_tipo")
	private int gfeTipo;

	public GenFeriado() {
	}

	public int getGfeFecha() {
		return this.gfeFecha;
	}

	public void setGfeFecha(int gfeFecha) {
		this.gfeFecha = gfeFecha;
	}

	public int getGfeMotivo() {
		return this.gfeMotivo;
	}

	public void setGfeMotivo(int gfeMotivo) {
		this.gfeMotivo = gfeMotivo;
	}

	public int getGfeTipo() {
		return this.gfeTipo;
	}

	public void setGfeTipo(int gfeTipo) {
		this.gfeTipo = gfeTipo;
	}

}