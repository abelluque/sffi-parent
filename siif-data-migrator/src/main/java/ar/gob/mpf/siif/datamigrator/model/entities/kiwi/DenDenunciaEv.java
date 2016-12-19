package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the den_denuncia_ev database table.
 * 
 */
// @Entity
// @Table(name="den_denuncia_ev")
@NamedQuery(name="DenDenunciaEv.findAll", query="SELECT d FROM DenDenunciaEv d")
public class DenDenunciaEv implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ddev_code")
	private int ddevCode;

	@Column(name="dden_code")
	private int ddenCode;

	@Column(name="ddev_clave")
	private int ddevClave;

	@Column(name="ddev_dependencia")
	private int ddevDependencia;

	@Column(name="ddev_descripcion")
	private String ddevDescripcion;

	@Column(name="ddev_link")
	private String ddevLink;

	@Column(name="ddev_tipo")
	private String ddevTipo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ddev_tstamp")
	private Date ddevTstamp;

	@Column(name="ddev_user_id")
	private int ddevUserId;

	@Column(name="ddrp_code")
	private int ddrpCode;

	public DenDenunciaEv() {
	}

	public int getDdevCode() {
		return this.ddevCode;
	}

	public void setDdevCode(int ddevCode) {
		this.ddevCode = ddevCode;
	}

	public int getDdenCode() {
		return this.ddenCode;
	}

	public void setDdenCode(int ddenCode) {
		this.ddenCode = ddenCode;
	}

	public int getDdevClave() {
		return this.ddevClave;
	}

	public void setDdevClave(int ddevClave) {
		this.ddevClave = ddevClave;
	}

	public int getDdevDependencia() {
		return this.ddevDependencia;
	}

	public void setDdevDependencia(int ddevDependencia) {
		this.ddevDependencia = ddevDependencia;
	}

	public String getDdevDescripcion() {
		return this.ddevDescripcion;
	}

	public void setDdevDescripcion(String ddevDescripcion) {
		this.ddevDescripcion = ddevDescripcion;
	}

	public String getDdevLink() {
		return this.ddevLink;
	}

	public void setDdevLink(String ddevLink) {
		this.ddevLink = ddevLink;
	}

	public String getDdevTipo() {
		return this.ddevTipo;
	}

	public void setDdevTipo(String ddevTipo) {
		this.ddevTipo = ddevTipo;
	}

	public Date getDdevTstamp() {
		return this.ddevTstamp;
	}

	public void setDdevTstamp(Date ddevTstamp) {
		this.ddevTstamp = ddevTstamp;
	}

	public int getDdevUserId() {
		return this.ddevUserId;
	}

	public void setDdevUserId(int ddevUserId) {
		this.ddevUserId = ddevUserId;
	}

	public int getDdrpCode() {
		return this.ddrpCode;
	}

	public void setDdrpCode(int ddrpCode) {
		this.ddrpCode = ddrpCode;
	}

}