package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the avi_eventos database table.
 * 
 */
// @Entity
// @Table(name="avi_eventos")
@NamedQuery(name="AviEvento.findAll", query="SELECT a FROM AviEvento a")
public class AviEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ave_code")
	private String aveCode;

	@Column(name="ave_filtro")
	private String aveFiltro;

	@Column(name="ave_filtro_valor")
	private String aveFiltroValor;

	@Column(name="ave_filtro2")
	private String aveFiltro2;

	@Column(name="ave_filtro2_valor")
	private String aveFiltro2Valor;

	@Column(name="ave_key")
	private int aveKey;

	@Column(name="ave_template")
	private String aveTemplate;

	@Column(name="avr_status")
	private String avrStatus;

	@Column(name="avr_type")
	private String avrType;

	@Column(name="cco_code")
	private int ccoCode;

	public AviEvento() {
	}

	public String getAveCode() {
		return this.aveCode;
	}

	public void setAveCode(String aveCode) {
		this.aveCode = aveCode;
	}

	public String getAveFiltro() {
		return this.aveFiltro;
	}

	public void setAveFiltro(String aveFiltro) {
		this.aveFiltro = aveFiltro;
	}

	public String getAveFiltroValor() {
		return this.aveFiltroValor;
	}

	public void setAveFiltroValor(String aveFiltroValor) {
		this.aveFiltroValor = aveFiltroValor;
	}

	public String getAveFiltro2() {
		return this.aveFiltro2;
	}

	public void setAveFiltro2(String aveFiltro2) {
		this.aveFiltro2 = aveFiltro2;
	}

	public String getAveFiltro2Valor() {
		return this.aveFiltro2Valor;
	}

	public void setAveFiltro2Valor(String aveFiltro2Valor) {
		this.aveFiltro2Valor = aveFiltro2Valor;
	}

	public int getAveKey() {
		return this.aveKey;
	}

	public void setAveKey(int aveKey) {
		this.aveKey = aveKey;
	}

	public String getAveTemplate() {
		return this.aveTemplate;
	}

	public void setAveTemplate(String aveTemplate) {
		this.aveTemplate = aveTemplate;
	}

	public String getAvrStatus() {
		return this.avrStatus;
	}

	public void setAvrStatus(String avrStatus) {
		this.avrStatus = avrStatus;
	}

	public String getAvrType() {
		return this.avrType;
	}

	public void setAvrType(String avrType) {
		this.avrType = avrType;
	}

	public int getCcoCode() {
		return this.ccoCode;
	}

	public void setCcoCode(int ccoCode) {
		this.ccoCode = ccoCode;
	}

}