package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cat_value_list database table.
 * 
 */
// @Entity
// @Table(name="cat_value_list")
@NamedQuery(name="CatValueList.findAll", query="SELECT c FROM CatValueList c")
public class CatValueList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="vli_code")
	private String vliCode;

	@Column(name="vli_name")
	private String vliName;

	//bi-directional many-to-one association to CatValue
	@OneToMany(mappedBy="catValueList")
	private List<CatValue> catValues;

	public CatValueList() {
	}
	
	/**
	 * Constructor a utilizar con lo obtenido de la DB Kiwi.cat_value_list.
	 * @param vliCode
	 * @param vliName
	 * @param catValues
	 */
	public CatValueList(String dbRow) {
		super();
		this.vliCode = dbRow.substring(0, 1);
		this.vliName = dbRow.substring(2);
	}



	public String getVliCode() {
		return this.vliCode;
	}

	public void setVliCode(String vliCode) {
		this.vliCode = vliCode;
	}

	public String getVliName() {
		return this.vliName;
	}

	public void setVliName(String vliName) {
		this.vliName = vliName;
	}

	public List<CatValue> getCatValues() {
		return this.catValues;
	}

	public void setCatValues(List<CatValue> catValues) {
		this.catValues = catValues;
	}

	public CatValue addCatValue(CatValue catValue) {
		getCatValues().add(catValue);
		catValue.setCatValueList(this);

		return catValue;
	}

	public CatValue removeCatValue(CatValue catValue) {
		getCatValues().remove(catValue);
		catValue.setCatValueList(null);

		return catValue;
	}

}