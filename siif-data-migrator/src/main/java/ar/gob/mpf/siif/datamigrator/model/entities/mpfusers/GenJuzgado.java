package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_juzgados database table.
 * 
 */
// @Entity
// @Table(name="gen_juzgados")
@NamedQuery(name="GenJuzgado.findAll", query="SELECT g FROM GenJuzgado g")
public class GenJuzgado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="juzgado_id")
	private int juzgadoId;

	private String direccion;

	private String email;

	@Column(name="email_secretario")
	private String emailSecretario;

	private String juez;

	private String secretario;

	private String telefono;

	@Column(name="telefono_secretario")
	private String telefonoSecretario;

	public GenJuzgado() {
	}

	public int getJuzgadoId() {
		return this.juzgadoId;
	}

	public void setJuzgadoId(int juzgadoId) {
		this.juzgadoId = juzgadoId;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailSecretario() {
		return this.emailSecretario;
	}

	public void setEmailSecretario(String emailSecretario) {
		this.emailSecretario = emailSecretario;
	}

	public String getJuez() {
		return this.juez;
	}

	public void setJuez(String juez) {
		this.juez = juez;
	}

	public String getSecretario() {
		return this.secretario;
	}

	public void setSecretario(String secretario) {
		this.secretario = secretario;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefonoSecretario() {
		return this.telefonoSecretario;
	}

	public void setTelefonoSecretario(String telefonoSecretario) {
		this.telefonoSecretario = telefonoSecretario;
	}

}