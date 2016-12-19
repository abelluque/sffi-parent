package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_botones_acciones database table.
 * 
 */
// @Entity
// @Table(name="gen_botones_acciones")
@NamedQuery(name="GenBotonesAccione.findAll", query="SELECT g FROM GenBotonesAccione g")
public class GenBotonesAccione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="gba_alerta")
	private int gbaAlerta;

	@Column(name="gba_color")
	private int gbaColor;

	@Column(name="gba_descripcion")
	private int gbaDescripcion;

	@Column(name="gba_div_name")
	private int gbaDivName;

	@Column(name="gba_estado")
	private int gbaEstado;

	@Column(name="gba_funcion")
	private int gbaFuncion;

	@Column(name="gba_icon_name")
	private int gbaIconName;

	@Column(name="gba_id")
	private int gbaId;

	@Column(name="gba_orden")
	private int gbaOrden;

	@Column(name="gba_presentation")
	private int gbaPresentation;

	@Column(name="gba_refresco")
	private int gbaRefresco;

	@Column(name="gba_target")
	private int gbaTarget;

	@Column(name="gba_url_destino")
	private int gbaUrlDestino;

	@Column(name="rig_name")
	private int rigName;

	public GenBotonesAccione() {
	}

	public int getGbaAlerta() {
		return this.gbaAlerta;
	}

	public void setGbaAlerta(int gbaAlerta) {
		this.gbaAlerta = gbaAlerta;
	}

	public int getGbaColor() {
		return this.gbaColor;
	}

	public void setGbaColor(int gbaColor) {
		this.gbaColor = gbaColor;
	}

	public int getGbaDescripcion() {
		return this.gbaDescripcion;
	}

	public void setGbaDescripcion(int gbaDescripcion) {
		this.gbaDescripcion = gbaDescripcion;
	}

	public int getGbaDivName() {
		return this.gbaDivName;
	}

	public void setGbaDivName(int gbaDivName) {
		this.gbaDivName = gbaDivName;
	}

	public int getGbaEstado() {
		return this.gbaEstado;
	}

	public void setGbaEstado(int gbaEstado) {
		this.gbaEstado = gbaEstado;
	}

	public int getGbaFuncion() {
		return this.gbaFuncion;
	}

	public void setGbaFuncion(int gbaFuncion) {
		this.gbaFuncion = gbaFuncion;
	}

	public int getGbaIconName() {
		return this.gbaIconName;
	}

	public void setGbaIconName(int gbaIconName) {
		this.gbaIconName = gbaIconName;
	}

	public int getGbaId() {
		return this.gbaId;
	}

	public void setGbaId(int gbaId) {
		this.gbaId = gbaId;
	}

	public int getGbaOrden() {
		return this.gbaOrden;
	}

	public void setGbaOrden(int gbaOrden) {
		this.gbaOrden = gbaOrden;
	}

	public int getGbaPresentation() {
		return this.gbaPresentation;
	}

	public void setGbaPresentation(int gbaPresentation) {
		this.gbaPresentation = gbaPresentation;
	}

	public int getGbaRefresco() {
		return this.gbaRefresco;
	}

	public void setGbaRefresco(int gbaRefresco) {
		this.gbaRefresco = gbaRefresco;
	}

	public int getGbaTarget() {
		return this.gbaTarget;
	}

	public void setGbaTarget(int gbaTarget) {
		this.gbaTarget = gbaTarget;
	}

	public int getGbaUrlDestino() {
		return this.gbaUrlDestino;
	}

	public void setGbaUrlDestino(int gbaUrlDestino) {
		this.gbaUrlDestino = gbaUrlDestino;
	}

	public int getRigName() {
		return this.rigName;
	}

	public void setRigName(int rigName) {
		this.rigName = rigName;
	}

}