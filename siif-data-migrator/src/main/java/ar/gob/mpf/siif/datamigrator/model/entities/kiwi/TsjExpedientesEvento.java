package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tsj_expedientes_eventos database table.
 * 
 */
// @Entity
// @Table(name="tsj_expedientes_eventos")
@NamedQuery(name="TsjExpedientesEvento.findAll", query="SELECT t FROM TsjExpedientesEvento t")
public class TsjExpedientesEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="exe_code")
	private int exeCode;

	@Column(name="exe_cambios")
	private String exeCambios;

	@Column(name="exe_comentarios")
	private String exeComentarios;

	@Column(name="exe_estado")
	private String exeEstado;

	@Column(name="exe_estado_anterior")
	private String exeEstadoAnterior;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exe_fecha")
	private Date exeFecha;

	@Column(name="exi_code")
	private int exiCode;

	@Column(name="exp_code")
	private int expCode;

	@Column(name="use_code")
	private int useCode;

	public TsjExpedientesEvento() {
	}

	public int getExeCode() {
		return this.exeCode;
	}

	public void setExeCode(int exeCode) {
		this.exeCode = exeCode;
	}

	public String getExeCambios() {
		return this.exeCambios;
	}

	public void setExeCambios(String exeCambios) {
		this.exeCambios = exeCambios;
	}

	public String getExeComentarios() {
		return this.exeComentarios;
	}

	public void setExeComentarios(String exeComentarios) {
		this.exeComentarios = exeComentarios;
	}

	public String getExeEstado() {
		return this.exeEstado;
	}

	public void setExeEstado(String exeEstado) {
		this.exeEstado = exeEstado;
	}

	public String getExeEstadoAnterior() {
		return this.exeEstadoAnterior;
	}

	public void setExeEstadoAnterior(String exeEstadoAnterior) {
		this.exeEstadoAnterior = exeEstadoAnterior;
	}

	public Date getExeFecha() {
		return this.exeFecha;
	}

	public void setExeFecha(Date exeFecha) {
		this.exeFecha = exeFecha;
	}

	public int getExiCode() {
		return this.exiCode;
	}

	public void setExiCode(int exiCode) {
		this.exiCode = exiCode;
	}

	public int getExpCode() {
		return this.expCode;
	}

	public void setExpCode(int expCode) {
		this.expCode = expCode;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}