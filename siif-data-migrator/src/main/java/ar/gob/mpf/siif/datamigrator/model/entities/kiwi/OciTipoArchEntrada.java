package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the oci_tipo_arch_entrada database table.
 * 
 */
// @Entity
// @Table(name="oci_tipo_arch_entrada")
@NamedQuery(name="OciTipoArchEntrada.findAll", query="SELECT o FROM OciTipoArchEntrada o")
public class OciTipoArchEntrada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oae_code")
	private int oaeCode;

	@Column(name="oae_activo")
	private String oaeActivo;

	@Column(name="oae_extension")
	private String oaeExtension;

	@Column(name="oae_titulo")
	private String oaeTitulo;

	@Column(name="oor_code")
	private int oorCode;

	//bi-directional many-to-many association to OciTipoIngreso
	@ManyToMany
	@JoinTable(
		name="oci_ingreso_arch_entrada"
		, joinColumns={
			@JoinColumn(name="oae_code")
			}
		, inverseJoinColumns={
			@JoinColumn(name="oti_code")
			}
		)
	private List<OciTipoIngreso> ociTipoIngresos;

	public OciTipoArchEntrada() {
	}

	public int getOaeCode() {
		return this.oaeCode;
	}

	public void setOaeCode(int oaeCode) {
		this.oaeCode = oaeCode;
	}

	public String getOaeActivo() {
		return this.oaeActivo;
	}

	public void setOaeActivo(String oaeActivo) {
		this.oaeActivo = oaeActivo;
	}

	public String getOaeExtension() {
		return this.oaeExtension;
	}

	public void setOaeExtension(String oaeExtension) {
		this.oaeExtension = oaeExtension;
	}

	public String getOaeTitulo() {
		return this.oaeTitulo;
	}

	public void setOaeTitulo(String oaeTitulo) {
		this.oaeTitulo = oaeTitulo;
	}

	public int getOorCode() {
		return this.oorCode;
	}

	public void setOorCode(int oorCode) {
		this.oorCode = oorCode;
	}

	public List<OciTipoIngreso> getOciTipoIngresos() {
		return this.ociTipoIngresos;
	}

	public void setOciTipoIngresos(List<OciTipoIngreso> ociTipoIngresos) {
		this.ociTipoIngresos = ociTipoIngresos;
	}

}