package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the oci_personas_eventos database table.
 * 
 */
// @Entity
// @Table(name="oci_personas_eventos")
@NamedQuery(name="OciPersonasEvento.findAll", query="SELECT o FROM OciPersonasEvento o")
public class OciPersonasEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="oac_code")
	private int oacCode;

	@Column(name="oap_estado_persona")
	private String oapEstadoPersona;

	@Column(name="oap_estado_tramite")
	private String oapEstadoTramite;

	@Column(name="ope_code")
	private int opeCode;

	@Column(name="ope_comentario")
	private String opeComentario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ope_fecha")
	private Date opeFecha;

	@Column(name="ope_identificado")
	private String opeIdentificado;

	@Column(name="use_code")
	private int useCode;

	public OciPersonasEvento() {
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getOacCode() {
		return this.oacCode;
	}

	public void setOacCode(int oacCode) {
		this.oacCode = oacCode;
	}

	public String getOapEstadoPersona() {
		return this.oapEstadoPersona;
	}

	public void setOapEstadoPersona(String oapEstadoPersona) {
		this.oapEstadoPersona = oapEstadoPersona;
	}

	public String getOapEstadoTramite() {
		return this.oapEstadoTramite;
	}

	public void setOapEstadoTramite(String oapEstadoTramite) {
		this.oapEstadoTramite = oapEstadoTramite;
	}

	public int getOpeCode() {
		return this.opeCode;
	}

	public void setOpeCode(int opeCode) {
		this.opeCode = opeCode;
	}

	public String getOpeComentario() {
		return this.opeComentario;
	}

	public void setOpeComentario(String opeComentario) {
		this.opeComentario = opeComentario;
	}

	public Date getOpeFecha() {
		return this.opeFecha;
	}

	public void setOpeFecha(Date opeFecha) {
		this.opeFecha = opeFecha;
	}

	public String getOpeIdentificado() {
		return this.opeIdentificado;
	}

	public void setOpeIdentificado(String opeIdentificado) {
		this.opeIdentificado = opeIdentificado;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}