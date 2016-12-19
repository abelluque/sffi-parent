package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tsj_categorias_de_proceso database table.
 * 
 */
// @Entity
// @Table(name="tsj_categorias_de_proceso")
@NamedQuery(name="TsjCategoriasDeProceso.findAll", query="SELECT t FROM TsjCategoriasDeProceso t")
public class TsjCategoriasDeProceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tcp_code")
	private int tcpCode;

	@Column(name="tcp_activo")
	private String tcpActivo;

	@Column(name="tcp_nombre")
	private String tcpNombre;

	public TsjCategoriasDeProceso() {
	}

	public int getTcpCode() {
		return this.tcpCode;
	}

	public void setTcpCode(int tcpCode) {
		this.tcpCode = tcpCode;
	}

	public String getTcpActivo() {
		return this.tcpActivo;
	}

	public void setTcpActivo(String tcpActivo) {
		this.tcpActivo = tcpActivo;
	}

	public String getTcpNombre() {
		return this.tcpNombre;
	}

	public void setTcpNombre(String tcpNombre) {
		this.tcpNombre = tcpNombre;
	}

}