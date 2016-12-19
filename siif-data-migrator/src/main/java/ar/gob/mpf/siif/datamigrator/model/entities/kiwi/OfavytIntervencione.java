package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ofavyt_intervenciones database table.
 * 
 */
// @Entity
// @Table(name="ofavyt_intervenciones")
@NamedQuery(name="OfavytIntervencione.findAll", query="SELECT o FROM OfavytIntervencione o")
public class OfavytIntervencione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oin_code")
	private int oinCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="ocs_code")
	private int ocsCode;

	@Column(name="oin_agente")
	private int oinAgente;

	@Lob
	@Column(name="oin_descripcion")
	private String oinDescripcion;

	@Column(name="oin_doc_asoc")
	private String oinDocAsoc;

	@Column(name="oin_estado")
	private String oinEstado;

	@Column(name="oin_etiquetas")
	private String oinEtiquetas;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oin_fecha")
	private Date oinFecha;

	@Lob
	@Column(name="oin_instancia")
	private String oinInstancia;

	@Column(name="oin_nro_doc")
	private int oinNroDoc;

	@Column(name="oin_ofavyt")
	private int oinOfavyt;

	@Column(name="oin_origen_dependencia")
	private int oinOrigenDependencia;

	@Column(name="oin_origen_observ")
	private String oinOrigenObserv;

	@Column(name="oin_supervisor")
	private int oinSupervisor;

	@Column(name="oin_tipo_doc")
	private String oinTipoDoc;

	@Column(name="oin_tipo_origen")
	private String oinTipoOrigen;

	@Column(name="oti_code")
	private int otiCode;

	@Column(name="ots_code")
	private int otsCode;

	@Column(name="pco_code")
	private int pcoCode;

	@Column(name="pdc_code")
	private int pdcCode;

	@Column(name="pdo_code")
	private int pdoCode;

	@Column(name="per_caracter")
	private String perCaracter;

	@Column(name="per_code")
	private int perCode;

	@Column(name="use_code")
	private String useCode;

	@Column(name="use_email")
	private String useEmail;

	@Column(name="use_mobile_lab")
	private String useMobileLab;

	@Column(name="use_phone_lab")
	private String usePhoneLab;

	public OfavytIntervencione() {
	}

	public int getOinCode() {
		return this.oinCode;
	}

	public void setOinCode(int oinCode) {
		this.oinCode = oinCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getOcsCode() {
		return this.ocsCode;
	}

	public void setOcsCode(int ocsCode) {
		this.ocsCode = ocsCode;
	}

	public int getOinAgente() {
		return this.oinAgente;
	}

	public void setOinAgente(int oinAgente) {
		this.oinAgente = oinAgente;
	}

	public String getOinDescripcion() {
		return this.oinDescripcion;
	}

	public void setOinDescripcion(String oinDescripcion) {
		this.oinDescripcion = oinDescripcion;
	}

	public String getOinDocAsoc() {
		return this.oinDocAsoc;
	}

	public void setOinDocAsoc(String oinDocAsoc) {
		this.oinDocAsoc = oinDocAsoc;
	}

	public String getOinEstado() {
		return this.oinEstado;
	}

	public void setOinEstado(String oinEstado) {
		this.oinEstado = oinEstado;
	}

	public String getOinEtiquetas() {
		return this.oinEtiquetas;
	}

	public void setOinEtiquetas(String oinEtiquetas) {
		this.oinEtiquetas = oinEtiquetas;
	}

	public Date getOinFecha() {
		return this.oinFecha;
	}

	public void setOinFecha(Date oinFecha) {
		this.oinFecha = oinFecha;
	}

	public String getOinInstancia() {
		return this.oinInstancia;
	}

	public void setOinInstancia(String oinInstancia) {
		this.oinInstancia = oinInstancia;
	}

	public int getOinNroDoc() {
		return this.oinNroDoc;
	}

	public void setOinNroDoc(int oinNroDoc) {
		this.oinNroDoc = oinNroDoc;
	}

	public int getOinOfavyt() {
		return this.oinOfavyt;
	}

	public void setOinOfavyt(int oinOfavyt) {
		this.oinOfavyt = oinOfavyt;
	}

	public int getOinOrigenDependencia() {
		return this.oinOrigenDependencia;
	}

	public void setOinOrigenDependencia(int oinOrigenDependencia) {
		this.oinOrigenDependencia = oinOrigenDependencia;
	}

	public String getOinOrigenObserv() {
		return this.oinOrigenObserv;
	}

	public void setOinOrigenObserv(String oinOrigenObserv) {
		this.oinOrigenObserv = oinOrigenObserv;
	}

	public int getOinSupervisor() {
		return this.oinSupervisor;
	}

	public void setOinSupervisor(int oinSupervisor) {
		this.oinSupervisor = oinSupervisor;
	}

	public String getOinTipoDoc() {
		return this.oinTipoDoc;
	}

	public void setOinTipoDoc(String oinTipoDoc) {
		this.oinTipoDoc = oinTipoDoc;
	}

	public String getOinTipoOrigen() {
		return this.oinTipoOrigen;
	}

	public void setOinTipoOrigen(String oinTipoOrigen) {
		this.oinTipoOrigen = oinTipoOrigen;
	}

	public int getOtiCode() {
		return this.otiCode;
	}

	public void setOtiCode(int otiCode) {
		this.otiCode = otiCode;
	}

	public int getOtsCode() {
		return this.otsCode;
	}

	public void setOtsCode(int otsCode) {
		this.otsCode = otsCode;
	}

	public int getPcoCode() {
		return this.pcoCode;
	}

	public void setPcoCode(int pcoCode) {
		this.pcoCode = pcoCode;
	}

	public int getPdcCode() {
		return this.pdcCode;
	}

	public void setPdcCode(int pdcCode) {
		this.pdcCode = pdcCode;
	}

	public int getPdoCode() {
		return this.pdoCode;
	}

	public void setPdoCode(int pdoCode) {
		this.pdoCode = pdoCode;
	}

	public String getPerCaracter() {
		return this.perCaracter;
	}

	public void setPerCaracter(String perCaracter) {
		this.perCaracter = perCaracter;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public String getUseEmail() {
		return this.useEmail;
	}

	public void setUseEmail(String useEmail) {
		this.useEmail = useEmail;
	}

	public String getUseMobileLab() {
		return this.useMobileLab;
	}

	public void setUseMobileLab(String useMobileLab) {
		this.useMobileLab = useMobileLab;
	}

	public String getUsePhoneLab() {
		return this.usePhoneLab;
	}

	public void setUsePhoneLab(String usePhoneLab) {
		this.usePhoneLab = usePhoneLab;
	}

}