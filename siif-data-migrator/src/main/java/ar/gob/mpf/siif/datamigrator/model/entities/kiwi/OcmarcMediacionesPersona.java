package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ocmarc_mediaciones_personas database table.
 * 
 */
// @Entity
// @Table(name="ocmarc_mediaciones_personas")
@NamedQuery(name="OcmarcMediacionesPersona.findAll", query="SELECT o FROM OcmarcMediacionesPersona o")
public class OcmarcMediacionesPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OcmarcMediacionesPersonaPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="omp_fecha")
	private Date ompFecha;

	@Column(name="omp_rol_documento")
	private String ompRolDocumento;

	@Column(name="omp_rol_mediacion")
	private String ompRolMediacion;

	@Column(name="pco_code")
	private int pcoCode;

	@Column(name="pdc_code")
	private int pdcCode;

	@Column(name="pdo_code")
	private int pdoCode;

	@Column(name="use_code")
	private String useCode;

	public OcmarcMediacionesPersona() {
	}

	public OcmarcMediacionesPersonaPK getId() {
		return this.id;
	}

	public void setId(OcmarcMediacionesPersonaPK id) {
		this.id = id;
	}

	public Date getOmpFecha() {
		return this.ompFecha;
	}

	public void setOmpFecha(Date ompFecha) {
		this.ompFecha = ompFecha;
	}

	public String getOmpRolDocumento() {
		return this.ompRolDocumento;
	}

	public void setOmpRolDocumento(String ompRolDocumento) {
		this.ompRolDocumento = ompRolDocumento;
	}

	public String getOmpRolMediacion() {
		return this.ompRolMediacion;
	}

	public void setOmpRolMediacion(String ompRolMediacion) {
		this.ompRolMediacion = ompRolMediacion;
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

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}