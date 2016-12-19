package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pay_interinatos_subrogancias database table.
 * 
 */
// @Entity
// @Table(name="pay_interinatos_subrogancias")
@NamedQuery(name="PayInterinatosSubrogancia.findAll", query="SELECT p FROM PayInterinatosSubrogancia p")
public class PayInterinatosSubrogancia implements Serializable {
	private static final long serialVersionUID = 1L;

	private int actual;

	private int campoid;

	private int codigo;

	private int codoremp;

	private int codreemp;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecdesde;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_cre")
	private Date fechaCre;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_mod")
	private Date fechaMod;

	@Temporal(TemporalType.TIMESTAMP)
	private Date hasta;

	private int idarea;

	private int idareaan;

	private int idcargo;

	private int idcargoan;

	private int idunid;

	private int idunidan;

	private String inteperm;

	private String motivo;

	private int nrolic;

	private String resol;

	public PayInterinatosSubrogancia() {
	}

	public int getActual() {
		return this.actual;
	}

	public void setActual(int actual) {
		this.actual = actual;
	}

	public int getCampoid() {
		return this.campoid;
	}

	public void setCampoid(int campoid) {
		this.campoid = campoid;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodoremp() {
		return this.codoremp;
	}

	public void setCodoremp(int codoremp) {
		this.codoremp = codoremp;
	}

	public int getCodreemp() {
		return this.codreemp;
	}

	public void setCodreemp(int codreemp) {
		this.codreemp = codreemp;
	}

	public Date getFecdesde() {
		return this.fecdesde;
	}

	public void setFecdesde(Date fecdesde) {
		this.fecdesde = fecdesde;
	}

	public Date getFechaCre() {
		return this.fechaCre;
	}

	public void setFechaCre(Date fechaCre) {
		this.fechaCre = fechaCre;
	}

	public Date getFechaMod() {
		return this.fechaMod;
	}

	public void setFechaMod(Date fechaMod) {
		this.fechaMod = fechaMod;
	}

	public Date getHasta() {
		return this.hasta;
	}

	public void setHasta(Date hasta) {
		this.hasta = hasta;
	}

	public int getIdarea() {
		return this.idarea;
	}

	public void setIdarea(int idarea) {
		this.idarea = idarea;
	}

	public int getIdareaan() {
		return this.idareaan;
	}

	public void setIdareaan(int idareaan) {
		this.idareaan = idareaan;
	}

	public int getIdcargo() {
		return this.idcargo;
	}

	public void setIdcargo(int idcargo) {
		this.idcargo = idcargo;
	}

	public int getIdcargoan() {
		return this.idcargoan;
	}

	public void setIdcargoan(int idcargoan) {
		this.idcargoan = idcargoan;
	}

	public int getIdunid() {
		return this.idunid;
	}

	public void setIdunid(int idunid) {
		this.idunid = idunid;
	}

	public int getIdunidan() {
		return this.idunidan;
	}

	public void setIdunidan(int idunidan) {
		this.idunidan = idunidan;
	}

	public String getInteperm() {
		return this.inteperm;
	}

	public void setInteperm(String inteperm) {
		this.inteperm = inteperm;
	}

	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public int getNrolic() {
		return this.nrolic;
	}

	public void setNrolic(int nrolic) {
		this.nrolic = nrolic;
	}

	public String getResol() {
		return this.resol;
	}

	public void setResol(String resol) {
		this.resol = resol;
	}

}