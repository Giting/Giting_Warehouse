package com.giting.entities.table;

import java.sql.Timestamp;

/**
 * SmElectronicrecord entity. @author MyEclipse Persistence Tools
 */

public class SmElectronicrecord implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public SmErstorage getSmErstorage() {
		return this.smErstorage;
	}

	public void setSmErstorage(SmErstorage smErstorage) {
		this.smErstorage = smErstorage;
	}

	public String getDaTablename() {
		return this.daTablename;
	}

	public void setDaTablename(String daTablename) {
		this.daTablename = daTablename;
	}

	public String getFkTableId() {
		return this.fkTableId;
	}

	public void setFkTableId(String fkTableId) {
		this.fkTableId = fkTableId;
	}

	public String getDaFilename() {
		return this.daFilename;
	}

	public void setDaFilename(String daFilename) {
		this.daFilename = daFilename;
	}

	public String getDaFilesuffixes() {
		return this.daFilesuffixes;
	}

	public void setDaFilesuffixes(String daFilesuffixes) {
		this.daFilesuffixes = daFilesuffixes;
	}

	public Double getDaFilesize() {
		return this.daFilesize;
	}

	public void setDaFilesize(Double daFilesize) {
		this.daFilesize = daFilesize;
	}

	public String getFkAccessTypeId() {
		return this.fkAccessTypeId;
	}

	public void setFkAccessTypeId(String fkAccessTypeId) {
		this.fkAccessTypeId = fkAccessTypeId;
	}

	public Boolean getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	public Timestamp getDtDate() {
		return this.dtDate;
	}

	public void setDtDate(Timestamp dtDate) {
		this.dtDate = dtDate;
	}

	public Integer getRkOrder() {
		return this.rkOrder;
	}

	public void setRkOrder(Integer rkOrder) {
		this.rkOrder = rkOrder;
	}

	public Timestamp getCtTime() {
		return this.ctTime;
	}

	public void setCtTime(Timestamp ctTime) {
		this.ctTime = ctTime;
	}

}