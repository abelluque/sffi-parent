package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ori_tipos_inst database table.
 * 
 */
// @Entity
// @Table(name="ori_tipos_inst")
@NamedQuery(name="OriTiposInst.findAll", query="SELECT o FROM OriTiposInst o")
public class OriTiposInst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="otp_code")
	private int otpCode;

	@Column(name="otp_activo")
	private String otpActivo;

	@Column(name="otp_tipo")
	private String otpTipo;

	public OriTiposInst() {
	}

	public int getOtpCode() {
		return this.otpCode;
	}

	public void setOtpCode(int otpCode) {
		this.otpCode = otpCode;
	}

	public String getOtpActivo() {
		return this.otpActivo;
	}

	public void setOtpActivo(String otpActivo) {
		this.otpActivo = otpActivo;
	}

	public String getOtpTipo() {
		return this.otpTipo;
	}

	public void setOtpTipo(String otpTipo) {
		this.otpTipo = otpTipo;
	}

}