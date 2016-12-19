package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oci_personas_auditoria_cambios database table.
 * 
 */
// @Entity
// @Table(name="oci_personas_auditoria_cambios")
@NamedQuery(name="OciPersonasAuditoriaCambio.findAll", query="SELECT o FROM OciPersonasAuditoriaCambio o")
public class OciPersonasAuditoriaCambio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="opac_code")
	private int opacCode;

	@Column(name="opa_cambio")
	private String opaCambio;

	@Column(name="opa_campo")
	private String opaCampo;

	@Column(name="opa_code")
	private int opaCode;

	@Column(name="opa_operacion")
	private String opaOperacion;

	@Column(name="opa_tabla")
	private String opaTabla;

	@Column(name="opa_tablakey")
	private String opaTablakey;

	@Column(name="opa_valornue")
	private String opaValornue;

	@Column(name="opa_valorvie")
	private String opaValorvie;

	public OciPersonasAuditoriaCambio() {
	}

	public int getOpacCode() {
		return this.opacCode;
	}

	public void setOpacCode(int opacCode) {
		this.opacCode = opacCode;
	}

	public String getOpaCambio() {
		return this.opaCambio;
	}

	public void setOpaCambio(String opaCambio) {
		this.opaCambio = opaCambio;
	}

	public String getOpaCampo() {
		return this.opaCampo;
	}

	public void setOpaCampo(String opaCampo) {
		this.opaCampo = opaCampo;
	}

	public int getOpaCode() {
		return this.opaCode;
	}

	public void setOpaCode(int opaCode) {
		this.opaCode = opaCode;
	}

	public String getOpaOperacion() {
		return this.opaOperacion;
	}

	public void setOpaOperacion(String opaOperacion) {
		this.opaOperacion = opaOperacion;
	}

	public String getOpaTabla() {
		return this.opaTabla;
	}

	public void setOpaTabla(String opaTabla) {
		this.opaTabla = opaTabla;
	}

	public String getOpaTablakey() {
		return this.opaTablakey;
	}

	public void setOpaTablakey(String opaTablakey) {
		this.opaTablakey = opaTablakey;
	}

	public String getOpaValornue() {
		return this.opaValornue;
	}

	public void setOpaValornue(String opaValornue) {
		this.opaValornue = opaValornue;
	}

	public String getOpaValorvie() {
		return this.opaValorvie;
	}

	public void setOpaValorvie(String opaValorvie) {
		this.opaValorvie = opaValorvie;
	}

}