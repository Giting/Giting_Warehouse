package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.Date;

/**
 * PmPopulationfocus entity. @author MyEclipse Persistence Tools
 */

public class PmPopulationfocus implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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

	public String getDaFocusNumber() {
		return this.daFocusNumber;
	}

	public void setDaFocusNumber(String daFocusNumber) {
		this.daFocusNumber = daFocusNumber;
	}

	public String getFkDemographicId() {
		return this.fkDemographicId;
	}

	public void setFkDemographicId(String fkDemographicId) {
		this.fkDemographicId = fkDemographicId;
	}

	public String getFkRegulatoryReasonsId() {
		return this.fkRegulatoryReasonsId;
	}

	public void setFkRegulatoryReasonsId(String fkRegulatoryReasonsId) {
		this.fkRegulatoryReasonsId = fkRegulatoryReasonsId;
	}

	public String getDaCrimeType() {
		return this.daCrimeType;
	}

	public void setDaCrimeType(String daCrimeType) {
		this.daCrimeType = daCrimeType;
	}

	public Date getDaCrimeDate() {
		return this.daCrimeDate;
	}

	public void setDaCrimeDate(Date daCrimeDate) {
		this.daCrimeDate = daCrimeDate;
	}

	public Date getDaJailDate() {
		return this.daJailDate;
	}

	public void setDaJailDate(Date daJailDate) {
		this.daJailDate = daJailDate;
	}

	public Date getDaPrisonDate() {
		return this.daPrisonDate;
	}

	public void setDaPrisonDate(Date daPrisonDate) {
		this.daPrisonDate = daPrisonDate;
	}

	public String getDaSentence() {
		return this.daSentence;
	}

	public void setDaSentence(String daSentence) {
		this.daSentence = daSentence;
	}

	public Date getDaDecisionTime() {
		return this.daDecisionTime;
	}

	public void setDaDecisionTime(Date daDecisionTime) {
		this.daDecisionTime = daDecisionTime;
	}

	public String getFkTrialResultsId() {
		return this.fkTrialResultsId;
	}

	public void setFkTrialResultsId(String fkTrialResultsId) {
		this.fkTrialResultsId = fkTrialResultsId;
	}

	public String getDaCourtVerdict() {
		return this.daCourtVerdict;
	}

	public void setDaCourtVerdict(String daCourtVerdict) {
		this.daCourtVerdict = daCourtVerdict;
	}

	public String getFkAbsencesTypeId() {
		return this.fkAbsencesTypeId;
	}

	public void setFkAbsencesTypeId(String fkAbsencesTypeId) {
		this.fkAbsencesTypeId = fkAbsencesTypeId;
	}

	public Boolean getDaDetached() {
		return this.daDetached;
	}

	public void setDaDetached(Boolean daDetached) {
		this.daDetached = daDetached;
	}

	public String getDaCurrentAddress() {
		return this.daCurrentAddress;
	}

	public void setDaCurrentAddress(String daCurrentAddress) {
		this.daCurrentAddress = daCurrentAddress;
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