package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_documentos_actores database table.
 * 
 */
// @Entity
// @Table(name="docum_documentos_actores")
@NamedQuery(name="DocumDocumentosActore.findAll", query="SELECT d FROM DocumDocumentosActore d")
public class DocumDocumentosActore implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocumDocumentosActorePK id;

	@Column(name="ddrp_estado")
	private String ddrpEstado;

	@Column(name="ddrp_rol")
	private String ddrpRol;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ddrp_tstamp")
	private Date ddrpTstamp;

	@Column(name="estado_presunto")
	private String estadoPresunto;

	@Column(name="per_code")
	private int perCode;

	@Column(name="use_code")
	private int useCode;

	public DocumDocumentosActore() {
	}

	public DocumDocumentosActorePK getId() {
		return this.id;
	}

	public void setId(DocumDocumentosActorePK id) {
		this.id = id;
	}

	public String getDdrpEstado() {
		return this.ddrpEstado;
	}

	public void setDdrpEstado(String ddrpEstado) {
		this.ddrpEstado = ddrpEstado;
	}

	public String getDdrpRol() {
		return this.ddrpRol;
	}

	public void setDdrpRol(String ddrpRol) {
		this.ddrpRol = ddrpRol;
	}

	public Date getDdrpTstamp() {
		return this.ddrpTstamp;
	}

	public void setDdrpTstamp(Date ddrpTstamp) {
		this.ddrpTstamp = ddrpTstamp;
	}

	public String getEstadoPresunto() {
		return this.estadoPresunto;
	}

	public void setEstadoPresunto(String estadoPresunto) {
		this.estadoPresunto = estadoPresunto;
	}

	public int getPerCode() {
		return this.perCode;
	}

	public void setPerCode(int perCode) {
		this.perCode = perCode;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

}