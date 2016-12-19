package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cayt_objetos database table.
 * 
 */
// @Entity
// @Table(name="cayt_objetos")
@NamedQuery(name="CaytObjeto.findAll", query="SELECT c FROM CaytObjeto c")
public class CaytObjeto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="obj_code")
	private int objCode;

	@Column(name="obj_activo")
	private String objActivo;

	@Column(name="obj_categoria")
	private String objCategoria;

	@Column(name="obj_nombre")
	private String objNombre;

	public CaytObjeto() {
	}

	public int getObjCode() {
		return this.objCode;
	}

	public void setObjCode(int objCode) {
		this.objCode = objCode;
	}

	public String getObjActivo() {
		return this.objActivo;
	}

	public void setObjActivo(String objActivo) {
		this.objActivo = objActivo;
	}

	public String getObjCategoria() {
		return this.objCategoria;
	}

	public void setObjCategoria(String objCategoria) {
		this.objCategoria = objCategoria;
	}

	public String getObjNombre() {
		return this.objNombre;
	}

	public void setObjNombre(String objNombre) {
		this.objNombre = objNombre;
	}

}