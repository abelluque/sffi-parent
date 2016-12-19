package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the oci_personas_auditoria database table.
 * 
 */
// @Entity
// @Table(name="oci_personas_auditoria")
@NamedQuery(name="OciPersonasAuditoria.findAll", query="SELECT o FROM OciPersonasAuditoria o")
public class OciPersonasAuditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="opa_code")
	private int opaCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Lob
	@Column(name="opa_busqueda")
	private String opaBusqueda;

	@Lob
	@Column(name="opa_controles")
	private String opaControles;

	@Lob
	@Column(name="opa_objnue")
	private String opaObjnue;

	@Lob
	@Column(name="opa_objvie")
	private String opaObjvie;

	@Column(name="opa_operacion")
	private String opaOperacion;

	@Column(name="opa_origen")
	private String opaOrigen;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="opa_tstamp")
	private Date opaTstamp;

	@Column(name="ope_code")
	private int opeCode;

	@Column(name="use_code")
	private String useCode;

	public OciPersonasAuditoria() {
	}

	public int getOpaCode() {
		return this.opaCode;
	}

	public void setOpaCode(int opaCode) {
		this.opaCode = opaCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getOpaBusqueda() {
		return this.opaBusqueda;
	}

	public void setOpaBusqueda(String opaBusqueda) {
		this.opaBusqueda = opaBusqueda;
	}

	public String getOpaControles() {
		return this.opaControles;
	}

	public void setOpaControles(String opaControles) {
		this.opaControles = opaControles;
	}

	public String getOpaObjnue() {
		return this.opaObjnue;
	}

	public void setOpaObjnue(String opaObjnue) {
		this.opaObjnue = opaObjnue;
	}

	public String getOpaObjvie() {
		return this.opaObjvie;
	}

	public void setOpaObjvie(String opaObjvie) {
		this.opaObjvie = opaObjvie;
	}

	public String getOpaOperacion() {
		return this.opaOperacion;
	}

	public void setOpaOperacion(String opaOperacion) {
		this.opaOperacion = opaOperacion;
	}

	public String getOpaOrigen() {
		return this.opaOrigen;
	}

	public void setOpaOrigen(String opaOrigen) {
		this.opaOrigen = opaOrigen;
	}

	public Date getOpaTstamp() {
		return this.opaTstamp;
	}

	public void setOpaTstamp(Date opaTstamp) {
		this.opaTstamp = opaTstamp;
	}

	public int getOpeCode() {
		return this.opeCode;
	}

	public void setOpeCode(int opeCode) {
		this.opeCode = opeCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}