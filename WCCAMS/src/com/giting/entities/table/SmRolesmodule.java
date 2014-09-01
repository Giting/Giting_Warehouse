package com.giting.entities.table;

import java.sql.Timestamp;

/**
 * SmRolesmodule entity. @author MyEclipse Persistence Tools
 */

public class SmRolesmodule implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pkId;
	private SmModule smModule;
	private SmRole smRole;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;

	// Constructors

	/** default constructor */
	public SmRolesmodule() {
	}

	/** minimal constructor */
	public SmRolesmodule(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public SmRolesmodule(String pkId, SmModule smModule, SmRole smRole,
			Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime) {
		this.pkId = pkId;
		this.smModule = smModule;
		this.smRole = smRole;
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

	public SmModule getSmModule() {
		return this.smModule;
	}

	public void setSmModule(SmModule smModule) {
		this.smModule = smModule;
	}

	public SmRole getSmRole() {
		return this.smRole;
	}

	public void setSmRole(SmRole smRole) {
		this.smRole = smRole;
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