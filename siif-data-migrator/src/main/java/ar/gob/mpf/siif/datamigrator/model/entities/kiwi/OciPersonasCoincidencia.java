package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the oci_personas_coincidencias database table.
 * 
 */
// @Entity
// @Table(name="oci_personas_coincidencias")
@NamedQuery(name="OciPersonasCoincidencia.findAll", query="SELECT o FROM OciPersonasCoincidencia o")
public class OciPersonasCoincidencia implements Serializable {
	private static final long serialVersionUID = 1L;

	private String apellido;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String nombre;

	@Column(name="nro_documento")
	private String nroDocumento;

	@Column(name="ope_code")
	private int opeCode;

	@Column(name="ope_code_rel")
	private int opeCodeRel;

	private String referencia;

	@Column(name="tipo_documento")
	private String tipoDocumento;

	public OciPersonasCoincidencia() {
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNroDocumento() {
		return this.nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public int getOpeCode() {
		return this.opeCode;
	}

	public void setOpeCode(int opeCode) {
		this.opeCode = opeCode;
	}

	public int getOpeCodeRel() {
		return this.opeCodeRel;
	}

	public void setOpeCodeRel(int opeCodeRel) {
		this.opeCodeRel = opeCodeRel;
	}

	public String getReferencia() {
		return this.referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

}