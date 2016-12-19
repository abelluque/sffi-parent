package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the den_denuncia database table.
 * 
 */
// @Entity
// @Table(name="den_denuncia")
@NamedQuery(name="DenDenuncia.findAll", query="SELECT d FROM DenDenuncia d")
public class DenDenuncia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dden_code")
	private int ddenCode;

	@Column(name="dca_code")
	private int dcaCode;

	@Column(name="dden_actor_vd")
	private String ddenActorVd;

	@Column(name="dden_anio_juscaba")
	private int ddenAnioJuscaba;

	@Column(name="dden_articulos_observ")
	private String ddenArticulosObserv;

	@Lob
	@Column(name="dden_categorias")
	private String ddenCategorias;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dden_conexidades_geografica_hecha")
	private Date ddenConexidadesGeograficaHecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dden_conexidades_persona_hecha")
	private Date ddenConexidadesPersonaHecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dden_conexidades_por_nombre_hecha")
	private Date ddenConexidadesPorNombreHecha;

	@Lob
	@Column(name="dden_data_prerevision")
	private String ddenDataPrerevision;

	@Column(name="dden_del_informatico")
	private String ddenDelInformatico;

	@Column(name="dden_escrita_com")
	private int ddenEscritaCom;

	@Column(name="dden_escrita_fpol")
	private int ddenEscritaFpol;

	@Column(name="dden_estado")
	private String ddenEstado;

	@Lob
	@Column(name="dden_etiquetas")
	private String ddenEtiquetas;

	@Column(name="dden_faltas_acta_circunstanciada")
	private String ddenFaltasActaCircunstanciada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dden_faltas_fecha_acta")
	private Date ddenFaltasFechaActa;

	@Column(name="dden_faltas_nro_acta")
	private String ddenFaltasNroActa;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dden_fecha_alta_preconexidad")
	private Date ddenFechaAltaPreconexidad;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dden_fecha_escrita_u_otro")
	private Date ddenFechaEscritaUOtro;

	@Column(name="dden_fecha_hora_desconocido")
	private String ddenFechaHoraDesconocido;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dden_fecha_hora_prerevision")
	private Date ddenFechaHoraPrerevision;

	@Column(name="dden_flagrante")
	private String ddenFlagrante;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dden_fpol_fecha")
	private Date ddenFpolFecha;

	@Column(name="dden_fpol_sumario")
	private String ddenFpolSumario;

	@Lob
	@Column(name="dden_hecho")
	private String ddenHecho;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dden_hecho_tstamp_fin")
	private Date ddenHechoTstampFin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dden_hecho_tstamp_ini")
	private Date ddenHechoTstampIni;

	@Column(name="dden_hora_fin_desc")
	private String ddenHoraFinDesc;

	@Column(name="dden_hora_ini_desc")
	private String ddenHoraIniDesc;

	@Column(name="dden_id_juscaba")
	private String ddenIdJuscaba;

	@Column(name="dden_lista_para_analisis")
	private String ddenListaParaAnalisis;

	@Column(name="dden_mediar")
	private String ddenMediar;

	@Column(name="dden_medida_cautelar")
	private String ddenMedidaCautelar;

	@Column(name="dden_medida_cautelar_obs")
	private String ddenMedidaCautelarObs;

	@Column(name="dden_nro_caso_escrita_u_otro")
	private String ddenNroCasoEscritaUOtro;

	@Column(name="dden_nro_juscaba")
	private String ddenNroJuscaba;

	@Column(name="dden_observaciones")
	private String ddenObservaciones;

	@Column(name="dden_operador_alta_preconexidad")
	private int ddenOperadorAltaPreconexidad;

	@Column(name="dden_organismo_escrita_u_otro")
	private String ddenOrganismoEscritaUOtro;

	@Column(name="dden_origen_dato")
	private String ddenOrigenDato;

	@Column(name="dden_origen_observ")
	private String ddenOrigenObserv;

	@Column(name="dden_pre_resena")
	private String ddenPreResena;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dden_pre_resena_hecha")
	private Date ddenPreResenaHecha;

	@Column(name="dden_preconex_hay")
	private String ddenPreconexHay;

	@Column(name="dden_preconex_nota")
	private String ddenPreconexNota;

	@Column(name="dden_realizo_prerevision")
	private String ddenRealizoPrerevision;

	@Column(name="dden_resena_caso")
	private String ddenResenaCaso;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dden_resena_caso_hecha")
	private Date ddenResenaCasoHecha;

	@Column(name="dden_reserva_dependencia")
	private int ddenReservaDependencia;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dden_reserva_fecha")
	private Date ddenReservaFecha;

	@Column(name="dden_reserva_fiscal")
	private String ddenReservaFiscal;

	@Column(name="dden_tipo")
	private String ddenTipo;

	@Column(name="dden_tipo_lugar_hecho")
	private String ddenTipoLugarHecho;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dden_tstamp")
	private Date ddenTstamp;

	@Column(name="dden_ubicacion")
	private String ddenUbicacion;

	@Column(name="dden_use_code_prerevision")
	private int ddenUseCodePrerevision;

	@Column(name="dden_usuario_conexidades_geografica_hecha")
	private int ddenUsuarioConexidadesGeograficaHecha;

	@Column(name="dden_usuario_conexidades_persona_hecha")
	private int ddenUsuarioConexidadesPersonaHecha;

	@Column(name="dden_usuario_conexidades_por_nombre_hecha")
	private int ddenUsuarioConexidadesPorNombreHecha;

	@Column(name="dden_v_domestica")
	private String ddenVDomestica;

	@Column(name="dden_via_publica")
	private String ddenViaPublica;

	@Column(name="dden_zona")
	private String ddenZona;

	@Column(name="den_dependencia")
	private int denDependencia;

	@Column(name="den_user_id")
	private int denUserId;

	@Column(name="dom_code_hecho")
	private int domCodeHecho;

	@Column(name="oac_code")
	private int oacCode;

	@Column(name="pue_code")
	private int pueCode;

	public DenDenuncia() {
	}

	public int getDdenCode() {
		return this.ddenCode;
	}

	public void setDdenCode(int ddenCode) {
		this.ddenCode = ddenCode;
	}

	public int getDcaCode() {
		return this.dcaCode;
	}

	public void setDcaCode(int dcaCode) {
		this.dcaCode = dcaCode;
	}

	public String getDdenActorVd() {
		return this.ddenActorVd;
	}

	public void setDdenActorVd(String ddenActorVd) {
		this.ddenActorVd = ddenActorVd;
	}

	public int getDdenAnioJuscaba() {
		return this.ddenAnioJuscaba;
	}

	public void setDdenAnioJuscaba(int ddenAnioJuscaba) {
		this.ddenAnioJuscaba = ddenAnioJuscaba;
	}

	public String getDdenArticulosObserv() {
		return this.ddenArticulosObserv;
	}

	public void setDdenArticulosObserv(String ddenArticulosObserv) {
		this.ddenArticulosObserv = ddenArticulosObserv;
	}

	public String getDdenCategorias() {
		return this.ddenCategorias;
	}

	public void setDdenCategorias(String ddenCategorias) {
		this.ddenCategorias = ddenCategorias;
	}

	public Date getDdenConexidadesGeograficaHecha() {
		return this.ddenConexidadesGeograficaHecha;
	}

	public void setDdenConexidadesGeograficaHecha(Date ddenConexidadesGeograficaHecha) {
		this.ddenConexidadesGeograficaHecha = ddenConexidadesGeograficaHecha;
	}

	public Date getDdenConexidadesPersonaHecha() {
		return this.ddenConexidadesPersonaHecha;
	}

	public void setDdenConexidadesPersonaHecha(Date ddenConexidadesPersonaHecha) {
		this.ddenConexidadesPersonaHecha = ddenConexidadesPersonaHecha;
	}

	public Date getDdenConexidadesPorNombreHecha() {
		return this.ddenConexidadesPorNombreHecha;
	}

	public void setDdenConexidadesPorNombreHecha(Date ddenConexidadesPorNombreHecha) {
		this.ddenConexidadesPorNombreHecha = ddenConexidadesPorNombreHecha;
	}

	public String getDdenDataPrerevision() {
		return this.ddenDataPrerevision;
	}

	public void setDdenDataPrerevision(String ddenDataPrerevision) {
		this.ddenDataPrerevision = ddenDataPrerevision;
	}

	public String getDdenDelInformatico() {
		return this.ddenDelInformatico;
	}

	public void setDdenDelInformatico(String ddenDelInformatico) {
		this.ddenDelInformatico = ddenDelInformatico;
	}

	public int getDdenEscritaCom() {
		return this.ddenEscritaCom;
	}

	public void setDdenEscritaCom(int ddenEscritaCom) {
		this.ddenEscritaCom = ddenEscritaCom;
	}

	public int getDdenEscritaFpol() {
		return this.ddenEscritaFpol;
	}

	public void setDdenEscritaFpol(int ddenEscritaFpol) {
		this.ddenEscritaFpol = ddenEscritaFpol;
	}

	public String getDdenEstado() {
		return this.ddenEstado;
	}

	public void setDdenEstado(String ddenEstado) {
		this.ddenEstado = ddenEstado;
	}

	public String getDdenEtiquetas() {
		return this.ddenEtiquetas;
	}

	public void setDdenEtiquetas(String ddenEtiquetas) {
		this.ddenEtiquetas = ddenEtiquetas;
	}

	public String getDdenFaltasActaCircunstanciada() {
		return this.ddenFaltasActaCircunstanciada;
	}

	public void setDdenFaltasActaCircunstanciada(String ddenFaltasActaCircunstanciada) {
		this.ddenFaltasActaCircunstanciada = ddenFaltasActaCircunstanciada;
	}

	public Date getDdenFaltasFechaActa() {
		return this.ddenFaltasFechaActa;
	}

	public void setDdenFaltasFechaActa(Date ddenFaltasFechaActa) {
		this.ddenFaltasFechaActa = ddenFaltasFechaActa;
	}

	public String getDdenFaltasNroActa() {
		return this.ddenFaltasNroActa;
	}

	public void setDdenFaltasNroActa(String ddenFaltasNroActa) {
		this.ddenFaltasNroActa = ddenFaltasNroActa;
	}

	public Date getDdenFechaAltaPreconexidad() {
		return this.ddenFechaAltaPreconexidad;
	}

	public void setDdenFechaAltaPreconexidad(Date ddenFechaAltaPreconexidad) {
		this.ddenFechaAltaPreconexidad = ddenFechaAltaPreconexidad;
	}

	public Date getDdenFechaEscritaUOtro() {
		return this.ddenFechaEscritaUOtro;
	}

	public void setDdenFechaEscritaUOtro(Date ddenFechaEscritaUOtro) {
		this.ddenFechaEscritaUOtro = ddenFechaEscritaUOtro;
	}

	public String getDdenFechaHoraDesconocido() {
		return this.ddenFechaHoraDesconocido;
	}

	public void setDdenFechaHoraDesconocido(String ddenFechaHoraDesconocido) {
		this.ddenFechaHoraDesconocido = ddenFechaHoraDesconocido;
	}

	public Date getDdenFechaHoraPrerevision() {
		return this.ddenFechaHoraPrerevision;
	}

	public void setDdenFechaHoraPrerevision(Date ddenFechaHoraPrerevision) {
		this.ddenFechaHoraPrerevision = ddenFechaHoraPrerevision;
	}

	public String getDdenFlagrante() {
		return this.ddenFlagrante;
	}

	public void setDdenFlagrante(String ddenFlagrante) {
		this.ddenFlagrante = ddenFlagrante;
	}

	public Date getDdenFpolFecha() {
		return this.ddenFpolFecha;
	}

	public void setDdenFpolFecha(Date ddenFpolFecha) {
		this.ddenFpolFecha = ddenFpolFecha;
	}

	public String getDdenFpolSumario() {
		return this.ddenFpolSumario;
	}

	public void setDdenFpolSumario(String ddenFpolSumario) {
		this.ddenFpolSumario = ddenFpolSumario;
	}

	public String getDdenHecho() {
		return this.ddenHecho;
	}

	public void setDdenHecho(String ddenHecho) {
		this.ddenHecho = ddenHecho;
	}

	public Date getDdenHechoTstampFin() {
		return this.ddenHechoTstampFin;
	}

	public void setDdenHechoTstampFin(Date ddenHechoTstampFin) {
		this.ddenHechoTstampFin = ddenHechoTstampFin;
	}

	public Date getDdenHechoTstampIni() {
		return this.ddenHechoTstampIni;
	}

	public void setDdenHechoTstampIni(Date ddenHechoTstampIni) {
		this.ddenHechoTstampIni = ddenHechoTstampIni;
	}

	public String getDdenHoraFinDesc() {
		return this.ddenHoraFinDesc;
	}

	public void setDdenHoraFinDesc(String ddenHoraFinDesc) {
		this.ddenHoraFinDesc = ddenHoraFinDesc;
	}

	public String getDdenHoraIniDesc() {
		return this.ddenHoraIniDesc;
	}

	public void setDdenHoraIniDesc(String ddenHoraIniDesc) {
		this.ddenHoraIniDesc = ddenHoraIniDesc;
	}

	public String getDdenIdJuscaba() {
		return this.ddenIdJuscaba;
	}

	public void setDdenIdJuscaba(String ddenIdJuscaba) {
		this.ddenIdJuscaba = ddenIdJuscaba;
	}

	public String getDdenListaParaAnalisis() {
		return this.ddenListaParaAnalisis;
	}

	public void setDdenListaParaAnalisis(String ddenListaParaAnalisis) {
		this.ddenListaParaAnalisis = ddenListaParaAnalisis;
	}

	public String getDdenMediar() {
		return this.ddenMediar;
	}

	public void setDdenMediar(String ddenMediar) {
		this.ddenMediar = ddenMediar;
	}

	public String getDdenMedidaCautelar() {
		return this.ddenMedidaCautelar;
	}

	public void setDdenMedidaCautelar(String ddenMedidaCautelar) {
		this.ddenMedidaCautelar = ddenMedidaCautelar;
	}

	public String getDdenMedidaCautelarObs() {
		return this.ddenMedidaCautelarObs;
	}

	public void setDdenMedidaCautelarObs(String ddenMedidaCautelarObs) {
		this.ddenMedidaCautelarObs = ddenMedidaCautelarObs;
	}

	public String getDdenNroCasoEscritaUOtro() {
		return this.ddenNroCasoEscritaUOtro;
	}

	public void setDdenNroCasoEscritaUOtro(String ddenNroCasoEscritaUOtro) {
		this.ddenNroCasoEscritaUOtro = ddenNroCasoEscritaUOtro;
	}

	public String getDdenNroJuscaba() {
		return this.ddenNroJuscaba;
	}

	public void setDdenNroJuscaba(String ddenNroJuscaba) {
		this.ddenNroJuscaba = ddenNroJuscaba;
	}

	public String getDdenObservaciones() {
		return this.ddenObservaciones;
	}

	public void setDdenObservaciones(String ddenObservaciones) {
		this.ddenObservaciones = ddenObservaciones;
	}

	public int getDdenOperadorAltaPreconexidad() {
		return this.ddenOperadorAltaPreconexidad;
	}

	public void setDdenOperadorAltaPreconexidad(int ddenOperadorAltaPreconexidad) {
		this.ddenOperadorAltaPreconexidad = ddenOperadorAltaPreconexidad;
	}

	public String getDdenOrganismoEscritaUOtro() {
		return this.ddenOrganismoEscritaUOtro;
	}

	public void setDdenOrganismoEscritaUOtro(String ddenOrganismoEscritaUOtro) {
		this.ddenOrganismoEscritaUOtro = ddenOrganismoEscritaUOtro;
	}

	public String getDdenOrigenDato() {
		return this.ddenOrigenDato;
	}

	public void setDdenOrigenDato(String ddenOrigenDato) {
		this.ddenOrigenDato = ddenOrigenDato;
	}

	public String getDdenOrigenObserv() {
		return this.ddenOrigenObserv;
	}

	public void setDdenOrigenObserv(String ddenOrigenObserv) {
		this.ddenOrigenObserv = ddenOrigenObserv;
	}

	public String getDdenPreResena() {
		return this.ddenPreResena;
	}

	public void setDdenPreResena(String ddenPreResena) {
		this.ddenPreResena = ddenPreResena;
	}

	public Date getDdenPreResenaHecha() {
		return this.ddenPreResenaHecha;
	}

	public void setDdenPreResenaHecha(Date ddenPreResenaHecha) {
		this.ddenPreResenaHecha = ddenPreResenaHecha;
	}

	public String getDdenPreconexHay() {
		return this.ddenPreconexHay;
	}

	public void setDdenPreconexHay(String ddenPreconexHay) {
		this.ddenPreconexHay = ddenPreconexHay;
	}

	public String getDdenPreconexNota() {
		return this.ddenPreconexNota;
	}

	public void setDdenPreconexNota(String ddenPreconexNota) {
		this.ddenPreconexNota = ddenPreconexNota;
	}

	public String getDdenRealizoPrerevision() {
		return this.ddenRealizoPrerevision;
	}

	public void setDdenRealizoPrerevision(String ddenRealizoPrerevision) {
		this.ddenRealizoPrerevision = ddenRealizoPrerevision;
	}

	public String getDdenResenaCaso() {
		return this.ddenResenaCaso;
	}

	public void setDdenResenaCaso(String ddenResenaCaso) {
		this.ddenResenaCaso = ddenResenaCaso;
	}

	public Date getDdenResenaCasoHecha() {
		return this.ddenResenaCasoHecha;
	}

	public void setDdenResenaCasoHecha(Date ddenResenaCasoHecha) {
		this.ddenResenaCasoHecha = ddenResenaCasoHecha;
	}

	public int getDdenReservaDependencia() {
		return this.ddenReservaDependencia;
	}

	public void setDdenReservaDependencia(int ddenReservaDependencia) {
		this.ddenReservaDependencia = ddenReservaDependencia;
	}

	public Date getDdenReservaFecha() {
		return this.ddenReservaFecha;
	}

	public void setDdenReservaFecha(Date ddenReservaFecha) {
		this.ddenReservaFecha = ddenReservaFecha;
	}

	public String getDdenReservaFiscal() {
		return this.ddenReservaFiscal;
	}

	public void setDdenReservaFiscal(String ddenReservaFiscal) {
		this.ddenReservaFiscal = ddenReservaFiscal;
	}

	public String getDdenTipo() {
		return this.ddenTipo;
	}

	public void setDdenTipo(String ddenTipo) {
		this.ddenTipo = ddenTipo;
	}

	public String getDdenTipoLugarHecho() {
		return this.ddenTipoLugarHecho;
	}

	public void setDdenTipoLugarHecho(String ddenTipoLugarHecho) {
		this.ddenTipoLugarHecho = ddenTipoLugarHecho;
	}

	public Date getDdenTstamp() {
		return this.ddenTstamp;
	}

	public void setDdenTstamp(Date ddenTstamp) {
		this.ddenTstamp = ddenTstamp;
	}

	public String getDdenUbicacion() {
		return this.ddenUbicacion;
	}

	public void setDdenUbicacion(String ddenUbicacion) {
		this.ddenUbicacion = ddenUbicacion;
	}

	public int getDdenUseCodePrerevision() {
		return this.ddenUseCodePrerevision;
	}

	public void setDdenUseCodePrerevision(int ddenUseCodePrerevision) {
		this.ddenUseCodePrerevision = ddenUseCodePrerevision;
	}

	public int getDdenUsuarioConexidadesGeograficaHecha() {
		return this.ddenUsuarioConexidadesGeograficaHecha;
	}

	public void setDdenUsuarioConexidadesGeograficaHecha(int ddenUsuarioConexidadesGeograficaHecha) {
		this.ddenUsuarioConexidadesGeograficaHecha = ddenUsuarioConexidadesGeograficaHecha;
	}

	public int getDdenUsuarioConexidadesPersonaHecha() {
		return this.ddenUsuarioConexidadesPersonaHecha;
	}

	public void setDdenUsuarioConexidadesPersonaHecha(int ddenUsuarioConexidadesPersonaHecha) {
		this.ddenUsuarioConexidadesPersonaHecha = ddenUsuarioConexidadesPersonaHecha;
	}

	public int getDdenUsuarioConexidadesPorNombreHecha() {
		return this.ddenUsuarioConexidadesPorNombreHecha;
	}

	public void setDdenUsuarioConexidadesPorNombreHecha(int ddenUsuarioConexidadesPorNombreHecha) {
		this.ddenUsuarioConexidadesPorNombreHecha = ddenUsuarioConexidadesPorNombreHecha;
	}

	public String getDdenVDomestica() {
		return this.ddenVDomestica;
	}

	public void setDdenVDomestica(String ddenVDomestica) {
		this.ddenVDomestica = ddenVDomestica;
	}

	public String getDdenViaPublica() {
		return this.ddenViaPublica;
	}

	public void setDdenViaPublica(String ddenViaPublica) {
		this.ddenViaPublica = ddenViaPublica;
	}

	public String getDdenZona() {
		return this.ddenZona;
	}

	public void setDdenZona(String ddenZona) {
		this.ddenZona = ddenZona;
	}

	public int getDenDependencia() {
		return this.denDependencia;
	}

	public void setDenDependencia(int denDependencia) {
		this.denDependencia = denDependencia;
	}

	public int getDenUserId() {
		return this.denUserId;
	}

	public void setDenUserId(int denUserId) {
		this.denUserId = denUserId;
	}

	public int getDomCodeHecho() {
		return this.domCodeHecho;
	}

	public void setDomCodeHecho(int domCodeHecho) {
		this.domCodeHecho = domCodeHecho;
	}

	public int getOacCode() {
		return this.oacCode;
	}

	public void setOacCode(int oacCode) {
		this.oacCode = oacCode;
	}

	public int getPueCode() {
		return this.pueCode;
	}

	public void setPueCode(int pueCode) {
		this.pueCode = pueCode;
	}

}