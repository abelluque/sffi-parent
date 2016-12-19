package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gen_botones_acciones database table.
 * 
 */
// @Entity
// @Table(name="gen_botones_acciones")
@NamedQuery(name="GenBotonesAcciones.findAll", query="SELECT g FROM GenBotonesAcciones g")
public class GenBotonesAcciones implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="gba_id")
	private int gbaId;

	@Column(name="gba_alerta")
	private String gbaAlerta;

	@Column(name="gba_color")
	private String gbaColor;

	@Column(name="gba_descripcion")
	private String gbaDescripcion;

	@Column(name="gba_div_name")
	private String gbaDivName;

	@Column(name="gba_estado")
	private String gbaEstado;

	@Column(name="gba_funcion")
	private String gbaFuncion;

	@Column(name="gba_icon_name")
	private String gbaIconName;

	@Column(name="gba_orden")
	private String gbaOrden;

	@Column(name="gba_presentation")
	private String gbaPresentation;

	@Column(name="gba_refresco")
	private int gbaRefresco;

	@Column(name="gba_target")
	private String gbaTarget;

	@Column(name="gba_url_destino")
	private String gbaUrlDestino;

	@Column(name="rig_name")
	private String rigName;

	public GenBotonesAcciones() {
	}

	public int getGbaId() {
		return this.gbaId;
	}

	public void setGbaId(int gbaId) {
		this.gbaId = gbaId;
	}

	public String getGbaAlerta() {
		return this.gbaAlerta;
	}

	public void setGbaAlerta(String gbaAlerta) {
		this.gbaAlerta = gbaAlerta;
	}

	public String getGbaColor() {
		return this.gbaColor;
	}

	public void setGbaColor(String gbaColor) {
		this.gbaColor = gbaColor;
	}

	public String getGbaDescripcion() {
		return this.gbaDescripcion;
	}

	public void setGbaDescripcion(String gbaDescripcion) {
		this.gbaDescripcion = gbaDescripcion;
	}

	public String getGbaDivName() {
		return this.gbaDivName;
	}

	public void setGbaDivName(String gbaDivName) {
		this.gbaDivName = gbaDivName;
	}

	public String getGbaEstado() {
		return this.gbaEstado;
	}

	public void setGbaEstado(String gbaEstado) {
		this.gbaEstado = gbaEstado;
	}

	public String getGbaFuncion() {
		return this.gbaFuncion;
	}

	public void setGbaFuncion(String gbaFuncion) {
		this.gbaFuncion = gbaFuncion;
	}

	public String getGbaIconName() {
		return this.gbaIconName;
	}

	public void setGbaIconName(String gbaIconName) {
		this.gbaIconName = gbaIconName;
	}

	public String getGbaOrden() {
		return this.gbaOrden;
	}

	public void setGbaOrden(String gbaOrden) {
		this.gbaOrden = gbaOrden;
	}

	public String getGbaPresentation() {
		return this.gbaPresentation;
	}

	public void setGbaPresentation(String gbaPresentation) {
		this.gbaPresentation = gbaPresentation;
	}

	public int getGbaRefresco() {
		return this.gbaRefresco;
	}

	public void setGbaRefresco(int gbaRefresco) {
		this.gbaRefresco = gbaRefresco;
	}

	public String getGbaTarget() {
		return this.gbaTarget;
	}

	public void setGbaTarget(String gbaTarget) {
		this.gbaTarget = gbaTarget;
	}

	public String getGbaUrlDestino() {
		return this.gbaUrlDestino;
	}

	public void setGbaUrlDestino(String gbaUrlDestino) {
		this.gbaUrlDestino = gbaUrlDestino;
	}

	public String getRigName() {
		return this.rigName;
	}

	public void setRigName(String rigName) {
		this.rigName = rigName;
	}

}