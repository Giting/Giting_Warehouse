package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * PmgmBranch entity. @author MyEclipse Persistence Tools
 */

public class PmgmBranch implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	private Set pmgmParties = new HashSet(0);
	private Set pmgmBranchactivitieses = new HashSet(0);

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
			Set pmgmParties, Set pmgmBranchactivitieses) {
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

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public String getDaBranchNumber() {
		return this.daBranchNumber;
	}

	public void setDaBranchNumber(String daBranchNumber) {
		this.daBranchNumber = daBranchNumber;
	}

	public String getDaBranchName() {
		return this.daBranchName;
	}

	public void setDaBranchName(String daBranchName) {
		this.daBranchName = daBranchName;
	}

	public String getDaSecretary() {
		return this.daSecretary;
	}

	public void setDaSecretary(String daSecretary) {
		this.daSecretary = daSecretary;
	}

	public String getDaMembers() {
		return this.daMembers;
	}

	public void setDaMembers(String daMembers) {
		this.daMembers = daMembers;
	}

	public Integer getDaParty() {
		return this.daParty;
	}

	public void setDaParty(Integer daParty) {
		this.daParty = daParty;
	}

	public Integer getDaActivists() {
		return this.daActivists;
	}

	public void setDaActivists(Integer daActivists) {
		this.daActivists = daActivists;
	}

	public String getDaRemark() {
		return this.daRemark;
	}

	public void setDaRemark(String daRemark) {
		this.daRemark = daRemark;
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

	public Set getPmgmParties() {
		return this.pmgmParties;
	}

	public void setPmgmParties(Set pmgmParties) {
		this.pmgmParties = pmgmParties;
	}

	public Set getPmgmBranchactivitieses() {
		return this.pmgmBranchactivitieses;
	}

	public void setPmgmBranchactivitieses(Set pmgmBranchactivitieses) {
		this.pmgmBranchactivitieses = pmgmBranchactivitieses;
	}

}