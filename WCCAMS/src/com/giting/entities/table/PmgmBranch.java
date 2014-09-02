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
 * PmgmBranch entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pmgm_branch", catalog = "wccams")
public class PmgmBranch implements java.io.Serializable {

	// Fields

	private String pkId;
	private String daBranchNumber;
	private String daBranchName;
	private String daSecretary;
	private String daMembers;
	private Integer daParty;
	private Integer daActivists;
	private String daRemark;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set<PmgmParty> pmgmParties = new HashSet<PmgmParty>(0);
	private Set<PmgmBranchactivities> pmgmBranchactivitieses = new HashSet<PmgmBranchactivities>(
			0);

	// Constructors

	/** default constructor */
	public PmgmBranch() {
	}

	/** minimal constructor */
	public PmgmBranch(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public PmgmBranch(String pkId, String daBranchNumber, String daBranchName,
			String daSecretary, String daMembers, Integer daParty,
			Integer daActivists, String daRemark, Boolean isDelete,
			Timestamp dtDate, Integer rkOrder, Timestamp ctTime,
			Set<PmgmParty> pmgmParties,
			Set<PmgmBranchactivities> pmgmBranchactivitieses) {
		this.pkId = pkId;
		this.daBranchNumber = daBranchNumber;
		this.daBranchName = daBranchName;
		this.daSecretary = daSecretary;
		this.daMembers = daMembers;
		this.daParty = daParty;
		this.daActivists = daActivists;
		this.daRemark = daRemark;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.pmgmParties = pmgmParties;
		this.pmgmBranchactivitieses = pmgmBranchactivitieses;
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

	@Column(name = "da_BranchNumber", length = 30)
	public String getDaBranchNumber() {
		return this.daBranchNumber;
	}

	public void setDaBranchNumber(String daBranchNumber) {
		this.daBranchNumber = daBranchNumber;
	}

	@Column(name = "da_BranchName", length = 50)
	public String getDaBranchName() {
		return this.daBranchName;
	}

	public void setDaBranchName(String daBranchName) {
		this.daBranchName = daBranchName;
	}

	@Column(name = "da_Secretary", length = 20)
	public String getDaSecretary() {
		return this.daSecretary;
	}

	public void setDaSecretary(String daSecretary) {
		this.daSecretary = daSecretary;
	}

	@Column(name = "da_Members", length = 20)
	public String getDaMembers() {
		return this.daMembers;
	}

	public void setDaMembers(String daMembers) {
		this.daMembers = daMembers;
	}

	@Column(name = "da_Party")
	public Integer getDaParty() {
		return this.daParty;
	}

	public void setDaParty(Integer daParty) {
		this.daParty = daParty;
	}

	@Column(name = "da_Activists")
	public Integer getDaActivists() {
		return this.daActivists;
	}

	public void setDaActivists(Integer daActivists) {
		this.daActivists = daActivists;
	}

	@Column(name = "da_Remark", length = 300)
	public String getDaRemark() {
		return this.daRemark;
	}

	public void setDaRemark(String daRemark) {
		this.daRemark = daRemark;
	}

	@Column(name = "is_Delete")
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pmgmBranch")
	public Set<PmgmParty> getPmgmParties() {
		return this.pmgmParties;
	}

	public void setPmgmParties(Set<PmgmParty> pmgmParties) {
		this.pmgmParties = pmgmParties;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pmgmBranch")
	public Set<PmgmBranchactivities> getPmgmBranchactivitieses() {
		return this.pmgmBranchactivitieses;
	}

	public void setPmgmBranchactivitieses(
			Set<PmgmBranchactivities> pmgmBranchactivitieses) {
		this.pmgmBranchactivitieses = pmgmBranchactivitieses;
	}

}