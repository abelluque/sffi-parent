package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sec_acl database table.
 * 
 */
// @Entity
// @Table(name="sec_acl")
@NamedQuery(name="SecAcl.findAll", query="SELECT s FROM SecAcl s")
public class SecAcl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="acl_code")
	private int aclCode;

	@Column(name="can_delete")
	private String canDelete;

	@Column(name="can_read")
	private String canRead;

	@Column(name="can_write")
	private String canWrite;

	@Column(name="ugr_code")
	private String ugrCode;

	@Column(name="use_code")
	private String useCode;

	public SecAcl() {
	}

	public int getAclCode() {
		return this.aclCode;
	}

	public void setAclCode(int aclCode) {
		this.aclCode = aclCode;
	}

	public String getCanDelete() {
		return this.canDelete;
	}

	public void setCanDelete(String canDelete) {
		this.canDelete = canDelete;
	}

	public String getCanRead() {
		return this.canRead;
	}

	public void setCanRead(String canRead) {
		this.canRead = canRead;
	}

	public String getCanWrite() {
		return this.canWrite;
	}

	public void setCanWrite(String canWrite) {
		this.canWrite = canWrite;
	}

	public String getUgrCode() {
		return this.ugrCode;
	}

	public void setUgrCode(String ugrCode) {
		this.ugrCode = ugrCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}