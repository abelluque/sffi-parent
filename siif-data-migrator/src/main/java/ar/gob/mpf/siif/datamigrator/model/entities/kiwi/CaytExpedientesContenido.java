package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cayt_expedientes_contenidos database table.
 * 
 */
// @Entity
// @Table(name="cayt_expedientes_contenidos")
@NamedQuery(name="CaytExpedientesContenido.findAll", query="SELECT c FROM CaytExpedientesContenido c")
public class CaytExpedientesContenido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="exi_code")
	private int exiCode;

	@Column(name="cdo_code")
	private int cdoCode;

	@Column(name="exi_adjunto")
	private String exiAdjunto;

	@Column(name="exi_cautelar_estado")
	private String exiCautelarEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exi_cautelar_fecha_concesion")
	private Date exiCautelarFechaConcesion;

	@Lob
	@Column(name="exi_comentario")
	private String exiComentario;

	@Column(name="exi_cuerpo")
	private byte exiCuerpo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exi_fecha_alta")
	private Date exiFechaAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exi_fecha_emision")
	private Date exiFechaEmision;

	@Column(name="exi_firmante")
	private String exiFirmante;

	@Column(name="exi_fojas_desde")
	private int exiFojasDesde;

	@Column(name="exi_fojas_hasta")
	private int exiFojasHasta;

	@Column(name="exi_fuero")
	private String exiFuero;

	@Column(name="exi_nombre")
	private String exiNombre;

	@Column(name="exi_organo_emisor")
	private int exiOrganoEmisor;

	@Column(name="exi_sufijo")
	private byte exiSufijo;

	@Column(name="exp_code")
	private int expCode;

	@Column(name="exv_code")
	private int exvCode;

	@Column(name="tin_code")
	private int tinCode;

	@Column(name="use_code")
	private String useCode;

	public CaytExpedientesContenido() {
	}

	public int getExiCode() {
		return this.exiCode;
	}

	public void setExiCode(int exiCode) {
		this.exiCode = exiCode;
	}

	public int getCdoCode() {
		return this.cdoCode;
	}

	public void setCdoCode(int cdoCode) {
		this.cdoCode = cdoCode;
	}

	public String getExiAdjunto() {
		return this.exiAdjunto;
	}

	public void setExiAdjunto(String exiAdjunto) {
		this.exiAdjunto = exiAdjunto;
	}

	public String getExiCautelarEstado() {
		return this.exiCautelarEstado;
	}

	public void setExiCautelarEstado(String exiCautelarEstado) {
		this.exiCautelarEstado = exiCautelarEstado;
	}

	public Date getExiCautelarFechaConcesion() {
		return this.exiCautelarFechaConcesion;
	}

	public void setExiCautelarFechaConcesion(Date exiCautelarFechaConcesion) {
		this.exiCautelarFechaConcesion = exiCautelarFechaConcesion;
	}

	public String getExiComentario() {
		return this.exiComentario;
	}

	public void setExiComentario(String exiComentario) {
		this.exiComentario = exiComentario;
	}

	public byte getExiCuerpo() {
		return this.exiCuerpo;
	}

	public void setExiCuerpo(byte exiCuerpo) {
		this.exiCuerpo = exiCuerpo;
	}

	public Date getExiFechaAlta() {
		return this.exiFechaAlta;
	}

	public void setExiFechaAlta(Date exiFechaAlta) {
		this.exiFechaAlta = exiFechaAlta;
	}

	public Date getExiFechaEmision() {
		return this.exiFechaEmision;
	}

	public void setExiFechaEmision(Date exiFechaEmision) {
		this.exiFechaEmision = exiFechaEmision;
	}

	public String getExiFirmante() {
		return this.exiFirmante;
	}

	public void setExiFirmante(String exiFirmante) {
		this.exiFirmante = exiFirmante;
	}

	public int getExiFojasDesde() {
		return this.exiFojasDesde;
	}

	public void setExiFojasDesde(int exiFojasDesde) {
		this.exiFojasDesde = exiFojasDesde;
	}

	public int getExiFojasHasta() {
		return this.exiFojasHasta;
	}

	public void setExiFojasHasta(int exiFojasHasta) {
		this.exiFojasHasta = exiFojasHasta;
	}

	public String getExiFuero() {
		return this.exiFuero;
	}

	public void setExiFuero(String exiFuero) {
		this.exiFuero = exiFuero;
	}

	public String getExiNombre() {
		return this.exiNombre;
	}

	public void setExiNombre(String exiNombre) {
		this.exiNombre = exiNombre;
	}

	public int getExiOrganoEmisor() {
		return this.exiOrganoEmisor;
	}

	public void setExiOrganoEmisor(int exiOrganoEmisor) {
		this.exiOrganoEmisor = exiOrganoEmisor;
	}

	public byte getExiSufijo() {
		return this.exiSufijo;
	}

	public void setExiSufijo(byte exiSufijo) {
		this.exiSufijo = exiSufijo;
	}

	public int getExpCode() {
		return this.expCode;
	}

	public void setExpCode(int expCode) {
		this.expCode = expCode;
	}

	public int getExvCode() {
		return this.exvCode;
	}

	public void setExvCode(int exvCode) {
		this.exvCode = exvCode;
	}

	public int getTinCode() {
		return this.tinCode;
	}

	public void setTinCode(int tinCode) {
		this.tinCode = tinCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}