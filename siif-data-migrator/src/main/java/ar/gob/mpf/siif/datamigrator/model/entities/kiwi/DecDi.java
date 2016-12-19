package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dec_di database table.
 * 
 */
// @Entity
// @Table(name="dec_di")
@NamedQuery(name="DecDi.findAll", query="SELECT d FROM DecDi d")
public class DecDi implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DecDiPK id;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="ddi_excepciones")
	private int ddiExcepciones;

	@Column(name="ddi_ultimo_seleccionado")
	private String ddiUltimoSeleccionado;

	public DecDi() {
	}

	public DecDiPK getId() {
		return this.id;
	}

	public void setId(DecDiPK id) {
		this.id = id;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getDdiExcepciones() {
		return this.ddiExcepciones;
	}

	public void setDdiExcepciones(int ddiExcepciones) {
		this.ddiExcepciones = ddiExcepciones;
	}

	public String getDdiUltimoSeleccionado() {
		return this.ddiUltimoSeleccionado;
	}

	public void setDdiUltimoSeleccionado(String ddiUltimoSeleccionado) {
		this.ddiUltimoSeleccionado = ddiUltimoSeleccionado;
	}

}