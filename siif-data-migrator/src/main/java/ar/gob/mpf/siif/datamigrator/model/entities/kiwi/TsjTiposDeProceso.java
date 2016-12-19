package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tsj_tipos_de_proceso database table.
 * 
 */
// @Entity
// @Table(name="tsj_tipos_de_proceso")
@NamedQuery(name="TsjTiposDeProceso.findAll", query="SELECT t FROM TsjTiposDeProceso t")
public class TsjTiposDeProceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ttp_code")
	private int ttpCode;

	@Column(name="tcp_code")
	private int tcpCode;

	@Column(name="ttp_activo")
	private String ttpActivo;

	@Column(name="ttp_nombre")
	private String ttpNombre;

	public TsjTiposDeProceso() {
	}

	public int getTtpCode() {
		return this.ttpCode;
	}

	public void setTtpCode(int ttpCode) {
		this.ttpCode = ttpCode;
	}

	public int getTcpCode() {
		return this.tcpCode;
	}

	public void setTcpCode(int tcpCode) {
		this.tcpCode = tcpCode;
	}

	public String getTtpActivo() {
		return this.ttpActivo;
	}

	public void setTtpActivo(String ttpActivo) {
		this.ttpActivo = ttpActivo;
	}

	public String getTtpNombre() {
		return this.ttpNombre;
	}

	public void setTtpNombre(String ttpNombre) {
		this.ttpNombre = ttpNombre;
	}

}