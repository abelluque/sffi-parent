package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utc_tramites_migraciones_usuarios database table.
 * 
 */
// @Entity
// @Table(name="utc_tramites_migraciones_usuarios")
@NamedQuery(name="UtcTramitesMigracionesUsuario.findAll", query="SELECT u FROM UtcTramitesMigracionesUsuario u")
public class UtcTramitesMigracionesUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="utmu_code")
	private int utmuCode;

	@Column(name="utmu_aal_codigo")
	private int utmuAalCodigo;

	@Column(name="utmu_password")
	private String utmuPassword;

	@Column(name="utmu_usuario")
	private String utmuUsuario;

	public UtcTramitesMigracionesUsuario() {
	}

	public int getUtmuCode() {
		return this.utmuCode;
	}

	public void setUtmuCode(int utmuCode) {
		this.utmuCode = utmuCode;
	}

	public int getUtmuAalCodigo() {
		return this.utmuAalCodigo;
	}

	public void setUtmuAalCodigo(int utmuAalCodigo) {
		this.utmuAalCodigo = utmuAalCodigo;
	}

	public String getUtmuPassword() {
		return this.utmuPassword;
	}

	public void setUtmuPassword(String utmuPassword) {
		this.utmuPassword = utmuPassword;
	}

	public String getUtmuUsuario() {
		return this.utmuUsuario;
	}

	public void setUtmuUsuario(String utmuUsuario) {
		this.utmuUsuario = utmuUsuario;
	}

}