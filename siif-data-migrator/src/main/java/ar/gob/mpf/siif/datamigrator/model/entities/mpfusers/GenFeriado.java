package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the gen_feriados database table.
 * 
 */
// @Entity
// @Table(name="gen_feriados")
@NamedQuery(name="GenFeriado.findAll", query="SELECT g FROM GenFeriado g")
public class GenFeriado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="gfe_fecha")
	private Date gfeFecha;

	@Column(name="gfe_motivo")
	private String gfeMotivo;

	@Column(name="gfe_tipo")
	private String gfeTipo;

	public GenFeriado() {
	}

	public Date getGfeFecha() {
		return this.gfeFecha;
	}

	public void setGfeFecha(Date gfeFecha) {
		this.gfeFecha = gfeFecha;
	}

	public String getGfeMotivo() {
		return this.gfeMotivo;
	}

	public void setGfeMotivo(String gfeMotivo) {
		this.gfeMotivo = gfeMotivo;
	}

	public String getGfeTipo() {
		return this.gfeTipo;
	}

	public void setGfeTipo(String gfeTipo) {
		this.gfeTipo = gfeTipo;
	}

}