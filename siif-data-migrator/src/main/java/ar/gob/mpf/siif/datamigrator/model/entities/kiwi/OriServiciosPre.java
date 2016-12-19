package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ori_servicios_pres database table.
 * 
 */
// @Entity
// @Table(name="ori_servicios_pres")
@NamedQuery(name="OriServiciosPre.findAll", query="SELECT o FROM OriServiciosPre o")
public class OriServiciosPre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="osv_code")
	private int osvCode;

	@Column(name="osv_activo")
	private String osvActivo;

	@Column(name="osv_servicio")
	private String osvServicio;

	public OriServiciosPre() {
	}

	public int getOsvCode() {
		return this.osvCode;
	}

	public void setOsvCode(int osvCode) {
		this.osvCode = osvCode;
	}

	public String getOsvActivo() {
		return this.osvActivo;
	}

	public void setOsvActivo(String osvActivo) {
		this.osvActivo = osvActivo;
	}

	public String getOsvServicio() {
		return this.osvServicio;
	}

	public void setOsvServicio(String osvServicio) {
		this.osvServicio = osvServicio;
	}

}