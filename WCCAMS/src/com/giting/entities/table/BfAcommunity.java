package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BfAcommunity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "bf_acommunity", catalog = "wccams")
public class BfAcommunity implements java.io.Serializable {

	// Fields

	private String pkId;
	private String daAcommunity;
	private String daName;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set<PmgmBranchactivities> pmgmBranchactivitieses = new HashSet<PmgmBranchactivities>(
			0);
	private Set<BfCommunity> bfCommunities = new HashSet<BfCommunity>(0);
	private Set<SmCommunityusers> smCommunityuserses = new HashSet<SmCommunityusers>(
			0);

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
			Timestamp ctTime, Set<PmgmBranchactivities> pmgmBranchactivitieses,
			Set<BfCommunity> bfCommunities,
			Set<SmCommunityusers> smCommunityuserses) {
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
	@Id
	@Column(name = "pk_Id", unique = true, nullable = false, length = 36)
	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	@Column(name = "da_Acommunity", length = 50)
	public String getDaAcommunity() {
		return this.daAcommunity;
	}

	public void setDaAcommunity(String daAcommunity) {
		this.daAcommunity = daAcommunity;
	}

	@Column(name = "da_Name", length = 50)
	public String getDaName() {
		return this.daName;
	}

	public void setDaName(String daName) {
		this.daName = daName;
	}

	@Column(name = "is_delete")
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bfAcommunity")
	public Set<PmgmBranchactivities> getPmgmBranchactivitieses() {
		return this.pmgmBranchactivitieses;
	}

	public void setPmgmBranchactivitieses(
			Set<PmgmBranchactivities> pmgmBranchactivitieses) {
		this.pmgmBranchactivitieses = pmgmBranchactivitieses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bfAcommunity")
	public Set<BfCommunity> getBfCommunities() {
		return this.bfCommunities;
	}

	public void setBfCommunities(Set<BfCommunity> bfCommunities) {
		this.bfCommunities = bfCommunities;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bfAcommunity")
	public Set<SmCommunityusers> getSmCommunityuserses() {
		return this.smCommunityuserses;
	}

	public void setSmCommunityuserses(Set<SmCommunityusers> smCommunityuserses) {
		this.smCommunityuserses = smCommunityuserses;
	}

}