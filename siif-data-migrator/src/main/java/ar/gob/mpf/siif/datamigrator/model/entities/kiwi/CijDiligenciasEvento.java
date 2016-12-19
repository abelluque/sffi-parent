package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cij_diligencias_eventos database table.
 * 
 */
// @Entity
// @Table(name="cij_diligencias_eventos")
@NamedQuery(name="CijDiligenciasEvento.findAll", query="SELECT c FROM CijDiligenciasEvento c")
public class CijDiligenciasEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CijDiligenciasEventoPK id;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="cde_agente")
	private String cdeAgente;

	@Column(name="cde_cambios")
	private String cdeCambios;

	@Column(name="cde_estado")
	private String cdeEstado;

	@Column(name="cde_observacion")
	private String cdeObservacion;

	@Column(name="cde_responsable")
	private String cdeResponsable;

	@Column(name="cde_supervisor")
	private String cdeSupervisor;

	@Column(name="use_code")
	private String useCode;

	public CijDiligenciasEvento() {
	}

	public CijDiligenciasEventoPK getId() {
		return this.id;
	}

	public void setId(CijDiligenciasEventoPK id) {
		this.id = id;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getCdeAgente() {
		return this.cdeAgente;
	}

	public void setCdeAgente(String cdeAgente) {
		this.cdeAgente = cdeAgente;
	}

	public String getCdeCambios() {
		return this.cdeCambios;
	}

	public void setCdeCambios(String cdeCambios) {
		this.cdeCambios = cdeCambios;
	}

	public String getCdeEstado() {
		return this.cdeEstado;
	}

	public void setCdeEstado(String cdeEstado) {
		this.cdeEstado = cdeEstado;
	}

	public String getCdeObservacion() {
		return this.cdeObservacion;
	}

	public void setCdeObservacion(String cdeObservacion) {
		this.cdeObservacion = cdeObservacion;
	}

	public String getCdeResponsable() {
		return this.cdeResponsable;
	}

	public void setCdeResponsable(String cdeResponsable) {
		this.cdeResponsable = cdeResponsable;
	}

	public String getCdeSupervisor() {
		return this.cdeSupervisor;
	}

	public void setCdeSupervisor(String cdeSupervisor) {
		this.cdeSupervisor = cdeSupervisor;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}