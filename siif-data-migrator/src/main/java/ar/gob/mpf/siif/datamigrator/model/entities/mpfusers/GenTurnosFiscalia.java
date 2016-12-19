package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the gen_turnos_fiscalias database table.
 * 
 */
// @Entity
// @Table(name="gen_turnos_fiscalias")
@NamedQuery(name="GenTurnosFiscalia.findAll", query="SELECT g FROM GenTurnosFiscalia g")
public class GenTurnosFiscalia implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GenTurnosFiscaliaPK id;

	private String comisarias;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_desde")
	private Date fechaDesde;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_hasta")
	private Date fechaHasta;

	@Column(name="fiscal_id")
	private int fiscalId;

	@Column(name="fiscalia_id")
	private int fiscaliaId;

	@Column(name="secretario_id")
	private int secretarioId;

	public GenTurnosFiscalia() {
	}

	public GenTurnosFiscaliaPK getId() {
		return this.id;
	}

	public void setId(GenTurnosFiscaliaPK id) {
		this.id = id;
	}

	public String getComisarias() {
		return this.comisarias;
	}

	public void setComisarias(String comisarias) {
		this.comisarias = comisarias;
	}

	public Date getFechaDesde() {
		return this.fechaDesde;
	}

	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public Date getFechaHasta() {
		return this.fechaHasta;
	}

	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	public int getFiscalId() {
		return this.fiscalId;
	}

	public void setFiscalId(int fiscalId) {
		this.fiscalId = fiscalId;
	}

	public int getFiscaliaId() {
		return this.fiscaliaId;
	}

	public void setFiscaliaId(int fiscaliaId) {
		this.fiscaliaId = fiscaliaId;
	}

	public int getSecretarioId() {
		return this.secretarioId;
	}

	public void setSecretarioId(int secretarioId) {
		this.secretarioId = secretarioId;
	}

}