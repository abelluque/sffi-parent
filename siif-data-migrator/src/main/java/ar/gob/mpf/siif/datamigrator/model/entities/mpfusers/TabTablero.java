package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tab_tableros database table.
 * 
 */
// @Entity
// @Table(name="tab_tableros")
@NamedQuery(name="TabTablero.findAll", query="SELECT t FROM TabTablero t")
public class TabTablero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tab_code")
	private int tabCode;

	@Column(name="tab_arc_mpf")
	private String tabArcMpf;

	@Column(name="tab_arc_pentaho")
	private String tabArcPentaho;

	@Column(name="tab_descripcion")
	private String tabDescripcion;

	@Column(name="tab_estado")
	private String tabEstado;

	@Column(name="tab_nombre")
	private String tabNombre;

	@Column(name="tab_rig_name")
	private String tabRigName;

	@Column(name="tab_sistema")
	private String tabSistema;

	public TabTablero() {
	}

	public int getTabCode() {
		return this.tabCode;
	}

	public void setTabCode(int tabCode) {
		this.tabCode = tabCode;
	}

	public String getTabArcMpf() {
		return this.tabArcMpf;
	}

	public void setTabArcMpf(String tabArcMpf) {
		this.tabArcMpf = tabArcMpf;
	}

	public String getTabArcPentaho() {
		return this.tabArcPentaho;
	}

	public void setTabArcPentaho(String tabArcPentaho) {
		this.tabArcPentaho = tabArcPentaho;
	}

	public String getTabDescripcion() {
		return this.tabDescripcion;
	}

	public void setTabDescripcion(String tabDescripcion) {
		this.tabDescripcion = tabDescripcion;
	}

	public String getTabEstado() {
		return this.tabEstado;
	}

	public void setTabEstado(String tabEstado) {
		this.tabEstado = tabEstado;
	}

	public String getTabNombre() {
		return this.tabNombre;
	}

	public void setTabNombre(String tabNombre) {
		this.tabNombre = tabNombre;
	}

	public String getTabRigName() {
		return this.tabRigName;
	}

	public void setTabRigName(String tabRigName) {
		this.tabRigName = tabRigName;
	}

	public String getTabSistema() {
		return this.tabSistema;
	}

	public void setTabSistema(String tabSistema) {
		this.tabSistema = tabSistema;
	}

}