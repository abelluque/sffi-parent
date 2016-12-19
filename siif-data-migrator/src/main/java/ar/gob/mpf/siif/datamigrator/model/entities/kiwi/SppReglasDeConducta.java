package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spp_reglas_de_conducta database table.
 * 
 */
// @Entity
// @Table(name="spp_reglas_de_conducta")
@NamedQuery(name="SppReglasDeConducta.findAll", query="SELECT s FROM SppReglasDeConducta s")
public class SppReglasDeConducta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="src_code")
	private int srcCode;

	@Column(name="src_articulo")
	private String srcArticulo;

	@Column(name="src_articulo_corto")
	private String srcArticuloCorto;

	@Column(name="src_descripcion")
	private String srcDescripcion;

	@Column(name="src_descripcion_corta")
	private String srcDescripcionCorta;

	@Column(name="src_estado")
	private String srcEstado;

	@Column(name="src_fuero")
	private String srcFuero;

	@Column(name="src_fuero_corto")
	private String srcFueroCorto;

	@Column(name="src_inciso")
	private String srcInciso;

	@Column(name="src_regla")
	private String srcRegla;

	public SppReglasDeConducta() {
	}

	public int getSrcCode() {
		return this.srcCode;
	}

	public void setSrcCode(int srcCode) {
		this.srcCode = srcCode;
	}

	public String getSrcArticulo() {
		return this.srcArticulo;
	}

	public void setSrcArticulo(String srcArticulo) {
		this.srcArticulo = srcArticulo;
	}

	public String getSrcArticuloCorto() {
		return this.srcArticuloCorto;
	}

	public void setSrcArticuloCorto(String srcArticuloCorto) {
		this.srcArticuloCorto = srcArticuloCorto;
	}

	public String getSrcDescripcion() {
		return this.srcDescripcion;
	}

	public void setSrcDescripcion(String srcDescripcion) {
		this.srcDescripcion = srcDescripcion;
	}

	public String getSrcDescripcionCorta() {
		return this.srcDescripcionCorta;
	}

	public void setSrcDescripcionCorta(String srcDescripcionCorta) {
		this.srcDescripcionCorta = srcDescripcionCorta;
	}

	public String getSrcEstado() {
		return this.srcEstado;
	}

	public void setSrcEstado(String srcEstado) {
		this.srcEstado = srcEstado;
	}

	public String getSrcFuero() {
		return this.srcFuero;
	}

	public void setSrcFuero(String srcFuero) {
		this.srcFuero = srcFuero;
	}

	public String getSrcFueroCorto() {
		return this.srcFueroCorto;
	}

	public void setSrcFueroCorto(String srcFueroCorto) {
		this.srcFueroCorto = srcFueroCorto;
	}

	public String getSrcInciso() {
		return this.srcInciso;
	}

	public void setSrcInciso(String srcInciso) {
		this.srcInciso = srcInciso;
	}

	public String getSrcRegla() {
		return this.srcRegla;
	}

	public void setSrcRegla(String srcRegla) {
		this.srcRegla = srcRegla;
	}

}