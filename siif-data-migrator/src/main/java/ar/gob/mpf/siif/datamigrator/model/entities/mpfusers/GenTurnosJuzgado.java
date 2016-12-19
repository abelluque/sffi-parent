package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the gen_turnos_juzgados database table.
 * 
 */
// @Entity
// @Table(name="gen_turnos_juzgados")
@NamedQuery(name="GenTurnosJuzgado.findAll", query="SELECT g FROM GenTurnosJuzgado g")
public class GenTurnosJuzgado implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GenTurnosJuzgadoPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_desde")
	private Date fechaDesde;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_hasta")
	private Date fechaHasta;

	@Column(name="juzgado_id")
	private int juzgadoId;

	public GenTurnosJuzgado() {
	}

	public GenTurnosJuzgadoPK getId() {
		return this.id;
	}

	public void setId(GenTurnosJuzgadoPK id) {
		this.id = id;
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

	public int getJuzgadoId() {
		return this.juzgadoId;
	}

	public void setJuzgadoId(int juzgadoId) {
		this.juzgadoId = juzgadoId;
	}

}