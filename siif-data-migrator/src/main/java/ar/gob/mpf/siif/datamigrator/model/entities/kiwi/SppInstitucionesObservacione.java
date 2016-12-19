package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the spp_instituciones_observaciones database table.
 * 
 */
// @Entity
// @Table(name="spp_instituciones_observaciones")
@NamedQuery(name="SppInstitucionesObservacione.findAll", query="SELECT s FROM SppInstitucionesObservacione s")
public class SppInstitucionesObservacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sino_code")
	private int sinoCode;

	@Lob
	private String observacion;

	@Column(name="sin_code")
	private int sinCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sino_tstamp")
	private Date sinoTstamp;

	@Column(name="sino_use_code")
	private String sinoUseCode;

	public SppInstitucionesObservacione() {
	}

	public int getSinoCode() {
		return this.sinoCode;
	}

	public void setSinoCode(int sinoCode) {
		this.sinoCode = sinoCode;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getSinCode() {
		return this.sinCode;
	}

	public void setSinCode(int sinCode) {
		this.sinCode = sinCode;
	}

	public Date getSinoTstamp() {
		return this.sinoTstamp;
	}

	public void setSinoTstamp(Date sinoTstamp) {
		this.sinoTstamp = sinoTstamp;
	}

	public String getSinoUseCode() {
		return this.sinoUseCode;
	}

	public void setSinoUseCode(String sinoUseCode) {
		this.sinoUseCode = sinoUseCode;
	}

}