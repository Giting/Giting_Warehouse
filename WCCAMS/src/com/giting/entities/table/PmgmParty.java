package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.Date;

/**
 * PmgmParty entity. @author MyEclipse Persistence Tools
 */

public class PmgmParty implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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

	public PmPopulationinformation getPmPopulationinformation() {
		return this.pmPopulationinformation;
	}

	public void setPmPopulationinformation(
			PmPopulationinformation pmPopulationinformation) {
		this.pmPopulationinformation = pmPopulationinformation;
	}

	public String getDaSocialclass() {
		return this.daSocialclass;
	}

	public void setDaSocialclass(String daSocialclass) {
		this.daSocialclass = daSocialclass;
	}

	public Date getDaJoinDate() {
		return this.daJoinDate;
	}

	public void setDaJoinDate(Date daJoinDate) {
		this.daJoinDate = daJoinDate;
	}

	public Date getDaRegularizedDate() {
		return this.daRegularizedDate;
	}

	public void setDaRegularizedDate(Date daRegularizedDate) {
		this.daRegularizedDate = daRegularizedDate;
	}

	public String getDaPositivecases() {
		return this.daPositivecases;
	}

	public void setDaPositivecases(String daPositivecases) {
		this.daPositivecases = daPositivecases;
	}

	public Date getDaBranchDate() {
		return this.daBranchDate;
	}

	public void setDaBranchDate(Date daBranchDate) {
		this.daBranchDate = daBranchDate;
	}

	public String getDaPoliceStation() {
		return this.daPoliceStation;
	}

	public void setDaPoliceStation(String daPoliceStation) {
		this.daPoliceStation = daPoliceStation;
	}

	public Double getDaDues() {
		return this.daDues;
	}

	public void setDaDues(Double daDues) {
		this.daDues = daDues;
	}

	public String getDaJobs() {
		return this.daJobs;
	}

	public void setDaJobs(String daJobs) {
		this.daJobs = daJobs;
	}

	public String getDaLinecase() {
		return this.daLinecase;
	}

	public void setDaLinecase(String daLinecase) {
		this.daLinecase = daLinecase;
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