package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ocmarc_mediaciones_eventos database table.
 * 
 */
// @Entity
// @Table(name="ocmarc_mediaciones_eventos")
@NamedQuery(name="OcmarcMediacionesEvento.findAll", query="SELECT o FROM OcmarcMediacionesEvento o")
public class OcmarcMediacionesEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OcmarcMediacionesEventoPK id;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="ome_cambios")
	private String omeCambios;

	@Column(name="ome_estado")
	private String omeEstado;

	@Column(name="ome_observacion")
	private String omeObservacion;

	@Column(name="use_code")
	private String useCode;

	public OcmarcMediacionesEvento() {
	}

	public OcmarcMediacionesEventoPK getId() {
		return this.id;
	}

	public void setId(OcmarcMediacionesEventoPK id) {
		this.id = id;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getOmeCambios() {
		return this.omeCambios;
	}

	public void setOmeCambios(String omeCambios) {
		this.omeCambios = omeCambios;
	}

	public String getOmeEstado() {
		return this.omeEstado;
	}

	public void setOmeEstado(String omeEstado) {
		this.omeEstado = omeEstado;
	}

	public String getOmeObservacion() {
		return this.omeObservacion;
	}

	public void setOmeObservacion(String omeObservacion) {
		this.omeObservacion = omeObservacion;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}