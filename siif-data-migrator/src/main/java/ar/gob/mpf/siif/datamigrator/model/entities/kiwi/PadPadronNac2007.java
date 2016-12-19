package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pad_padron_nac_2007 database table.
 * 
 */
// @Entity
// @Table(name="pad_padron_nac_2007")
@NamedQuery(name="PadPadronNac2007.findAll", query="SELECT p FROM PadPadronNac2007 p")
public class PadPadronNac2007 implements Serializable {
	private static final long serialVersionUID = 1L;

	private int apelnom;

	private int clase;

	private int depto;

	private int direcc;

	@Column(name="id_localidad")
	private int idLocalidad;

	@Column(name="id_provincia")
	private int idProvincia;

	private int localidad;

	private int matricula;

	private int ocup;

	private int provincia;

	private int sexo;

	private int tipo;

	public PadPadronNac2007() {
	}

	public int getApelnom() {
		return this.apelnom;
	}

	public void setApelnom(int apelnom) {
		this.apelnom = apelnom;
	}

	public int getClase() {
		return this.clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public int getDepto() {
		return this.depto;
	}

	public void setDepto(int depto) {
		this.depto = depto;
	}

	public int getDirecc() {
		return this.direcc;
	}

	public void setDirecc(int direcc) {
		this.direcc = direcc;
	}

	public int getIdLocalidad() {
		return this.idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public int getIdProvincia() {
		return this.idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	public int getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(int localidad) {
		this.localidad = localidad;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getOcup() {
		return this.ocup;
	}

	public void setOcup(int ocup) {
		this.ocup = ocup;
	}

	public int getProvincia() {
		return this.provincia;
	}

	public void setProvincia(int provincia) {
		this.provincia = provincia;
	}

	public int getSexo() {
		return this.sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}