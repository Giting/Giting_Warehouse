package com.giting.entities.table;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PmgmBranchactivities entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pmgm_branchactivities", catalog = "wccams")
public class PmgmBranchactivities implements java.io.Serializable {

	// Fields

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
	@Id
	@Column(name = "pk_Id", unique = true, nullable = false, length = 36)
	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_Branch_id")
	public PmgmBranch getPmgmBranch() {
		return this.pmgmBranch;
	}

	public void setPmgmBranch(PmgmBranch pmgmBranch) {
		this.pmgmBranch = pmgmBranch;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_Acommunity_id")
	public BfAcommunity getBfAcommunity() {
		return this.bfAcommunity;
	}

	public void setBfAcommunity(BfAcommunity bfAcommunity) {
		this.bfAcommunity = bfAcommunity;
	}

	@Column(name = "da_ActivitiesNumber", length = 30)
	public String getDaActivitiesNumber() {
		return this.daActivitiesNumber;
	}

	public void setDaActivitiesNumber(String daActivitiesNumber) {
		this.daActivitiesNumber = daActivitiesNumber;
	}

	@Column(name = "da_ActivitiesName", length = 30)
	public String getDaActivitiesName() {
		return this.daActivitiesName;
	}

	public void setDaActivitiesName(String daActivitiesName) {
		this.daActivitiesName = daActivitiesName;
	}

	@Column(name = "da_ActivitiesContent", length = 300)
	public String getDaActivitiesContent() {
		return this.daActivitiesContent;
	}

	public void setDaActivitiesContent(String daActivitiesContent) {
		this.daActivitiesContent = daActivitiesContent;
	}

	@Column(name = "da_Participants")
	public Integer getDaParticipants() {
		return this.daParticipants;
	}

	public void setDaParticipants(Integer daParticipants) {
		this.daParticipants = daParticipants;
	}

	@Column(name = "fk_ActivityType_id", length = 36)
	public String getFkActivityTypeId() {
		return this.fkActivityTypeId;
	}

	public void setFkActivityTypeId(String fkActivityTypeId) {
		this.fkActivityTypeId = fkActivityTypeId;
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

}