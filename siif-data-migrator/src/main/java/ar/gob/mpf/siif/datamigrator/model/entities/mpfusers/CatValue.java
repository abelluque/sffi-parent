package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cat_value database table.
 * 
 */
 @Entity
 @Table(name="cat_value", schema = "mpfusers")
@NamedQuery(name="CatValue.findAll", query="SELECT c FROM CatValue c")
public class CatValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatValuePK id;

	@Column(name="cas_code")
	private String casCode;

	@Column(name="cas_value")
	private String casValue;

	@Column(name="val_order")
	private int valOrder;

	//bi-directional many-to-one association to CatValueList
	@ManyToOne
	@JoinColumn(name="vli_code", insertable=false, updatable=false) // Caused by: org.hibernate.MappingException: Repeated column in mapping for entity: ar.com.stack.siif.view.model.importer.entities.mpfusers.CatValue column: vli_code (should be mapped with insert="false" update="false")
	private CatValueList catValueList;

	public CatValue() {
	}

	public CatValuePK getId() {
		return this.id;
	}

	public void setId(CatValuePK id) {
		this.id = id;
	}

	public String getCasCode() {
		return this.casCode;
	}

	public void setCasCode(String casCode) {
		this.casCode = casCode;
	}

	public String getCasValue() {
		return this.casValue;
	}

	public void setCasValue(String casValue) {
		this.casValue = casValue;
	}

	public int getValOrder() {
		return this.valOrder;
	}

	public void setValOrder(int valOrder) {
		this.valOrder = valOrder;
	}

	public CatValueList getCatValueList() {
		return this.catValueList;
	}

	public void setCatValueList(CatValueList catValueList) {
		this.catValueList = catValueList;
	}

}