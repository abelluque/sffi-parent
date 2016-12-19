package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cayt_documentos_sistematizados database table.
 * 
 */
// @Entity
// @Table(name="cayt_documentos_sistematizados")
@NamedQuery(name="CaytDocumentosSistematizado.findAll", query="SELECT c FROM CaytDocumentosSistematizado c")
public class CaytDocumentosSistematizado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dsi_code")
	private int dsiCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="dsi_descriptores")
	private String dsiDescriptores;

	@Column(name="dsi_estado")
	private String dsiEstado;

	@Column(name="dsi_etiquetas")
	private String dsiEtiquetas;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dsi_fecha_hora")
	private Date dsiFechaHora;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dsi_fecha_sistematizado")
	private Date dsiFechaSistematizado;

	@Lob
	@Column(name="dsi_texto")
	private String dsiTexto;

	@Column(name="exi_code")
	private int exiCode;

	@Column(name="exp_code")
	private int expCode;

	@Column(name="exv_code")
	private int exvCode;

	@Column(name="use_code")
	private String useCode;

	public CaytDocumentosSistematizado() {
	}

	public int getDsiCode() {
		return this.dsiCode;
	}

	public void setDsiCode(int dsiCode) {
		this.dsiCode = dsiCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getDsiDescriptores() {
		return this.dsiDescriptores;
	}

	public void setDsiDescriptores(String dsiDescriptores) {
		this.dsiDescriptores = dsiDescriptores;
	}

	public String getDsiEstado() {
		return this.dsiEstado;
	}

	public void setDsiEstado(String dsiEstado) {
		this.dsiEstado = dsiEstado;
	}

	public String getDsiEtiquetas() {
		return this.dsiEtiquetas;
	}

	public void setDsiEtiquetas(String dsiEtiquetas) {
		this.dsiEtiquetas = dsiEtiquetas;
	}

	public Date getDsiFechaHora() {
		return this.dsiFechaHora;
	}

	public void setDsiFechaHora(Date dsiFechaHora) {
		this.dsiFechaHora = dsiFechaHora;
	}

	public Date getDsiFechaSistematizado() {
		return this.dsiFechaSistematizado;
	}

	public void setDsiFechaSistematizado(Date dsiFechaSistematizado) {
		this.dsiFechaSistematizado = dsiFechaSistematizado;
	}

	public String getDsiTexto() {
		return this.dsiTexto;
	}

	public void setDsiTexto(String dsiTexto) {
		this.dsiTexto = dsiTexto;
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

	public int getExvCode() {
		return this.exvCode;
	}

	public void setExvCode(int exvCode) {
		this.exvCode = exvCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}