package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ef_flujo_excepciones database table.
 * 
 */
// @Entity
// @Table(name="ef_flujo_excepciones")
@NamedQuery(name="EfFlujoExcepcione.findAll", query="SELECT e FROM EfFlujoExcepcione e")
public class EfFlujoExcepcione implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EfFlujoExcepcionePK id;

	@Column(name="contador_salteo")
	private int contadorSalteo;

	public EfFlujoExcepcione() {
	}

	public EfFlujoExcepcionePK getId() {
		return this.id;
	}

	public void setId(EfFlujoExcepcionePK id) {
		this.id = id;
	}

	public int getContadorSalteo() {
		return this.contadorSalteo;
	}

	public void setContadorSalteo(int contadorSalteo) {
		this.contadorSalteo = contadorSalteo;
	}

}