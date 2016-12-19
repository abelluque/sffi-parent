package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the spp_informes_previos_contenidos database table.
 * 
 */
// @Entity
// @Table(name="spp_informes_previos_contenidos")
@NamedQuery(name="SppInformesPreviosContenido.findAll", query="SELECT s FROM SppInformesPreviosContenido s")
public class SppInformesPreviosContenido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sipc_code")
	private int sipcCode;

	@Column(name="sip_code")
	private int sipCode;

	@Column(name="sipc_adjunto")
	private String sipcAdjunto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sipc_fecha")
	private Date sipcFecha;

	@Column(name="sti_code")
	private int stiCode;

	@Column(name="use_code")
	private int useCode;

	public SppInformesPreviosContenido() {
	}

	public int getSipcCode() {
		return this.sipcCode;
	}

	public void setSipcCode(int sipcCode) {
		this.sipcCode = sipcCode;
	}

	public int getSipCode() {
		return this.sipCode;
	}

	public void setSipCode(int sipCode) {
		this.sipCode = sipCode;
	}

	public String getSipcAdjunto() {
		return this.sipcAdjunto;
	}

	public void setSipcAdjunto(String sipcAdjunto) {
		this.sipcAdjunto = sipcAdjunto;
	}

	public Date getSipcFecha() {
		return this.sipcFecha;
	}

	public void setSipcFecha(Date sipcFecha) {
		this.sipcFecha = sipcFecha;
	}

	public int getStiCode() {
		return this.stiCode;
	}

	public void setStiCode(int stiCode) {
		this.stiCode = stiCode;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}