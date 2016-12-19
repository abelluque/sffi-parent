package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ori_orientaciones database table.
 * 
 */
// @Entity
// @Table(name="ori_orientaciones")
@NamedQuery(name="OriOrientacione.findAll", query="SELECT o FROM OriOrientacione o")
public class OriOrientacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ori_code")
	private int oriCode;

	@Column(name="ode_code")
	private int odeCode;

	@Column(name="oin_code")
	private int oinCode;

	@Column(name="ori_denuncia")
	private String oriDenuncia;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ori_fechahora")
	private Date oriFechahora;

	@Column(name="ori_motivo")
	private String oriMotivo;

	@Column(name="ori_ofavit")
	private String oriOfavit;

	@Column(name="ori_operador")
	private String oriOperador;

	@Column(name="ori_origen")
	private String oriOrigen;

	@Column(name="ori_seguimiento_cerrado")
	private String oriSeguimientoCerrado;

	@Column(name="osv_code")
	private int osvCode;

	@Column(name="oun_code")
	private int ounCode;

	@Column(name="ovo_code")
	private int ovoCode;

	@Column(name="pco_code")
	private int pcoCode;

	@Column(name="pdo_code")
	private int pdoCode;

	@Column(name="per_code")
	private int perCode;

	public OriOrientacione() {
	}

	public int getOriCode() {
		return this.oriCode;
	}

	public void setOriCode(int oriCode) {
		this.oriCode = oriCode;
	}

	public int getOdeCode() {
		return this.odeCode;
	}

	public void setOdeCode(int odeCode) {
		this.odeCode = odeCode;
	}

	public int getOinCode() {
		return this.oinCode;
	}

	public void setOinCode(int oinCode) {
		this.oinCode = oinCode;
	}

	public String getOriDenuncia() {
		return this.oriDenuncia;
	}

	public void setOriDenuncia(String oriDenuncia) {
		this.oriDenuncia = oriDenuncia;
	}

	public Date getOriFechahora() {
		return this.oriFechahora;
	}

	public void setOriFechahora(Date oriFechahora) {
		this.oriFechahora = oriFechahora;
	}

	public String getOriMotivo() {
		return this.oriMotivo;
	}

	public void setOriMotivo(String oriMotivo) {
		this.oriMotivo = oriMotivo;
	}

	public String getOriOfavit() {
		return this.oriOfavit;
	}

	public void setOriOfavit(String oriOfavit) {
		this.oriOfavit = oriOfavit;
	}

	public String getOriOperador() {
		return this.oriOperador;
	}

	public void setOriOperador(String oriOperador) {
		this.oriOperador = oriOperador;
	}

	public String getOriOrigen() {
		return this.oriOrigen;
	}

	public void setOriOrigen(String oriOrigen) {
		this.oriOrigen = oriOrigen;
	}

	public String getOriSeguimientoCerrado() {
		return this.oriSeguimientoCerrado;
	}

	public void setOriSeguimientoCerrado(String oriSeguimientoCerrado) {
		this.oriSeguimientoCerrado = oriSeguimientoCerrado;
	}

	public int getOsvCode() {
		return this.osvCode;
	}

	public void setOsvCode(int osvCode) {
		this.osvCode = osvCode;
	}

	public int getOunCode() {
		return this.ounCode;
	}

	public void setOunCode(int ounCode) {
		this.ounCode = ounCode;
	}

	public int getOvoCode() {
		return this.ovoCode;
	}

	public void setOvoCode(int ovoCode) {
		this.ovoCode = ovoCode;
	}

	public int getPcoCode() {
		return this.pcoCode;
	}

	public void setPcoCode(int pcoCode) {
		this.pcoCode = pcoCode;
	}

	public int getPdoCode() {
		return this.pdoCode;
	}

	public void setPdoCode(int pdoCode) {
		this.pdoCode = pdoCode;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

}