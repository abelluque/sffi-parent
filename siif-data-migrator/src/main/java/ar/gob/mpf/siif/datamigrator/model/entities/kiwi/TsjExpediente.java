package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tsj_expedientes database table.
 * 
 */
// @Entity
// @Table(name="tsj_expedientes")
@NamedQuery(name="TsjExpediente.findAll", query="SELECT t FROM TsjExpediente t")
public class TsjExpediente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="exp_code")
	private int expCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="art_code")
	private int artCode;

	@Column(name="cor_code")
	private int corCode;

	@Column(name="exp_agregados")
	private String expAgregados;

	@Column(name="exp_agregados_detalle")
	private String expAgregadosDetalle;

	@Column(name="exp_autos")
	private String expAutos;

	@Column(name="exp_caratula")
	private String expCaratula;

	@Column(name="exp_codigo")
	private String expCodigo;

	@Column(name="exp_codigo_anio")
	private int expCodigoAnio;

	@Column(name="exp_codigo_instancia_anterior")
	private String expCodigoInstanciaAnterior;

	@Column(name="exp_codigo_numero")
	private int expCodigoNumero;

	@Column(name="exp_codigo_sufijo")
	private int expCodigoSufijo;

	@Column(name="exp_cuerpos")
	private byte expCuerpos;

	@Column(name="exp_en")
	private String expEn;

	@Column(name="exp_estado")
	private String expEstado;

	@Column(name="exp_estado_ingreso")
	private String expEstadoIngreso;

	@Column(name="exp_etiquetas")
	private String expEtiquetas;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_fecha")
	private Date expFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exp_fecha_carga")
	private Date expFechaCarga;

	@Column(name="exp_fojas")
	private int expFojas;

	@Column(name="exp_fuero")
	private String expFuero;

	@Column(name="exp_juez")
	private String expJuez;

	@Column(name="exp_libro_registro")
	private String expLibroRegistro;

	@Column(name="exp_observaciones")
	private String expObservaciones;

	@Column(name="exp_requisitos_observaciones")
	private String expRequisitosObservaciones;

	@Column(name="exp_secretaria")
	private String expSecretaria;

	@Column(name="exp_sintesis")
	private String expSintesis;

	@Column(name="exp_sobre")
	private String expSobre;

	@Column(name="exp_temas_centrales")
	private String expTemasCentrales;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exp_tstamp")
	private Date expTstamp;

	@Column(name="exp_ubicacion")
	private int expUbicacion;

	@Column(name="exp_ultima_fiscalia")
	private int expUltimaFiscalia;

	@Column(name="gam_code")
	private int gamCode;

	@Column(name="obj_code")
	private int objCode;

	@Column(name="ttp_code")
	private int ttpCode;

	@Column(name="use_code")
	private String useCode;

	public TsjExpediente() {
	}

	public int getExpCode() {
		return this.expCode;
	}

	public void setExpCode(int expCode) {
		this.expCode = expCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getArtCode() {
		return this.artCode;
	}

	public void setArtCode(int artCode) {
		this.artCode = artCode;
	}

	public int getCorCode() {
		return this.corCode;
	}

	public void setCorCode(int corCode) {
		this.corCode = corCode;
	}

	public String getExpAgregados() {
		return this.expAgregados;
	}

	public void setExpAgregados(String expAgregados) {
		this.expAgregados = expAgregados;
	}

	public String getExpAgregadosDetalle() {
		return this.expAgregadosDetalle;
	}

	public void setExpAgregadosDetalle(String expAgregadosDetalle) {
		this.expAgregadosDetalle = expAgregadosDetalle;
	}

	public String getExpAutos() {
		return this.expAutos;
	}

	public void setExpAutos(String expAutos) {
		this.expAutos = expAutos;
	}

	public String getExpCaratula() {
		return this.expCaratula;
	}

	public void setExpCaratula(String expCaratula) {
		this.expCaratula = expCaratula;
	}

	public String getExpCodigo() {
		return this.expCodigo;
	}

	public void setExpCodigo(String expCodigo) {
		this.expCodigo = expCodigo;
	}

	public int getExpCodigoAnio() {
		return this.expCodigoAnio;
	}

	public void setExpCodigoAnio(int expCodigoAnio) {
		this.expCodigoAnio = expCodigoAnio;
	}

	public String getExpCodigoInstanciaAnterior() {
		return this.expCodigoInstanciaAnterior;
	}

	public void setExpCodigoInstanciaAnterior(String expCodigoInstanciaAnterior) {
		this.expCodigoInstanciaAnterior = expCodigoInstanciaAnterior;
	}

	public int getExpCodigoNumero() {
		return this.expCodigoNumero;
	}

	public void setExpCodigoNumero(int expCodigoNumero) {
		this.expCodigoNumero = expCodigoNumero;
	}

	public int getExpCodigoSufijo() {
		return this.expCodigoSufijo;
	}

	public void setExpCodigoSufijo(int expCodigoSufijo) {
		this.expCodigoSufijo = expCodigoSufijo;
	}

	public byte getExpCuerpos() {
		return this.expCuerpos;
	}

	public void setExpCuerpos(byte expCuerpos) {
		this.expCuerpos = expCuerpos;
	}

	public String getExpEn() {
		return this.expEn;
	}

	public void setExpEn(String expEn) {
		this.expEn = expEn;
	}

	public String getExpEstado() {
		return this.expEstado;
	}

	public void setExpEstado(String expEstado) {
		this.expEstado = expEstado;
	}

	public String getExpEstadoIngreso() {
		return this.expEstadoIngreso;
	}

	public void setExpEstadoIngreso(String expEstadoIngreso) {
		this.expEstadoIngreso = expEstadoIngreso;
	}

	public String getExpEtiquetas() {
		return this.expEtiquetas;
	}

	public void setExpEtiquetas(String expEtiquetas) {
		this.expEtiquetas = expEtiquetas;
	}

	public Date getExpFecha() {
		return this.expFecha;
	}

	public void setExpFecha(Date expFecha) {
		this.expFecha = expFecha;
	}

	public Date getExpFechaCarga() {
		return this.expFechaCarga;
	}

	public void setExpFechaCarga(Date expFechaCarga) {
		this.expFechaCarga = expFechaCarga;
	}

	public int getExpFojas() {
		return this.expFojas;
	}

	public void setExpFojas(int expFojas) {
		this.expFojas = expFojas;
	}

	public String getExpFuero() {
		return this.expFuero;
	}

	public void setExpFuero(String expFuero) {
		this.expFuero = expFuero;
	}

	public String getExpJuez() {
		return this.expJuez;
	}

	public void setExpJuez(String expJuez) {
		this.expJuez = expJuez;
	}

	public String getExpLibroRegistro() {
		return this.expLibroRegistro;
	}

	public void setExpLibroRegistro(String expLibroRegistro) {
		this.expLibroRegistro = expLibroRegistro;
	}

	public String getExpObservaciones() {
		return this.expObservaciones;
	}

	public void setExpObservaciones(String expObservaciones) {
		this.expObservaciones = expObservaciones;
	}

	public String getExpRequisitosObservaciones() {
		return this.expRequisitosObservaciones;
	}

	public void setExpRequisitosObservaciones(String expRequisitosObservaciones) {
		this.expRequisitosObservaciones = expRequisitosObservaciones;
	}

	public String getExpSecretaria() {
		return this.expSecretaria;
	}

	public void setExpSecretaria(String expSecretaria) {
		this.expSecretaria = expSecretaria;
	}

	public String getExpSintesis() {
		return this.expSintesis;
	}

	public void setExpSintesis(String expSintesis) {
		this.expSintesis = expSintesis;
	}

	public String getExpSobre() {
		return this.expSobre;
	}

	public void setExpSobre(String expSobre) {
		this.expSobre = expSobre;
	}

	public String getExpTemasCentrales() {
		return this.expTemasCentrales;
	}

	public void setExpTemasCentrales(String expTemasCentrales) {
		this.expTemasCentrales = expTemasCentrales;
	}

	public Date getExpTstamp() {
		return this.expTstamp;
	}

	public void setExpTstamp(Date expTstamp) {
		this.expTstamp = expTstamp;
	}

	public int getExpUbicacion() {
		return this.expUbicacion;
	}

	public void setExpUbicacion(int expUbicacion) {
		this.expUbicacion = expUbicacion;
	}

	public int getExpUltimaFiscalia() {
		return this.expUltimaFiscalia;
	}

	public void setExpUltimaFiscalia(int expUltimaFiscalia) {
		this.expUltimaFiscalia = expUltimaFiscalia;
	}

	public int getGamCode() {
		return this.gamCode;
	}

	public void setGamCode(int gamCode) {
		this.gamCode = gamCode;
	}

	public int getObjCode() {
		return this.objCode;
	}

	public void setObjCode(int objCode) {
		this.objCode = objCode;
	}

	public int getTtpCode() {
		return this.ttpCode;
	}

	public void setTtpCode(int ttpCode) {
		this.ttpCode = ttpCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}