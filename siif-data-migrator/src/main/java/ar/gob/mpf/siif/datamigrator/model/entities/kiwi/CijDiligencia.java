package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cij_diligencias database table.
 * 
 */
// @Entity
// @Table(name="cij_diligencias")
@NamedQuery(name="CijDiligencia.findAll", query="SELECT c FROM CijDiligencia c")
public class CijDiligencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cid_code")
	private int cidCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="cdc_code")
	private int cdcCode;

	@Column(name="cdt_code")
	private int cdtCode;

	@Column(name="cid_agente")
	private int cidAgente;

	@Temporal(TemporalType.DATE)
	@Column(name="cid_alerta")
	private Date cidAlerta;

	@Column(name="cid_avance")
	private String cidAvance;

	@Column(name="cid_caso")
	private int cidCaso;

	@Lob
	@Column(name="cid_descripcion")
	private String cidDescripcion;

	@Lob
	@Column(name="cid_detalle")
	private String cidDetalle;

	@Column(name="cid_estado")
	private String cidEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cid_fecha")
	private Date cidFecha;

	@Column(name="cid_responsable")
	private int cidResponsable;

	@Column(name="cid_supervisor")
	private int cidSupervisor;

	@Column(name="cid_tiempo_maximo")
	private int cidTiempoMaximo;

	@Column(name="cii_code")
	private int ciiCode;

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

	public CijDiligencia() {
	}

	public int getCidCode() {
		return this.cidCode;
	}

	public void setCidCode(int cidCode) {
		this.cidCode = cidCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getCdcCode() {
		return this.cdcCode;
	}

	public void setCdcCode(int cdcCode) {
		this.cdcCode = cdcCode;
	}

	public int getCdtCode() {
		return this.cdtCode;
	}

	public void setCdtCode(int cdtCode) {
		this.cdtCode = cdtCode;
	}

	public int getCidAgente() {
		return this.cidAgente;
	}

	public void setCidAgente(int cidAgente) {
		this.cidAgente = cidAgente;
	}

	public Date getCidAlerta() {
		return this.cidAlerta;
	}

	public void setCidAlerta(Date cidAlerta) {
		this.cidAlerta = cidAlerta;
	}

	public String getCidAvance() {
		return this.cidAvance;
	}

	public void setCidAvance(String cidAvance) {
		this.cidAvance = cidAvance;
	}

	public int getCidCaso() {
		return this.cidCaso;
	}

	public void setCidCaso(int cidCaso) {
		this.cidCaso = cidCaso;
	}

	public String getCidDescripcion() {
		return this.cidDescripcion;
	}

	public void setCidDescripcion(String cidDescripcion) {
		this.cidDescripcion = cidDescripcion;
	}

	public String getCidDetalle() {
		return this.cidDetalle;
	}

	public void setCidDetalle(String cidDetalle) {
		this.cidDetalle = cidDetalle;
	}

	public String getCidEstado() {
		return this.cidEstado;
	}

	public void setCidEstado(String cidEstado) {
		this.cidEstado = cidEstado;
	}

	public Date getCidFecha() {
		return this.cidFecha;
	}

	public void setCidFecha(Date cidFecha) {
		this.cidFecha = cidFecha;
	}

	public int getCidResponsable() {
		return this.cidResponsable;
	}

	public void setCidResponsable(int cidResponsable) {
		this.cidResponsable = cidResponsable;
	}

	public int getCidSupervisor() {
		return this.cidSupervisor;
	}

	public void setCidSupervisor(int cidSupervisor) {
		this.cidSupervisor = cidSupervisor;
	}

	public int getCidTiempoMaximo() {
		return this.cidTiempoMaximo;
	}

	public void setCidTiempoMaximo(int cidTiempoMaximo) {
		this.cidTiempoMaximo = cidTiempoMaximo;
	}

	public int getCiiCode() {
		return this.ciiCode;
	}

	public void setCiiCode(int ciiCode) {
		this.ciiCode = ciiCode;
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