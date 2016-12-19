package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ori_seguimientos database table.
 * 
 */
// @Entity
// @Table(name="ori_seguimientos")
@NamedQuery(name="OriSeguimiento.findAll", query="SELECT o FROM OriSeguimiento o")
public class OriSeguimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="osg_code")
	private int osgCode;

	@Column(name="omn_code")
	private int omnCode;

	@Column(name="ori_code")
	private int oriCode;

	@Column(name="osg_concurrio")
	private String osgConcurrio;

	@Column(name="osg_contactado")
	private String osgContactado;

	@Column(name="osg_da_informacion")
	private String osgDaInformacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="osg_fechahora")
	private Date osgFechahora;

	@Column(name="osg_observacion")
	private String osgObservacion;

	@Column(name="osg_operador")
	private String osgOperador;

	@Column(name="osg_satisfactorio")
	private String osgSatisfactorio;

	@Column(name="osg_seguimiento_cerrado")
	private String osgSeguimientoCerrado;

	public OriSeguimiento() {
	}

	public int getOsgCode() {
		return this.osgCode;
	}

	public void setOsgCode(int osgCode) {
		this.osgCode = osgCode;
	}

	public int getOmnCode() {
		return this.omnCode;
	}

	public void setOmnCode(int omnCode) {
		this.omnCode = omnCode;
	}

	public int getOriCode() {
		return this.oriCode;
	}

	public void setOriCode(int oriCode) {
		this.oriCode = oriCode;
	}

	public String getOsgConcurrio() {
		return this.osgConcurrio;
	}

	public void setOsgConcurrio(String osgConcurrio) {
		this.osgConcurrio = osgConcurrio;
	}

	public String getOsgContactado() {
		return this.osgContactado;
	}

	public void setOsgContactado(String osgContactado) {
		this.osgContactado = osgContactado;
	}

	public String getOsgDaInformacion() {
		return this.osgDaInformacion;
	}

	public void setOsgDaInformacion(String osgDaInformacion) {
		this.osgDaInformacion = osgDaInformacion;
	}

	public Date getOsgFechahora() {
		return this.osgFechahora;
	}

	public void setOsgFechahora(Date osgFechahora) {
		this.osgFechahora = osgFechahora;
	}

	public String getOsgObservacion() {
		return this.osgObservacion;
	}

	public void setOsgObservacion(String osgObservacion) {
		this.osgObservacion = osgObservacion;
	}

	public String getOsgOperador() {
		return this.osgOperador;
	}

	public void setOsgOperador(String osgOperador) {
		this.osgOperador = osgOperador;
	}

	public String getOsgSatisfactorio() {
		return this.osgSatisfactorio;
	}

	public void setOsgSatisfactorio(String osgSatisfactorio) {
		this.osgSatisfactorio = osgSatisfactorio;
	}

	public String getOsgSeguimientoCerrado() {
		return this.osgSeguimientoCerrado;
	}

	public void setOsgSeguimientoCerrado(String osgSeguimientoCerrado) {
		this.osgSeguimientoCerrado = osgSeguimientoCerrado;
	}

}