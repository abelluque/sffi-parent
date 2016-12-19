package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utc_remisiones_remitos_legajos database table.
 * 
 */
// @Entity
// @Table(name="utc_remisiones_remitos_legajos")
@NamedQuery(name="UtcRemisionesRemitosLegajo.findAll", query="SELECT u FROM UtcRemisionesRemitosLegajo u")
public class UtcRemisionesRemitosLegajo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="url_code")
	private int urlCode;

	@Column(name="doc_code")
	private String docCode;

	@Column(name="doc_nro_juscaba")
	private String docNroJuscaba;

	@Column(name="url_anio")
	private String urlAnio;

	@Column(name="url_caratula")
	private String urlCaratula;

	@Column(name="url_estado")
	private String urlEstado;

	@Column(name="url_fojas_desde")
	private String urlFojasDesde;

	@Column(name="url_fojas_hasta")
	private String urlFojasHasta;

	@Column(name="url_fundamentacion")
	private String urlFundamentacion;

	@Column(name="url_numero")
	private String urlNumero;

	@Column(name="url_observaciones")
	private String urlObservaciones;

	@Column(name="urr_code")
	private int urrCode;

	public UtcRemisionesRemitosLegajo() {
	}

	public int getUrlCode() {
		return this.urlCode;
	}

	public void setUrlCode(int urlCode) {
		this.urlCode = urlCode;
	}

	public String getDocCode() {
		return this.docCode;
	}

	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}

	public String getDocNroJuscaba() {
		return this.docNroJuscaba;
	}

	public void setDocNroJuscaba(String docNroJuscaba) {
		this.docNroJuscaba = docNroJuscaba;
	}

	public String getUrlAnio() {
		return this.urlAnio;
	}

	public void setUrlAnio(String urlAnio) {
		this.urlAnio = urlAnio;
	}

	public String getUrlCaratula() {
		return this.urlCaratula;
	}

	public void setUrlCaratula(String urlCaratula) {
		this.urlCaratula = urlCaratula;
	}

	public String getUrlEstado() {
		return this.urlEstado;
	}

	public void setUrlEstado(String urlEstado) {
		this.urlEstado = urlEstado;
	}

	public String getUrlFojasDesde() {
		return this.urlFojasDesde;
	}

	public void setUrlFojasDesde(String urlFojasDesde) {
		this.urlFojasDesde = urlFojasDesde;
	}

	public String getUrlFojasHasta() {
		return this.urlFojasHasta;
	}

	public void setUrlFojasHasta(String urlFojasHasta) {
		this.urlFojasHasta = urlFojasHasta;
	}

	public String getUrlFundamentacion() {
		return this.urlFundamentacion;
	}

	public void setUrlFundamentacion(String urlFundamentacion) {
		this.urlFundamentacion = urlFundamentacion;
	}

	public String getUrlNumero() {
		return this.urlNumero;
	}

	public void setUrlNumero(String urlNumero) {
		this.urlNumero = urlNumero;
	}

	public String getUrlObservaciones() {
		return this.urlObservaciones;
	}

	public void setUrlObservaciones(String urlObservaciones) {
		this.urlObservaciones = urlObservaciones;
	}

	public int getUrrCode() {
		return this.urrCode;
	}

	public void setUrrCode(int urrCode) {
		this.urrCode = urrCode;
	}

}