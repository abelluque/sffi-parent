package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tsj_remitos_expedientes database table.
 * 
 */
// @Entity
// @Table(name="tsj_remitos_expedientes")
@NamedQuery(name="TsjRemitosExpediente.findAll", query="SELECT t FROM TsjRemitosExpediente t")
public class TsjRemitosExpediente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="rex_code")
	private int rexCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="rex_cantidad")
	private int rexCantidad;

	@Column(name="rex_estado")
	private String rexEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="rex_fecha")
	private Date rexFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="rex_tstamp")
	private Date rexTstamp;

	@Column(name="use_code")
	private String useCode;

	public TsjRemitosExpediente() {
	}

	public int getRexCode() {
		return this.rexCode;
	}

	public void setRexCode(int rexCode) {
		this.rexCode = rexCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getRexCantidad() {
		return this.rexCantidad;
	}

	public void setRexCantidad(int rexCantidad) {
		this.rexCantidad = rexCantidad;
	}

	public String getRexEstado() {
		return this.rexEstado;
	}

	public void setRexEstado(String rexEstado) {
		this.rexEstado = rexEstado;
	}

	public Date getRexFecha() {
		return this.rexFecha;
	}

	public void setRexFecha(Date rexFecha) {
		this.rexFecha = rexFecha;
	}

	public Date getRexTstamp() {
		return this.rexTstamp;
	}

	public void setRexTstamp(Date rexTstamp) {
		this.rexTstamp = rexTstamp;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}