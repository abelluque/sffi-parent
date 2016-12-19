package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the nper_personas_domicilios database table.
 * 
 */
// @Entity
// @Table(name="nper_personas_domicilios")
@NamedQuery(name="NperPersonasDomicilio.findAll", query="SELECT n FROM NperPersonasDomicilio n")
public class NperPersonasDomicilio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pdo_code")
	private int pdoCode;

	@Column(name="glu_code")
	private String gluCode;

	@Column(name="pdo_altura")
	private int pdoAltura;

	@Column(name="pdo_barrio")
	private String pdoBarrio;

	@Column(name="pdo_calle")
	private String pdoCalle;

	@Column(name="pdo_ciudad")
	private String pdoCiudad;

	@Column(name="pdo_coordx")
	private BigDecimal pdoCoordx;

	@Column(name="pdo_coordy")
	private BigDecimal pdoCoordy;

	@Column(name="pdo_cp")
	private int pdoCp;

	@Column(name="pdo_deleted")
	private String pdoDeleted;

	@Column(name="pdo_depto")
	private String pdoDepto;

	@Column(name="pdo_desc")
	private String pdoDesc;

	@Column(name="pdo_dir_tipo")
	private String pdoDirTipo;

	@Column(name="pdo_otro")
	private String pdoOtro;

	@Column(name="pdo_pais")
	private String pdoPais;

	@Column(name="pdo_piso")
	private String pdoPiso;

	@Column(name="pdo_provincia")
	private String pdoProvincia;

	@Column(name="pdo_tipo")
	private String pdoTipo;

	@Column(name="pdo_torre")
	private String pdoTorre;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pdo_tstamp")
	private Date pdoTstamp;

	@Column(name="pdo_villa")
	private String pdoVilla;

	@Column(name="pdo_villa_calle")
	private String pdoVillaCalle;

	@Column(name="pdo_villa_casa")
	private String pdoVillaCasa;

	@Column(name="pdo_villa_lote")
	private String pdoVillaLote;

	@Column(name="pdo_villa_manzana")
	private String pdoVillaManzana;

	@Column(name="per_code")
	private int perCode;

	public NperPersonasDomicilio() {
	}

	public int getPdoCode() {
		return this.pdoCode;
	}

	public void setPdoCode(int pdoCode) {
		this.pdoCode = pdoCode;
	}

	public String getGluCode() {
		return this.gluCode;
	}

	public void setGluCode(String gluCode) {
		this.gluCode = gluCode;
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

	public String getPdoCiudad() {
		return this.pdoCiudad;
	}

	public void setPdoCiudad(String pdoCiudad) {
		this.pdoCiudad = pdoCiudad;
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

	public int getPdoCp() {
		return this.pdoCp;
	}

	public void setPdoCp(int pdoCp) {
		this.pdoCp = pdoCp;
	}

	public String getPdoDeleted() {
		return this.pdoDeleted;
	}

	public void setPdoDeleted(String pdoDeleted) {
		this.pdoDeleted = pdoDeleted;
	}

	public String getPdoDepto() {
		return this.pdoDepto;
	}

	public void setPdoDepto(String pdoDepto) {
		this.pdoDepto = pdoDepto;
	}

	public String getPdoDesc() {
		return this.pdoDesc;
	}

	public void setPdoDesc(String pdoDesc) {
		this.pdoDesc = pdoDesc;
	}

	public String getPdoDirTipo() {
		return this.pdoDirTipo;
	}

	public void setPdoDirTipo(String pdoDirTipo) {
		this.pdoDirTipo = pdoDirTipo;
	}

	public String getPdoOtro() {
		return this.pdoOtro;
	}

	public void setPdoOtro(String pdoOtro) {
		this.pdoOtro = pdoOtro;
	}

	public String getPdoPais() {
		return this.pdoPais;
	}

	public void setPdoPais(String pdoPais) {
		this.pdoPais = pdoPais;
	}

	public String getPdoPiso() {
		return this.pdoPiso;
	}

	public void setPdoPiso(String pdoPiso) {
		this.pdoPiso = pdoPiso;
	}

	public String getPdoProvincia() {
		return this.pdoProvincia;
	}

	public void setPdoProvincia(String pdoProvincia) {
		this.pdoProvincia = pdoProvincia;
	}

	public String getPdoTipo() {
		return this.pdoTipo;
	}

	public void setPdoTipo(String pdoTipo) {
		this.pdoTipo = pdoTipo;
	}

	public String getPdoTorre() {
		return this.pdoTorre;
	}

	public void setPdoTorre(String pdoTorre) {
		this.pdoTorre = pdoTorre;
	}

	public Date getPdoTstamp() {
		return this.pdoTstamp;
	}

	public void setPdoTstamp(Date pdoTstamp) {
		this.pdoTstamp = pdoTstamp;
	}

	public String getPdoVilla() {
		return this.pdoVilla;
	}

	public void setPdoVilla(String pdoVilla) {
		this.pdoVilla = pdoVilla;
	}

	public String getPdoVillaCalle() {
		return this.pdoVillaCalle;
	}

	public void setPdoVillaCalle(String pdoVillaCalle) {
		this.pdoVillaCalle = pdoVillaCalle;
	}

	public String getPdoVillaCasa() {
		return this.pdoVillaCasa;
	}

	public void setPdoVillaCasa(String pdoVillaCasa) {
		this.pdoVillaCasa = pdoVillaCasa;
	}

	public String getPdoVillaLote() {
		return this.pdoVillaLote;
	}

	public void setPdoVillaLote(String pdoVillaLote) {
		this.pdoVillaLote = pdoVillaLote;
	}

	public String getPdoVillaManzana() {
		return this.pdoVillaManzana;
	}

	public void setPdoVillaManzana(String pdoVillaManzana) {
		this.pdoVillaManzana = pdoVillaManzana;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

}