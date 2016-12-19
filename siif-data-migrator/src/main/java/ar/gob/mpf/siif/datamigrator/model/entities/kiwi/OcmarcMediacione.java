package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ocmarc_mediaciones database table.
 * 
 */
// @Entity
// @Table(name="ocmarc_mediaciones")
@NamedQuery(name="OcmarcMediacione.findAll", query="SELECT o FROM OcmarcMediacione o")
public class OcmarcMediacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ocm_code")
	private int ocmCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="dden_code")
	private int ddenCode;

	@Column(name="doc_code")
	private int docCode;

	@Column(name="doc_tipo")
	private String docTipo;

	@Column(name="ocm_acuerdo")
	private String ocmAcuerdo;

	@Column(name="ocm_acuerdo_estado")
	private String ocmAcuerdoEstado;

	@Column(name="ocm_agente")
	private int ocmAgente;

	@Column(name="ocm_descripcion")
	private String ocmDescripcion;

	@Column(name="ocm_estado")
	private String ocmEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ocm_fecha")
	private Date ocmFecha;

	@Column(name="ocm_tipo_acuerdo")
	private String ocmTipoAcuerdo;

	@Column(name="use_code")
	private String useCode;

	public OcmarcMediacione() {
	}

	public int getOcmCode() {
		return this.ocmCode;
	}

	public void setOcmCode(int ocmCode) {
		this.ocmCode = ocmCode;
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

	public String getOcmAcuerdo() {
		return this.ocmAcuerdo;
	}

	public void setOcmAcuerdo(String ocmAcuerdo) {
		this.ocmAcuerdo = ocmAcuerdo;
	}

	public String getOcmAcuerdoEstado() {
		return this.ocmAcuerdoEstado;
	}

	public void setOcmAcuerdoEstado(String ocmAcuerdoEstado) {
		this.ocmAcuerdoEstado = ocmAcuerdoEstado;
	}

	public int getOcmAgente() {
		return this.ocmAgente;
	}

	public void setOcmAgente(int ocmAgente) {
		this.ocmAgente = ocmAgente;
	}

	public String getOcmDescripcion() {
		return this.ocmDescripcion;
	}

	public void setOcmDescripcion(String ocmDescripcion) {
		this.ocmDescripcion = ocmDescripcion;
	}

	public String getOcmEstado() {
		return this.ocmEstado;
	}

	public void setOcmEstado(String ocmEstado) {
		this.ocmEstado = ocmEstado;
	}

	public Date getOcmFecha() {
		return this.ocmFecha;
	}

	public void setOcmFecha(Date ocmFecha) {
		this.ocmFecha = ocmFecha;
	}

	public String getOcmTipoAcuerdo() {
		return this.ocmTipoAcuerdo;
	}

	public void setOcmTipoAcuerdo(String ocmTipoAcuerdo) {
		this.ocmTipoAcuerdo = ocmTipoAcuerdo;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}