package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

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
	private int canDelete;

	@Column(name="can_read")
	private int canRead;

	@Column(name="can_write")
	private int canWrite;

	@Column(name="ugr_code")
	private int ugrCode;

	@Column(name="use_code")
	private int useCode;

	public SecAcl() {
	}

	public int getAclCode() {
		return this.aclCode;
	}

	public void setAclCode(int aclCode) {
		this.aclCode = aclCode;
	}

	public int getCanDelete() {
		return this.canDelete;
	}

	public void setCanDelete(int canDelete) {
		this.canDelete = canDelete;
	}

	public int getCanRead() {
		return this.canRead;
	}

	public void setCanRead(int canRead) {
		this.canRead = canRead;
	}

	public int getCanWrite() {
		return this.canWrite;
	}

	public void setCanWrite(int canWrite) {
		this.canWrite = canWrite;
	}

	public int getUgrCode() {
		return this.ugrCode;
	}

	public void setUgrCode(int ugrCode) {
		this.ugrCode = ugrCode;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}