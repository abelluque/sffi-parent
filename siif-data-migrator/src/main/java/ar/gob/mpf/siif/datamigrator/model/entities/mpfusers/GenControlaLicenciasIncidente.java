package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the gen_controla_licencias_incidentes database table.
 * 
 */
// @Entity
// @Table(name="gen_controla_licencias_incidentes")
@NamedQuery(name="GenControlaLicenciasIncidente.findAll", query="SELECT g FROM GenControlaLicenciasIncidente g")
public class GenControlaLicenciasIncidente implements Serializable {
	private static final long serialVersionUID = 1L;

	private String codigo;

	private String descripcion;

	private String legajo;

	private Timestamp tmstamp;

	private String valor;

	public GenControlaLicenciasIncidente() {
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLegajo() {
		return this.legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public Timestamp getTmstamp() {
		return this.tmstamp;
	}

	public void setTmstamp(Timestamp tmstamp) {
		this.tmstamp = tmstamp;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}