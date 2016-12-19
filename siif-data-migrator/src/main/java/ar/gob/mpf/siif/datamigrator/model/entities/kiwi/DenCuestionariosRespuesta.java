package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the den_cuestionarios_respuestas database table.
 * 
 */
// @Entity
// @Table(name="den_cuestionarios_respuestas")
@NamedQuery(name="DenCuestionariosRespuesta.findAll", query="SELECT d FROM DenCuestionariosRespuesta d")
public class DenCuestionariosRespuesta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dcr_code")
	private int dcrCode;

	@Column(name="dcp_callback")
	private String dcpCallback;

	@Column(name="dcp_obligatoria")
	private String dcpObligatoria;

	@Column(name="dcp_orden")
	private int dcpOrden;

	@Column(name="dcp_pregunta")
	private String dcpPregunta;

	@Column(name="dcp_seccion")
	private String dcpSeccion;

	@Column(name="dcp_tipo")
	private String dcpTipo;

	@Lob
	@Column(name="dcr_respuesta")
	private String dcrRespuesta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dcr_tstamp")
	private Date dcrTstamp;

	@Column(name="dcu_code")
	private int dcuCode;

	@Column(name="dcu_nombre")
	private String dcuNombre;

	@Column(name="dden_code")
	private int ddenCode;

	@Column(name="use_code")
	private String useCode;

	public DenCuestionariosRespuesta() {
	}

	public int getDcrCode() {
		return this.dcrCode;
	}

	public void setDcrCode(int dcrCode) {
		this.dcrCode = dcrCode;
	}

	public String getDcpCallback() {
		return this.dcpCallback;
	}

	public void setDcpCallback(String dcpCallback) {
		this.dcpCallback = dcpCallback;
	}

	public String getDcpObligatoria() {
		return this.dcpObligatoria;
	}

	public void setDcpObligatoria(String dcpObligatoria) {
		this.dcpObligatoria = dcpObligatoria;
	}

	public int getDcpOrden() {
		return this.dcpOrden;
	}

	public void setDcpOrden(int dcpOrden) {
		this.dcpOrden = dcpOrden;
	}

	public String getDcpPregunta() {
		return this.dcpPregunta;
	}

	public void setDcpPregunta(String dcpPregunta) {
		this.dcpPregunta = dcpPregunta;
	}

	public String getDcpSeccion() {
		return this.dcpSeccion;
	}

	public void setDcpSeccion(String dcpSeccion) {
		this.dcpSeccion = dcpSeccion;
	}

	public String getDcpTipo() {
		return this.dcpTipo;
	}

	public void setDcpTipo(String dcpTipo) {
		this.dcpTipo = dcpTipo;
	}

	public String getDcrRespuesta() {
		return this.dcrRespuesta;
	}

	public void setDcrRespuesta(String dcrRespuesta) {
		this.dcrRespuesta = dcrRespuesta;
	}

	public Date getDcrTstamp() {
		return this.dcrTstamp;
	}

	public void setDcrTstamp(Date dcrTstamp) {
		this.dcrTstamp = dcrTstamp;
	}

	public int getDcuCode() {
		return this.dcuCode;
	}

	public void setDcuCode(int dcuCode) {
		this.dcuCode = dcuCode;
	}

	public String getDcuNombre() {
		return this.dcuNombre;
	}

	public void setDcuNombre(String dcuNombre) {
		this.dcuNombre = dcuNombre;
	}

	public int getDdenCode() {
		return this.ddenCode;
	}

	public void setDdenCode(int ddenCode) {
		this.ddenCode = ddenCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}