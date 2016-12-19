package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tsj_documentos database table.
 * 
 */
// @Entity
// @Table(name="tsj_documentos")
@NamedQuery(name="TsjDocumento.findAll", query="SELECT t FROM TsjDocumento t")
public class TsjDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cdo_code")
	private int cdoCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="cdo_anio")
	private int cdoAnio;

	@Column(name="cdo_documento_firmado")
	private String cdoDocumentoFirmado;

	@Column(name="cdo_estado")
	private String cdoEstado;

	@Column(name="cdo_etiquetas")
	private String cdoEtiquetas;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cdo_fecha")
	private Date cdoFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cdo_fecha_firma")
	private Date cdoFechaFirma;

	@Column(name="cdo_numero")
	private int cdoNumero;

	@Column(name="cdo_template")
	private String cdoTemplate;

	@Lob
	@Column(name="cdo_texto")
	private String cdoTexto;

	@Column(name="cdo_tipo_documento")
	private String cdoTipoDocumento;

	@Column(name="cdo_use_code_firma")
	private String cdoUseCodeFirma;

	@Column(name="exi_code")
	private int exiCode;

	@Column(name="exp_code")
	private int expCode;

	@Column(name="use_code")
	private String useCode;

	public TsjDocumento() {
	}

	public int getCdoCode() {
		return this.cdoCode;
	}

	public void setCdoCode(int cdoCode) {
		this.cdoCode = cdoCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getCdoAnio() {
		return this.cdoAnio;
	}

	public void setCdoAnio(int cdoAnio) {
		this.cdoAnio = cdoAnio;
	}

	public String getCdoDocumentoFirmado() {
		return this.cdoDocumentoFirmado;
	}

	public void setCdoDocumentoFirmado(String cdoDocumentoFirmado) {
		this.cdoDocumentoFirmado = cdoDocumentoFirmado;
	}

	public String getCdoEstado() {
		return this.cdoEstado;
	}

	public void setCdoEstado(String cdoEstado) {
		this.cdoEstado = cdoEstado;
	}

	public String getCdoEtiquetas() {
		return this.cdoEtiquetas;
	}

	public void setCdoEtiquetas(String cdoEtiquetas) {
		this.cdoEtiquetas = cdoEtiquetas;
	}

	public Date getCdoFecha() {
		return this.cdoFecha;
	}

	public void setCdoFecha(Date cdoFecha) {
		this.cdoFecha = cdoFecha;
	}

	public Date getCdoFechaFirma() {
		return this.cdoFechaFirma;
	}

	public void setCdoFechaFirma(Date cdoFechaFirma) {
		this.cdoFechaFirma = cdoFechaFirma;
	}

	public int getCdoNumero() {
		return this.cdoNumero;
	}

	public void setCdoNumero(int cdoNumero) {
		this.cdoNumero = cdoNumero;
	}

	public String getCdoTemplate() {
		return this.cdoTemplate;
	}

	public void setCdoTemplate(String cdoTemplate) {
		this.cdoTemplate = cdoTemplate;
	}

	public String getCdoTexto() {
		return this.cdoTexto;
	}

	public void setCdoTexto(String cdoTexto) {
		this.cdoTexto = cdoTexto;
	}

	public String getCdoTipoDocumento() {
		return this.cdoTipoDocumento;
	}

	public void setCdoTipoDocumento(String cdoTipoDocumento) {
		this.cdoTipoDocumento = cdoTipoDocumento;
	}

	public String getCdoUseCodeFirma() {
		return this.cdoUseCodeFirma;
	}

	public void setCdoUseCodeFirma(String cdoUseCodeFirma) {
		this.cdoUseCodeFirma = cdoUseCodeFirma;
	}

	public int getExiCode() {
		return this.exiCode;
	}

	public void setExiCode(int exiCode) {
		this.exiCode = exiCode;
	}

	public int getExpCode() {
		return this.expCode;
	}

	public void setExpCode(int expCode) {
		this.expCode = expCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}