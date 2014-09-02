package com.giting.entities.table;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SmElectronicrecord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sm_electronicrecord", catalog = "wccams")
public class SmElectronicrecord implements java.io.Serializable {

	// Fields

	private String pkId;
	private SmErstorage smErstorage;
	private String daTablename;
	private String fkTableId;
	private String daFilename;
	private String daFilesuffixes;
	private Double daFilesize;
	private String fkAccessTypeId;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;

	// Constructors

	/** default constructor */
	public SmElectronicrecord() {
	}

	/** minimal constructor */
	public SmElectronicrecord(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public SmElectronicrecord(String pkId, SmErstorage smErstorage,
			String daTablename, String fkTableId, String daFilename,
			String daFilesuffixes, Double daFilesize, String fkAccessTypeId,
			Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime) {
		this.pkId = pkId;
		this.smErstorage = smErstorage;
		this.daTablename = daTablename;
		this.fkTableId = fkTableId;
		this.daFilename = daFilename;
		this.daFilesuffixes = daFilesuffixes;
		this.daFilesize = daFilesize;
		this.fkAccessTypeId = fkAccessTypeId;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
	}

	// Property accessors
	@Id
	@Column(name = "pk_Id", unique = true, nullable = false, length = 36)
	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_ERStorage_id")
	public SmErstorage getSmErstorage() {
		return this.smErstorage;
	}

	public void setSmErstorage(SmErstorage smErstorage) {
		this.smErstorage = smErstorage;
	}

	@Column(name = "da_Tablename", length = 50)
	public String getDaTablename() {
		return this.daTablename;
	}

	public void setDaTablename(String daTablename) {
		this.daTablename = daTablename;
	}

	@Column(name = "fk_Table_id", length = 36)
	public String getFkTableId() {
		return this.fkTableId;
	}

	public void setFkTableId(String fkTableId) {
		this.fkTableId = fkTableId;
	}

	@Column(name = "da_Filename", length = 100)
	public String getDaFilename() {
		return this.daFilename;
	}

	public void setDaFilename(String daFilename) {
		this.daFilename = daFilename;
	}

	@Column(name = "da_Filesuffixes", length = 50)
	public String getDaFilesuffixes() {
		return this.daFilesuffixes;
	}

	public void setDaFilesuffixes(String daFilesuffixes) {
		this.daFilesuffixes = daFilesuffixes;
	}

	@Column(name = "da_Filesize", precision = 40)
	public Double getDaFilesize() {
		return this.daFilesize;
	}

	public void setDaFilesize(Double daFilesize) {
		this.daFilesize = daFilesize;
	}

	@Column(name = "fk_AccessType_id", length = 36)
	public String getFkAccessTypeId() {
		return this.fkAccessTypeId;
	}

	public void setFkAccessTypeId(String fkAccessTypeId) {
		this.fkAccessTypeId = fkAccessTypeId;
	}

	@Column(name = "is_Delete")
	public Boolean getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	@Column(name = "dt_Date", nullable = false, length = 19)
	public Timestamp getDtDate() {
		return this.dtDate;
	}

	public void setDtDate(Timestamp dtDate) {
		this.dtDate = dtDate;
	}

	@Column(name = "rk_Order")
	public Integer getRkOrder() {
		return this.rkOrder;
	}

	public void setRkOrder(Integer rkOrder) {
		this.rkOrder = rkOrder;
	}

	@Column(name = "ct_Time", nullable = false, length = 19)
	public Timestamp getCtTime() {
		return this.ctTime;
	}

	public void setCtTime(Timestamp ctTime) {
		this.ctTime = ctTime;
	}

}