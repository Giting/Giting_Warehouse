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
 * PmPopulationfocus entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pm_populationfocus", catalog = "wccams")
public class PmPopulationfocus implements java.io.Serializable {

	// Fields

	private String pkId;
	private PmPopulationinformation pmPopulationinformation;
	private String daFocusNumber;
	private String fkDemographicId;
	private String fkRegulatoryReasonsId;
	private String daCrimeType;
	private Date daCrimeDate;
	private Date daJailDate;
	private Date daPrisonDate;
	private String daSentence;
	private Date daDecisionTime;
	private String fkTrialResultsId;
	private String daCourtVerdict;
	private String fkAbsencesTypeId;
	private Boolean daDetached;
	private String daCurrentAddress;
	private String daRemark;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;

	// Constructors

	/** default constructor */
	public PmPopulationfocus() {
	}

	/** minimal constructor */
	public PmPopulationfocus(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public PmPopulationfocus(String pkId,
			PmPopulationinformation pmPopulationinformation,
			String daFocusNumber, String fkDemographicId,
			String fkRegulatoryReasonsId, String daCrimeType, Date daCrimeDate,
			Date daJailDate, Date daPrisonDate, String daSentence,
			Date daDecisionTime, String fkTrialResultsId,
			String daCourtVerdict, String fkAbsencesTypeId, Boolean daDetached,
			String daCurrentAddress, String daRemark, Boolean isDelete,
			Timestamp dtDate, Integer rkOrder, Timestamp ctTime) {
		this.pkId = pkId;
		this.pmPopulationinformation = pmPopulationinformation;
		this.daFocusNumber = daFocusNumber;
		this.fkDemographicId = fkDemographicId;
		this.fkRegulatoryReasonsId = fkRegulatoryReasonsId;
		this.daCrimeType = daCrimeType;
		this.daCrimeDate = daCrimeDate;
		this.daJailDate = daJailDate;
		this.daPrisonDate = daPrisonDate;
		this.daSentence = daSentence;
		this.daDecisionTime = daDecisionTime;
		this.fkTrialResultsId = fkTrialResultsId;
		this.daCourtVerdict = daCourtVerdict;
		this.fkAbsencesTypeId = fkAbsencesTypeId;
		this.daDetached = daDetached;
		this.daCurrentAddress = daCurrentAddress;
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

	@Column(name = "da_FocusNumber", length = 50)
	public String getDaFocusNumber() {
		return this.daFocusNumber;
	}

	public void setDaFocusNumber(String daFocusNumber) {
		this.daFocusNumber = daFocusNumber;
	}

	@Column(name = "fk_Demographic_id", length = 36)
	public String getFkDemographicId() {
		return this.fkDemographicId;
	}

	public void setFkDemographicId(String fkDemographicId) {
		this.fkDemographicId = fkDemographicId;
	}

	@Column(name = "fk_RegulatoryReasons_id", length = 36)
	public String getFkRegulatoryReasonsId() {
		return this.fkRegulatoryReasonsId;
	}

	public void setFkRegulatoryReasonsId(String fkRegulatoryReasonsId) {
		this.fkRegulatoryReasonsId = fkRegulatoryReasonsId;
	}

	@Column(name = "da_CrimeType", length = 50)
	public String getDaCrimeType() {
		return this.daCrimeType;
	}

	public void setDaCrimeType(String daCrimeType) {
		this.daCrimeType = daCrimeType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_CrimeDate", length = 10)
	public Date getDaCrimeDate() {
		return this.daCrimeDate;
	}

	public void setDaCrimeDate(Date daCrimeDate) {
		this.daCrimeDate = daCrimeDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_JailDate", length = 10)
	public Date getDaJailDate() {
		return this.daJailDate;
	}

	public void setDaJailDate(Date daJailDate) {
		this.daJailDate = daJailDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_PrisonDate", length = 10)
	public Date getDaPrisonDate() {
		return this.daPrisonDate;
	}

	public void setDaPrisonDate(Date daPrisonDate) {
		this.daPrisonDate = daPrisonDate;
	}

	@Column(name = "da_Sentence", length = 50)
	public String getDaSentence() {
		return this.daSentence;
	}

	public void setDaSentence(String daSentence) {
		this.daSentence = daSentence;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_DecisionTime", length = 10)
	public Date getDaDecisionTime() {
		return this.daDecisionTime;
	}

	public void setDaDecisionTime(Date daDecisionTime) {
		this.daDecisionTime = daDecisionTime;
	}

	@Column(name = "fk_TrialResults_id", length = 36)
	public String getFkTrialResultsId() {
		return this.fkTrialResultsId;
	}

	public void setFkTrialResultsId(String fkTrialResultsId) {
		this.fkTrialResultsId = fkTrialResultsId;
	}

	@Column(name = "da_CourtVerdict", length = 50)
	public String getDaCourtVerdict() {
		return this.daCourtVerdict;
	}

	public void setDaCourtVerdict(String daCourtVerdict) {
		this.daCourtVerdict = daCourtVerdict;
	}

	@Column(name = "fk_AbsencesType_id", length = 36)
	public String getFkAbsencesTypeId() {
		return this.fkAbsencesTypeId;
	}

	public void setFkAbsencesTypeId(String fkAbsencesTypeId) {
		this.fkAbsencesTypeId = fkAbsencesTypeId;
	}

	@Column(name = "da_Detached")
	public Boolean getDaDetached() {
		return this.daDetached;
	}

	public void setDaDetached(Boolean daDetached) {
		this.daDetached = daDetached;
	}

	@Column(name = "da_CurrentAddress", length = 50)
	public String getDaCurrentAddress() {
		return this.daCurrentAddress;
	}

	public void setDaCurrentAddress(String daCurrentAddress) {
		this.daCurrentAddress = daCurrentAddress;
	}

	@Column(name = "da_Remark", length = 500)
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