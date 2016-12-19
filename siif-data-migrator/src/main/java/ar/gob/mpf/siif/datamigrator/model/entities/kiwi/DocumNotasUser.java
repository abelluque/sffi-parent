package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the docum_notas_users database table.
 * 
 */
// @Entity
// @Table(name="docum_notas_users")
@NamedQuery(name="DocumNotasUser.findAll", query="SELECT d FROM DocumNotasUser d")
public class DocumNotasUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocumNotasUserPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dnu_fecha_ult_actualizacion")
	private Date dnuFechaUltActualizacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dnu_fecha_ult_lectura")
	private Date dnuFechaUltLectura;

	public DocumNotasUser() {
	}

	public DocumNotasUserPK getId() {
		return this.id;
	}

	public void setId(DocumNotasUserPK id) {
		this.id = id;
	}

	public Date getDnuFechaUltActualizacion() {
		return this.dnuFechaUltActualizacion;
	}

	public void setDnuFechaUltActualizacion(Date dnuFechaUltActualizacion) {
		this.dnuFechaUltActualizacion = dnuFechaUltActualizacion;
	}

	public Date getDnuFechaUltLectura() {
		return this.dnuFechaUltLectura;
	}

	public void setDnuFechaUltLectura(Date dnuFechaUltLectura) {
		this.dnuFechaUltLectura = dnuFechaUltLectura;
	}

}