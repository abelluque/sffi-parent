package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spp_tipos_de_tareas database table.
 * 
 */
// @Entity
// @Table(name="spp_tipos_de_tareas")
@NamedQuery(name="SppTiposDeTarea.findAll", query="SELECT s FROM SppTiposDeTarea s")
public class SppTiposDeTarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="stt_code")
	private int sttCode;

	@Column(name="stt_activo")
	private String sttActivo;

	@Column(name="stt_descripcion")
	private String sttDescripcion;

	public SppTiposDeTarea() {
	}

	public int getSttCode() {
		return this.sttCode;
	}

	public void setSttCode(int sttCode) {
		this.sttCode = sttCode;
	}

	public String getSttActivo() {
		return this.sttActivo;
	}

	public void setSttActivo(String sttActivo) {
		this.sttActivo = sttActivo;
	}

	public String getSttDescripcion() {
		return this.sttDescripcion;
	}

	public void setSttDescripcion(String sttDescripcion) {
		this.sttDescripcion = sttDescripcion;
	}

}