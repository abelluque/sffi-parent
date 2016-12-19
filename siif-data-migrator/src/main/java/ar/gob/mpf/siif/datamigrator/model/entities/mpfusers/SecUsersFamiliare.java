package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sec_users_familiares database table.
 * 
 */
// @Entity
// @Table(name="sec_users_familiares")
@NamedQuery(name="SecUsersFamiliare.findAll", query="SELECT s FROM SecUsersFamiliare s")
public class SecUsersFamiliare implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="usf_code")
	private int usfCode;

	@Column(name="use_code")
	private String useCode;

	@Column(name="usf_cuil")
	private String usfCuil;

	@Temporal(TemporalType.DATE)
	@Column(name="usf_fecnac")
	private Date usfFecnac;

	@Column(name="usf_name")
	private String usfName;

	@Column(name="usf_nrodoc")
	private String usfNrodoc;

	@Column(name="usf_parentesco")
	private String usfParentesco;

	@Column(name="usf_sexo")
	private String usfSexo;

	@Column(name="usf_status")
	private String usfStatus;

	@Column(name="usf_tipodoc")
	private String usfTipodoc;

	public SecUsersFamiliare() {
	}

	public int getUsfCode() {
		return this.usfCode;
	}

	public void setUsfCode(int usfCode) {
		this.usfCode = usfCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public String getUsfCuil() {
		return this.usfCuil;
	}

	public void setUsfCuil(String usfCuil) {
		this.usfCuil = usfCuil;
	}

	public Date getUsfFecnac() {
		return this.usfFecnac;
	}

	public void setUsfFecnac(Date usfFecnac) {
		this.usfFecnac = usfFecnac;
	}

	public String getUsfName() {
		return this.usfName;
	}

	public void setUsfName(String usfName) {
		this.usfName = usfName;
	}

	public String getUsfNrodoc() {
		return this.usfNrodoc;
	}

	public void setUsfNrodoc(String usfNrodoc) {
		this.usfNrodoc = usfNrodoc;
	}

	public String getUsfParentesco() {
		return this.usfParentesco;
	}

	public void setUsfParentesco(String usfParentesco) {
		this.usfParentesco = usfParentesco;
	}

	public String getUsfSexo() {
		return this.usfSexo;
	}

	public void setUsfSexo(String usfSexo) {
		this.usfSexo = usfSexo;
	}

	public String getUsfStatus() {
		return this.usfStatus;
	}

	public void setUsfStatus(String usfStatus) {
		this.usfStatus = usfStatus;
	}

	public String getUsfTipodoc() {
		return this.usfTipodoc;
	}

	public void setUsfTipodoc(String usfTipodoc) {
		this.usfTipodoc = usfTipodoc;
	}

}