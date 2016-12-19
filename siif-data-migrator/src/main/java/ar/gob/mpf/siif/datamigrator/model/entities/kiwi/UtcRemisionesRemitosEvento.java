package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the utc_remisiones_remitos_eventos database table.
 * 
 */
// @Entity
// @Table(name="utc_remisiones_remitos_eventos")
@NamedQuery(name="UtcRemisionesRemitosEvento.findAll", query="SELECT u FROM UtcRemisionesRemitosEvento u")
public class UtcRemisionesRemitosEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ure_cambios")
	private String ureCambios;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ure_tstamp")
	private Date ureTstamp;

	@Column(name="urr_code")
	private int urrCode;

	@Column(name="urr_estado")
	private String urrEstado;

	@Column(name="use_code")
	private int useCode;

	public UtcRemisionesRemitosEvento() {
	}

	public String getUreCambios() {
		return this.ureCambios;
	}

	public void setUreCambios(String ureCambios) {
		this.ureCambios = ureCambios;
	}

	public Date getUreTstamp() {
		return this.ureTstamp;
	}

	public void setUreTstamp(Date ureTstamp) {
		this.ureTstamp = ureTstamp;
	}

	public int getUrrCode() {
		return this.urrCode;
	}

	public void setUrrCode(int urrCode) {
		this.urrCode = urrCode;
	}

	public String getUrrEstado() {
		return this.urrEstado;
	}

	public void setUrrEstado(String urrEstado) {
		this.urrEstado = urrEstado;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}