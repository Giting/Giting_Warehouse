package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * BfAcommunity entity. @author MyEclipse Persistence Tools
 */

public class BfAcommunity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String pkId;
	private String daAcommunity;
	private String daName;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set pmgmBranchactivitieses = new HashSet(0);
	private Set bfCommunities = new HashSet(0);
	private Set smCommunityuserses = new HashSet(0);

	// Constructors

	/** default constructor */
	public BfAcommunity() {
	}

	/** minimal constructor */
	public BfAcommunity(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public BfAcommunity(String pkId, String daAcommunity, String daName,
			Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime, Set pmgmBranchactivitieses, Set bfCommunities,
			Set smCommunityuserses) {
		this.pkId = pkId;
		this.daAcommunity = daAcommunity;
		this.daName = daName;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.pmgmBranchactivitieses = pmgmBranchactivitieses;
		this.bfCommunities = bfCommunities;
		this.smCommunityuserses = smCommunityuserses;
	}

	// Property accessors

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public String getDaAcommunity() {
		return this.daAcommunity;
	}

	public void setDaAcommunity(String daAcommunity) {
		this.daAcommunity = daAcommunity;
	}

	public String getDaName() {
		return this.daName;
	}

	public void setDaName(String daName) {
		this.daName = daName;
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

	public Set getPmgmBranchactivitieses() {
		return this.pmgmBranchactivitieses;
	}

	public void setPmgmBranchactivitieses(Set pmgmBranchactivitieses) {
		this.pmgmBranchactivitieses = pmgmBranchactivitieses;
	}

	public Set getBfCommunities() {
		return this.bfCommunities;
	}

	public void setBfCommunities(Set bfCommunities) {
		this.bfCommunities = bfCommunities;
	}

	public Set getSmCommunityuserses() {
		return this.smCommunityuserses;
	}

	public void setSmCommunityuserses(Set smCommunityuserses) {
		this.smCommunityuserses = smCommunityuserses;
	}

}