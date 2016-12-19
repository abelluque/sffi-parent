package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the dec_di database table.
 * 
 */
@Embeddable
public class DecDiPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ddi_codigo_dec_di")
	private String ddiCodigoDecDi;

	@Column(name="ddi_orden")
	private int ddiOrden;

	public DecDiPK() {
	}
	public String getDdiCodigoDecDi() {
		return this.ddiCodigoDecDi;
	}
	public void setDdiCodigoDecDi(String ddiCodigoDecDi) {
		this.ddiCodigoDecDi = ddiCodigoDecDi;
	}
	public int getDdiOrden() {
		return this.ddiOrden;
	}
	public void setDdiOrden(int ddiOrden) {
		this.ddiOrden = ddiOrden;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DecDiPK)) {
			return false;
		}
		DecDiPK castOther = (DecDiPK)other;
		return 
			this.ddiCodigoDecDi.equals(castOther.ddiCodigoDecDi)
			&& (this.ddiOrden == castOther.ddiOrden);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ddiCodigoDecDi.hashCode();
		hash = hash * prime + this.ddiOrden;
		
		return hash;
	}
}