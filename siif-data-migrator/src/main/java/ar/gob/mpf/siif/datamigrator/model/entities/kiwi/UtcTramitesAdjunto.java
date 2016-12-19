package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the utc_tramites_adjuntos database table.
 * 
 */
// @Entity
// @Table(name="utc_tramites_adjuntos")
@NamedQuery(name="UtcTramitesAdjunto.findAll", query="SELECT u FROM UtcTramitesAdjunto u")
public class UtcTramitesAdjunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="uta_code")
	private int utaCode;

	@Column(name="doc_storage")
	private String docStorage;

	@Column(name="use_code")
	private String useCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="uta_fecha")
	private Date utaFecha;

	@Column(name="uta_tipo")
	private String utaTipo;

	@Column(name="utr_code")
	private int utrCode;

	public UtcTramitesAdjunto() {
	}

	public int getUtaCode() {
		return this.utaCode;
	}

	public void setUtaCode(int utaCode) {
		this.utaCode = utaCode;
	}

	public String getDocStorage() {
		return this.docStorage;
	}

	public void setDocStorage(String docStorage) {
		this.docStorage = docStorage;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public Date getUtaFecha() {
		return this.utaFecha;
	}

	public void setUtaFecha(Date utaFecha) {
		this.utaFecha = utaFecha;
	}

	public String getUtaTipo() {
		return this.utaTipo;
	}

	public void setUtaTipo(String utaTipo) {
		this.utaTipo = utaTipo;
	}

	public int getUtrCode() {
		return this.utrCode;
	}

	public void setUtrCode(int utrCode) {
		this.utrCode = utrCode;
	}

}