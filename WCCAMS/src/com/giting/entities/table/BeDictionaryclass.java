package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * BeDictionaryclass entity. @author MyEclipse Persistence Tools
 */

public class BeDictionaryclass implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pkId;
	private String dictClassname;
	private String dictClassvalue;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set beDictionarydatas = new HashSet(0);

	// Constructors

	/** default constructor */
	public BeDictionaryclass() {
	}

	/** minimal constructor */
	public BeDictionaryclass(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public BeDictionaryclass(String pkId, String dictClassname,
			String dictClassvalue, Boolean isDelete, Timestamp dtDate,
			Integer rkOrder, Timestamp ctTime, Set beDictionarydatas) {
		this.pkId = pkId;
		this.dictClassname = dictClassname;
		this.dictClassvalue = dictClassvalue;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.beDictionarydatas = beDictionarydatas;
	}

	// Property accessors

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public String getDictClassname() {
		return this.dictClassname;
	}

	public void setDictClassname(String dictClassname) {
		this.dictClassname = dictClassname;
	}

	public String getDictClassvalue() {
		return this.dictClassvalue;
	}

	public void setDictClassvalue(String dictClassvalue) {
		this.dictClassvalue = dictClassvalue;
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

	public Set getBeDictionarydatas() {
		return this.beDictionarydatas;
	}

	public void setBeDictionarydatas(Set beDictionarydatas) {
		this.beDictionarydatas = beDictionarydatas;
	}

}