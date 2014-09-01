package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.Date;

/**
 * PmRegistration entity. @author MyEclipse Persistence Tools
 */

public class PmRegistration implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pkId;
	private PmPopulationinformation pmPopulationinformation;
	private String fkRegistrationTypeId;
	private String daRegistrationReason;
	private Date daRegistrationTime;
	private Date daEndTime;
	private String daRemark;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;

	// Constructors

	/** default constructor */
	public PmRegistration() {
	}

	/** minimal constructor */
	public PmRegistration(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public PmRegistration(String pkId,
			PmPopulationinformation pmPopulationinformation,
			String fkRegistrationTypeId, String daRegistrationReason,
			Date daRegistrationTime, Date daEndTime, String daRemark,
			Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime) {
		this.pkId = pkId;
		this.pmPopulationinformation = pmPopulationinformation;
		this.fkRegistrationTypeId = fkRegistrationTypeId;
		this.daRegistrationReason = daRegistrationReason;
		this.daRegistrationTime = daRegistrationTime;
		this.daEndTime = daEndTime;
		this.daRemark = daRemark;
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

	public PmPopulationinformation getPmPopulationinformation() {
		return this.pmPopulationinformation;
	}

	public void setPmPopulationinformation(
			PmPopulationinformation pmPopulationinformation) {
		this.pmPopulationinformation = pmPopulationinformation;
	}

	public String getFkRegistrationTypeId() {
		return this.fkRegistrationTypeId;
	}

	public void setFkRegistrationTypeId(String fkRegistrationTypeId) {
		this.fkRegistrationTypeId = fkRegistrationTypeId;
	}

	public String getDaRegistrationReason() {
		return this.daRegistrationReason;
	}

	public void setDaRegistrationReason(String daRegistrationReason) {
		this.daRegistrationReason = daRegistrationReason;
	}

	public Date getDaRegistrationTime() {
		return this.daRegistrationTime;
	}

	public void setDaRegistrationTime(Date daRegistrationTime) {
		this.daRegistrationTime = daRegistrationTime;
	}

	public Date getDaEndTime() {
		return this.daEndTime;
	}

	public void setDaEndTime(Date daEndTime) {
		this.daEndTime = daEndTime;
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

}