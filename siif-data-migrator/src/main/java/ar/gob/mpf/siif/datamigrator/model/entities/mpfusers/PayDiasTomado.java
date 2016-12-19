package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pay_dias_tomados database table.
 * 
 */
// @Entity
// @Table(name="pay_dias_tomados")
@NamedQuery(name="PayDiasTomado.findAll", query="SELECT p FROM PayDiasTomado p")
public class PayDiasTomado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="gcc_code")
	private int gccCode;

	@Column(name="sdt_cant_dias_tomados")
	private int sdtCantDiasTomados;

	@Column(name="sdt_cant_usr")
	private int sdtCantUsr;

	public PayDiasTomado() {
	}

	public int getGccCode() {
		return this.gccCode;
	}

	public void setGccCode(int gccCode) {
		this.gccCode = gccCode;
	}

	public int getSdtCantDiasTomados() {
		return this.sdtCantDiasTomados;
	}

	public void setSdtCantDiasTomados(int sdtCantDiasTomados) {
		this.sdtCantDiasTomados = sdtCantDiasTomados;
	}

	public int getSdtCantUsr() {
		return this.sdtCantUsr;
	}

	public void setSdtCantUsr(int sdtCantUsr) {
		this.sdtCantUsr = sdtCantUsr;
	}

}