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
 * PmRegistration entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pm_registration", catalog = "wccams")
public class PmRegistration implements java.io.Serializable {

	// Fields

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
	@Id
	@Column(name = "pk_Id", unique = true, nullable = false, length = 36)
	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
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

	@Column(name = "fk_RegistrationType_id", length = 36)
	public String getFkRegistrationTypeId() {
		return this.fkRegistrationTypeId;
	}

	public void setFkRegistrationTypeId(String fkRegistrationTypeId) {
		this.fkRegistrationTypeId = fkRegistrationTypeId;
	}

	@Column(name = "da_RegistrationReason", length = 100)
	public String getDaRegistrationReason() {
		return this.daRegistrationReason;
	}

	public void setDaRegistrationReason(String daRegistrationReason) {
		this.daRegistrationReason = daRegistrationReason;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_RegistrationTime", length = 10)
	public Date getDaRegistrationTime() {
		return this.daRegistrationTime;
	}

	public void setDaRegistrationTime(Date daRegistrationTime) {
		this.daRegistrationTime = daRegistrationTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_EndTime", length = 10)
	public Date getDaEndTime() {
		return this.daEndTime;
	}

	public void setDaEndTime(Date daEndTime) {
		this.daEndTime = daEndTime;
	}

	@Column(name = "da_Remark", length = 100)
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

}