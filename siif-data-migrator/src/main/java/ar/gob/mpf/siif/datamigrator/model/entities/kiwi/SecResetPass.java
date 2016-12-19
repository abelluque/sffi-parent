package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sec_reset_pass database table.
 * 
 */
// @Entity
// @Table(name="sec_reset_pass")
@NamedQuery(name="SecResetPass.findAll", query="SELECT s FROM SecResetPass s")
public class SecResetPass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="srp_enviado")
	private int srpEnviado;

	@Column(name="srp_server")
	private int srpServer;

	@Column(name="srp_status")
	private int srpStatus;

	@Column(name="srp_token")
	private int srpToken;

	@Column(name="srp_usado")
	private int srpUsado;

	@Column(name="srp_vencimiento")
	private int srpVencimiento;

	@Column(name="use_code")
	private int useCode;

	@Column(name="use_email")
	private int useEmail;

	@Column(name="use_login")
	private int useLogin;

	@Column(name="use_name")
	private int useName;

	public SecResetPass() {
	}

	public int getSrpEnviado() {
		return this.srpEnviado;
	}

	public void setSrpEnviado(int srpEnviado) {
		this.srpEnviado = srpEnviado;
	}

	public int getSrpServer() {
		return this.srpServer;
	}

	public void setSrpServer(int srpServer) {
		this.srpServer = srpServer;
	}

	public int getSrpStatus() {
		return this.srpStatus;
	}

	public void setSrpStatus(int srpStatus) {
		this.srpStatus = srpStatus;
	}

	public int getSrpToken() {
		return this.srpToken;
	}

	public void setSrpToken(int srpToken) {
		this.srpToken = srpToken;
	}

	public int getSrpUsado() {
		return this.srpUsado;
	}

	public void setSrpUsado(int srpUsado) {
		this.srpUsado = srpUsado;
	}

	public int getSrpVencimiento() {
		return this.srpVencimiento;
	}

	public void setSrpVencimiento(int srpVencimiento) {
		this.srpVencimiento = srpVencimiento;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

	public int getUseEmail() {
		return this.useEmail;
	}

	public void setUseEmail(int useEmail) {
		this.useEmail = useEmail;
	}

	public int getUseLogin() {
		return this.useLogin;
	}

	public void setUseLogin(int useLogin) {
		this.useLogin = useLogin;
	}

	public int getUseName() {
		return this.useName;
	}

	public void setUseName(int useName) {
		this.useName = useName;
	}

}