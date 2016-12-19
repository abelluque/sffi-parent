package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sec_sequence database table.
 * 
 */
// @Entity
// @Table(name="sec_sequence")
@NamedQuery(name="SecSequence.findAll", query="SELECT s FROM SecSequence s")
public class SecSequence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="seq_object")
	private String seqObject;

	@Column(name="seq_code")
	private int seqCode;

	public SecSequence() {
	}

	public String getSeqObject() {
		return this.seqObject;
	}

	public void setSeqObject(String seqObject) {
		this.seqObject = seqObject;
	}

	public int getSeqCode() {
		return this.seqCode;
	}

	public void setSeqCode(int seqCode) {
		this.seqCode = seqCode;
	}

}