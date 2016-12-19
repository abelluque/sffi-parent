package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cij_intervenciones_eventos database table.
 * 
 */
// @Entity
// @Table(name="cij_intervenciones_eventos")
@NamedQuery(name="CijIntervencionesEvento.findAll", query="SELECT c FROM CijIntervencionesEvento c")
public class CijIntervencionesEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CijIntervencionesEventoPK id;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="cie_cambios")
	private String cieCambios;

	@Column(name="cie_estado")
	private String cieEstado;

	@Column(name="cie_observacion")
	private String cieObservacion;

	@Column(name="cie_responsable")
	private String cieResponsable;

	@Column(name="use_code")
	private String useCode;

	public CijIntervencionesEvento() {
	}

	public CijIntervencionesEventoPK getId() {
		return this.id;
	}

	public void setId(CijIntervencionesEventoPK id) {
		this.id = id;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getCieCambios() {
		return this.cieCambios;
	}

	public void setCieCambios(String cieCambios) {
		this.cieCambios = cieCambios;
	}

	public String getCieEstado() {
		return this.cieEstado;
	}

	public void setCieEstado(String cieEstado) {
		this.cieEstado = cieEstado;
	}

	public String getCieObservacion() {
		return this.cieObservacion;
	}

	public void setCieObservacion(String cieObservacion) {
		this.cieObservacion = cieObservacion;
	}

	public String getCieResponsable() {
		return this.cieResponsable;
	}

	public void setCieResponsable(String cieResponsable) {
		this.cieResponsable = cieResponsable;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}