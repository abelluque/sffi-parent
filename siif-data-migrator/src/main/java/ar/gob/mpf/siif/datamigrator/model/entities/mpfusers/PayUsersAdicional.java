package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the pay_users_adicional database table.
 * 
 */
// @Entity
// @Table(name="pay_users_adicional")
@NamedQuery(name="PayUsersAdicional.findAll", query="SELECT p FROM PayUsersAdicional p")
public class PayUsersAdicional implements Serializable {
	private static final long serialVersionUID = 1L;

	private int codcam;

	private String codigo;

	private int jdd;

	private String valorC;

	@Temporal(TemporalType.TIMESTAMP)
	private Date valorF;

	private BigDecimal valorN;

	public PayUsersAdicional() {
	}

	public int getCodcam() {
		return this.codcam;
	}

	public void setCodcam(int codcam) {
		this.codcam = codcam;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getJdd() {
		return this.jdd;
	}

	public void setJdd(int jdd) {
		this.jdd = jdd;
	}

	public String getValorC() {
		return this.valorC;
	}

	public void setValorC(String valorC) {
		this.valorC = valorC;
	}

	public Date getValorF() {
		return this.valorF;
	}

	public void setValorF(Date valorF) {
		this.valorF = valorF;
	}

	public BigDecimal getValorN() {
		return this.valorN;
	}

	public void setValorN(BigDecimal valorN) {
		this.valorN = valorN;
	}

}