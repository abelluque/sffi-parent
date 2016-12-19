package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the ocmarc_salas_turnos database table.
 * 
 */
// @Entity
// @Table(name="ocmarc_salas_turnos")
@NamedQuery(name="OcmarcSalasTurno.findAll", query="SELECT o FROM OcmarcSalasTurno o")
public class OcmarcSalasTurno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ost_code")
	private int ostCode;

	@Column(name="ocs_code")
	private int ocsCode;

	@Column(name="ost_desde")
	private Time ostDesde;

	@Column(name="ost_dia")
	private int ostDia;

	@Column(name="ost_duracion")
	private int ostDuracion;

	@Column(name="ost_hasta")
	private Time ostHasta;

	@Column(name="ost_tipo")
	private String ostTipo;

	public OcmarcSalasTurno() {
	}

	public int getOstCode() {
		return this.ostCode;
	}

	public void setOstCode(int ostCode) {
		this.ostCode = ostCode;
	}

	public int getOcsCode() {
		return this.ocsCode;
	}

	public void setOcsCode(int ocsCode) {
		this.ocsCode = ocsCode;
	}

	public Time getOstDesde() {
		return this.ostDesde;
	}

	public void setOstDesde(Time ostDesde) {
		this.ostDesde = ostDesde;
	}

	public int getOstDia() {
		return this.ostDia;
	}

	public void setOstDia(int ostDia) {
		this.ostDia = ostDia;
	}

	public int getOstDuracion() {
		return this.ostDuracion;
	}

	public void setOstDuracion(int ostDuracion) {
		this.ostDuracion = ostDuracion;
	}

	public Time getOstHasta() {
		return this.ostHasta;
	}

	public void setOstHasta(Time ostHasta) {
		this.ostHasta = ostHasta;
	}

	public String getOstTipo() {
		return this.ostTipo;
	}

	public void setOstTipo(String ostTipo) {
		this.ostTipo = ostTipo;
	}

}