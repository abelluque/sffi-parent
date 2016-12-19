package ar.gob.mpf.siif.datamigrator.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.Gson;

@Entity
@Table(name = "Data_Import", schema = "siif")
public class DataImport implements Serializable {

	/**
	 * Default serial version.
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private Date creationDate;
	@Column
	private Date modificationDate;

	@Column
	private String dbName;
	@Column
	private String tableName;
	@Column
	private Long lastIdImported;
	@Column
	private String row;

	public DataImport() {
	}

	public DataImport(String databaseName, String table, Long lastIdImported, String row) {
		super();
		this.dbName = databaseName;
		this.tableName = table;
		this.lastIdImported = lastIdImported;

		this.row = new Gson().toJson(row);
		
		this.creationDate = new Date();
		this.modificationDate = new Date();
	}
	
	public DataImport(String databaseName, String table, Long lastIdImported, Object row) {
		super();
		this.dbName = databaseName;
		this.tableName = table;
		this.lastIdImported = lastIdImported;

		this.row = new Gson().toJson(row);
		
		this.creationDate = new Date();
		this.modificationDate = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDatabaseName() {
		return dbName;
	}

	public void setDatabaseName(String databaseName) {
		this.dbName = databaseName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String name) {
		this.tableName = name;
	}

	public Long getLastIdImported() {
		return lastIdImported;
	}

	public void setLastIdImported(Long lastIdImported) {
		this.lastIdImported = lastIdImported;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creation_date) {
		this.creationDate = creation_date;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modification_date) {
		this.modificationDate = modification_date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((dbName == null) ? 0 : dbName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastIdImported == null) ? 0 : lastIdImported.hashCode());
		result = prime * result + ((modificationDate == null) ? 0 : modificationDate.hashCode());
		result = prime * result + ((row == null) ? 0 : row.hashCode());
		result = prime * result + ((tableName == null) ? 0 : tableName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataImport other = (DataImport) obj;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (dbName == null) {
			if (other.dbName != null)
				return false;
		} else if (!dbName.equals(other.dbName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastIdImported == null) {
			if (other.lastIdImported != null)
				return false;
		} else if (!lastIdImported.equals(other.lastIdImported))
			return false;
		if (modificationDate == null) {
			if (other.modificationDate != null)
				return false;
		} else if (!modificationDate.equals(other.modificationDate))
			return false;
		if (row == null) {
			if (other.row != null)
				return false;
		} else if (!row.equals(other.row))
			return false;
		if (tableName == null) {
			if (other.tableName != null)
				return false;
		} else if (!tableName.equals(other.tableName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DataImport [id=" + id + ", creationDate=" + creationDate + ", modificationDate=" + modificationDate
				+ ", dbName=" + dbName + ", tableName=" + tableName + ", lastIdImported=" + lastIdImported + ", row="
				+ row + "]";
	}

}