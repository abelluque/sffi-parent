package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the utc_cedulas_eventos database table.
 * 
 */
// @Entity
// @Table(name="utc_cedulas_eventos")
@NamedQuery(name="UtcCedulasEvento.findAll", query="SELECT u FROM UtcCedulasEvento u")
public class UtcCedulasEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ced_code")
	private int cedCode;

	@Column(name="ced_estado")
	private String cedEstado;

	@Column(name="cev_cambios")
	private String cevCambios;

	@Column(name="cev_comentarios")
	private String cevComentarios;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cev_tstamp")
	private Date cevTstamp;

	@Column(name="use_code")
	private int useCode;

	public UtcCedulasEvento() {
	}

	public int getCedCode() {
		return this.cedCode;
	}

	public void setCedCode(int cedCode) {
		this.cedCode = cedCode;
	}

	public String getCedEstado() {
		return this.cedEstado;
	}

	public void setCedEstado(String cedEstado) {
		this.cedEstado = cedEstado;
	}

	public String getCevCambios() {
		return this.cevCambios;
	}

	public void setCevCambios(String cevCambios) {
		this.cevCambios = cevCambios;
	}

	public String getCevComentarios() {
		return this.cevComentarios;
	}

	public void setCevComentarios(String cevComentarios) {
		this.cevComentarios = cevComentarios;
	}

	public Date getCevTstamp() {
		return this.cevTstamp;
	}

	public void setCevTstamp(Date cevTstamp) {
		this.cevTstamp = cevTstamp;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}