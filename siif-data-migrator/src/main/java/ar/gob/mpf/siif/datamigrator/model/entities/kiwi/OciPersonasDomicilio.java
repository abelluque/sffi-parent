package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the oci_personas_domicilios database table.
 * 
 */
// @Entity
// @Table(name="oci_personas_domicilios")
@NamedQuery(name="OciPersonasDomicilio.findAll", query="SELECT o FROM OciPersonasDomicilio o")
public class OciPersonasDomicilio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="opd_code")
	private int opdCode;

	@Column(name="glu_code")
	private String gluCode;

	@Column(name="opd_altura")
	private int opdAltura;

	@Column(name="opd_barrio")
	private String opdBarrio;

	@Column(name="opd_calle")
	private String opdCalle;

	@Column(name="opd_ciudad")
	private String opdCiudad;

	@Column(name="opd_coordx")
	private BigDecimal opdCoordx;

	@Column(name="opd_coordy")
	private BigDecimal opdCoordy;

	@Column(name="opd_cp")
	private int opdCp;

	@Column(name="opd_deleted")
	private String opdDeleted;

	@Column(name="opd_depto")
	private String opdDepto;

	@Column(name="opd_desc")
	private String opdDesc;

	@Column(name="opd_dir_tipo")
	private String opdDirTipo;

	@Column(name="opd_pais")
	private String opdPais;

	@Column(name="opd_piso")
	private String opdPiso;

	@Column(name="opd_provincia")
	private String opdProvincia;

	@Column(name="opd_tipo")
	private String opdTipo;

	@Column(name="opd_torre")
	private String opdTorre;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="opd_tstamp")
	private Date opdTstamp;

	@Column(name="opd_villa")
	private String opdVilla;

	@Column(name="opd_villa_calle")
	private String opdVillaCalle;

	@Column(name="opd_villa_casa")
	private String opdVillaCasa;

	@Column(name="opd_villa_lote")
	private String opdVillaLote;

	@Column(name="opd_villa_manzana")
	private String opdVillaManzana;

	@Column(name="ope_code")
	private int opeCode;

	public OciPersonasDomicilio() {
	}

	public int getOpdCode() {
		return this.opdCode;
	}

	public void setOpdCode(int opdCode) {
		this.opdCode = opdCode;
	}

	public String getGluCode() {
		return this.gluCode;
	}

	public void setGluCode(String gluCode) {
		this.gluCode = gluCode;
	}

	public int getOpdAltura() {
		return this.opdAltura;
	}

	public void setOpdAltura(int opdAltura) {
		this.opdAltura = opdAltura;
	}

	public String getOpdBarrio() {
		return this.opdBarrio;
	}

	public void setOpdBarrio(String opdBarrio) {
		this.opdBarrio = opdBarrio;
	}

	public String getOpdCalle() {
		return this.opdCalle;
	}

	public void setOpdCalle(String opdCalle) {
		this.opdCalle = opdCalle;
	}

	public String getOpdCiudad() {
		return this.opdCiudad;
	}

	public void setOpdCiudad(String opdCiudad) {
		this.opdCiudad = opdCiudad;
	}

	public BigDecimal getOpdCoordx() {
		return this.opdCoordx;
	}

	public void setOpdCoordx(BigDecimal opdCoordx) {
		this.opdCoordx = opdCoordx;
	}

	public BigDecimal getOpdCoordy() {
		return this.opdCoordy;
	}

	public void setOpdCoordy(BigDecimal opdCoordy) {
		this.opdCoordy = opdCoordy;
	}

	public int getOpdCp() {
		return this.opdCp;
	}

	public void setOpdCp(int opdCp) {
		this.opdCp = opdCp;
	}

	public String getOpdDeleted() {
		return this.opdDeleted;
	}

	public void setOpdDeleted(String opdDeleted) {
		this.opdDeleted = opdDeleted;
	}

	public String getOpdDepto() {
		return this.opdDepto;
	}

	public void setOpdDepto(String opdDepto) {
		this.opdDepto = opdDepto;
	}

	public String getOpdDesc() {
		return this.opdDesc;
	}

	public void setOpdDesc(String opdDesc) {
		this.opdDesc = opdDesc;
	}

	public String getOpdDirTipo() {
		return this.opdDirTipo;
	}

	public void setOpdDirTipo(String opdDirTipo) {
		this.opdDirTipo = opdDirTipo;
	}

	public String getOpdPais() {
		return this.opdPais;
	}

	public void setOpdPais(String opdPais) {
		this.opdPais = opdPais;
	}

	public String getOpdPiso() {
		return this.opdPiso;
	}

	public void setOpdPiso(String opdPiso) {
		this.opdPiso = opdPiso;
	}

	public String getOpdProvincia() {
		return this.opdProvincia;
	}

	public void setOpdProvincia(String opdProvincia) {
		this.opdProvincia = opdProvincia;
	}

	public String getOpdTipo() {
		return this.opdTipo;
	}

	public void setOpdTipo(String opdTipo) {
		this.opdTipo = opdTipo;
	}

	public String getOpdTorre() {
		return this.opdTorre;
	}

	public void setOpdTorre(String opdTorre) {
		this.opdTorre = opdTorre;
	}

	public Date getOpdTstamp() {
		return this.opdTstamp;
	}

	public void setOpdTstamp(Date opdTstamp) {
		this.opdTstamp = opdTstamp;
	}

	public String getOpdVilla() {
		return this.opdVilla;
	}

	public void setOpdVilla(String opdVilla) {
		this.opdVilla = opdVilla;
	}

	public String getOpdVillaCalle() {
		return this.opdVillaCalle;
	}

	public void setOpdVillaCalle(String opdVillaCalle) {
		this.opdVillaCalle = opdVillaCalle;
	}

	public String getOpdVillaCasa() {
		return this.opdVillaCasa;
	}

	public void setOpdVillaCasa(String opdVillaCasa) {
		this.opdVillaCasa = opdVillaCasa;
	}

	public String getOpdVillaLote() {
		return this.opdVillaLote;
	}

	public void setOpdVillaLote(String opdVillaLote) {
		this.opdVillaLote = opdVillaLote;
	}

	public String getOpdVillaManzana() {
		return this.opdVillaManzana;
	}

	public void setOpdVillaManzana(String opdVillaManzana) {
		this.opdVillaManzana = opdVillaManzana;
	}

	public int getOpeCode() {
		return this.opeCode;
	}

	public void setOpeCode(int opeCode) {
		this.opeCode = opeCode;
	}

}