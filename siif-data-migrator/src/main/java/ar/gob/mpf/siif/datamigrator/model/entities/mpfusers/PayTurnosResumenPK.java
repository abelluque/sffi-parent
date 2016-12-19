package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pay_turnos_resumen database table.
 * 
 */
@Embeddable
public class PayTurnosResumenPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int anio;

	private int mes;

	private int quincena;

	private int fiscalia;

	public PayTurnosResumenPK() {
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
	public int getFiscalia() {
		return this.fiscalia;
	}
	public void setFiscalia(int fiscalia) {
		this.fiscalia = fiscalia;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PayTurnosResumenPK)) {
			return false;
		}
		PayTurnosResumenPK castOther = (PayTurnosResumenPK)other;
		return 
			(this.anio == castOther.anio)
			&& (this.mes == castOther.mes)
			&& (this.quincena == castOther.quincena)
			&& (this.fiscalia == castOther.fiscalia);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.anio;
		hash = hash * prime + this.mes;
		hash = hash * prime + this.quincena;
		hash = hash * prime + this.fiscalia;
		
		return hash;
	}
}