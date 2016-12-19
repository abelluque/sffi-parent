package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the oci_tipo_arch_salida database table.
 * 
 */
// @Entity
// @Table(name="oci_tipo_arch_salida")
@NamedQuery(name="OciTipoArchSalida.findAll", query="SELECT o FROM OciTipoArchSalida o")
public class OciTipoArchSalida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oas_code")
	private int oasCode;

	@Column(name="oas_activo")
	private String oasActivo;

	@Column(name="oas_extension")
	private String oasExtension;

	@Column(name="oas_titulo")
	private String oasTitulo;

	//bi-directional many-to-many association to OciTipoIngreso
	@ManyToMany
	@JoinTable(
		name="oci_ingreso_arch_salida"
		, joinColumns={
			@JoinColumn(name="oas_code")
			}
		, inverseJoinColumns={
			@JoinColumn(name="oti_code")
			}
		)
	private List<OciTipoIngreso> ociTipoIngresos;

	public OciTipoArchSalida() {
	}

	public int getOasCode() {
		return this.oasCode;
	}

	public void setOasCode(int oasCode) {
		this.oasCode = oasCode;
	}

	public String getOasActivo() {
		return this.oasActivo;
	}

	public void setOasActivo(String oasActivo) {
		this.oasActivo = oasActivo;
	}

	public String getOasExtension() {
		return this.oasExtension;
	}

	public void setOasExtension(String oasExtension) {
		this.oasExtension = oasExtension;
	}

	public String getOasTitulo() {
		return this.oasTitulo;
	}

	public void setOasTitulo(String oasTitulo) {
		this.oasTitulo = oasTitulo;
	}

	public List<OciTipoIngreso> getOciTipoIngresos() {
		return this.ociTipoIngresos;
	}

	public void setOciTipoIngresos(List<OciTipoIngreso> ociTipoIngresos) {
		this.ociTipoIngresos = ociTipoIngresos;
	}

}