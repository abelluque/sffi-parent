package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pay_tablas database table.
 * 
 */
// @Entity
// @Table(name="pay_tablas")
@NamedQuery(name="PayTabla.findAll", query="SELECT p FROM PayTabla p")
public class PayTabla implements Serializable {
	private static final long serialVersionUID = 1L;

	private String codAl;

	private int codigo;

	private int cotab;

	private String descrip;

	private int jdd;

	private String tipo;

	private int valor;

	private int valor2;

	private String valor4;

	private String valorC;

	@Lob
	private String valorG;

	public PayTabla() {
	}

	public String getCodAl() {
		return this.codAl;
	}

	public void setCodAl(String codAl) {
		this.codAl = codAl;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCotab() {
		return this.cotab;
	}

	public void setCotab(int cotab) {
		this.cotab = cotab;
	}

	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public int getJdd() {
		return this.jdd;
	}

	public void setJdd(int jdd) {
		this.jdd = jdd;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getValor2() {
		return this.valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public String getValor4() {
		return this.valor4;
	}

	public void setValor4(String valor4) {
		this.valor4 = valor4;
	}

	public String getValorC() {
		return this.valorC;
	}

	public void setValorC(String valorC) {
		this.valorC = valorC;
	}

	public String getValorG() {
		return this.valorG;
	}

	public void setValorG(String valorG) {
		this.valorG = valorG;
	}

}