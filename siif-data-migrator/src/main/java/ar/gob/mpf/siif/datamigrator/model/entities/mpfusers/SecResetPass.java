package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sec_reset_pass database table.
 * 
 */
// @Entity
// @Table(name="sec_reset_pass")
@NamedQuery(name="SecResetPass.findAll", query="SELECT s FROM SecResetPass s")
public class SecResetPass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="srp_token")
	private String srpToken;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="srp_enviado")
	private Date srpEnviado;

	@Column(name="srp_server")
	private String srpServer;

	@Column(name="srp_status")
	private String srpStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="srp_usado")
	private Date srpUsado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="srp_vencimiento")
	private Date srpVencimiento;

	@Column(name="use_code")
	private String useCode;

	@Column(name="use_email")
	private String useEmail;

	@Column(name="use_login")
	private String useLogin;

	@Column(name="use_name")
	private String useName;

	public SecResetPass() {
	}

	public String getSrpToken() {
		return this.srpToken;
	}

	public void setSrpToken(String srpToken) {
		this.srpToken = srpToken;
	}

	public Date getSrpEnviado() {
		return this.srpEnviado;
	}

	public void setSrpEnviado(Date srpEnviado) {
		this.srpEnviado = srpEnviado;
	}

	public String getSrpServer() {
		return this.srpServer;
	}

	public void setSrpServer(String srpServer) {
		this.srpServer = srpServer;
	}

	public String getSrpStatus() {
		return this.srpStatus;
	}

	public void setSrpStatus(String srpStatus) {
		this.srpStatus = srpStatus;
	}

	public Date getSrpUsado() {
		return this.srpUsado;
	}

	public void setSrpUsado(Date srpUsado) {
		this.srpUsado = srpUsado;
	}

	public Date getSrpVencimiento() {
		return this.srpVencimiento;
	}

	public void setSrpVencimiento(Date srpVencimiento) {
		this.srpVencimiento = srpVencimiento;
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

	public String getUseLogin() {
		return this.useLogin;
	}

	public void setUseLogin(String useLogin) {
		this.useLogin = useLogin;
	}

	public String getUseName() {
		return this.useName;
	}

	public void setUseName(String useName) {
		this.useName = useName;
	}

}