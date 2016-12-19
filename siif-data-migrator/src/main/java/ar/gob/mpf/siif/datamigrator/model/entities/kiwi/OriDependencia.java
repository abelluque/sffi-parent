package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ori_dependencias database table.
 * 
 */
// @Entity
// @Table(name="ori_dependencias")
@NamedQuery(name="OriDependencia.findAll", query="SELECT o FROM OriDependencia o")
public class OriDependencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="odp_code")
	private int odpCode;

	@Column(name="odp_activo")
	private String odpActivo;

	@Column(name="odp_dependencia")
	private String odpDependencia;

	public OriDependencia() {
	}

	public int getOdpCode() {
		return this.odpCode;
	}

	public void setOdpCode(int odpCode) {
		this.odpCode = odpCode;
	}

	public String getOdpActivo() {
		return this.odpActivo;
	}

	public void setOdpActivo(String odpActivo) {
		this.odpActivo = odpActivo;
	}

	public String getOdpDependencia() {
		return this.odpDependencia;
	}

	public void setOdpDependencia(String odpDependencia) {
		this.odpDependencia = odpDependencia;
	}

}