package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_provincias database table.
 * 
 */
// @Entity
// @Table(name="gen_provincias")
@NamedQuery(name="GenProvincia.findAll", query="SELECT g FROM GenProvincia g")
public class GenProvincia implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GenProvinciaPK id;

	@Column(name="ppr_codigo")
	private String pprCodigo;

	@Column(name="ppr_nombre_esp")
	private String pprNombreEsp;

	public GenProvincia() {
	}

	public GenProvinciaPK getId() {
		return this.id;
	}

	public void setId(GenProvinciaPK id) {
		this.id = id;
	}

	public String getPprCodigo() {
		return this.pprCodigo;
	}

	public void setPprCodigo(String pprCodigo) {
		this.pprCodigo = pprCodigo;
	}

	public String getPprNombreEsp() {
		return this.pprNombreEsp;
	}

	public void setPprNombreEsp(String pprNombreEsp) {
		this.pprNombreEsp = pprNombreEsp;
	}

}