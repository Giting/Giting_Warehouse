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
 * PmRegistrationtype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pm_registrationtype", catalog = "wccams")
public class PmRegistrationtype implements java.io.Serializable {

	// Fields

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
	@Id
	@Column(name = "pk_Id", unique = true, nullable = false, length = 36)
	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_TPopulationInformation_id")
	public PmPopulationinformation getPmPopulationinformationByFkTpopulationInformationId() {
		return this.pmPopulationinformationByFkTpopulationInformationId;
	}

	public void setPmPopulationinformationByFkTpopulationInformationId(
			PmPopulationinformation pmPopulationinformationByFkTpopulationInformationId) {
		this.pmPopulationinformationByFkTpopulationInformationId = pmPopulationinformationByFkTpopulationInformationId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_FPopulationInformation_id")
	public PmPopulationinformation getPmPopulationinformationByFkFpopulationInformationId() {
		return this.pmPopulationinformationByFkFpopulationInformationId;
	}

	public void setPmPopulationinformationByFkFpopulationInformationId(
			PmPopulationinformation pmPopulationinformationByFkFpopulationInformationId) {
		this.pmPopulationinformationByFkFpopulationInformationId = pmPopulationinformationByFkFpopulationInformationId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_StarTime", length = 10)
	public Date getDaStarTime() {
		return this.daStarTime;
	}

	public void setDaStarTime(Date daStarTime) {
		this.daStarTime = daStarTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_EndTime", length = 10)
	public Date getDaEndTime() {
		return this.daEndTime;
	}

	public void setDaEndTime(Date daEndTime) {
		this.daEndTime = daEndTime;
	}

	@Column(name = "fk_Room_id", length = 36)
	public String getFkRoomId() {
		return this.fkRoomId;
	}

	public void setFkRoomId(String fkRoomId) {
		this.fkRoomId = fkRoomId;
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