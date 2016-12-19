package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the den_cuestionarios_preguntas database table.
 * 
 */
// @Entity
// @Table(name="den_cuestionarios_preguntas")
@NamedQuery(name="DenCuestionariosPregunta.findAll", query="SELECT d FROM DenCuestionariosPregunta d")
public class DenCuestionariosPregunta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dcp_code")
	private int dcpCode;

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

	@Column(name="dcu_code")
	private int dcuCode;

	public DenCuestionariosPregunta() {
	}

	public int getDcpCode() {
		return this.dcpCode;
	}

	public void setDcpCode(int dcpCode) {
		this.dcpCode = dcpCode;
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

	public int getDcuCode() {
		return this.dcuCode;
	}

	public void setDcuCode(int dcuCode) {
		this.dcuCode = dcuCode;
	}

}