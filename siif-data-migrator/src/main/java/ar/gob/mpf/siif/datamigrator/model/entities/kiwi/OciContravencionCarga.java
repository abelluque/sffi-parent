package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the oci_contravencion_carga database table.
 * 
 */
// @Entity
// @Table(name="oci_contravencion_carga")
@NamedQuery(name="OciContravencionCarga.findAll", query="SELECT o FROM OciContravencionCarga o")
public class OciContravencionCarga implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="gco_code")
	private int gcoCode;

	@Column(name="gfp_code")
	private int gfpCode;

	@Column(name="oac_code")
	private int oacCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oac_fecha")
	private Date oacFecha;

	@Column(name="occ_comentario")
	private String occComentario;

	@Column(name="occ_estado")
	private String occEstado;

	@Column(name="occ_operador")
	private int occOperador;

	private int operador;

	@Column(name="oti_code")
	private int otiCode;

	@Column(name="use_code")
	private int useCode;

	public OciContravencionCarga() {
	}

	public int getGcoCode() {
		return this.gcoCode;
	}

	public void setGcoCode(int gcoCode) {
		this.gcoCode = gcoCode;
	}

	public int getGfpCode() {
		return this.gfpCode;
	}

	public void setGfpCode(int gfpCode) {
		this.gfpCode = gfpCode;
	}

	public int getOacCode() {
		return this.oacCode;
	}

	public void setOacCode(int oacCode) {
		this.oacCode = oacCode;
	}

	public Date getOacFecha() {
		return this.oacFecha;
	}

	public void setOacFecha(Date oacFecha) {
		this.oacFecha = oacFecha;
	}

	public String getOccComentario() {
		return this.occComentario;
	}

	public void setOccComentario(String occComentario) {
		this.occComentario = occComentario;
	}

	public String getOccEstado() {
		return this.occEstado;
	}

	public void setOccEstado(String occEstado) {
		this.occEstado = occEstado;
	}

	public int getOccOperador() {
		return this.occOperador;
	}

	public void setOccOperador(int occOperador) {
		this.occOperador = occOperador;
	}

	public int getOperador() {
		return this.operador;
	}

	public void setOperador(int operador) {
		this.operador = operador;
	}

	public int getOtiCode() {
		return this.otiCode;
	}

	public void setOtiCode(int otiCode) {
		this.otiCode = otiCode;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}