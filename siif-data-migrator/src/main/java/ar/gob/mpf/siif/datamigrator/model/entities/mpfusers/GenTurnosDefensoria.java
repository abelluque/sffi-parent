package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the gen_turnos_defensorias database table.
 * 
 */
// @Entity
// @Table(name="gen_turnos_defensorias")
@NamedQuery(name="GenTurnosDefensoria.findAll", query="SELECT g FROM GenTurnosDefensoria g")
public class GenTurnosDefensoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GenTurnosDefensoriaPK id;

	@Column(name="defensoria_id")
	private int defensoriaId;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_desde")
	private Date fechaDesde;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_hasta")
	private Date fechaHasta;

	public GenTurnosDefensoria() {
	}

	public GenTurnosDefensoriaPK getId() {
		return this.id;
	}

	public void setId(GenTurnosDefensoriaPK id) {
		this.id = id;
	}

	public int getDefensoriaId() {
		return this.defensoriaId;
	}

	public void setDefensoriaId(int defensoriaId) {
		this.defensoriaId = defensoriaId;
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

}