package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the oci_acta database table.
 * 
 */
// @Entity
// @Table(name="oci_acta")
@NamedQuery(name="OciActa.findAll", query="SELECT o FROM OciActa o")
public class OciActa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oac_code")
	private int oacCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="aal_codigo_resp")
	private int aalCodigoResp;

	@Column(name="doc_id")
	private String docId;

	@Column(name="gco_code")
	private int gcoCode;

	@Column(name="gfp_code")
	private int gfpCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oac_fecha")
	private Date oacFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oac_ingreso")
	private Date oacIngreso;

	@Column(name="oac_juez")
	private String oacJuez;

	@Column(name="oac_juzgado")
	private String oacJuzgado;

	@Column(name="oac_observacion")
	private String oacObservacion;

	@Column(name="oac_responsable")
	private int oacResponsable;

	@Column(name="oti_code")
	private int otiCode;

	@Column(name="use_code")
	private int useCode;

	public OciActa() {
	}

	public int getOacCode() {
		return this.oacCode;
	}

	public void setOacCode(int oacCode) {
		this.oacCode = oacCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getAalCodigoResp() {
		return this.aalCodigoResp;
	}

	public void setAalCodigoResp(int aalCodigoResp) {
		this.aalCodigoResp = aalCodigoResp;
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public int getGcoCode() {
		return this.gcoCode;
	}

	public void setGcoCode(int gcoCode) {
		this.gcoCode = gcoCode;
	}

	public int getGfpCode() {
		return this.gfpCode;
	}

	public void setGfpCode(int gfpCode) {
		this.gfpCode = gfpCode;
	}

	public Date getOacFecha() {
		return this.oacFecha;
	}

	public void setOacFecha(Date oacFecha) {
		this.oacFecha = oacFecha;
	}

	public Date getOacIngreso() {
		return this.oacIngreso;
	}

	public void setOacIngreso(Date oacIngreso) {
		this.oacIngreso = oacIngreso;
	}

	public String getOacJuez() {
		return this.oacJuez;
	}

	public void setOacJuez(String oacJuez) {
		this.oacJuez = oacJuez;
	}

	public String getOacJuzgado() {
		return this.oacJuzgado;
	}

	public void setOacJuzgado(String oacJuzgado) {
		this.oacJuzgado = oacJuzgado;
	}

	public String getOacObservacion() {
		return this.oacObservacion;
	}

	public void setOacObservacion(String oacObservacion) {
		this.oacObservacion = oacObservacion;
	}

	public int getOacResponsable() {
		return this.oacResponsable;
	}

	public void setOacResponsable(int oacResponsable) {
		this.oacResponsable = oacResponsable;
	}

	public int getOtiCode() {
		return this.otiCode;
	}

	public void setOtiCode(int otiCode) {
		this.otiCode = otiCode;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}