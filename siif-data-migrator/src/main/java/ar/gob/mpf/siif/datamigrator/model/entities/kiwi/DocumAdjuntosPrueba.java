package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_adjuntos_pruebas database table.
 * 
 */
// @Entity
// @Table(name="docum_adjuntos_pruebas")
@NamedQuery(name="DocumAdjuntosPrueba.findAll", query="SELECT d FROM DocumAdjuntosPrueba d")
public class DocumAdjuntosPrueba implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dap_code")
	private int dapCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="cin_inventario")
	private int cinInventario;

	@Column(name="dap_estado")
	private String dapEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dap_fecha")
	private Date dapFecha;

	@Column(name="dap_observacion")
	private String dapObservacion;

	@Column(name="dap_soporte")
	private String dapSoporte;

	@Column(name="dap_texto")
	private String dapTexto;

	@Column(name="ddrp_rol")
	private String ddrpRol;

	@Column(name="doc_code")
	private int docCode;

	@Column(name="doc_storage")
	private String docStorage;

	@Column(name="dta_code")
	private int dtaCode;

	@Column(name="dtip_code")
	private String dtipCode;

	@Column(name="per_code")
	private int perCode;

	@Column(name="use_code")
	private String useCode;

	public DocumAdjuntosPrueba() {
	}

	public int getDapCode() {
		return this.dapCode;
	}

	public void setDapCode(int dapCode) {
		this.dapCode = dapCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getCinInventario() {
		return this.cinInventario;
	}

	public void setCinInventario(int cinInventario) {
		this.cinInventario = cinInventario;
	}

	public String getDapEstado() {
		return this.dapEstado;
	}

	public void setDapEstado(String dapEstado) {
		this.dapEstado = dapEstado;
	}

	public Date getDapFecha() {
		return this.dapFecha;
	}

	public void setDapFecha(Date dapFecha) {
		this.dapFecha = dapFecha;
	}

	public String getDapObservacion() {
		return this.dapObservacion;
	}

	public void setDapObservacion(String dapObservacion) {
		this.dapObservacion = dapObservacion;
	}

	public String getDapSoporte() {
		return this.dapSoporte;
	}

	public void setDapSoporte(String dapSoporte) {
		this.dapSoporte = dapSoporte;
	}

	public String getDapTexto() {
		return this.dapTexto;
	}

	public void setDapTexto(String dapTexto) {
		this.dapTexto = dapTexto;
	}

	public String getDdrpRol() {
		return this.ddrpRol;
	}

	public void setDdrpRol(String ddrpRol) {
		this.ddrpRol = ddrpRol;
	}

	public int getDocCode() {
		return this.docCode;
	}

	public void setDocCode(int docCode) {
		this.docCode = docCode;
	}

	public String getDocStorage() {
		return this.docStorage;
	}

	public void setDocStorage(String docStorage) {
		this.docStorage = docStorage;
	}

	public int getDtaCode() {
		return this.dtaCode;
	}

	public void setDtaCode(int dtaCode) {
		this.dtaCode = dtaCode;
	}

	public String getDtipCode() {
		return this.dtipCode;
	}

	public void setDtipCode(String dtipCode) {
		this.dtipCode = dtipCode;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}