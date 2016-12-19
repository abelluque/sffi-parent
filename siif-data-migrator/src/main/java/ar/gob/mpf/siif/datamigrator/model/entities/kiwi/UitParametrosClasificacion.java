package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the uit_parametros_clasificacion database table.
 * 
 */
// @Entity
// @Table(name="uit_parametros_clasificacion")
@NamedQuery(name="UitParametrosClasificacion.findAll", query="SELECT u FROM UitParametrosClasificacion u")
public class UitParametrosClasificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="upc_clave")
	private String upcClave;

	@Column(name="upc_aal_codigo_unica")
	private int upcAalCodigoUnica;

	@Lob
	@Column(name="upc_asignacion_php_general")
	private String upcAsignacionPhpGeneral;

	@Lob
	@Column(name="upc_asignacion_php_opcion")
	private String upcAsignacionPhpOpcion;

	@Lob
	@Column(name="upc_condicion_js")
	private String upcCondicionJs;

	@Lob
	@Column(name="upc_condicion_php")
	private String upcCondicionPhp;

	@Lob
	@Column(name="upc_descripcion")
	private String upcDescripcion;

	@Lob
	@Column(name="upc_descripcion_alerta")
	private String upcDescripcionAlerta;

	@Column(name="upc_dest_code_unica")
	private int upcDestCodeUnica;

	@Column(name="upc_estado")
	private String upcEstado;

	@Column(name="upc_grupo")
	private String upcGrupo;

	@Column(name="upc_nombre")
	private String upcNombre;

	@Column(name="upc_orden")
	private String upcOrden;

	@Column(name="upc_tipo_opciones")
	private String upcTipoOpciones;

	public UitParametrosClasificacion() {
	}

	public String getUpcClave() {
		return this.upcClave;
	}

	public void setUpcClave(String upcClave) {
		this.upcClave = upcClave;
	}

	public int getUpcAalCodigoUnica() {
		return this.upcAalCodigoUnica;
	}

	public void setUpcAalCodigoUnica(int upcAalCodigoUnica) {
		this.upcAalCodigoUnica = upcAalCodigoUnica;
	}

	public String getUpcAsignacionPhpGeneral() {
		return this.upcAsignacionPhpGeneral;
	}

	public void setUpcAsignacionPhpGeneral(String upcAsignacionPhpGeneral) {
		this.upcAsignacionPhpGeneral = upcAsignacionPhpGeneral;
	}

	public String getUpcAsignacionPhpOpcion() {
		return this.upcAsignacionPhpOpcion;
	}

	public void setUpcAsignacionPhpOpcion(String upcAsignacionPhpOpcion) {
		this.upcAsignacionPhpOpcion = upcAsignacionPhpOpcion;
	}

	public String getUpcCondicionJs() {
		return this.upcCondicionJs;
	}

	public void setUpcCondicionJs(String upcCondicionJs) {
		this.upcCondicionJs = upcCondicionJs;
	}

	public String getUpcCondicionPhp() {
		return this.upcCondicionPhp;
	}

	public void setUpcCondicionPhp(String upcCondicionPhp) {
		this.upcCondicionPhp = upcCondicionPhp;
	}

	public String getUpcDescripcion() {
		return this.upcDescripcion;
	}

	public void setUpcDescripcion(String upcDescripcion) {
		this.upcDescripcion = upcDescripcion;
	}

	public String getUpcDescripcionAlerta() {
		return this.upcDescripcionAlerta;
	}

	public void setUpcDescripcionAlerta(String upcDescripcionAlerta) {
		this.upcDescripcionAlerta = upcDescripcionAlerta;
	}

	public int getUpcDestCodeUnica() {
		return this.upcDestCodeUnica;
	}

	public void setUpcDestCodeUnica(int upcDestCodeUnica) {
		this.upcDestCodeUnica = upcDestCodeUnica;
	}

	public String getUpcEstado() {
		return this.upcEstado;
	}

	public void setUpcEstado(String upcEstado) {
		this.upcEstado = upcEstado;
	}

	public String getUpcGrupo() {
		return this.upcGrupo;
	}

	public void setUpcGrupo(String upcGrupo) {
		this.upcGrupo = upcGrupo;
	}

	public String getUpcNombre() {
		return this.upcNombre;
	}

	public void setUpcNombre(String upcNombre) {
		this.upcNombre = upcNombre;
	}

	public String getUpcOrden() {
		return this.upcOrden;
	}

	public void setUpcOrden(String upcOrden) {
		this.upcOrden = upcOrden;
	}

	public String getUpcTipoOpciones() {
		return this.upcTipoOpciones;
	}

	public void setUpcTipoOpciones(String upcTipoOpciones) {
		this.upcTipoOpciones = upcTipoOpciones;
	}

}