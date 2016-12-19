package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ocmarc_audiencias_eventos database table.
 * 
 */
// @Entity
// @Table(name="ocmarc_audiencias_eventos")
@NamedQuery(name="OcmarcAudienciasEvento.findAll", query="SELECT o FROM OcmarcAudienciasEvento o")
public class OcmarcAudienciasEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OcmarcAudienciasEventoPK id;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="oae_cambios")
	private String oaeCambios;

	@Column(name="oae_estado")
	private String oaeEstado;

	@Column(name="oae_observacion")
	private String oaeObservacion;

	@Column(name="use_code")
	private String useCode;

	public OcmarcAudienciasEvento() {
	}

	public OcmarcAudienciasEventoPK getId() {
		return this.id;
	}

	public void setId(OcmarcAudienciasEventoPK id) {
		this.id = id;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getOaeCambios() {
		return this.oaeCambios;
	}

	public void setOaeCambios(String oaeCambios) {
		this.oaeCambios = oaeCambios;
	}

	public String getOaeEstado() {
		return this.oaeEstado;
	}

	public void setOaeEstado(String oaeEstado) {
		this.oaeEstado = oaeEstado;
	}

	public String getOaeObservacion() {
		return this.oaeObservacion;
	}

	public void setOaeObservacion(String oaeObservacion) {
		this.oaeObservacion = oaeObservacion;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}