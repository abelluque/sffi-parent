package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spp_tipos_de_reglas_de_conducta database table.
 * 
 */
// @Entity
// @Table(name="spp_tipos_de_reglas_de_conducta")
@NamedQuery(name="SppTiposDeReglasDeConducta.findAll", query="SELECT s FROM SppTiposDeReglasDeConducta s")
public class SppTiposDeReglasDeConducta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="str_code")
	private int strCode;

	@Column(name="str_descripcion_obligatoria")
	private String strDescripcionObligatoria;

	@Column(name="str_estado")
	private String strEstado;

	@Column(name="str_institucion_obligatoria")
	private String strInstitucionObligatoria;

	@Column(name="str_tipo")
	private String strTipo;

	@Column(name="str_valor_obligatorio")
	private String strValorObligatorio;

	public SppTiposDeReglasDeConducta() {
	}

	public int getStrCode() {
		return this.strCode;
	}

	public void setStrCode(int strCode) {
		this.strCode = strCode;
	}

	public String getStrDescripcionObligatoria() {
		return this.strDescripcionObligatoria;
	}

	public void setStrDescripcionObligatoria(String strDescripcionObligatoria) {
		this.strDescripcionObligatoria = strDescripcionObligatoria;
	}

	public String getStrEstado() {
		return this.strEstado;
	}

	public void setStrEstado(String strEstado) {
		this.strEstado = strEstado;
	}

	public String getStrInstitucionObligatoria() {
		return this.strInstitucionObligatoria;
	}

	public void setStrInstitucionObligatoria(String strInstitucionObligatoria) {
		this.strInstitucionObligatoria = strInstitucionObligatoria;
	}

	public String getStrTipo() {
		return this.strTipo;
	}

	public void setStrTipo(String strTipo) {
		this.strTipo = strTipo;
	}

	public String getStrValorObligatorio() {
		return this.strValorObligatorio;
	}

	public void setStrValorObligatorio(String strValorObligatorio) {
		this.strValorObligatorio = strValorObligatorio;
	}

}