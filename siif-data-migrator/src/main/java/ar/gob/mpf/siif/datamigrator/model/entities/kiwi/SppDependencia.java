package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spp_dependencias database table.
 * 
 */
// @Entity
// @Table(name="spp_dependencias")
@NamedQuery(name="SppDependencia.findAll", query="SELECT s FROM SppDependencia s")
public class SppDependencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sdp_code")
	private int sdpCode;

	@Column(name="sdp_contacto")
	private String sdpContacto;

	@Column(name="sdp_dependencia")
	private String sdpDependencia;

	@Column(name="sdp_estado")
	private String sdpEstado;

	@Column(name="sdp_tel_fijo")
	private String sdpTelFijo;

	@Column(name="sdp_tel_movil")
	private String sdpTelMovil;

	public SppDependencia() {
	}

	public int getSdpCode() {
		return this.sdpCode;
	}

	public void setSdpCode(int sdpCode) {
		this.sdpCode = sdpCode;
	}

	public String getSdpContacto() {
		return this.sdpContacto;
	}

	public void setSdpContacto(String sdpContacto) {
		this.sdpContacto = sdpContacto;
	}

	public String getSdpDependencia() {
		return this.sdpDependencia;
	}

	public void setSdpDependencia(String sdpDependencia) {
		this.sdpDependencia = sdpDependencia;
	}

	public String getSdpEstado() {
		return this.sdpEstado;
	}

	public void setSdpEstado(String sdpEstado) {
		this.sdpEstado = sdpEstado;
	}

	public String getSdpTelFijo() {
		return this.sdpTelFijo;
	}

	public void setSdpTelFijo(String sdpTelFijo) {
		this.sdpTelFijo = sdpTelFijo;
	}

	public String getSdpTelMovil() {
		return this.sdpTelMovil;
	}

	public void setSdpTelMovil(String sdpTelMovil) {
		this.sdpTelMovil = sdpTelMovil;
	}

}