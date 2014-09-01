package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * SmRole entity. @author MyEclipse Persistence Tools
 */

public class SmRole implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pkId;
	private String daRoleNumber;
	private String daRoleName;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set smRolesmodules = new HashSet(0);
	private Set smUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public SmRole() {
	}

	/** minimal constructor */
	public SmRole(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public SmRole(String pkId, String daRoleNumber, String daRoleName,
			Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime, Set smRolesmodules, Set smUsers) {
		this.pkId = pkId;
		this.daRoleNumber = daRoleNumber;
		this.daRoleName = daRoleName;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.smRolesmodules = smRolesmodules;
		this.smUsers = smUsers;
	}

	// Property accessors

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public String getDaRoleNumber() {
		return this.daRoleNumber;
	}

	public void setDaRoleNumber(String daRoleNumber) {
		this.daRoleNumber = daRoleNumber;
	}

	public String getDaRoleName() {
		return this.daRoleName;
	}

	public void setDaRoleName(String daRoleName) {
		this.daRoleName = daRoleName;
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

	public Set getSmRolesmodules() {
		return this.smRolesmodules;
	}

	public void setSmRolesmodules(Set smRolesmodules) {
		this.smRolesmodules = smRolesmodules;
	}

	public Set getSmUsers() {
		return this.smUsers;
	}

	public void setSmUsers(Set smUsers) {
		this.smUsers = smUsers;
	}

}