package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_articulos database table.
 * 
 */
// @Entity
// @Table(name="gen_articulos")
@NamedQuery(name="GenArticulo.findAll", query="SELECT g FROM GenArticulo g")
public class GenArticulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="art_code")
	private int artCode;

	@Column(name="art_agrupamiento_asignacion_ef")
	private String artAgrupamientoAsignacionEf;

	@Column(name="art_articulo")
	private String artArticulo;

	@Column(name="art_descripcion")
	private String artDescripcion;

	@Column(name="art_especializacion")
	private String artEspecializacion;

	@Column(name="art_inciso")
	private String artInciso;

	@Column(name="art_ley")
	private String artLey;

	@Column(name="art_numero")
	private String artNumero;

	private String derogado;

	@Column(name="mat_code")
	private int matCode;

	public GenArticulo() {
	}

	public int getArtCode() {
		return this.artCode;
	}

	public void setArtCode(int artCode) {
		this.artCode = artCode;
	}

	public String getArtAgrupamientoAsignacionEf() {
		return this.artAgrupamientoAsignacionEf;
	}

	public void setArtAgrupamientoAsignacionEf(String artAgrupamientoAsignacionEf) {
		this.artAgrupamientoAsignacionEf = artAgrupamientoAsignacionEf;
	}

	public String getArtArticulo() {
		return this.artArticulo;
	}

	public void setArtArticulo(String artArticulo) {
		this.artArticulo = artArticulo;
	}

	public String getArtDescripcion() {
		return this.artDescripcion;
	}

	public void setArtDescripcion(String artDescripcion) {
		this.artDescripcion = artDescripcion;
	}

	public String getArtEspecializacion() {
		return this.artEspecializacion;
	}

	public void setArtEspecializacion(String artEspecializacion) {
		this.artEspecializacion = artEspecializacion;
	}

	public String getArtInciso() {
		return this.artInciso;
	}

	public void setArtInciso(String artInciso) {
		this.artInciso = artInciso;
	}

	public String getArtLey() {
		return this.artLey;
	}

	public void setArtLey(String artLey) {
		this.artLey = artLey;
	}

	public String getArtNumero() {
		return this.artNumero;
	}

	public void setArtNumero(String artNumero) {
		this.artNumero = artNumero;
	}

	public String getDerogado() {
		return this.derogado;
	}

	public void setDerogado(String derogado) {
		this.derogado = derogado;
	}

	public int getMatCode() {
		return this.matCode;
	}

	public void setMatCode(int matCode) {
		this.matCode = matCode;
	}

}