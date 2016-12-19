package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the den_directivas database table.
 * 
 */
// @Entity
// @Table(name="den_directivas")
@NamedQuery(name="DenDirectiva.findAll", query="SELECT d FROM DenDirectiva d")
public class DenDirectiva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ddir_code")
	private int ddirCode;

	@Column(name="ddir_datos_policia")
	private String ddirDatosPolicia;

	@Column(name="ddir_dependencia_intervinente")
	private int ddirDependenciaIntervinente;

	@Column(name="ddir_fpol_agente")
	private String ddirFpolAgente;

	@Column(name="ddir_fpol_sms")
	private String ddirFpolSms;

	@Column(name="ddir_labra_acta")
	private String ddirLabraActa;

	@Column(name="ddir_observaciones")
	private String ddirObservaciones;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ddir_tstamp")
	private Date ddirTstamp;

	@Column(name="ddir_use_code_fisc")
	private int ddirUseCodeFisc;

	@Column(name="ddir_use_code_oper")
	private int ddirUseCodeOper;

	@Column(name="dir_code")
	private int dirCode;

	@Column(name="doc_code")
	private int docCode;

	@Column(name="dtip_code")
	private String dtipCode;

	@Column(name="fpol_code")
	private int fpolCode;

	@Column(name="gco_code")
	private int gcoCode;

	public DenDirectiva() {
	}

	public int getDdirCode() {
		return this.ddirCode;
	}

	public void setDdirCode(int ddirCode) {
		this.ddirCode = ddirCode;
	}

	public String getDdirDatosPolicia() {
		return this.ddirDatosPolicia;
	}

	public void setDdirDatosPolicia(String ddirDatosPolicia) {
		this.ddirDatosPolicia = ddirDatosPolicia;
	}

	public int getDdirDependenciaIntervinente() {
		return this.ddirDependenciaIntervinente;
	}

	public void setDdirDependenciaIntervinente(int ddirDependenciaIntervinente) {
		this.ddirDependenciaIntervinente = ddirDependenciaIntervinente;
	}

	public String getDdirFpolAgente() {
		return this.ddirFpolAgente;
	}

	public void setDdirFpolAgente(String ddirFpolAgente) {
		this.ddirFpolAgente = ddirFpolAgente;
	}

	public String getDdirFpolSms() {
		return this.ddirFpolSms;
	}

	public void setDdirFpolSms(String ddirFpolSms) {
		this.ddirFpolSms = ddirFpolSms;
	}

	public String getDdirLabraActa() {
		return this.ddirLabraActa;
	}

	public void setDdirLabraActa(String ddirLabraActa) {
		this.ddirLabraActa = ddirLabraActa;
	}

	public String getDdirObservaciones() {
		return this.ddirObservaciones;
	}

	public void setDdirObservaciones(String ddirObservaciones) {
		this.ddirObservaciones = ddirObservaciones;
	}

	public Date getDdirTstamp() {
		return this.ddirTstamp;
	}

	public void setDdirTstamp(Date ddirTstamp) {
		this.ddirTstamp = ddirTstamp;
	}

	public int getDdirUseCodeFisc() {
		return this.ddirUseCodeFisc;
	}

	public void setDdirUseCodeFisc(int ddirUseCodeFisc) {
		this.ddirUseCodeFisc = ddirUseCodeFisc;
	}

	public int getDdirUseCodeOper() {
		return this.ddirUseCodeOper;
	}

	public void setDdirUseCodeOper(int ddirUseCodeOper) {
		this.ddirUseCodeOper = ddirUseCodeOper;
	}

	public int getDirCode() {
		return this.dirCode;
	}

	public void setDirCode(int dirCode) {
		this.dirCode = dirCode;
	}

	public int getDocCode() {
		return this.docCode;
	}

	public void setDocCode(int docCode) {
		this.docCode = docCode;
	}

	public String getDtipCode() {
		return this.dtipCode;
	}

	public void setDtipCode(String dtipCode) {
		this.dtipCode = dtipCode;
	}

	public int getFpolCode() {
		return this.fpolCode;
	}

	public void setFpolCode(int fpolCode) {
		this.fpolCode = fpolCode;
	}

	public int getGcoCode() {
		return this.gcoCode;
	}

	public void setGcoCode(int gcoCode) {
		this.gcoCode = gcoCode;
	}

}