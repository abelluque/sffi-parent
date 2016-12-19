package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the spp_suspensiones_de_proceso_informes_eventos database table.
 * 
 */
// @Entity
// @Table(name="spp_suspensiones_de_proceso_informes_eventos")
@NamedQuery(name="SppSuspensionesDeProcesoInformesEvento.findAll", query="SELECT s FROM SppSuspensionesDeProcesoInformesEvento s")
public class SppSuspensionesDeProcesoInformesEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sine_code")
	private int sineCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="sin_code")
	private int sinCode;

	@Column(name="sin_estado")
	private String sinEstado;

	@Lob
	@Column(name="sine_cambios")
	private String sineCambios;

	@Lob
	@Column(name="sine_comentarios")
	private String sineComentarios;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sine_tstamp")
	private Date sineTstamp;

	@Column(name="use_code")
	private String useCode;

	public SppSuspensionesDeProcesoInformesEvento() {
	}

	public int getSineCode() {
		return this.sineCode;
	}

	public void setSineCode(int sineCode) {
		this.sineCode = sineCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getSinCode() {
		return this.sinCode;
	}

	public void setSinCode(int sinCode) {
		this.sinCode = sinCode;
	}

	public String getSinEstado() {
		return this.sinEstado;
	}

	public void setSinEstado(String sinEstado) {
		this.sinEstado = sinEstado;
	}

	public String getSineCambios() {
		return this.sineCambios;
	}

	public void setSineCambios(String sineCambios) {
		this.sineCambios = sineCambios;
	}

	public String getSineComentarios() {
		return this.sineComentarios;
	}

	public void setSineComentarios(String sineComentarios) {
		this.sineComentarios = sineComentarios;
	}

	public Date getSineTstamp() {
		return this.sineTstamp;
	}

	public void setSineTstamp(Date sineTstamp) {
		this.sineTstamp = sineTstamp;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}