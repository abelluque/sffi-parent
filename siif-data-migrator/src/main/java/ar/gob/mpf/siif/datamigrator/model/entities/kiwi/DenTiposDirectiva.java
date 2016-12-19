package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the den_tipos_directivas database table.
 * 
 */
// @Entity
// @Table(name="den_tipos_directivas")
@NamedQuery(name="DenTiposDirectiva.findAll", query="SELECT d FROM DenTiposDirectiva d")
public class DenTiposDirectiva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dir_code")
	private int dirCode;

	@Column(name="dir_activo")
	private String dirActivo;

	@Column(name="dir_datos_policia")
	private String dirDatosPolicia;

	@Column(name="dir_descrip")
	private String dirDescrip;

	@Column(name="dir_labrado_acta")
	private String dirLabradoActa;

	@Column(name="dir_nombre")
	private String dirNombre;

	@Column(name="dir_tipo")
	private String dirTipo;

	public DenTiposDirectiva() {
	}

	public int getDirCode() {
		return this.dirCode;
	}

	public void setDirCode(int dirCode) {
		this.dirCode = dirCode;
	}

	public String getDirActivo() {
		return this.dirActivo;
	}

	public void setDirActivo(String dirActivo) {
		this.dirActivo = dirActivo;
	}

	public String getDirDatosPolicia() {
		return this.dirDatosPolicia;
	}

	public void setDirDatosPolicia(String dirDatosPolicia) {
		this.dirDatosPolicia = dirDatosPolicia;
	}

	public String getDirDescrip() {
		return this.dirDescrip;
	}

	public void setDirDescrip(String dirDescrip) {
		this.dirDescrip = dirDescrip;
	}

	public String getDirLabradoActa() {
		return this.dirLabradoActa;
	}

	public void setDirLabradoActa(String dirLabradoActa) {
		this.dirLabradoActa = dirLabradoActa;
	}

	public String getDirNombre() {
		return this.dirNombre;
	}

	public void setDirNombre(String dirNombre) {
		this.dirNombre = dirNombre;
	}

	public String getDirTipo() {
		return this.dirTipo;
	}

	public void setDirTipo(String dirTipo) {
		this.dirTipo = dirTipo;
	}

}