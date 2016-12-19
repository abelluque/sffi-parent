package ar.gob.mpf.siif.web.view.managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * 
 * @author Abel Luque (a-b)
 *
 */

@ManagedBean
@ViewScoped
public class LoginController implements Serializable {

	private static final long serialVersionUID = 3973801993975443027L;

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String goToHome() {
		//TODO implemet login method
		return "/pages/home.xhtml";
	}
}