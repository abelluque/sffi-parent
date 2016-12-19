package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tsj_dictamenes_control_calidad database table.
 * 
 */
// @Entity
// @Table(name="tsj_dictamenes_control_calidad")
@NamedQuery(name="TsjDictamenesControlCalidad.findAll", query="SELECT t FROM TsjDictamenesControlCalidad t")
public class TsjDictamenesControlCalidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="exc_code")
	private int excCode;

	@Column(name="dcc_cita_dictamenes")
	private String dccCitaDictamenes;

	@Column(name="dcc_cita_doctrina")
	private String dccCitaDoctrina;

	@Column(name="dcc_cita_jurisprudencia")
	private String dccCitaJurisprudencia;

	@Column(name="dcc_cita_tsj")
	private String dccCitaTsj;

	@Column(name="dcc_citas_legales")
	private String dccCitasLegales;

	@Lob
	@Column(name="dcc_comentario")
	private String dccComentario;

	@Column(name="dcc_cumplimiento_plazo_interno")
	private String dccCumplimientoPlazoInterno;

	@Column(name="dcc_cumplimiento_plazo_legal")
	private String dccCumplimientoPlazoLegal;

	@Column(name="dcc_dias_habiles_empleados")
	private int dccDiasHabilesEmpleados;

	@Column(name="dcc_estado")
	private String dccEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dcc_fecha")
	private Date dccFecha;

	@Temporal(TemporalType.DATE)
	@Column(name="dcc_fecha_devolucion_tsj")
	private Date dccFechaDevolucionTsj;

	@Column(name="dcc_relato_hechos")
	private String dccRelatoHechos;

	@Column(name="dcc_remision_publicacion")
	private String dccRemisionPublicacion;

	@Column(name="exc_dependencia")
	private int excDependencia;

	@Column(name="exc_dictamen_anio")
	private int excDictamenAnio;

	@Column(name="exc_dictamen_nro")
	private int excDictamenNro;

	@Column(name="exc_firmante_mpf")
	private String excFirmanteMpf;

	@Column(name="exi_code")
	private int exiCode;

	@Column(name="exp_code")
	private int expCode;

	@Column(name="use_code")
	private int useCode;

	public TsjDictamenesControlCalidad() {
	}

	public int getExcCode() {
		return this.excCode;
	}

	public void setExcCode(int excCode) {
		this.excCode = excCode;
	}

	public String getDccCitaDictamenes() {
		return this.dccCitaDictamenes;
	}

	public void setDccCitaDictamenes(String dccCitaDictamenes) {
		this.dccCitaDictamenes = dccCitaDictamenes;
	}

	public String getDccCitaDoctrina() {
		return this.dccCitaDoctrina;
	}

	public void setDccCitaDoctrina(String dccCitaDoctrina) {
		this.dccCitaDoctrina = dccCitaDoctrina;
	}

	public String getDccCitaJurisprudencia() {
		return this.dccCitaJurisprudencia;
	}

	public void setDccCitaJurisprudencia(String dccCitaJurisprudencia) {
		this.dccCitaJurisprudencia = dccCitaJurisprudencia;
	}

	public String getDccCitaTsj() {
		return this.dccCitaTsj;
	}

	public void setDccCitaTsj(String dccCitaTsj) {
		this.dccCitaTsj = dccCitaTsj;
	}

	public String getDccCitasLegales() {
		return this.dccCitasLegales;
	}

	public void setDccCitasLegales(String dccCitasLegales) {
		this.dccCitasLegales = dccCitasLegales;
	}

	public String getDccComentario() {
		return this.dccComentario;
	}

	public void setDccComentario(String dccComentario) {
		this.dccComentario = dccComentario;
	}

	public String getDccCumplimientoPlazoInterno() {
		return this.dccCumplimientoPlazoInterno;
	}

	public void setDccCumplimientoPlazoInterno(String dccCumplimientoPlazoInterno) {
		this.dccCumplimientoPlazoInterno = dccCumplimientoPlazoInterno;
	}

	public String getDccCumplimientoPlazoLegal() {
		return this.dccCumplimientoPlazoLegal;
	}

	public void setDccCumplimientoPlazoLegal(String dccCumplimientoPlazoLegal) {
		this.dccCumplimientoPlazoLegal = dccCumplimientoPlazoLegal;
	}

	public int getDccDiasHabilesEmpleados() {
		return this.dccDiasHabilesEmpleados;
	}

	public void setDccDiasHabilesEmpleados(int dccDiasHabilesEmpleados) {
		this.dccDiasHabilesEmpleados = dccDiasHabilesEmpleados;
	}

	public String getDccEstado() {
		return this.dccEstado;
	}

	public void setDccEstado(String dccEstado) {
		this.dccEstado = dccEstado;
	}

	public Date getDccFecha() {
		return this.dccFecha;
	}

	public void setDccFecha(Date dccFecha) {
		this.dccFecha = dccFecha;
	}

	public Date getDccFechaDevolucionTsj() {
		return this.dccFechaDevolucionTsj;
	}

	public void setDccFechaDevolucionTsj(Date dccFechaDevolucionTsj) {
		this.dccFechaDevolucionTsj = dccFechaDevolucionTsj;
	}

	public String getDccRelatoHechos() {
		return this.dccRelatoHechos;
	}

	public void setDccRelatoHechos(String dccRelatoHechos) {
		this.dccRelatoHechos = dccRelatoHechos;
	}

	public String getDccRemisionPublicacion() {
		return this.dccRemisionPublicacion;
	}

	public void setDccRemisionPublicacion(String dccRemisionPublicacion) {
		this.dccRemisionPublicacion = dccRemisionPublicacion;
	}

	public int getExcDependencia() {
		return this.excDependencia;
	}

	public void setExcDependencia(int excDependencia) {
		this.excDependencia = excDependencia;
	}

	public int getExcDictamenAnio() {
		return this.excDictamenAnio;
	}

	public void setExcDictamenAnio(int excDictamenAnio) {
		this.excDictamenAnio = excDictamenAnio;
	}

	public int getExcDictamenNro() {
		return this.excDictamenNro;
	}

	public void setExcDictamenNro(int excDictamenNro) {
		this.excDictamenNro = excDictamenNro;
	}

	public String getExcFirmanteMpf() {
		return this.excFirmanteMpf;
	}

	public void setExcFirmanteMpf(String excFirmanteMpf) {
		this.excFirmanteMpf = excFirmanteMpf;
	}

	public int getExiCode() {
		return this.exiCode;
	}

	public void setExiCode(int exiCode) {
		this.exiCode = exiCode;
	}

	public int getExpCode() {
		return this.expCode;
	}

	public void setExpCode(int expCode) {
		this.expCode = expCode;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}