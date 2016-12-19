package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cij_intervenciones database table.
 * 
 */
// @Entity
// @Table(name="cij_intervenciones")
@NamedQuery(name="CijIntervencione.findAll", query="SELECT c FROM CijIntervencione c")
public class CijIntervencione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cii_code")
	private int ciiCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="cii_caso")
	private int ciiCaso;

	@Lob
	@Column(name="cii_descripcion")
	private String ciiDescripcion;

	@Column(name="cii_estado")
	private String ciiEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cii_fecha")
	private Date ciiFecha;

	@Column(name="cii_motivo_rechazo")
	private String ciiMotivoRechazo;

	@Column(name="cii_oficio")
	private String ciiOficio;

	@Column(name="cii_organismo")
	private String ciiOrganismo;

	@Column(name="cii_origen")
	private String ciiOrigen;

	@Column(name="cii_responsable")
	private int ciiResponsable;

	@Column(name="cii_tiempo_maximo")
	private int ciiTiempoMaximo;

	@Column(name="use_code")
	private String useCode;

	@Column(name="use_email")
	private String useEmail;

	@Column(name="use_mobile_lab")
	private String useMobileLab;

	@Column(name="use_phone_lab")
	private String usePhoneLab;

	public CijIntervencione() {
	}

	public int getCiiCode() {
		return this.ciiCode;
	}

	public void setCiiCode(int ciiCode) {
		this.ciiCode = ciiCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getCiiCaso() {
		return this.ciiCaso;
	}

	public void setCiiCaso(int ciiCaso) {
		this.ciiCaso = ciiCaso;
	}

	public String getCiiDescripcion() {
		return this.ciiDescripcion;
	}

	public void setCiiDescripcion(String ciiDescripcion) {
		this.ciiDescripcion = ciiDescripcion;
	}

	public String getCiiEstado() {
		return this.ciiEstado;
	}

	public void setCiiEstado(String ciiEstado) {
		this.ciiEstado = ciiEstado;
	}

	public Date getCiiFecha() {
		return this.ciiFecha;
	}

	public void setCiiFecha(Date ciiFecha) {
		this.ciiFecha = ciiFecha;
	}

	public String getCiiMotivoRechazo() {
		return this.ciiMotivoRechazo;
	}

	public void setCiiMotivoRechazo(String ciiMotivoRechazo) {
		this.ciiMotivoRechazo = ciiMotivoRechazo;
	}

	public String getCiiOficio() {
		return this.ciiOficio;
	}

	public void setCiiOficio(String ciiOficio) {
		this.ciiOficio = ciiOficio;
	}

	public String getCiiOrganismo() {
		return this.ciiOrganismo;
	}

	public void setCiiOrganismo(String ciiOrganismo) {
		this.ciiOrganismo = ciiOrganismo;
	}

	public String getCiiOrigen() {
		return this.ciiOrigen;
	}

	public void setCiiOrigen(String ciiOrigen) {
		this.ciiOrigen = ciiOrigen;
	}

	public int getCiiResponsable() {
		return this.ciiResponsable;
	}

	public void setCiiResponsable(int ciiResponsable) {
		this.ciiResponsable = ciiResponsable;
	}

	public int getCiiTiempoMaximo() {
		return this.ciiTiempoMaximo;
	}

	public void setCiiTiempoMaximo(int ciiTiempoMaximo) {
		this.ciiTiempoMaximo = ciiTiempoMaximo;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public String getUseEmail() {
		return this.useEmail;
	}

	public void setUseEmail(String useEmail) {
		this.useEmail = useEmail;
	}

	public String getUseMobileLab() {
		return this.useMobileLab;
	}

	public void setUseMobileLab(String useMobileLab) {
		this.useMobileLab = useMobileLab;
	}

	public String getUsePhoneLab() {
		return this.usePhoneLab;
	}

	public void setUsePhoneLab(String usePhoneLab) {
		this.usePhoneLab = usePhoneLab;
	}

}