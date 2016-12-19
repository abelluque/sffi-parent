package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the gen_eventos database table.
 * 
 */
// @Entity
// @Table(name="gen_eventos")
@NamedQuery(name="GenEvento.findAll", query="SELECT g FROM GenEvento g")
public class GenEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="gev_code")
	private int gevCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="gev_cambios")
	private String gevCambios;

	@Column(name="gev_comentarios")
	private String gevComentarios;

	@Column(name="gev_estado")
	private String gevEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="gev_fecha")
	private Date gevFecha;

	@Column(name="gev_tabla_codigo")
	private String gevTablaCodigo;

	@Column(name="gev_tabla_nombre")
	private String gevTablaNombre;

	@Column(name="use_code")
	private String useCode;

	public GenEvento() {
	}

	public int getGevCode() {
		return this.gevCode;
	}

	public void setGevCode(int gevCode) {
		this.gevCode = gevCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getGevCambios() {
		return this.gevCambios;
	}

	public void setGevCambios(String gevCambios) {
		this.gevCambios = gevCambios;
	}

	public String getGevComentarios() {
		return this.gevComentarios;
	}

	public void setGevComentarios(String gevComentarios) {
		this.gevComentarios = gevComentarios;
	}

	public String getGevEstado() {
		return this.gevEstado;
	}

	public void setGevEstado(String gevEstado) {
		this.gevEstado = gevEstado;
	}

	public Date getGevFecha() {
		return this.gevFecha;
	}

	public void setGevFecha(Date gevFecha) {
		this.gevFecha = gevFecha;
	}

	public String getGevTablaCodigo() {
		return this.gevTablaCodigo;
	}

	public void setGevTablaCodigo(String gevTablaCodigo) {
		this.gevTablaCodigo = gevTablaCodigo;
	}

	public String getGevTablaNombre() {
		return this.gevTablaNombre;
	}

	public void setGevTablaNombre(String gevTablaNombre) {
		this.gevTablaNombre = gevTablaNombre;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}