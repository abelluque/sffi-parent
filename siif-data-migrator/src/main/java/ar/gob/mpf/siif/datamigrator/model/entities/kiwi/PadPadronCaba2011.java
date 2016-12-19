package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pad_padron_caba_2011 database table.
 * 
 */
// @Entity
// @Table(name="pad_padron_caba_2011")
@NamedQuery(name="PadPadronCaba2011.findAll", query="SELECT p FROM PadPadronCaba2011 p")
public class PadPadronCaba2011 implements Serializable {
	private static final long serialVersionUID = 1L;

	private int analfa;

	private int apellido;

	private int clase;

	private int domicilio;

	private int matricula;

	private int nombre;

	private int profesion;

	private int sexo;

	@Column(name="tipo_doc")
	private int tipoDoc;

	public PadPadronCaba2011() {
	}

	public int getAnalfa() {
		return this.analfa;
	}

	public void setAnalfa(int analfa) {
		this.analfa = analfa;
	}

	public int getApellido() {
		return this.apellido;
	}

	public void setApellido(int apellido) {
		this.apellido = apellido;
	}

	public int getClase() {
		return this.clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public int getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(int domicilio) {
		this.domicilio = domicilio;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getNombre() {
		return this.nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public int getProfesion() {
		return this.profesion;
	}

	public void setProfesion(int profesion) {
		this.profesion = profesion;
	}

	public int getSexo() {
		return this.sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public int getTipoDoc() {
		return this.tipoDoc;
	}

	public void setTipoDoc(int tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

}