package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the den_fiscal_turno database table.
 * 
 */
// @Entity
// @Table(name="den_fiscal_turno")
@NamedQuery(name="DenFiscalTurno.findAll", query="SELECT d FROM DenFiscalTurno d")
public class DenFiscalTurno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dfi_code")
	private int dfiCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="dfi_equipo_fiscal")
	private String dfiEquipoFiscal;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dfi_fecha_fin")
	private Date dfiFechaFin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dfi_fecha_inicio")
	private Date dfiFechaInicio;

	@Column(name="use_code")
	private int useCode;

	public DenFiscalTurno() {
	}

	public int getDfiCode() {
		return this.dfiCode;
	}

	public void setDfiCode(int dfiCode) {
		this.dfiCode = dfiCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public String getDfiEquipoFiscal() {
		return this.dfiEquipoFiscal;
	}

	public void setDfiEquipoFiscal(String dfiEquipoFiscal) {
		this.dfiEquipoFiscal = dfiEquipoFiscal;
	}

	public Date getDfiFechaFin() {
		return this.dfiFechaFin;
	}

	public void setDfiFechaFin(Date dfiFechaFin) {
		this.dfiFechaFin = dfiFechaFin;
	}

	public Date getDfiFechaInicio() {
		return this.dfiFechaInicio;
	}

	public void setDfiFechaInicio(Date dfiFechaInicio) {
		this.dfiFechaInicio = dfiFechaInicio;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}