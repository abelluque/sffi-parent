package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cayt_juzgados_salas database table.
 * 
 */
// @Entity
// @Table(name="cayt_juzgados_salas")
@NamedQuery(name="CaytJuzgadosSala.findAll", query="SELECT c FROM CaytJuzgadosSala c")
public class CaytJuzgadosSala implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="jsa_code")
	private int jsaCode;

	@Column(name="jsa_activo")
	private String jsaActivo;

	@Column(name="jsa_instancia")
	private int jsaInstancia;

	@Column(name="jsa_juzgado")
	private String jsaJuzgado;

	@Column(name="jsa_nombre")
	private String jsaNombre;

	@Column(name="jsa_sala")
	private String jsaSala;

	@Column(name="jsa_secretaria")
	private String jsaSecretaria;

	public CaytJuzgadosSala() {
	}

	public int getJsaCode() {
		return this.jsaCode;
	}

	public void setJsaCode(int jsaCode) {
		this.jsaCode = jsaCode;
	}

	public String getJsaActivo() {
		return this.jsaActivo;
	}

	public void setJsaActivo(String jsaActivo) {
		this.jsaActivo = jsaActivo;
	}

	public int getJsaInstancia() {
		return this.jsaInstancia;
	}

	public void setJsaInstancia(int jsaInstancia) {
		this.jsaInstancia = jsaInstancia;
	}

	public String getJsaJuzgado() {
		return this.jsaJuzgado;
	}

	public void setJsaJuzgado(String jsaJuzgado) {
		this.jsaJuzgado = jsaJuzgado;
	}

	public String getJsaNombre() {
		return this.jsaNombre;
	}

	public void setJsaNombre(String jsaNombre) {
		this.jsaNombre = jsaNombre;
	}

	public String getJsaSala() {
		return this.jsaSala;
	}

	public void setJsaSala(String jsaSala) {
		this.jsaSala = jsaSala;
	}

	public String getJsaSecretaria() {
		return this.jsaSecretaria;
	}

	public void setJsaSecretaria(String jsaSecretaria) {
		this.jsaSecretaria = jsaSecretaria;
	}

}