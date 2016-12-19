package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the spp_informes_previos_instituciones database table.
 * 
 */
// @Entity
// @Table(name="spp_informes_previos_instituciones")
@NamedQuery(name="SppInformesPreviosInstitucione.findAll", query="SELECT s FROM SppInformesPreviosInstitucione s")
public class SppInformesPreviosInstitucione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sipi_code")
	private int sipiCode;

	@Column(name="sin_code")
	private int sinCode;

	@Column(name="sip_code")
	private int sipCode;

	@Column(name="sipi_comentarios")
	private String sipiComentarios;

	@Column(name="sipi_institucion_a_designar")
	private String sipiInstitucionADesignar;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sipi_tstamp")
	private Date sipiTstamp;

	@Column(name="sipi_unidad_de_medida")
	private String sipiUnidadDeMedida;

	@Column(name="sipi_use_code")
	private String sipiUseCode;

	@Column(name="sipi_valor")
	private int sipiValor;

	@Column(name="sipi_valor_a_determinar")
	private String sipiValorADeterminar;

	@Column(name="str_code")
	private int strCode;

	public SppInformesPreviosInstitucione() {
	}

	public int getSipiCode() {
		return this.sipiCode;
	}

	public void setSipiCode(int sipiCode) {
		this.sipiCode = sipiCode;
	}

	public int getSinCode() {
		return this.sinCode;
	}

	public void setSinCode(int sinCode) {
		this.sinCode = sinCode;
	}

	public int getSipCode() {
		return this.sipCode;
	}

	public void setSipCode(int sipCode) {
		this.sipCode = sipCode;
	}

	public String getSipiComentarios() {
		return this.sipiComentarios;
	}

	public void setSipiComentarios(String sipiComentarios) {
		this.sipiComentarios = sipiComentarios;
	}

	public String getSipiInstitucionADesignar() {
		return this.sipiInstitucionADesignar;
	}

	public void setSipiInstitucionADesignar(String sipiInstitucionADesignar) {
		this.sipiInstitucionADesignar = sipiInstitucionADesignar;
	}

	public Date getSipiTstamp() {
		return this.sipiTstamp;
	}

	public void setSipiTstamp(Date sipiTstamp) {
		this.sipiTstamp = sipiTstamp;
	}

	public String getSipiUnidadDeMedida() {
		return this.sipiUnidadDeMedida;
	}

	public void setSipiUnidadDeMedida(String sipiUnidadDeMedida) {
		this.sipiUnidadDeMedida = sipiUnidadDeMedida;
	}

	public String getSipiUseCode() {
		return this.sipiUseCode;
	}

	public void setSipiUseCode(String sipiUseCode) {
		this.sipiUseCode = sipiUseCode;
	}

	public int getSipiValor() {
		return this.sipiValor;
	}

	public void setSipiValor(int sipiValor) {
		this.sipiValor = sipiValor;
	}

	public String getSipiValorADeterminar() {
		return this.sipiValorADeterminar;
	}

	public void setSipiValorADeterminar(String sipiValorADeterminar) {
		this.sipiValorADeterminar = sipiValorADeterminar;
	}

	public int getStrCode() {
		return this.strCode;
	}

	public void setStrCode(int strCode) {
		this.strCode = strCode;
	}

}