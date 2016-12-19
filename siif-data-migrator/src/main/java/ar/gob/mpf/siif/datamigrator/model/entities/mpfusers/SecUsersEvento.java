package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sec_users_eventos database table.
 * 
 */
// @Entity
// @Table(name="sec_users_eventos")
@NamedQuery(name="SecUsersEvento.findAll", query="SELECT s FROM SecUsersEvento s")
public class SecUsersEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sue_code")
	private int sueCode;

	@Column(name="sue_cambios")
	private String sueCambios;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sue_fecha")
	private Date sueFecha;

	@Column(name="sue_permisos")
	private String suePermisos;

	@Column(name="sue_proceso_origen")
	private String sueProcesoOrigen;

	@Column(name="use_code")
	private String useCode;

	@Column(name="use_code_aud")
	private String useCodeAud;

	public SecUsersEvento() {
	}

	public int getSueCode() {
		return this.sueCode;
	}

	public void setSueCode(int sueCode) {
		this.sueCode = sueCode;
	}

	public String getSueCambios() {
		return this.sueCambios;
	}

	public void setSueCambios(String sueCambios) {
		this.sueCambios = sueCambios;
	}

	public Date getSueFecha() {
		return this.sueFecha;
	}

	public void setSueFecha(Date sueFecha) {
		this.sueFecha = sueFecha;
	}

	public String getSuePermisos() {
		return this.suePermisos;
	}

	public void setSuePermisos(String suePermisos) {
		this.suePermisos = suePermisos;
	}

	public String getSueProcesoOrigen() {
		return this.sueProcesoOrigen;
	}

	public void setSueProcesoOrigen(String sueProcesoOrigen) {
		this.sueProcesoOrigen = sueProcesoOrigen;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public String getUseCodeAud() {
		return this.useCodeAud;
	}

	public void setUseCodeAud(String useCodeAud) {
		this.useCodeAud = useCodeAud;
	}

}