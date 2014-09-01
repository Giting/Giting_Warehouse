package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * SmUser entity. @author MyEclipse Persistence Tools
 */

public class SmUser implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pkId;
	private SmEmployees smEmployees;
	private SmRole smRole;
	private String daUserNumber;
	private String daLoginName;
	private String daPwd;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set smCommunityuserses = new HashSet(0);
	private Set smAnnouncements = new HashSet(0);

	// Constructors

	/** default constructor */
	public SmUser() {
	}

	/** minimal constructor */
	public SmUser(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public SmUser(String pkId, SmEmployees smEmployees, SmRole smRole,
			String daUserNumber, String daLoginName, String daPwd,
			Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime, Set smCommunityuserses, Set smAnnouncements) {
		this.pkId = pkId;
		this.smEmployees = smEmployees;
		this.smRole = smRole;
		this.daUserNumber = daUserNumber;
		this.daLoginName = daLoginName;
		this.daPwd = daPwd;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.smCommunityuserses = smCommunityuserses;
		this.smAnnouncements = smAnnouncements;
	}

	// Property accessors

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public SmEmployees getSmEmployees() {
		return this.smEmployees;
	}

	public void setSmEmployees(SmEmployees smEmployees) {
		this.smEmployees = smEmployees;
	}

	public SmRole getSmRole() {
		return this.smRole;
	}

	public void setSmRole(SmRole smRole) {
		this.smRole = smRole;
	}

	public String getDaUserNumber() {
		return this.daUserNumber;
	}

	public void setDaUserNumber(String daUserNumber) {
		this.daUserNumber = daUserNumber;
	}

	public String getDaLoginName() {
		return this.daLoginName;
	}

	public void setDaLoginName(String daLoginName) {
		this.daLoginName = daLoginName;
	}

	public String getDaPwd() {
		return this.daPwd;
	}

	public void setDaPwd(String daPwd) {
		this.daPwd = daPwd;
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

	public Set getSmCommunityuserses() {
		return this.smCommunityuserses;
	}

	public void setSmCommunityuserses(Set smCommunityuserses) {
		this.smCommunityuserses = smCommunityuserses;
	}

	public Set getSmAnnouncements() {
		return this.smAnnouncements;
	}

	public void setSmAnnouncements(Set smAnnouncements) {
		this.smAnnouncements = smAnnouncements;
	}

}