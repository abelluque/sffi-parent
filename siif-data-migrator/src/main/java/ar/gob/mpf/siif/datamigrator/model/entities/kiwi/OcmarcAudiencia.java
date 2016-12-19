package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the ocmarc_audiencias database table.
 * 
 */
// @Entity
// @Table(name="ocmarc_audiencias")
@NamedQuery(name="OcmarcAudiencia.findAll", query="SELECT o FROM OcmarcAudiencia o")
public class OcmarcAudiencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oca_code")
	private int ocaCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="dden_code")
	private int ddenCode;

	@Column(name="doc_code")
	private int docCode;

	@Column(name="doc_tipo")
	private String docTipo;

	@Column(name="oca_acuerdo")
	private String ocaAcuerdo;

	@Temporal(TemporalType.DATE)
	@Column(name="oca_audiencia_fecha")
	private Date ocaAudienciaFecha;

	@Column(name="oca_audiencia_hora_fin")
	private Time ocaAudienciaHoraFin;

	@Column(name="oca_audiencia_hora_inicio")
	private Time ocaAudienciaHoraInicio;

	@Column(name="oca_estado")
	private String ocaEstado;

	@Column(name="oca_id_juscaba")
	private int ocaIdJuscaba;

	@Column(name="oca_interviene_ofavyt")
	private String ocaIntervieneOfavyt;

	@Column(name="oca_mediador")
	private int ocaMediador;

	@Column(name="oca_personas")
	private String ocaPersonas;

	@Column(name="oca_resolucion")
	private String ocaResolucion;

	@Column(name="oca_tipo_acuerdo")
	private String ocaTipoAcuerdo;

	@Column(name="oca_turno_desde")
	private Time ocaTurnoDesde;

	@Column(name="oca_turno_duracion")
	private int ocaTurnoDuracion;

	@Temporal(TemporalType.DATE)
	@Column(name="oca_turno_fecha")
	private Date ocaTurnoFecha;

	@Column(name="oca_turno_hasta")
	private Time ocaTurnoHasta;

	@Column(name="ocm_code")
	private int ocmCode;

	@Column(name="ocs_code")
	private int ocsCode;

	@Column(name="oin_code")
	private int oinCode;

	@Column(name="otu_code")
	private int otuCode;

	@Column(name="use_code")
	private int useCode;

	public OcmarcAudiencia() {
	}

	public int getOcaCode() {
		return this.ocaCode;
	}

	public void setOcaCode(int ocaCode) {
		this.ocaCode = ocaCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getDdenCode() {
		return this.ddenCode;
	}

	public void setDdenCode(int ddenCode) {
		this.ddenCode = ddenCode;
	}

	public int getDocCode() {
		return this.docCode;
	}

	public void setDocCode(int docCode) {
		this.docCode = docCode;
	}

	public String getDocTipo() {
		return this.docTipo;
	}

	public void setDocTipo(String docTipo) {
		this.docTipo = docTipo;
	}

	public String getOcaAcuerdo() {
		return this.ocaAcuerdo;
	}

	public void setOcaAcuerdo(String ocaAcuerdo) {
		this.ocaAcuerdo = ocaAcuerdo;
	}

	public Date getOcaAudienciaFecha() {
		return this.ocaAudienciaFecha;
	}

	public void setOcaAudienciaFecha(Date ocaAudienciaFecha) {
		this.ocaAudienciaFecha = ocaAudienciaFecha;
	}

	public Time getOcaAudienciaHoraFin() {
		return this.ocaAudienciaHoraFin;
	}

	public void setOcaAudienciaHoraFin(Time ocaAudienciaHoraFin) {
		this.ocaAudienciaHoraFin = ocaAudienciaHoraFin;
	}

	public Time getOcaAudienciaHoraInicio() {
		return this.ocaAudienciaHoraInicio;
	}

	public void setOcaAudienciaHoraInicio(Time ocaAudienciaHoraInicio) {
		this.ocaAudienciaHoraInicio = ocaAudienciaHoraInicio;
	}

	public String getOcaEstado() {
		return this.ocaEstado;
	}

	public void setOcaEstado(String ocaEstado) {
		this.ocaEstado = ocaEstado;
	}

	public int getOcaIdJuscaba() {
		return this.ocaIdJuscaba;
	}

	public void setOcaIdJuscaba(int ocaIdJuscaba) {
		this.ocaIdJuscaba = ocaIdJuscaba;
	}

	public String getOcaIntervieneOfavyt() {
		return this.ocaIntervieneOfavyt;
	}

	public void setOcaIntervieneOfavyt(String ocaIntervieneOfavyt) {
		this.ocaIntervieneOfavyt = ocaIntervieneOfavyt;
	}

	public int getOcaMediador() {
		return this.ocaMediador;
	}

	public void setOcaMediador(int ocaMediador) {
		this.ocaMediador = ocaMediador;
	}

	public String getOcaPersonas() {
		return this.ocaPersonas;
	}

	public void setOcaPersonas(String ocaPersonas) {
		this.ocaPersonas = ocaPersonas;
	}

	public String getOcaResolucion() {
		return this.ocaResolucion;
	}

	public void setOcaResolucion(String ocaResolucion) {
		this.ocaResolucion = ocaResolucion;
	}

	public String getOcaTipoAcuerdo() {
		return this.ocaTipoAcuerdo;
	}

	public void setOcaTipoAcuerdo(String ocaTipoAcuerdo) {
		this.ocaTipoAcuerdo = ocaTipoAcuerdo;
	}

	public Time getOcaTurnoDesde() {
		return this.ocaTurnoDesde;
	}

	public void setOcaTurnoDesde(Time ocaTurnoDesde) {
		this.ocaTurnoDesde = ocaTurnoDesde;
	}

	public int getOcaTurnoDuracion() {
		return this.ocaTurnoDuracion;
	}

	public void setOcaTurnoDuracion(int ocaTurnoDuracion) {
		this.ocaTurnoDuracion = ocaTurnoDuracion;
	}

	public Date getOcaTurnoFecha() {
		return this.ocaTurnoFecha;
	}

	public void setOcaTurnoFecha(Date ocaTurnoFecha) {
		this.ocaTurnoFecha = ocaTurnoFecha;
	}

	public Time getOcaTurnoHasta() {
		return this.ocaTurnoHasta;
	}

	public void setOcaTurnoHasta(Time ocaTurnoHasta) {
		this.ocaTurnoHasta = ocaTurnoHasta;
	}

	public int getOcmCode() {
		return this.ocmCode;
	}

	public void setOcmCode(int ocmCode) {
		this.ocmCode = ocmCode;
	}

	public int getOcsCode() {
		return this.ocsCode;
	}

	public void setOcsCode(int ocsCode) {
		this.ocsCode = ocsCode;
	}

	public int getOinCode() {
		return this.oinCode;
	}

	public void setOinCode(int oinCode) {
		this.oinCode = oinCode;
	}

	public int getOtuCode() {
		return this.otuCode;
	}

	public void setOtuCode(int otuCode) {
		this.otuCode = otuCode;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}