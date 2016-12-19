package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the oci_contravencion_carga_eventos database table.
 * 
 */
// @Entity
// @Table(name="oci_contravencion_carga_eventos")
@NamedQuery(name="OciContravencionCargaEvento.findAll", query="SELECT o FROM OciContravencionCargaEvento o")
public class OciContravencionCargaEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oce_code")
	private int oceCode;

	@Column(name="oac_code")
	private int oacCode;

	@Column(name="oce_comentario")
	private String oceComentario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oce_fecha")
	private Date oceFecha;

	@Column(name="use_code")
	private int useCode;

	public OciContravencionCargaEvento() {
	}

	public int getOceCode() {
		return this.oceCode;
	}

	public void setOceCode(int oceCode) {
		this.oceCode = oceCode;
	}

	public int getOacCode() {
		return this.oacCode;
	}

	public void setOacCode(int oacCode) {
		this.oacCode = oacCode;
	}

	public String getOceComentario() {
		return this.oceComentario;
	}

	public void setOceComentario(String oceComentario) {
		this.oceComentario = oceComentario;
	}

	public Date getOceFecha() {
		return this.oceFecha;
	}

	public void setOceFecha(Date oceFecha) {
		this.oceFecha = oceFecha;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}