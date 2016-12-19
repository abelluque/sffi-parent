package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the spp_informes_previos_eventos database table.
 * 
 */
// @Entity
// @Table(name="spp_informes_previos_eventos")
@NamedQuery(name="SppInformesPreviosEvento.findAll", query="SELECT s FROM SppInformesPreviosEvento s")
public class SppInformesPreviosEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sipe_code")
	private int sipeCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="sip_code")
	private int sipCode;

	@Column(name="sipe_cambios")
	private String sipeCambios;

	@Column(name="sipe_comentarios")
	private String sipeComentarios;

	@Column(name="sipe_estado")
	private String sipeEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sipe_tstamp")
	private Date sipeTstamp;

	@Column(name="use_code")
	private String useCode;

	public SppInformesPreviosEvento() {
	}

	public int getSipeCode() {
		return this.sipeCode;
	}

	public void setSipeCode(int sipeCode) {
		this.sipeCode = sipeCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getSipCode() {
		return this.sipCode;
	}

	public void setSipCode(int sipCode) {
		this.sipCode = sipCode;
	}

	public String getSipeCambios() {
		return this.sipeCambios;
	}

	public void setSipeCambios(String sipeCambios) {
		this.sipeCambios = sipeCambios;
	}

	public String getSipeComentarios() {
		return this.sipeComentarios;
	}

	public void setSipeComentarios(String sipeComentarios) {
		this.sipeComentarios = sipeComentarios;
	}

	public String getSipeEstado() {
		return this.sipeEstado;
	}

	public void setSipeEstado(String sipeEstado) {
		this.sipeEstado = sipeEstado;
	}

	public Date getSipeTstamp() {
		return this.sipeTstamp;
	}

	public void setSipeTstamp(Date sipeTstamp) {
		this.sipeTstamp = sipeTstamp;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}