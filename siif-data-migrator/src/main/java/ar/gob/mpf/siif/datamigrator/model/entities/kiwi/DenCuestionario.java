package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the den_cuestionarios database table.
 * 
 */
// @Entity
// @Table(name="den_cuestionarios")
@NamedQuery(name="DenCuestionario.findAll", query="SELECT d FROM DenCuestionario d")
public class DenCuestionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dcu_code")
	private int dcuCode;

	@Lob
	@Column(name="dcu_condicion_js")
	private String dcuCondicionJs;

	@Lob
	@Column(name="dcu_condicion_php")
	private String dcuCondicionPhp;

	@Column(name="dcu_estado")
	private String dcuEstado;

	@Column(name="dcu_nombre")
	private String dcuNombre;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dcu_tstamp")
	private Date dcuTstamp;

	@Column(name="use_code")
	private String useCode;

	public DenCuestionario() {
	}

	public int getDcuCode() {
		return this.dcuCode;
	}

	public void setDcuCode(int dcuCode) {
		this.dcuCode = dcuCode;
	}

	public String getDcuCondicionJs() {
		return this.dcuCondicionJs;
	}

	public void setDcuCondicionJs(String dcuCondicionJs) {
		this.dcuCondicionJs = dcuCondicionJs;
	}

	public String getDcuCondicionPhp() {
		return this.dcuCondicionPhp;
	}

	public void setDcuCondicionPhp(String dcuCondicionPhp) {
		this.dcuCondicionPhp = dcuCondicionPhp;
	}

	public String getDcuEstado() {
		return this.dcuEstado;
	}

	public void setDcuEstado(String dcuEstado) {
		this.dcuEstado = dcuEstado;
	}

	public String getDcuNombre() {
		return this.dcuNombre;
	}

	public void setDcuNombre(String dcuNombre) {
		this.dcuNombre = dcuNombre;
	}

	public Date getDcuTstamp() {
		return this.dcuTstamp;
	}

	public void setDcuTstamp(Date dcuTstamp) {
		this.dcuTstamp = dcuTstamp;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}