package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PmgmParty entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pmgm_party", catalog = "wccams")
public class PmgmParty implements java.io.Serializable {

	// Fields

	private String pkId;
	private PmgmBranch pmgmBranch;
	private PmPopulationinformation pmPopulationinformation;
	private String daSocialclass;
	private Date daJoinDate;
	private Date daRegularizedDate;
	private String daPositivecases;
	private Date daBranchDate;
	private String daPoliceStation;
	private Double daDues;
	private String daJobs;
	private String daLinecase;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;

	// Constructors

	/** default constructor */
	public PmgmParty() {
	}

	/** minimal constructor */
	public PmgmParty(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public PmgmParty(String pkId, PmgmBranch pmgmBranch,
			PmPopulationinformation pmPopulationinformation,
			String daSocialclass, Date daJoinDate, Date daRegularizedDate,
			String daPositivecases, Date daBranchDate, String daPoliceStation,
			Double daDues, String daJobs, String daLinecase, Boolean isDelete,
			Timestamp dtDate, Integer rkOrder, Timestamp ctTime) {
		this.pkId = pkId;
		this.pmgmBranch = pmgmBranch;
		this.pmPopulationinformation = pmPopulationinformation;
		this.daSocialclass = daSocialclass;
		this.daJoinDate = daJoinDate;
		this.daRegularizedDate = daRegularizedDate;
		this.daPositivecases = daPositivecases;
		this.daBranchDate = daBranchDate;
		this.daPoliceStation = daPoliceStation;
		this.daDues = daDues;
		this.daJobs = daJobs;
		this.daLinecase = daLinecase;
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
	@JoinColumn(name = "fk_PopulationInformation_id")
	public PmPopulationinformation getPmPopulationinformation() {
		return this.pmPopulationinformation;
	}

	public void setPmPopulationinformation(
			PmPopulationinformation pmPopulationinformation) {
		this.pmPopulationinformation = pmPopulationinformation;
	}

	@Column(name = "da_Socialclass", length = 50)
	public String getDaSocialclass() {
		return this.daSocialclass;
	}

	public void setDaSocialclass(String daSocialclass) {
		this.daSocialclass = daSocialclass;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_JoinDate", length = 10)
	public Date getDaJoinDate() {
		return this.daJoinDate;
	}

	public void setDaJoinDate(Date daJoinDate) {
		this.daJoinDate = daJoinDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_RegularizedDate", length = 10)
	public Date getDaRegularizedDate() {
		return this.daRegularizedDate;
	}

	public void setDaRegularizedDate(Date daRegularizedDate) {
		this.daRegularizedDate = daRegularizedDate;
	}

	@Column(name = "da_Positivecases", length = 50)
	public String getDaPositivecases() {
		return this.daPositivecases;
	}

	public void setDaPositivecases(String daPositivecases) {
		this.daPositivecases = daPositivecases;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_BranchDate", length = 10)
	public Date getDaBranchDate() {
		return this.daBranchDate;
	}

	public void setDaBranchDate(Date daBranchDate) {
		this.daBranchDate = daBranchDate;
	}

	@Column(name = "da_PoliceStation", length = 100)
	public String getDaPoliceStation() {
		return this.daPoliceStation;
	}

	public void setDaPoliceStation(String daPoliceStation) {
		this.daPoliceStation = daPoliceStation;
	}

	@Column(name = "da_Dues", precision = 8)
	public Double getDaDues() {
		return this.daDues;
	}

	public void setDaDues(Double daDues) {
		this.daDues = daDues;
	}

	@Column(name = "da_Jobs", length = 50)
	public String getDaJobs() {
		return this.daJobs;
	}

	public void setDaJobs(String daJobs) {
		this.daJobs = daJobs;
	}

	@Column(name = "da_Linecase", length = 20)
	public String getDaLinecase() {
		return this.daLinecase;
	}

	public void setDaLinecase(String daLinecase) {
		this.daLinecase = daLinecase;
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