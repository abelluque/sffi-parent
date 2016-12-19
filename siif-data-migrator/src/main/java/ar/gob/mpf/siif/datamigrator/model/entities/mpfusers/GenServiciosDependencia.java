package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_servicios_dependencias database table.
 * 
 */
// @Entity
// @Table(name="gen_servicios_dependencias")
@NamedQuery(name="GenServiciosDependencia.findAll", query="SELECT g FROM GenServiciosDependencia g")
public class GenServiciosDependencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="gsd_code")
	private int gsdCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="gsv_code")
	private int gsvCode;

	public GenServiciosDependencia() {
	}

	public int getGsdCode() {
		return this.gsdCode;
	}

	public void setGsdCode(int gsdCode) {
		this.gsdCode = gsdCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getGsvCode() {
		return this.gsvCode;
	}

	public void setGsvCode(int gsvCode) {
		this.gsvCode = gsvCode;
	}

}