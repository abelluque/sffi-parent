package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tsj_expedientes_recursos_interpuestos database table.
 * 
 */
// @Entity
// @Table(name="tsj_expedientes_recursos_interpuestos")
@NamedQuery(name="TsjExpedientesRecursosInterpuesto.findAll", query="SELECT t FROM TsjExpedientesRecursosInterpuesto t")
public class TsjExpedientesRecursosInterpuesto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="eri_code")
	private int eriCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="eri_fecha_interpuesto")
	private Date eriFechaInterpuesto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="eri_fecha_sentencia")
	private Date eriFechaSentencia;

	@Column(name="eri_nombre")
	private String eriNombre;

	@Column(name="eri_observacion")
	private String eriObservacion;

	@Column(name="eri_plazo")
	private String eriPlazo;

	@Column(name="exp_code")
	private int expCode;

	public TsjExpedientesRecursosInterpuesto() {
	}

	public int getEriCode() {
		return this.eriCode;
	}

	public void setEriCode(int eriCode) {
		this.eriCode = eriCode;
	}

	public Date getEriFechaInterpuesto() {
		return this.eriFechaInterpuesto;
	}

	public void setEriFechaInterpuesto(Date eriFechaInterpuesto) {
		this.eriFechaInterpuesto = eriFechaInterpuesto;
	}

	public Date getEriFechaSentencia() {
		return this.eriFechaSentencia;
	}

	public void setEriFechaSentencia(Date eriFechaSentencia) {
		this.eriFechaSentencia = eriFechaSentencia;
	}

	public String getEriNombre() {
		return this.eriNombre;
	}

	public void setEriNombre(String eriNombre) {
		this.eriNombre = eriNombre;
	}

	public String getEriObservacion() {
		return this.eriObservacion;
	}

	public void setEriObservacion(String eriObservacion) {
		this.eriObservacion = eriObservacion;
	}

	public String getEriPlazo() {
		return this.eriPlazo;
	}

	public void setEriPlazo(String eriPlazo) {
		this.eriPlazo = eriPlazo;
	}

	public int getExpCode() {
		return this.expCode;
	}

	public void setExpCode(int expCode) {
		this.expCode = expCode;
	}

}