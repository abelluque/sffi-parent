package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the oci_tipo_ingreso database table.
 * 
 */
// @Entity
// @Table(name="oci_tipo_ingreso")
@NamedQuery(name="OciTipoIngreso.findAll", query="SELECT o FROM OciTipoIngreso o")
public class OciTipoIngreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="oti_code")
	private int otiCode;

	@Column(name="oti_acta_asociada")
	private String otiActaAsociada;

	@Column(name="oti_activo")
	private String otiActivo;

	@Column(name="oti_descripcion")
	private String otiDescripcion;

	@Column(name="oti_genera_denuncia")
	private String otiGeneraDenuncia;

	@Column(name="oti_rel_documento")
	private String otiRelDocumento;

	@Column(name="oti_sel_fza_pol")
	private String otiSelFzaPol;

	@Column(name="oti_texto")
	private String otiTexto;

	@Column(name="oti_texto_egreso")
	private String otiTextoEgreso;

	@Column(name="oti_texto_persona")
	private String otiTextoPersona;

	@Column(name="oti_tiempo_maximo")
	private int otiTiempoMaximo;

	@Column(name="oti_titulo")
	private String otiTitulo;

	//bi-directional many-to-many association to OciTipoArchEntrada
	@ManyToMany(mappedBy="ociTipoIngresos")
	private List<OciTipoArchEntrada> ociTipoArchEntradas;

	//bi-directional many-to-many association to OciTipoArchSalida
	@ManyToMany(mappedBy="ociTipoIngresos")
	private List<OciTipoArchSalida> ociTipoArchSalidas;

	public OciTipoIngreso() {
	}

	public int getOtiCode() {
		return this.otiCode;
	}

	public void setOtiCode(int otiCode) {
		this.otiCode = otiCode;
	}

	public String getOtiActaAsociada() {
		return this.otiActaAsociada;
	}

	public void setOtiActaAsociada(String otiActaAsociada) {
		this.otiActaAsociada = otiActaAsociada;
	}

	public String getOtiActivo() {
		return this.otiActivo;
	}

	public void setOtiActivo(String otiActivo) {
		this.otiActivo = otiActivo;
	}

	public String getOtiDescripcion() {
		return this.otiDescripcion;
	}

	public void setOtiDescripcion(String otiDescripcion) {
		this.otiDescripcion = otiDescripcion;
	}

	public String getOtiGeneraDenuncia() {
		return this.otiGeneraDenuncia;
	}

	public void setOtiGeneraDenuncia(String otiGeneraDenuncia) {
		this.otiGeneraDenuncia = otiGeneraDenuncia;
	}

	public String getOtiRelDocumento() {
		return this.otiRelDocumento;
	}

	public void setOtiRelDocumento(String otiRelDocumento) {
		this.otiRelDocumento = otiRelDocumento;
	}

	public String getOtiSelFzaPol() {
		return this.otiSelFzaPol;
	}

	public void setOtiSelFzaPol(String otiSelFzaPol) {
		this.otiSelFzaPol = otiSelFzaPol;
	}

	public String getOtiTexto() {
		return this.otiTexto;
	}

	public void setOtiTexto(String otiTexto) {
		this.otiTexto = otiTexto;
	}

	public String getOtiTextoEgreso() {
		return this.otiTextoEgreso;
	}

	public void setOtiTextoEgreso(String otiTextoEgreso) {
		this.otiTextoEgreso = otiTextoEgreso;
	}

	public String getOtiTextoPersona() {
		return this.otiTextoPersona;
	}

	public void setOtiTextoPersona(String otiTextoPersona) {
		this.otiTextoPersona = otiTextoPersona;
	}

	public int getOtiTiempoMaximo() {
		return this.otiTiempoMaximo;
	}

	public void setOtiTiempoMaximo(int otiTiempoMaximo) {
		this.otiTiempoMaximo = otiTiempoMaximo;
	}

	public String getOtiTitulo() {
		return this.otiTitulo;
	}

	public void setOtiTitulo(String otiTitulo) {
		this.otiTitulo = otiTitulo;
	}

	public List<OciTipoArchEntrada> getOciTipoArchEntradas() {
		return this.ociTipoArchEntradas;
	}

	public void setOciTipoArchEntradas(List<OciTipoArchEntrada> ociTipoArchEntradas) {
		this.ociTipoArchEntradas = ociTipoArchEntradas;
	}

	public List<OciTipoArchSalida> getOciTipoArchSalidas() {
		return this.ociTipoArchSalidas;
	}

	public void setOciTipoArchSalidas(List<OciTipoArchSalida> ociTipoArchSalidas) {
		this.ociTipoArchSalidas = ociTipoArchSalidas;
	}

}