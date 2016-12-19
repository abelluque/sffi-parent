package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ofavyt_intervenciones_asistencias database table.
 * 
 */
// @Entity
// @Table(name="ofavyt_intervenciones_asistencias")
@NamedQuery(name="OfavytIntervencionesAsistencia.findAll", query="SELECT o FROM OfavytIntervencionesAsistencia o")
public class OfavytIntervencionesAsistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oia_code")
	private int oiaCode;

	@Column(name="doc_storage")
	private String docStorage;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oia_fecha")
	private Date oiaFecha;

	@Column(name="oia_medidas_proteccion")
	private int oiaMedidasProteccion;

	@Column(name="oia_observacion")
	private String oiaObservacion;

	@Column(name="oia_ofavyt")
	private int oiaOfavyt;

	@Column(name="oia_permiso")
	private String oiaPermiso;

	@Column(name="oia_requiere_resultado")
	private String oiaRequiereResultado;

	@Column(name="oia_resultado")
	private String oiaResultado;

	@Column(name="oia_tipo_resultado")
	private String oiaTipoResultado;

	@Column(name="oin_code")
	private int oinCode;

	@Column(name="oti_code")
	private int otiCode;

	@Column(name="otr_resultado")
	private String otrResultado;

	@Column(name="use_code")
	private String useCode;

	public OfavytIntervencionesAsistencia() {
	}

	public int getOiaCode() {
		return this.oiaCode;
	}

	public void setOiaCode(int oiaCode) {
		this.oiaCode = oiaCode;
	}

	public String getDocStorage() {
		return this.docStorage;
	}

	public void setDocStorage(String docStorage) {
		this.docStorage = docStorage;
	}

	public Date getOiaFecha() {
		return this.oiaFecha;
	}

	public void setOiaFecha(Date oiaFecha) {
		this.oiaFecha = oiaFecha;
	}

	public int getOiaMedidasProteccion() {
		return this.oiaMedidasProteccion;
	}

	public void setOiaMedidasProteccion(int oiaMedidasProteccion) {
		this.oiaMedidasProteccion = oiaMedidasProteccion;
	}

	public String getOiaObservacion() {
		return this.oiaObservacion;
	}

	public void setOiaObservacion(String oiaObservacion) {
		this.oiaObservacion = oiaObservacion;
	}

	public int getOiaOfavyt() {
		return this.oiaOfavyt;
	}

	public void setOiaOfavyt(int oiaOfavyt) {
		this.oiaOfavyt = oiaOfavyt;
	}

	public String getOiaPermiso() {
		return this.oiaPermiso;
	}

	public void setOiaPermiso(String oiaPermiso) {
		this.oiaPermiso = oiaPermiso;
	}

	public String getOiaRequiereResultado() {
		return this.oiaRequiereResultado;
	}

	public void setOiaRequiereResultado(String oiaRequiereResultado) {
		this.oiaRequiereResultado = oiaRequiereResultado;
	}

	public String getOiaResultado() {
		return this.oiaResultado;
	}

	public void setOiaResultado(String oiaResultado) {
		this.oiaResultado = oiaResultado;
	}

	public String getOiaTipoResultado() {
		return this.oiaTipoResultado;
	}

	public void setOiaTipoResultado(String oiaTipoResultado) {
		this.oiaTipoResultado = oiaTipoResultado;
	}

	public int getOinCode() {
		return this.oinCode;
	}

	public void setOinCode(int oinCode) {
		this.oinCode = oinCode;
	}

	public int getOtiCode() {
		return this.otiCode;
	}

	public void setOtiCode(int otiCode) {
		this.otiCode = otiCode;
	}

	public String getOtrResultado() {
		return this.otrResultado;
	}

	public void setOtrResultado(String otrResultado) {
		this.otrResultado = otrResultado;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}