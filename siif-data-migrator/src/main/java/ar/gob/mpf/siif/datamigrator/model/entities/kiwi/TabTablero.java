package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

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

	@Column(name="tab_arc_mpf")
	private int tabArcMpf;

	@Column(name="tab_arc_pentaho")
	private int tabArcPentaho;

	@Column(name="tab_code")
	private int tabCode;

	@Column(name="tab_descripcion")
	private int tabDescripcion;

	@Column(name="tab_estado")
	private int tabEstado;

	@Column(name="tab_nombre")
	private int tabNombre;

	@Column(name="tab_rig_name")
	private int tabRigName;

	@Column(name="tab_sistema")
	private int tabSistema;

	public TabTablero() {
	}

	public int getTabArcMpf() {
		return this.tabArcMpf;
	}

	public void setTabArcMpf(int tabArcMpf) {
		this.tabArcMpf = tabArcMpf;
	}

	public int getTabArcPentaho() {
		return this.tabArcPentaho;
	}

	public void setTabArcPentaho(int tabArcPentaho) {
		this.tabArcPentaho = tabArcPentaho;
	}

	public int getTabCode() {
		return this.tabCode;
	}

	public void setTabCode(int tabCode) {
		this.tabCode = tabCode;
	}

	public int getTabDescripcion() {
		return this.tabDescripcion;
	}

	public void setTabDescripcion(int tabDescripcion) {
		this.tabDescripcion = tabDescripcion;
	}

	public int getTabEstado() {
		return this.tabEstado;
	}

	public void setTabEstado(int tabEstado) {
		this.tabEstado = tabEstado;
	}

	public int getTabNombre() {
		return this.tabNombre;
	}

	public void setTabNombre(int tabNombre) {
		this.tabNombre = tabNombre;
	}

	public int getTabRigName() {
		return this.tabRigName;
	}

	public void setTabRigName(int tabRigName) {
		this.tabRigName = tabRigName;
	}

	public int getTabSistema() {
		return this.tabSistema;
	}

	public void setTabSistema(int tabSistema) {
		this.tabSistema = tabSistema;
	}

}