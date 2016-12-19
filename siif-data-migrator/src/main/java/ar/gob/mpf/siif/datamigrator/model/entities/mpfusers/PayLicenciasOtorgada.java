package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pay_licencias_otorgadas database table.
 * 
 */
// @Entity
// @Table(name="pay_licencias_otorgadas")
@NamedQuery(name="PayLicenciasOtorgada.findAll", query="SELECT p FROM PayLicenciasOtorgada p")
public class PayLicenciasOtorgada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int lemid;

	private int alerven;

	private String codigo;

	private int dh;

	private String enviado;

	@Temporal(TemporalType.DATE)
	private Date fecdesde;

	@Temporal(TemporalType.DATE)
	private Date fechasta;

	@Temporal(TemporalType.DATE)
	private Date fecotorga;

	private String feria;

	private int hsredhor;

	private String licencia;

	private String nombre;

	private String observ;

	private int promeses;

	private int solid;

	private int tiplicid;

	private String usuario;

	public PayLicenciasOtorgada() {
	}

	public int getLemid() {
		return this.lemid;
	}

	public void setLemid(int lemid) {
		this.lemid = lemid;
	}

	public int getAlerven() {
		return this.alerven;
	}

	public void setAlerven(int alerven) {
		this.alerven = alerven;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getDh() {
		return this.dh;
	}

	public void setDh(int dh) {
		this.dh = dh;
	}

	public String getEnviado() {
		return this.enviado;
	}

	public void setEnviado(String enviado) {
		this.enviado = enviado;
	}

	public Date getFecdesde() {
		return this.fecdesde;
	}

	public void setFecdesde(Date fecdesde) {
		this.fecdesde = fecdesde;
	}

	public Date getFechasta() {
		return this.fechasta;
	}

	public void setFechasta(Date fechasta) {
		this.fechasta = fechasta;
	}

	public Date getFecotorga() {
		return this.fecotorga;
	}

	public void setFecotorga(Date fecotorga) {
		this.fecotorga = fecotorga;
	}

	public String getFeria() {
		return this.feria;
	}

	public void setFeria(String feria) {
		this.feria = feria;
	}

	public int getHsredhor() {
		return this.hsredhor;
	}

	public void setHsredhor(int hsredhor) {
		this.hsredhor = hsredhor;
	}

	public String getLicencia() {
		return this.licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObserv() {
		return this.observ;
	}

	public void setObserv(String observ) {
		this.observ = observ;
	}

	public int getPromeses() {
		return this.promeses;
	}

	public void setPromeses(int promeses) {
		this.promeses = promeses;
	}

	public int getSolid() {
		return this.solid;
	}

	public void setSolid(int solid) {
		this.solid = solid;
	}

	public int getTiplicid() {
		return this.tiplicid;
	}

	public void setTiplicid(int tiplicid) {
		this.tiplicid = tiplicid;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}