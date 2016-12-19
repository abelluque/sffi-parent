package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the gen_turnos_fiscalias database table.
 * 
 */
@Embeddable
public class GenTurnosFiscaliaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String zona;

	private int anio;

	private int mes;

	private int quincena;

	public GenTurnosFiscaliaPK() {
	}
	public String getZona() {
		return this.zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public int getAnio() {
		return this.anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getMes() {
		return this.mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getQuincena() {
		return this.quincena;
	}
	public void setQuincena(int quincena) {
		this.quincena = quincena;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof GenTurnosFiscaliaPK)) {
			return false;
		}
		GenTurnosFiscaliaPK castOther = (GenTurnosFiscaliaPK)other;
		return 
			this.zona.equals(castOther.zona)
			&& (this.anio == castOther.anio)
			&& (this.mes == castOther.mes)
			&& (this.quincena == castOther.quincena);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.zona.hashCode();
		hash = hash * prime + this.anio;
		hash = hash * prime + this.mes;
		hash = hash * prime + this.quincena;
		
		return hash;
	}
}