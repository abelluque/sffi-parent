package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the cat_value_list database table.
 * 
 */
@Entity
@Table(name = "cat_value_list", schema = "mpfusers")
@NamedQuery(name = "CatValueList.findAll", query = "SELECT c FROM CatValueList c")
public class CatValueList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "vli_code")
	private String vliCode;

	@Column(name = "vli_name")
	private String vliName;

	//bi-directional many-to-one association to CatValue
	@OneToMany(mappedBy = "catValueList")
	private List<CatValue> catValues;

	public CatValueList() {
	}

	/**
	 * Constructor a utilizar con lo obtenido de la tabla
	 * �mpfusers.cat_value_list�.
	 * 
	 * @param dbRow
	 */
	public CatValueList(Object[] dbRow) {
		super();
		this.vliCode = dbRow[0].toString();
		this.vliName = dbRow[1].toString();
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