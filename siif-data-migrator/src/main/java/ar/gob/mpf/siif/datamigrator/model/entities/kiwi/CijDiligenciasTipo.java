package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cij_diligencias_tipos database table.
 * 
 */
// @Entity
// @Table(name="cij_diligencias_tipos")
@NamedQuery(name="CijDiligenciasTipo.findAll", query="SELECT c FROM CijDiligenciasTipo c")
public class CijDiligenciasTipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cdt_code")
	private int cdtCode;

	@Column(name="cdc_code")
	private int cdcCode;

	@Column(name="cdt_activo")
	private String cdtActivo;

	@Column(name="cdt_plantilla")
	private String cdtPlantilla;

	@Column(name="cdt_requiere_persona")
	private String cdtRequierePersona;

	@Column(name="cdt_tipo")
	private String cdtTipo;

	@Column(name="cdt_tipo_agente")
	private String cdtTipoAgente;

	public CijDiligenciasTipo() {
	}

	public int getCdtCode() {
		return this.cdtCode;
	}

	public void setCdtCode(int cdtCode) {
		this.cdtCode = cdtCode;
	}

	public int getCdcCode() {
		return this.cdcCode;
	}

	public void setCdcCode(int cdcCode) {
		this.cdcCode = cdcCode;
	}

	public String getCdtActivo() {
		return this.cdtActivo;
	}

	public void setCdtActivo(String cdtActivo) {
		this.cdtActivo = cdtActivo;
	}

	public String getCdtPlantilla() {
		return this.cdtPlantilla;
	}

	public void setCdtPlantilla(String cdtPlantilla) {
		this.cdtPlantilla = cdtPlantilla;
	}

	public String getCdtRequierePersona() {
		return this.cdtRequierePersona;
	}

	public void setCdtRequierePersona(String cdtRequierePersona) {
		this.cdtRequierePersona = cdtRequierePersona;
	}

	public String getCdtTipo() {
		return this.cdtTipo;
	}

	public void setCdtTipo(String cdtTipo) {
		this.cdtTipo = cdtTipo;
	}

	public String getCdtTipoAgente() {
		return this.cdtTipoAgente;
	}

	public void setCdtTipoAgente(String cdtTipoAgente) {
		this.cdtTipoAgente = cdtTipoAgente;
	}

}