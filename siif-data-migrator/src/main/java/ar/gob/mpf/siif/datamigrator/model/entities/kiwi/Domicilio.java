package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the domicilios database table.
 * 
 */
// @Entity
// @Table(name="domicilios")
@NamedQuery(name="Domicilio.findAll", query="SELECT d FROM Domicilio d")
public class Domicilio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dom_code")
	private int domCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="dden_code")
	private int ddenCode;

	@Column(name="dom_altura")
	private int domAltura;

	@Column(name="dom_barrio")
	private String domBarrio;

	@Column(name="dom_caba")
	private String domCaba;

	@Column(name="dom_calle")
	private String domCalle;

	@Column(name="dom_calle_villa")
	private String domCalleVilla;

	@Column(name="dom_casa")
	private String domCasa;

	@Column(name="dom_cgpc")
	private String domCgpc;

	@Column(name="dom_ciudad")
	private String domCiudad;

	@Column(name="dom_coordx")
	private BigDecimal domCoordx;

	@Column(name="dom_coordy")
	private BigDecimal domCoordy;

	@Column(name="dom_cp")
	private String domCp;

	@Column(name="dom_depto")
	private String domDepto;

	@Column(name="dom_desc")
	private String domDesc;

	@Column(name="dom_dir_tipo")
	private String domDirTipo;

	@Column(name="dom_estado")
	private String domEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dom_fecha_alta")
	private Date domFechaAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dom_fecha_modi")
	private Date domFechaModi;

	@Column(name="dom_lote")
	private String domLote;

	@Column(name="dom_manzana")
	private String domManzana;

	@Column(name="dom_pais")
	private String domPais;

	@Column(name="dom_piso")
	private String domPiso;

	@Column(name="dom_provincia")
	private String domProvincia;

	@Column(name="dom_tipo")
	private String domTipo;

	@Column(name="dom_torre")
	private String domTorre;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dom_tstamp")
	private Date domTstamp;

	@Column(name="dom_villa")
	private String domVilla;

	@Column(name="glu_code")
	private String gluCode;

	@Column(name="per_code")
	private int perCode;

	@Column(name="use_code")
	private String useCode;

	public Domicilio() {
	}

	public int getDomCode() {
		return this.domCode;
	}

	public void setDomCode(int domCode) {
		this.domCode = domCode;
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

	public int getDomAltura() {
		return this.domAltura;
	}

	public void setDomAltura(int domAltura) {
		this.domAltura = domAltura;
	}

	public String getDomBarrio() {
		return this.domBarrio;
	}

	public void setDomBarrio(String domBarrio) {
		this.domBarrio = domBarrio;
	}

	public String getDomCaba() {
		return this.domCaba;
	}

	public void setDomCaba(String domCaba) {
		this.domCaba = domCaba;
	}

	public String getDomCalle() {
		return this.domCalle;
	}

	public void setDomCalle(String domCalle) {
		this.domCalle = domCalle;
	}

	public String getDomCalleVilla() {
		return this.domCalleVilla;
	}

	public void setDomCalleVilla(String domCalleVilla) {
		this.domCalleVilla = domCalleVilla;
	}

	public String getDomCasa() {
		return this.domCasa;
	}

	public void setDomCasa(String domCasa) {
		this.domCasa = domCasa;
	}

	public String getDomCgpc() {
		return this.domCgpc;
	}

	public void setDomCgpc(String domCgpc) {
		this.domCgpc = domCgpc;
	}

	public String getDomCiudad() {
		return this.domCiudad;
	}

	public void setDomCiudad(String domCiudad) {
		this.domCiudad = domCiudad;
	}

	public BigDecimal getDomCoordx() {
		return this.domCoordx;
	}

	public void setDomCoordx(BigDecimal domCoordx) {
		this.domCoordx = domCoordx;
	}

	public BigDecimal getDomCoordy() {
		return this.domCoordy;
	}

	public void setDomCoordy(BigDecimal domCoordy) {
		this.domCoordy = domCoordy;
	}

	public String getDomCp() {
		return this.domCp;
	}

	public void setDomCp(String domCp) {
		this.domCp = domCp;
	}

	public String getDomDepto() {
		return this.domDepto;
	}

	public void setDomDepto(String domDepto) {
		this.domDepto = domDepto;
	}

	public String getDomDesc() {
		return this.domDesc;
	}

	public void setDomDesc(String domDesc) {
		this.domDesc = domDesc;
	}

	public String getDomDirTipo() {
		return this.domDirTipo;
	}

	public void setDomDirTipo(String domDirTipo) {
		this.domDirTipo = domDirTipo;
	}

	public String getDomEstado() {
		return this.domEstado;
	}

	public void setDomEstado(String domEstado) {
		this.domEstado = domEstado;
	}

	public Date getDomFechaAlta() {
		return this.domFechaAlta;
	}

	public void setDomFechaAlta(Date domFechaAlta) {
		this.domFechaAlta = domFechaAlta;
	}

	public Date getDomFechaModi() {
		return this.domFechaModi;
	}

	public void setDomFechaModi(Date domFechaModi) {
		this.domFechaModi = domFechaModi;
	}

	public String getDomLote() {
		return this.domLote;
	}

	public void setDomLote(String domLote) {
		this.domLote = domLote;
	}

	public String getDomManzana() {
		return this.domManzana;
	}

	public void setDomManzana(String domManzana) {
		this.domManzana = domManzana;
	}

	public String getDomPais() {
		return this.domPais;
	}

	public void setDomPais(String domPais) {
		this.domPais = domPais;
	}

	public String getDomPiso() {
		return this.domPiso;
	}

	public void setDomPiso(String domPiso) {
		this.domPiso = domPiso;
	}

	public String getDomProvincia() {
		return this.domProvincia;
	}

	public void setDomProvincia(String domProvincia) {
		this.domProvincia = domProvincia;
	}

	public String getDomTipo() {
		return this.domTipo;
	}

	public void setDomTipo(String domTipo) {
		this.domTipo = domTipo;
	}

	public String getDomTorre() {
		return this.domTorre;
	}

	public void setDomTorre(String domTorre) {
		this.domTorre = domTorre;
	}

	public Date getDomTstamp() {
		return this.domTstamp;
	}

	public void setDomTstamp(Date domTstamp) {
		this.domTstamp = domTstamp;
	}

	public String getDomVilla() {
		return this.domVilla;
	}

	public void setDomVilla(String domVilla) {
		this.domVilla = domVilla;
	}

	public String getGluCode() {
		return this.gluCode;
	}

	public void setGluCode(String gluCode) {
		this.gluCode = gluCode;
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

}