package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cij_diligencias_informes database table.
 * 
 */
// @Entity
// @Table(name="cij_diligencias_informes")
@NamedQuery(name="CijDiligenciasInforme.findAll", query="SELECT c FROM CijDiligenciasInforme c")
public class CijDiligenciasInforme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cin_code")
	private int cinCode;

	@Column(name="aal_codigo")
	private int aalCodigo;

	@Column(name="cid_code")
	private int cidCode;

	@Column(name="cii_code")
	private int ciiCode;

	@Column(name="cin_estado")
	private String cinEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cin_fecha")
	private Date cinFecha;

	@Column(name="cin_inventario")
	private int cinInventario;

	@Column(name="cin_observacion")
	private String cinObservacion;

	@Column(name="cin_soporte")
	private String cinSoporte;

	@Column(name="cin_ubicacion")
	private String cinUbicacion;

	@Column(name="cti_code")
	private int ctiCode;

	@Column(name="doc_storage")
	private String docStorage;

	@Column(name="use_code")
	private String useCode;

	public CijDiligenciasInforme() {
	}

	public int getCinCode() {
		return this.cinCode;
	}

	public void setCinCode(int cinCode) {
		this.cinCode = cinCode;
	}

	public int getAalCodigo() {
		return this.aalCodigo;
	}

	public void setAalCodigo(int aalCodigo) {
		this.aalCodigo = aalCodigo;
	}

	public int getCidCode() {
		return this.cidCode;
	}

	public void setCidCode(int cidCode) {
		this.cidCode = cidCode;
	}

	public int getCiiCode() {
		return this.ciiCode;
	}

	public void setCiiCode(int ciiCode) {
		this.ciiCode = ciiCode;
	}

	public String getCinEstado() {
		return this.cinEstado;
	}

	public void setCinEstado(String cinEstado) {
		this.cinEstado = cinEstado;
	}

	public Date getCinFecha() {
		return this.cinFecha;
	}

	public void setCinFecha(Date cinFecha) {
		this.cinFecha = cinFecha;
	}

	public int getCinInventario() {
		return this.cinInventario;
	}

	public void setCinInventario(int cinInventario) {
		this.cinInventario = cinInventario;
	}

	public String getCinObservacion() {
		return this.cinObservacion;
	}

	public void setCinObservacion(String cinObservacion) {
		this.cinObservacion = cinObservacion;
	}

	public String getCinSoporte() {
		return this.cinSoporte;
	}

	public void setCinSoporte(String cinSoporte) {
		this.cinSoporte = cinSoporte;
	}

	public String getCinUbicacion() {
		return this.cinUbicacion;
	}

	public void setCinUbicacion(String cinUbicacion) {
		this.cinUbicacion = cinUbicacion;
	}

	public int getCtiCode() {
		return this.ctiCode;
	}

	public void setCtiCode(int ctiCode) {
		this.ctiCode = ctiCode;
	}

	public String getDocStorage() {
		return this.docStorage;
	}

	public void setDocStorage(String docStorage) {
		this.docStorage = docStorage;
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

}