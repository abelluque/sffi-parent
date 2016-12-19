package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pay_turnos_resumen database table.
 * 
 */
// @Entity
// @Table(name="pay_turnos_resumen")
@NamedQuery(name="PayTurnosResumen.findAll", query="SELECT p FROM PayTurnosResumen p")
public class PayTurnosResumen implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PayTurnosResumenPK id;

	@Column(name="codigo_fiscal")
	private String codigoFiscal;

	@Column(name="codigo_secretario")
	private String codigoSecretario;

	private String comisarias;

	private int defensoria;

	private String fiscal;

	private int juzgado;

	private String secretario;

	private int unidad;

	public PayTurnosResumen() {
	}

	public PayTurnosResumenPK getId() {
		return this.id;
	}

	public void setId(PayTurnosResumenPK id) {
		this.id = id;
	}

	public String getCodigoFiscal() {
		return this.codigoFiscal;
	}

	public void setCodigoFiscal(String codigoFiscal) {
		this.codigoFiscal = codigoFiscal;
	}

	public String getCodigoSecretario() {
		return this.codigoSecretario;
	}

	public void setCodigoSecretario(String codigoSecretario) {
		this.codigoSecretario = codigoSecretario;
	}

	public String getComisarias() {
		return this.comisarias;
	}

	public void setComisarias(String comisarias) {
		this.comisarias = comisarias;
	}

	public int getDefensoria() {
		return this.defensoria;
	}

	public void setDefensoria(int defensoria) {
		this.defensoria = defensoria;
	}

	public String getFiscal() {
		return this.fiscal;
	}

	public void setFiscal(String fiscal) {
		this.fiscal = fiscal;
	}

	public int getJuzgado() {
		return this.juzgado;
	}

	public void setJuzgado(int juzgado) {
		this.juzgado = juzgado;
	}

	public String getSecretario() {
		return this.secretario;
	}

	public void setSecretario(String secretario) {
		this.secretario = secretario;
	}

	public int getUnidad() {
		return this.unidad;
	}

	public void setUnidad(int unidad) {
		this.unidad = unidad;
	}

}