package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the den_rol_persona database table.
 * 
 */
// @Entity
// @Table(name="den_rol_persona")
@NamedQuery(name="DenRolPersona.findAll", query="SELECT d FROM DenRolPersona d")
public class DenRolPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ddrp_code")
	private int ddrpCode;

	@Column(name="con_lis_code")
	private int conLisCode;

	@Column(name="dden_code")
	private int ddenCode;

	@Column(name="ddrp_estado")
	private String ddrpEstado;

	@Column(name="ddrp_link_mod")
	private String ddrpLinkMod;

	@Column(name="ddrp_link_ver")
	private String ddrpLinkVer;

	@Column(name="ddrp_rol")
	private String ddrpRol;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ddrp_tstamp")
	private Date ddrpTstamp;

	@Column(name="ddrp_tstamp_modif")
	private Timestamp ddrpTstampModif;

	@Column(name="dom_code")
	private int domCode;

	@Column(name="estado_presunto")
	private String estadoPresunto;

	@Column(name="per_code")
	private int perCode;

	@Column(name="per_estado")
	private String perEstado;

	@Column(name="per_exhibe_doc")
	private String perExhibeDoc;

	@Column(name="use_code")
	private String useCode;

	public DenRolPersona() {
	}

	public int getDdrpCode() {
		return this.ddrpCode;
	}

	public void setDdrpCode(int ddrpCode) {
		this.ddrpCode = ddrpCode;
	}

	public int getConLisCode() {
		return this.conLisCode;
	}

	public void setConLisCode(int conLisCode) {
		this.conLisCode = conLisCode;
	}

	public int getDdenCode() {
		return this.ddenCode;
	}

	public void setDdenCode(int ddenCode) {
		this.ddenCode = ddenCode;
	}

	public String getDdrpEstado() {
		return this.ddrpEstado;
	}

	public void setDdrpEstado(String ddrpEstado) {
		this.ddrpEstado = ddrpEstado;
	}

	public String getDdrpLinkMod() {
		return this.ddrpLinkMod;
	}

	public void setDdrpLinkMod(String ddrpLinkMod) {
		this.ddrpLinkMod = ddrpLinkMod;
	}

	public String getDdrpLinkVer() {
		return this.ddrpLinkVer;
	}

	public void setDdrpLinkVer(String ddrpLinkVer) {
		this.ddrpLinkVer = ddrpLinkVer;
	}

	public String getDdrpRol() {
		return this.ddrpRol;
	}

	public void setDdrpRol(String ddrpRol) {
		this.ddrpRol = ddrpRol;
	}

	public Date getDdrpTstamp() {
		return this.ddrpTstamp;
	}

	public void setDdrpTstamp(Date ddrpTstamp) {
		this.ddrpTstamp = ddrpTstamp;
	}

	public Timestamp getDdrpTstampModif() {
		return this.ddrpTstampModif;
	}

	public void setDdrpTstampModif(Timestamp ddrpTstampModif) {
		this.ddrpTstampModif = ddrpTstampModif;
	}

	public int getDomCode() {
		return this.domCode;
	}

	public void setDomCode(int domCode) {
		this.domCode = domCode;
	}

	public String getEstadoPresunto() {
		return this.estadoPresunto;
	}

	public void setEstadoPresunto(String estadoPresunto) {
		this.estadoPresunto = estadoPresunto;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public String getPerEstado() {
		return this.perEstado;
	}

	public void setPerEstado(String perEstado) {
		this.perEstado = perEstado;
	}

	public String getPerExhibeDoc() {
		return this.perExhibeDoc;
	}

	public void setPerExhibeDoc(String perExhibeDoc) {
		this.perExhibeDoc = perExhibeDoc;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}