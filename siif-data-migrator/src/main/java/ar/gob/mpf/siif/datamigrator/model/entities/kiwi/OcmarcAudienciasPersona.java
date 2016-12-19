package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ocmarc_audiencias_personas database table.
 * 
 */
// @Entity
// @Table(name="ocmarc_audiencias_personas")
@NamedQuery(name="OcmarcAudienciasPersona.findAll", query="SELECT o FROM OcmarcAudienciasPersona o")
public class OcmarcAudienciasPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oap_fecha")
	private Date oapFecha;

	@Column(name="oap_rol_documento")
	private String oapRolDocumento;

	@Column(name="oap_rol_mediacion")
	private String oapRolMediacion;

	@Column(name="oca_code")
	private int ocaCode;

	@Column(name="pco_code")
	private int pcoCode;

	@Column(name="pdc_code")
	private int pdcCode;

	@Column(name="pdo_code")
	private int pdoCode;

	@Column(name="per_code")
	private int perCode;

	@Column(name="use_code")
	private String useCode;

	public OcmarcAudienciasPersona() {
	}

	public Date getOapFecha() {
		return this.oapFecha;
	}

	public void setOapFecha(Date oapFecha) {
		this.oapFecha = oapFecha;
	}

	public String getOapRolDocumento() {
		return this.oapRolDocumento;
	}

	public void setOapRolDocumento(String oapRolDocumento) {
		this.oapRolDocumento = oapRolDocumento;
	}

	public String getOapRolMediacion() {
		return this.oapRolMediacion;
	}

	public void setOapRolMediacion(String oapRolMediacion) {
		this.oapRolMediacion = oapRolMediacion;
	}

	public int getOcaCode() {
		return this.ocaCode;
	}

	public void setOcaCode(int ocaCode) {
		this.ocaCode = ocaCode;
	}

	public int getPcoCode() {
		return this.pcoCode;
	}

	public void setPcoCode(int pcoCode) {
		this.pcoCode = pcoCode;
	}

	public int getPdcCode() {
		return this.pdcCode;
	}

	public void setPdcCode(int pdcCode) {
		this.pdcCode = pdcCode;
	}

	public int getPdoCode() {
		return this.pdoCode;
	}

	public void setPdoCode(int pdoCode) {
		this.pdoCode = pdoCode;
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