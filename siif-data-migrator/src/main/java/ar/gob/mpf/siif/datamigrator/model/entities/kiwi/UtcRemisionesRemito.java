package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the utc_remisiones_remitos database table.
 * 
 */
// @Entity
// @Table(name="utc_remisiones_remitos")
@NamedQuery(name="UtcRemisionesRemito.findAll", query="SELECT u FROM UtcRemisionesRemito u")
public class UtcRemisionesRemito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="urr_code")
	private int urrCode;

	@Column(name="udd_code")
	private int uddCode;

	@Column(name="udu_code")
	private int uduCode;

	@Column(name="urr_dep_destino")
	private String urrDepDestino;

	@Column(name="urr_estado")
	private String urrEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="urr_fecha")
	private Date urrFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="urr_fecha_remision")
	private Date urrFechaRemision;

	@Column(name="urr_tipo_vencimiento")
	private String urrTipoVencimiento;

	@Column(name="urr_utc")
	private int urrUtc;

	@Column(name="use_code")
	private String useCode;

	public UtcRemisionesRemito() {
	}

	public int getUrrCode() {
		return this.urrCode;
	}

	public void setUrrCode(int urrCode) {
		this.urrCode = urrCode;
	}

	public int getUddCode() {
		return this.uddCode;
	}

	public void setUddCode(int uddCode) {
		this.uddCode = uddCode;
	}

	public int getUduCode() {
		return this.uduCode;
	}

	public void setUduCode(int uduCode) {
		this.uduCode = uduCode;
	}

	public String getUrrDepDestino() {
		return this.urrDepDestino;
	}

	public void setUrrDepDestino(String urrDepDestino) {
		this.urrDepDestino = urrDepDestino;
	}

	public String getUrrEstado() {
		return this.urrEstado;
	}

	public void setUrrEstado(String urrEstado) {
		this.urrEstado = urrEstado;
	}

	public Date getUrrFecha() {
		return this.urrFecha;
	}

	public void setUrrFecha(Date urrFecha) {
		this.urrFecha = urrFecha;
	}

	public Date getUrrFechaRemision() {
		return this.urrFechaRemision;
	}

	public void setUrrFechaRemision(Date urrFechaRemision) {
		this.urrFechaRemision = urrFechaRemision;
	}

	public String getUrrTipoVencimiento() {
		return this.urrTipoVencimiento;
	}

	public void setUrrTipoVencimiento(String urrTipoVencimiento) {
		this.urrTipoVencimiento = urrTipoVencimiento;
	}

	public int getUrrUtc() {
		return this.urrUtc;
	}

	public void setUrrUtc(int urrUtc) {
		this.urrUtc = urrUtc;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}