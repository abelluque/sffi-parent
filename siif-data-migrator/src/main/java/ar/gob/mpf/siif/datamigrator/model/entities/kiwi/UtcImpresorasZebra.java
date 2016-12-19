package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utc_impresoras_zebra database table.
 * 
 */
// @Entity
// @Table(name="utc_impresoras_zebra")
@NamedQuery(name="UtcImpresorasZebra.findAll", query="SELECT u FROM UtcImpresorasZebra u")
public class UtcImpresorasZebra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="uiz_code")
	private int uizCode;

	@Column(name="uiz_clave")
	private String uizClave;

	@Column(name="uiz_ip")
	private String uizIp;

	@Column(name="uiz_nombre")
	private String uizNombre;

	@Column(name="uiz_recurso")
	private String uizRecurso;

	@Column(name="uiz_usuario")
	private String uizUsuario;

	public UtcImpresorasZebra() {
	}

	public int getUizCode() {
		return this.uizCode;
	}

	public void setUizCode(int uizCode) {
		this.uizCode = uizCode;
	}

	public String getUizClave() {
		return this.uizClave;
	}

	public void setUizClave(String uizClave) {
		this.uizClave = uizClave;
	}

	public String getUizIp() {
		return this.uizIp;
	}

	public void setUizIp(String uizIp) {
		this.uizIp = uizIp;
	}

	public String getUizNombre() {
		return this.uizNombre;
	}

	public void setUizNombre(String uizNombre) {
		this.uizNombre = uizNombre;
	}

	public String getUizRecurso() {
		return this.uizRecurso;
	}

	public void setUizRecurso(String uizRecurso) {
		this.uizRecurso = uizRecurso;
	}

	public String getUizUsuario() {
		return this.uizUsuario;
	}

	public void setUizUsuario(String uizUsuario) {
		this.uizUsuario = uizUsuario;
	}

}