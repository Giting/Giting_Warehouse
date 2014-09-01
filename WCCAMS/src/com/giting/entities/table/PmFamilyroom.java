package com.giting.entities.table;

import java.sql.Timestamp;

/**
 * PmFamilyroom entity. @author MyEclipse Persistence Tools
 */

public class PmFamilyroom implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pkId;
	private BfRoom bfRoom;
	private PmFamily pmFamily;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;

	// Constructors

	/** default constructor */
	public PmFamilyroom() {
	}

	/** minimal constructor */
	public PmFamilyroom(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public PmFamilyroom(String pkId, BfRoom bfRoom, PmFamily pmFamily,
			Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime) {
		this.pkId = pkId;
		this.bfRoom = bfRoom;
		this.pmFamily = pmFamily;
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

	public BfRoom getBfRoom() {
		return this.bfRoom;
	}

	public void setBfRoom(BfRoom bfRoom) {
		this.bfRoom = bfRoom;
	}

	public PmFamily getPmFamily() {
		return this.pmFamily;
	}

	public void setPmFamily(PmFamily pmFamily) {
		this.pmFamily = pmFamily;
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