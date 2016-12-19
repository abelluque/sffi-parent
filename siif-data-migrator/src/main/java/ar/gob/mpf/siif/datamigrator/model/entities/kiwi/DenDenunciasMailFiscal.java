package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the den_denuncias_mail_fiscal database table.
 * 
 */
// @Entity
// @Table(name="den_denuncias_mail_fiscal")
@NamedQuery(name="DenDenunciasMailFiscal.findAll", query="SELECT d FROM DenDenunciasMailFiscal d")
public class DenDenunciasMailFiscal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ddmf_code")
	private int ddmfCode;

	@Column(name="dden_code")
	private int ddenCode;

	@Column(name="ddmf_estado")
	private String ddmfEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ddmf_tstamp")
	private Date ddmfTstamp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ddmf_tstamp_envio")
	private Date ddmfTstampEnvio;

	@Column(name="use_code")
	private String useCode;

	public DenDenunciasMailFiscal() {
	}

	public int getDdmfCode() {
		return this.ddmfCode;
	}

	public void setDdmfCode(int ddmfCode) {
		this.ddmfCode = ddmfCode;
	}

	public int getDdenCode() {
		return this.ddenCode;
	}

	public void setDdenCode(int ddenCode) {
		this.ddenCode = ddenCode;
	}

	public String getDdmfEstado() {
		return this.ddmfEstado;
	}

	public void setDdmfEstado(String ddmfEstado) {
		this.ddmfEstado = ddmfEstado;
	}

	public Date getDdmfTstamp() {
		return this.ddmfTstamp;
	}

	public void setDdmfTstamp(Date ddmfTstamp) {
		this.ddmfTstamp = ddmfTstamp;
	}

	public Date getDdmfTstampEnvio() {
		return this.ddmfTstampEnvio;
	}

	public void setDdmfTstampEnvio(Date ddmfTstampEnvio) {
		this.ddmfTstampEnvio = ddmfTstampEnvio;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}