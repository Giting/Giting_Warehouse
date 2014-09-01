package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.Date;

/**
 * PmRegistrationtype entity. @author MyEclipse Persistence Tools
 */

public class PmRegistrationtype implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pkId;
	private PmPopulationinformation pmPopulationinformationByFkTpopulationInformationId;
	private PmPopulationinformation pmPopulationinformationByFkFpopulationInformationId;
	private Date daStarTime;
	private Date daEndTime;
	private String fkRoomId;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;

	// Constructors

	/** default constructor */
	public PmRegistrationtype() {
	}

	/** minimal constructor */
	public PmRegistrationtype(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public PmRegistrationtype(
			String pkId,
			PmPopulationinformation pmPopulationinformationByFkTpopulationInformationId,
			PmPopulationinformation pmPopulationinformationByFkFpopulationInformationId,
			Date daStarTime, Date daEndTime, String fkRoomId, Boolean isDelete,
			Timestamp dtDate, Integer rkOrder, Timestamp ctTime) {
		this.pkId = pkId;
		this.pmPopulationinformationByFkTpopulationInformationId = pmPopulationinformationByFkTpopulationInformationId;
		this.pmPopulationinformationByFkFpopulationInformationId = pmPopulationinformationByFkFpopulationInformationId;
		this.daStarTime = daStarTime;
		this.daEndTime = daEndTime;
		this.fkRoomId = fkRoomId;
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

	public PmPopulationinformation getPmPopulationinformationByFkTpopulationInformationId() {
		return this.pmPopulationinformationByFkTpopulationInformationId;
	}

	public void setPmPopulationinformationByFkTpopulationInformationId(
			PmPopulationinformation pmPopulationinformationByFkTpopulationInformationId) {
		this.pmPopulationinformationByFkTpopulationInformationId = pmPopulationinformationByFkTpopulationInformationId;
	}

	public PmPopulationinformation getPmPopulationinformationByFkFpopulationInformationId() {
		return this.pmPopulationinformationByFkFpopulationInformationId;
	}

	public void setPmPopulationinformationByFkFpopulationInformationId(
			PmPopulationinformation pmPopulationinformationByFkFpopulationInformationId) {
		this.pmPopulationinformationByFkFpopulationInformationId = pmPopulationinformationByFkFpopulationInformationId;
	}

	public Date getDaStarTime() {
		return this.daStarTime;
	}

	public void setDaStarTime(Date daStarTime) {
		this.daStarTime = daStarTime;
	}

	public Date getDaEndTime() {
		return this.daEndTime;
	}

	public void setDaEndTime(Date daEndTime) {
		this.daEndTime = daEndTime;
	}

	public String getFkRoomId() {
		return this.fkRoomId;
	}

	public void setFkRoomId(String fkRoomId) {
		this.fkRoomId = fkRoomId;
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