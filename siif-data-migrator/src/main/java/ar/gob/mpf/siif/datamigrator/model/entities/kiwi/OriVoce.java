package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ori_voces database table.
 * 
 */
// @Entity
// @Table(name="ori_voces")
@NamedQuery(name="OriVoce.findAll", query="SELECT o FROM OriVoce o")
public class OriVoce implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ovo_code")
	private int ovoCode;

	@Column(name="ovo_activo")
	private String ovoActivo;

	@Column(name="ovo_voz")
	private String ovoVoz;

	public OriVoce() {
	}

	public int getOvoCode() {
		return this.ovoCode;
	}

	public void setOvoCode(int ovoCode) {
		this.ovoCode = ovoCode;
	}

	public String getOvoActivo() {
		return this.ovoActivo;
	}

	public void setOvoActivo(String ovoActivo) {
		this.ovoActivo = ovoActivo;
	}

	public String getOvoVoz() {
		return this.ovoVoz;
	}

	public void setOvoVoz(String ovoVoz) {
		this.ovoVoz = ovoVoz;
	}

}