package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the log_ocmarc_turnos database table.
 * 
 */
// @Entity
// @Table(name="log_ocmarc_turnos")
@NamedQuery(name="LogOcmarcTurno.findAll", query="SELECT l FROM LogOcmarcTurno l")
public class LogOcmarcTurno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="otu_code")
	private int otuCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="aal_codigo_log")
	private int aalCodigoLog;

	@Column(name="oca_code")
	private int ocaCode;

	@Column(name="ocs_code")
	private int ocsCode;

	@Column(name="otu_desde")
	private Time otuDesde;

	@Column(name="otu_duracion")
	private int otuDuracion;

	@Column(name="otu_estado")
	private String otuEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="otu_fecha")
	private Date otuFecha;

	@Column(name="otu_hasta")
	private Time otuHasta;

	@Column(name="otu_motivo")
	private String otuMotivo;

	@Column(name="otu_operacion_log")
	private String otuOperacionLog;

	@Column(name="otu_tipo")
	private String otuTipo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="otu_tstamp")
	private Date otuTstamp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="otu_tstamp_log")
	private Date otuTstampLog;

	@Column(name="use_code")
	private String useCode;

	@Column(name="use_code_log")
	private String useCodeLog;

	public LogOcmarcTurno() {
	}

	public int getOtuCode() {
		return this.otuCode;
	}

	public void setOtuCode(int otuCode) {
		this.otuCode = otuCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getAalCodigoLog() {
		return this.aalCodigoLog;
	}

	public void setAalCodigoLog(int aalCodigoLog) {
		this.aalCodigoLog = aalCodigoLog;
	}

	public int getOcaCode() {
		return this.ocaCode;
	}

	public void setOcaCode(int ocaCode) {
		this.ocaCode = ocaCode;
	}

	public int getOcsCode() {
		return this.ocsCode;
	}

	public void setOcsCode(int ocsCode) {
		this.ocsCode = ocsCode;
	}

	public Time getOtuDesde() {
		return this.otuDesde;
	}

	public void setOtuDesde(Time otuDesde) {
		this.otuDesde = otuDesde;
	}

	public int getOtuDuracion() {
		return this.otuDuracion;
	}

	public void setOtuDuracion(int otuDuracion) {
		this.otuDuracion = otuDuracion;
	}

	public String getOtuEstado() {
		return this.otuEstado;
	}

	public void setOtuEstado(String otuEstado) {
		this.otuEstado = otuEstado;
	}

	public Date getOtuFecha() {
		return this.otuFecha;
	}

	public void setOtuFecha(Date otuFecha) {
		this.otuFecha = otuFecha;
	}

	public Time getOtuHasta() {
		return this.otuHasta;
	}

	public void setOtuHasta(Time otuHasta) {
		this.otuHasta = otuHasta;
	}

	public String getOtuMotivo() {
		return this.otuMotivo;
	}

	public void setOtuMotivo(String otuMotivo) {
		this.otuMotivo = otuMotivo;
	}

	public String getOtuOperacionLog() {
		return this.otuOperacionLog;
	}

	public void setOtuOperacionLog(String otuOperacionLog) {
		this.otuOperacionLog = otuOperacionLog;
	}

	public String getOtuTipo() {
		return this.otuTipo;
	}

	public void setOtuTipo(String otuTipo) {
		this.otuTipo = otuTipo;
	}

	public Date getOtuTstamp() {
		return this.otuTstamp;
	}

	public void setOtuTstamp(Date otuTstamp) {
		this.otuTstamp = otuTstamp;
	}

	public Date getOtuTstampLog() {
		return this.otuTstampLog;
	}

	public void setOtuTstampLog(Date otuTstampLog) {
		this.otuTstampLog = otuTstampLog;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public String getUseCodeLog() {
		return this.useCodeLog;
	}

	public void setUseCodeLog(String useCodeLog) {
		this.useCodeLog = useCodeLog;
	}

}