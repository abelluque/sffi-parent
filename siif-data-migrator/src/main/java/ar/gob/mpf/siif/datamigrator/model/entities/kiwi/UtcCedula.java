package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the utc_cedulas database table.
 * 
 */
// @Entity
// @Table(name="utc_cedulas")
@NamedQuery(name="UtcCedula.findAll", query="SELECT u FROM UtcCedula u")
public class UtcCedula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ced_code")
	private int cedCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="ced_caracter")
	private String cedCaracter;

	@Column(name="ced_estado")
	private String cedEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ced_fecha_aprobada")
	private Date cedFechaAprobada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ced_fecha_firmada")
	private Date cedFechaFirmada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ced_fecha_generada")
	private Date cedFechaGenerada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ced_fecha_retornada")
	private Date cedFechaRetornada;

	@Lob
	@Column(name="ced_fundamentacion")
	private String cedFundamentacion;

	@Column(name="ced_medio")
	private String cedMedio;

	@Column(name="ced_observacion")
	private String cedObservacion;

	@Lob
	@Column(name="ced_texto")
	private String cedTexto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ced_tstamp")
	private Date cedTstamp;

	@Column(name="doc_code")
	private int docCode;

	@Column(name="doc_id")
	private String docId;

	@Column(name="dtip_code")
	private String dtipCode;

	@Column(name="pdo_altura")
	private int pdoAltura;

	@Column(name="pdo_barrio")
	private String pdoBarrio;

	@Column(name="pdo_calle")
	private String pdoCalle;

	@Column(name="pdo_calle_villa")
	private String pdoCalleVilla;

	@Column(name="pdo_casa")
	private String pdoCasa;

	@Column(name="pdo_ciudad")
	private String pdoCiudad;

	@Column(name="pdo_code")
	private int pdoCode;

	@Column(name="pdo_coordx")
	private BigDecimal pdoCoordx;

	@Column(name="pdo_coordy")
	private BigDecimal pdoCoordy;

	@Column(name="pdo_cp")
	private String pdoCp;

	@Column(name="pdo_depto")
	private String pdoDepto;

	@Column(name="pdo_lote")
	private String pdoLote;

	@Column(name="pdo_manzana")
	private String pdoManzana;

	@Column(name="pdo_otro")
	private String pdoOtro;

	@Column(name="pdo_piso")
	private String pdoPiso;

	@Column(name="pdo_tipo")
	private String pdoTipo;

	@Column(name="pdo_tipo_domicilio")
	private String pdoTipoDomicilio;

	@Column(name="pdo_torre")
	private String pdoTorre;

	@Column(name="pdo_villa")
	private int pdoVilla;

	@Column(name="per_code")
	private int perCode;

	@Column(name="per_nombre")
	private String perNombre;

	@Column(name="ucj_id")
	private int ucjId;

	@Column(name="ucj_numero")
	private String ucjNumero;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ucj_tstamp")
	private Date ucjTstamp;

	@Column(name="ucj_zona")
	private String ucjZona;

	@Column(name="use_code")
	private int useCode;

	@Column(name="utr_code")
	private int utrCode;

	public UtcCedula() {
	}

	public int getCedCode() {
		return this.cedCode;
	}

	public void setCedCode(int cedCode) {
		this.cedCode = cedCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getCedCaracter() {
		return this.cedCaracter;
	}

	public void setCedCaracter(String cedCaracter) {
		this.cedCaracter = cedCaracter;
	}

	public String getCedEstado() {
		return this.cedEstado;
	}

	public void setCedEstado(String cedEstado) {
		this.cedEstado = cedEstado;
	}

	public Date getCedFechaAprobada() {
		return this.cedFechaAprobada;
	}

	public void setCedFechaAprobada(Date cedFechaAprobada) {
		this.cedFechaAprobada = cedFechaAprobada;
	}

	public Date getCedFechaFirmada() {
		return this.cedFechaFirmada;
	}

	public void setCedFechaFirmada(Date cedFechaFirmada) {
		this.cedFechaFirmada = cedFechaFirmada;
	}

	public Date getCedFechaGenerada() {
		return this.cedFechaGenerada;
	}

	public void setCedFechaGenerada(Date cedFechaGenerada) {
		this.cedFechaGenerada = cedFechaGenerada;
	}

	public Date getCedFechaRetornada() {
		return this.cedFechaRetornada;
	}

	public void setCedFechaRetornada(Date cedFechaRetornada) {
		this.cedFechaRetornada = cedFechaRetornada;
	}

	public String getCedFundamentacion() {
		return this.cedFundamentacion;
	}

	public void setCedFundamentacion(String cedFundamentacion) {
		this.cedFundamentacion = cedFundamentacion;
	}

	public String getCedMedio() {
		return this.cedMedio;
	}

	public void setCedMedio(String cedMedio) {
		this.cedMedio = cedMedio;
	}

	public String getCedObservacion() {
		return this.cedObservacion;
	}

	public void setCedObservacion(String cedObservacion) {
		this.cedObservacion = cedObservacion;
	}

	public String getCedTexto() {
		return this.cedTexto;
	}

	public void setCedTexto(String cedTexto) {
		this.cedTexto = cedTexto;
	}

	public Date getCedTstamp() {
		return this.cedTstamp;
	}

	public void setCedTstamp(Date cedTstamp) {
		this.cedTstamp = cedTstamp;
	}

	public int getDocCode() {
		return this.docCode;
	}

	public void setDocCode(int docCode) {
		this.docCode = docCode;
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getDtipCode() {
		return this.dtipCode;
	}

	public void setDtipCode(String dtipCode) {
		this.dtipCode = dtipCode;
	}

	public int getPdoAltura() {
		return this.pdoAltura;
	}

	public void setPdoAltura(int pdoAltura) {
		this.pdoAltura = pdoAltura;
	}

	public String getPdoBarrio() {
		return this.pdoBarrio;
	}

	public void setPdoBarrio(String pdoBarrio) {
		this.pdoBarrio = pdoBarrio;
	}

	public String getPdoCalle() {
		return this.pdoCalle;
	}

	public void setPdoCalle(String pdoCalle) {
		this.pdoCalle = pdoCalle;
	}

	public String getPdoCalleVilla() {
		return this.pdoCalleVilla;
	}

	public void setPdoCalleVilla(String pdoCalleVilla) {
		this.pdoCalleVilla = pdoCalleVilla;
	}

	public String getPdoCasa() {
		return this.pdoCasa;
	}

	public void setPdoCasa(String pdoCasa) {
		this.pdoCasa = pdoCasa;
	}

	public String getPdoCiudad() {
		return this.pdoCiudad;
	}

	public void setPdoCiudad(String pdoCiudad) {
		this.pdoCiudad = pdoCiudad;
	}

	public int getPdoCode() {
		return this.pdoCode;
	}

	public void setPdoCode(int pdoCode) {
		this.pdoCode = pdoCode;
	}

	public BigDecimal getPdoCoordx() {
		return this.pdoCoordx;
	}

	public void setPdoCoordx(BigDecimal pdoCoordx) {
		this.pdoCoordx = pdoCoordx;
	}

	public BigDecimal getPdoCoordy() {
		return this.pdoCoordy;
	}

	public void setPdoCoordy(BigDecimal pdoCoordy) {
		this.pdoCoordy = pdoCoordy;
	}

	public String getPdoCp() {
		return this.pdoCp;
	}

	public void setPdoCp(String pdoCp) {
		this.pdoCp = pdoCp;
	}

	public String getPdoDepto() {
		return this.pdoDepto;
	}

	public void setPdoDepto(String pdoDepto) {
		this.pdoDepto = pdoDepto;
	}

	public String getPdoLote() {
		return this.pdoLote;
	}

	public void setPdoLote(String pdoLote) {
		this.pdoLote = pdoLote;
	}

	public String getPdoManzana() {
		return this.pdoManzana;
	}

	public void setPdoManzana(String pdoManzana) {
		this.pdoManzana = pdoManzana;
	}

	public String getPdoOtro() {
		return this.pdoOtro;
	}

	public void setPdoOtro(String pdoOtro) {
		this.pdoOtro = pdoOtro;
	}

	public String getPdoPiso() {
		return this.pdoPiso;
	}

	public void setPdoPiso(String pdoPiso) {
		this.pdoPiso = pdoPiso;
	}

	public String getPdoTipo() {
		return this.pdoTipo;
	}

	public void setPdoTipo(String pdoTipo) {
		this.pdoTipo = pdoTipo;
	}

	public String getPdoTipoDomicilio() {
		return this.pdoTipoDomicilio;
	}

	public void setPdoTipoDomicilio(String pdoTipoDomicilio) {
		this.pdoTipoDomicilio = pdoTipoDomicilio;
	}

	public String getPdoTorre() {
		return this.pdoTorre;
	}

	public void setPdoTorre(String pdoTorre) {
		this.pdoTorre = pdoTorre;
	}

	public int getPdoVilla() {
		return this.pdoVilla;
	}

	public void setPdoVilla(int pdoVilla) {
		this.pdoVilla = pdoVilla;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public String getPerNombre() {
		return this.perNombre;
	}

	public void setPerNombre(String perNombre) {
		this.perNombre = perNombre;
	}

	public int getUcjId() {
		return this.ucjId;
	}

	public void setUcjId(int ucjId) {
		this.ucjId = ucjId;
	}

	public String getUcjNumero() {
		return this.ucjNumero;
	}

	public void setUcjNumero(String ucjNumero) {
		this.ucjNumero = ucjNumero;
	}

	public Date getUcjTstamp() {
		return this.ucjTstamp;
	}

	public void setUcjTstamp(Date ucjTstamp) {
		this.ucjTstamp = ucjTstamp;
	}

	public String getUcjZona() {
		return this.ucjZona;
	}

	public void setUcjZona(String ucjZona) {
		this.ucjZona = ucjZona;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

	public int getUtrCode() {
		return this.utrCode;
	}

	public void setUtrCode(int utrCode) {
		this.utrCode = utrCode;
	}

}