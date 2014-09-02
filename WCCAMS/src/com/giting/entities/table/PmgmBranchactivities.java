package com.giting.entities.table;

import java.sql.Timestamp;

/**
 * 党支部活动表
 */

public class PmgmBranchactivities implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pkId;
	private PmgmBranch pmgmBranch;
	private BfAcommunity bfAcommunity;
	private String daActivitiesNumber;
	private String daActivitiesName;
	private String daActivitiesContent;
	private Integer daParticipants;
	private String fkActivityTypeId;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;

	// Constructors

	/** default constructor */
	public PmgmBranchactivities() {
	}

	/** minimal constructor */
	public PmgmBranchactivities(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public PmgmBranchactivities(String pkId, PmgmBranch pmgmBranch,
			BfAcommunity bfAcommunity, String daActivitiesNumber,
			String daActivitiesName, String daActivitiesContent,
			Integer daParticipants, String fkActivityTypeId, Boolean isDelete,
			Timestamp dtDate, Integer rkOrder, Timestamp ctTime) {
		this.pkId = pkId;
		this.pmgmBranch = pmgmBranch;
		this.bfAcommunity = bfAcommunity;
		this.daActivitiesNumber = daActivitiesNumber;
		this.daActivitiesName = daActivitiesName;
		this.daActivitiesContent = daActivitiesContent;
		this.daParticipants = daParticipants;
		this.fkActivityTypeId = fkActivityTypeId;
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

	public PmgmBranch getPmgmBranch() {
		return this.pmgmBranch;
	}

	public void setPmgmBranch(PmgmBranch pmgmBranch) {
		this.pmgmBranch = pmgmBranch;
	}

	public BfAcommunity getBfAcommunity() {
		return this.bfAcommunity;
	}

	public void setBfAcommunity(BfAcommunity bfAcommunity) {
		this.bfAcommunity = bfAcommunity;
	}

	public String getDaActivitiesNumber() {
		return this.daActivitiesNumber;
	}

	public void setDaActivitiesNumber(String daActivitiesNumber) {
		this.daActivitiesNumber = daActivitiesNumber;
	}

	public String getDaActivitiesName() {
		return this.daActivitiesName;
	}

	public void setDaActivitiesName(String daActivitiesName) {
		this.daActivitiesName = daActivitiesName;
	}

	public String getDaActivitiesContent() {
		return this.daActivitiesContent;
	}

	public void setDaActivitiesContent(String daActivitiesContent) {
		this.daActivitiesContent = daActivitiesContent;
	}

	public Integer getDaParticipants() {
		return this.daParticipants;
	}

	public void setDaParticipants(Integer daParticipants) {
		this.daParticipants = daParticipants;
	}

	public String getFkActivityTypeId() {
		return this.fkActivityTypeId;
	}

	public void setFkActivityTypeId(String fkActivityTypeId) {
		this.fkActivityTypeId = fkActivityTypeId;
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