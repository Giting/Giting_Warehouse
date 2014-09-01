package com.giting.entities.table;

import java.sql.Timestamp;

/**
 * BeDictionarydata entity. @author MyEclipse Persistence Tools
 */

public class BeDictionarydata implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String pkId;
	private BeDictionaryclass beDictionaryclass;
	private String dictdataName;
	private String dictdataValue;
	private Boolean isFixed;
	private Boolean isCancle;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;

	// Constructors

	/** default constructor */
	public BeDictionarydata() {
	}

	/** minimal constructor */
	public BeDictionarydata(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public BeDictionarydata(String pkId, BeDictionaryclass beDictionaryclass,
			String dictdataName, String dictdataValue, Boolean isFixed,
			Boolean isCancle, Boolean isDelete, Timestamp dtDate,
			Integer rkOrder, Timestamp ctTime) {
		this.pkId = pkId;
		this.beDictionaryclass = beDictionaryclass;
		this.dictdataName = dictdataName;
		this.dictdataValue = dictdataValue;
		this.isFixed = isFixed;
		this.isCancle = isCancle;
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

	public BeDictionaryclass getBeDictionaryclass() {
		return this.beDictionaryclass;
	}

	public void setBeDictionaryclass(BeDictionaryclass beDictionaryclass) {
		this.beDictionaryclass = beDictionaryclass;
	}

	public String getDictdataName() {
		return this.dictdataName;
	}

	public void setDictdataName(String dictdataName) {
		this.dictdataName = dictdataName;
	}

	public String getDictdataValue() {
		return this.dictdataValue;
	}

	public void setDictdataValue(String dictdataValue) {
		this.dictdataValue = dictdataValue;
	}

	public Boolean getIsFixed() {
		return this.isFixed;
	}

	public void setIsFixed(Boolean isFixed) {
		this.isFixed = isFixed;
	}

	public Boolean getIsCancle() {
		return this.isCancle;
	}

	public void setIsCancle(Boolean isCancle) {
		this.isCancle = isCancle;
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