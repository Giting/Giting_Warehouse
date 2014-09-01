package com.giting.entities.table;

import java.sql.Timestamp;

/**
 * SmCommunityusers entity. @author MyEclipse Persistence Tools
 */

public class SmCommunityusers implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pkId;
	private BfAcommunity bfAcommunity;
	private SmUser smUser;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;

	// Constructors

	/** default constructor */
	public SmCommunityusers() {
	}

	/** minimal constructor */
	public SmCommunityusers(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public SmCommunityusers(String pkId, BfAcommunity bfAcommunity,
			SmUser smUser, Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime) {
		this.pkId = pkId;
		this.bfAcommunity = bfAcommunity;
		this.smUser = smUser;
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

	public BfAcommunity getBfAcommunity() {
		return this.bfAcommunity;
	}

	public void setBfAcommunity(BfAcommunity bfAcommunity) {
		this.bfAcommunity = bfAcommunity;
	}

	public SmUser getSmUser() {
		return this.smUser;
	}

	public void setSmUser(SmUser smUser) {
		this.smUser = smUser;
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