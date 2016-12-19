package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the gen_procesos database table.
 * 
 */
// @Entity
// @Table(name="gen_procesos")
@NamedQuery(name="GenProceso.findAll", query="SELECT g FROM GenProceso g")
public class GenProceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="gp_nombre")
	private String gpNombre;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="gp_ultima_fecha_ejecucion")
	private Date gpUltimaFechaEjecucion;

	public GenProceso() {
	}

	public String getGpNombre() {
		return this.gpNombre;
	}

	public void setGpNombre(String gpNombre) {
		this.gpNombre = gpNombre;
	}

	public Date getGpUltimaFechaEjecucion() {
		return this.gpUltimaFechaEjecucion;
	}

	public void setGpUltimaFechaEjecucion(Date gpUltimaFechaEjecucion) {
		this.gpUltimaFechaEjecucion = gpUltimaFechaEjecucion;
	}

}