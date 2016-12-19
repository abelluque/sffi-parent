package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tsj_remitos_expedientes_detalle database table.
 * 
 */
// @Entity
// @Table(name="tsj_remitos_expedientes_detalle")
@NamedQuery(name="TsjRemitosExpedientesDetalle.findAll", query="SELECT t FROM TsjRemitosExpedientesDetalle t")
public class TsjRemitosExpedientesDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="red_code")
	private int redCode;

	@Column(name="exi_code")
	private int exiCode;

	@Column(name="red_observaciones")
	private String redObservaciones;

	@Column(name="rex_code")
	private int rexCode;

	public TsjRemitosExpedientesDetalle() {
	}

	public int getRedCode() {
		return this.redCode;
	}

	public void setRedCode(int redCode) {
		this.redCode = redCode;
	}

	public int getExiCode() {
		return this.exiCode;
	}

	public void setExiCode(int exiCode) {
		this.exiCode = exiCode;
	}

	public String getRedObservaciones() {
		return this.redObservaciones;
	}

	public void setRedObservaciones(String redObservaciones) {
		this.redObservaciones = redObservaciones;
	}

	public int getRexCode() {
		return this.rexCode;
	}

	public void setRexCode(int rexCode) {
		this.rexCode = rexCode;
	}

}