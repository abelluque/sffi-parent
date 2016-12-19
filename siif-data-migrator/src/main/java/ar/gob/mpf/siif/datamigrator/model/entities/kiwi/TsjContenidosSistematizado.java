package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tsj_contenidos_sistematizados database table.
 * 
 */
// @Entity
// @Table(name="tsj_contenidos_sistematizados")
@NamedQuery(name="TsjContenidosSistematizado.findAll", query="SELECT t FROM TsjContenidosSistematizado t")
public class TsjContenidosSistematizado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tcs_code")
	private int tcsCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="exc_code")
	private int excCode;

	@Column(name="exi_code")
	private int exiCode;

	@Column(name="exp_code")
	private int expCode;

	@Column(name="tcs_descriptores")
	private String tcsDescriptores;

	@Column(name="tcs_estado")
	private String tcsEstado;

	@Column(name="tcs_etiquetas")
	private String tcsEtiquetas;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="tcs_fecha_hora")
	private Date tcsFechaHora;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="tcs_fecha_sistematizado")
	private Date tcsFechaSistematizado;

	@Lob
	@Column(name="tcs_texto")
	private String tcsTexto;

	@Column(name="use_code")
	private String useCode;

	public TsjContenidosSistematizado() {
	}

	public int getTcsCode() {
		return this.tcsCode;
	}

	public void setTcsCode(int tcsCode) {
		this.tcsCode = tcsCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getExcCode() {
		return this.excCode;
	}

	public void setExcCode(int excCode) {
		this.excCode = excCode;
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

	public String getTcsDescriptores() {
		return this.tcsDescriptores;
	}

	public void setTcsDescriptores(String tcsDescriptores) {
		this.tcsDescriptores = tcsDescriptores;
	}

	public String getTcsEstado() {
		return this.tcsEstado;
	}

	public void setTcsEstado(String tcsEstado) {
		this.tcsEstado = tcsEstado;
	}

	public String getTcsEtiquetas() {
		return this.tcsEtiquetas;
	}

	public void setTcsEtiquetas(String tcsEtiquetas) {
		this.tcsEtiquetas = tcsEtiquetas;
	}

	public Date getTcsFechaHora() {
		return this.tcsFechaHora;
	}

	public void setTcsFechaHora(Date tcsFechaHora) {
		this.tcsFechaHora = tcsFechaHora;
	}

	public Date getTcsFechaSistematizado() {
		return this.tcsFechaSistematizado;
	}

	public void setTcsFechaSistematizado(Date tcsFechaSistematizado) {
		this.tcsFechaSistematizado = tcsFechaSistematizado;
	}

	public String getTcsTexto() {
		return this.tcsTexto;
	}

	public void setTcsTexto(String tcsTexto) {
		this.tcsTexto = tcsTexto;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}