package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_serv_dependencias_origen database table.
 * 
 */
// @Entity
// @Table(name="gen_serv_dependencias_origen")
@NamedQuery(name="GenServDependenciasOrigen.findAll", query="SELECT g FROM GenServDependenciasOrigen g")
public class GenServDependenciasOrigen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="gsd_code")
	private int gsdCode;

	public GenServDependenciasOrigen() {
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getGsdCode() {
		return this.gsdCode;
	}

	public void setGsdCode(int gsdCode) {
		this.gsdCode = gsdCode;
	}

}