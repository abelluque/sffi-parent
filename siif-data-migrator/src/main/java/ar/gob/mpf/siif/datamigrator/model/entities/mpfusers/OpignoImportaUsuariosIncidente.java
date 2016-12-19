package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the opigno_importa_usuarios_incidentes database table.
 * 
 */
// @Entity
// @Table(name="opigno_importa_usuarios_incidentes")
@NamedQuery(name="OpignoImportaUsuariosIncidente.findAll", query="SELECT o FROM OpignoImportaUsuariosIncidente o")
public class OpignoImportaUsuariosIncidente implements Serializable {
	private static final long serialVersionUID = 1L;

	private String codigo;

	private String codigoerr;

	@Lob
	private String descripcion;

	private Timestamp tmstamp;

	@Lob
	private String valor;

	public OpignoImportaUsuariosIncidente() {
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoerr() {
		return this.codigoerr;
	}

	public void setCodigoerr(String codigoerr) {
		this.codigoerr = codigoerr;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Timestamp getTmstamp() {
		return this.tmstamp;
	}

	public void setTmstamp(Timestamp tmstamp) {
		this.tmstamp = tmstamp;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}