package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PmPopulationinformation entity. @author MyEclipse Persistence Tools
 */

public class PmPopulationinformation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pkId;
	private PmFamily pmFamily;
	private String daName;
	private String daIdCard;
	private String daBirthDate;
	private String fkAccountTypeId;
	private Date fkSexId;
	private String fkMovedId;
	private String fkHouseRelationId;
	private String fkNationalId;
	private String fkEducationId;
	private String fkPersonnelCategoryId;
	private String daWorkUnits;
	private String fkMaritalStatusId;
	private Date daMaritalDate;
	private String fkPoliticalAffiliationId;
	private String fkVeteranStatusId;
	private String daDomicile;
	private String daBirthplace;
	private String daCurrentAddress;
	private String fkHealthStatusId;
	private Boolean daWhetherOut;
	private Date daIntoComDate;
	private String fkUnemploymentId;
	private String fkDisabilityRatingId;
	private String fkDisadvantagedGroupsId;
	private String fkDemographicId;
	private String fkReligionId;
	private String daOnechildNumber;
	private String fkChildBonusId;
	private String daPensionInsurance;
	private String daMedicalInsurance;
	private Boolean daOtherInfsurance;
	private String daSocieties;
	private String daCommunitySchool;
	private String fkEmployeesId;
	private Boolean daLivingAlone;
	private String daRemark;
	private String fkPopulationStatusId;
	private Timestamp daLogoutDate;
	private String fkLogoutId;
	private String daLogoutRemark;
	private String daImgUrl;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set pmRegistrations = new HashSet(0);
	private Set pmRegistrationtypesForFkTpopulationInformationId = new HashSet(
			0);
	private Set pmRegistrationtypesForFkFpopulationInformationId = new HashSet(
			0);
	private Set pmPopulationfocuses = new HashSet(0);
	private Set pmgmParties = new HashSet(0);

	// Constructors

	/** default constructor */
	public PmPopulationinformation() {
	}

	/** minimal constructor */
	public PmPopulationinformation(String pkId, Timestamp daLogoutDate,
			Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.daLogoutDate = daLogoutDate;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public PmPopulationinformation(String pkId, PmFamily pmFamily,
			String daName, String daIdCard, String daBirthDate,
			String fkAccountTypeId, Date fkSexId, String fkMovedId,
			String fkHouseRelationId, String fkNationalId,
			String fkEducationId, String fkPersonnelCategoryId,
			String daWorkUnits, String fkMaritalStatusId, Date daMaritalDate,
			String fkPoliticalAffiliationId, String fkVeteranStatusId,
			String daDomicile, String daBirthplace, String daCurrentAddress,
			String fkHealthStatusId, Boolean daWhetherOut, Date daIntoComDate,
			String fkUnemploymentId, String fkDisabilityRatingId,
			String fkDisadvantagedGroupsId, String fkDemographicId,
			String fkReligionId, String daOnechildNumber,
			String fkChildBonusId, String daPensionInsurance,
			String daMedicalInsurance, Boolean daOtherInfsurance,
			String daSocieties, String daCommunitySchool, String fkEmployeesId,
			Boolean daLivingAlone, String daRemark,
			String fkPopulationStatusId, Timestamp daLogoutDate,
			String fkLogoutId, String daLogoutRemark, String daImgUrl,
			Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime, Set pmRegistrations,
			Set pmRegistrationtypesForFkTpopulationInformationId,
			Set pmRegistrationtypesForFkFpopulationInformationId,
			Set pmPopulationfocuses, Set pmgmParties) {
		this.pkId = pkId;
		this.pmFamily = pmFamily;
		this.daName = daName;
		this.daIdCard = daIdCard;
		this.daBirthDate = daBirthDate;
		this.fkAccountTypeId = fkAccountTypeId;
		this.fkSexId = fkSexId;
		this.fkMovedId = fkMovedId;
		this.fkHouseRelationId = fkHouseRelationId;
		this.fkNationalId = fkNationalId;
		this.fkEducationId = fkEducationId;
		this.fkPersonnelCategoryId = fkPersonnelCategoryId;
		this.daWorkUnits = daWorkUnits;
		this.fkMaritalStatusId = fkMaritalStatusId;
		this.daMaritalDate = daMaritalDate;
		this.fkPoliticalAffiliationId = fkPoliticalAffiliationId;
		this.fkVeteranStatusId = fkVeteranStatusId;
		this.daDomicile = daDomicile;
		this.daBirthplace = daBirthplace;
		this.daCurrentAddress = daCurrentAddress;
		this.fkHealthStatusId = fkHealthStatusId;
		this.daWhetherOut = daWhetherOut;
		this.daIntoComDate = daIntoComDate;
		this.fkUnemploymentId = fkUnemploymentId;
		this.fkDisabilityRatingId = fkDisabilityRatingId;
		this.fkDisadvantagedGroupsId = fkDisadvantagedGroupsId;
		this.fkDemographicId = fkDemographicId;
		this.fkReligionId = fkReligionId;
		this.daOnechildNumber = daOnechildNumber;
		this.fkChildBonusId = fkChildBonusId;
		this.daPensionInsurance = daPensionInsurance;
		this.daMedicalInsurance = daMedicalInsurance;
		this.daOtherInfsurance = daOtherInfsurance;
		this.daSocieties = daSocieties;
		this.daCommunitySchool = daCommunitySchool;
		this.fkEmployeesId = fkEmployeesId;
		this.daLivingAlone = daLivingAlone;
		this.daRemark = daRemark;
		this.fkPopulationStatusId = fkPopulationStatusId;
		this.daLogoutDate = daLogoutDate;
		this.fkLogoutId = fkLogoutId;
		this.daLogoutRemark = daLogoutRemark;
		this.daImgUrl = daImgUrl;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.pmRegistrations = pmRegistrations;
		this.pmRegistrationtypesForFkTpopulationInformationId = pmRegistrationtypesForFkTpopulationInformationId;
		this.pmRegistrationtypesForFkFpopulationInformationId = pmRegistrationtypesForFkFpopulationInformationId;
		this.pmPopulationfocuses = pmPopulationfocuses;
		this.pmgmParties = pmgmParties;
	}

	// Property accessors

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public PmFamily getPmFamily() {
		return this.pmFamily;
	}

	public void setPmFamily(PmFamily pmFamily) {
		this.pmFamily = pmFamily;
	}

	public String getDaName() {
		return this.daName;
	}

	public void setDaName(String daName) {
		this.daName = daName;
	}

	public String getDaIdCard() {
		return this.daIdCard;
	}

	public void setDaIdCard(String daIdCard) {
		this.daIdCard = daIdCard;
	}

	public String getDaBirthDate() {
		return this.daBirthDate;
	}

	public void setDaBirthDate(String daBirthDate) {
		this.daBirthDate = daBirthDate;
	}

	public String getFkAccountTypeId() {
		return this.fkAccountTypeId;
	}

	public void setFkAccountTypeId(String fkAccountTypeId) {
		this.fkAccountTypeId = fkAccountTypeId;
	}

	public Date getFkSexId() {
		return this.fkSexId;
	}

	public void setFkSexId(Date fkSexId) {
		this.fkSexId = fkSexId;
	}

	public String getFkMovedId() {
		return this.fkMovedId;
	}

	public void setFkMovedId(String fkMovedId) {
		this.fkMovedId = fkMovedId;
	}

	public String getFkHouseRelationId() {
		return this.fkHouseRelationId;
	}

	public void setFkHouseRelationId(String fkHouseRelationId) {
		this.fkHouseRelationId = fkHouseRelationId;
	}

	public String getFkNationalId() {
		return this.fkNationalId;
	}

	public void setFkNationalId(String fkNationalId) {
		this.fkNationalId = fkNationalId;
	}

	public String getFkEducationId() {
		return this.fkEducationId;
	}

	public void setFkEducationId(String fkEducationId) {
		this.fkEducationId = fkEducationId;
	}

	public String getFkPersonnelCategoryId() {
		return this.fkPersonnelCategoryId;
	}

	public void setFkPersonnelCategoryId(String fkPersonnelCategoryId) {
		this.fkPersonnelCategoryId = fkPersonnelCategoryId;
	}

	public String getDaWorkUnits() {
		return this.daWorkUnits;
	}

	public void setDaWorkUnits(String daWorkUnits) {
		this.daWorkUnits = daWorkUnits;
	}

	public String getFkMaritalStatusId() {
		return this.fkMaritalStatusId;
	}

	public void setFkMaritalStatusId(String fkMaritalStatusId) {
		this.fkMaritalStatusId = fkMaritalStatusId;
	}

	public Date getDaMaritalDate() {
		return this.daMaritalDate;
	}

	public void setDaMaritalDate(Date daMaritalDate) {
		this.daMaritalDate = daMaritalDate;
	}

	public String getFkPoliticalAffiliationId() {
		return this.fkPoliticalAffiliationId;
	}

	public void setFkPoliticalAffiliationId(String fkPoliticalAffiliationId) {
		this.fkPoliticalAffiliationId = fkPoliticalAffiliationId;
	}

	public String getFkVeteranStatusId() {
		return this.fkVeteranStatusId;
	}

	public void setFkVeteranStatusId(String fkVeteranStatusId) {
		this.fkVeteranStatusId = fkVeteranStatusId;
	}

	public String getDaDomicile() {
		return this.daDomicile;
	}

	public void setDaDomicile(String daDomicile) {
		this.daDomicile = daDomicile;
	}

	public String getDaBirthplace() {
		return this.daBirthplace;
	}

	public void setDaBirthplace(String daBirthplace) {
		this.daBirthplace = daBirthplace;
	}

	public String getDaCurrentAddress() {
		return this.daCurrentAddress;
	}

	public void setDaCurrentAddress(String daCurrentAddress) {
		this.daCurrentAddress = daCurrentAddress;
	}

	public String getFkHealthStatusId() {
		return this.fkHealthStatusId;
	}

	public void setFkHealthStatusId(String fkHealthStatusId) {
		this.fkHealthStatusId = fkHealthStatusId;
	}

	public Boolean getDaWhetherOut() {
		return this.daWhetherOut;
	}

	public void setDaWhetherOut(Boolean daWhetherOut) {
		this.daWhetherOut = daWhetherOut;
	}

	public Date getDaIntoComDate() {
		return this.daIntoComDate;
	}

	public void setDaIntoComDate(Date daIntoComDate) {
		this.daIntoComDate = daIntoComDate;
	}

	public String getFkUnemploymentId() {
		return this.fkUnemploymentId;
	}

	public void setFkUnemploymentId(String fkUnemploymentId) {
		this.fkUnemploymentId = fkUnemploymentId;
	}

	public String getFkDisabilityRatingId() {
		return this.fkDisabilityRatingId;
	}

	public void setFkDisabilityRatingId(String fkDisabilityRatingId) {
		this.fkDisabilityRatingId = fkDisabilityRatingId;
	}

	public String getFkDisadvantagedGroupsId() {
		return this.fkDisadvantagedGroupsId;
	}

	public void setFkDisadvantagedGroupsId(String fkDisadvantagedGroupsId) {
		this.fkDisadvantagedGroupsId = fkDisadvantagedGroupsId;
	}

	public String getFkDemographicId() {
		return this.fkDemographicId;
	}

	public void setFkDemographicId(String fkDemographicId) {
		this.fkDemographicId = fkDemographicId;
	}

	public String getFkReligionId() {
		return this.fkReligionId;
	}

	public void setFkReligionId(String fkReligionId) {
		this.fkReligionId = fkReligionId;
	}

	public String getDaOnechildNumber() {
		return this.daOnechildNumber;
	}

	public void setDaOnechildNumber(String daOnechildNumber) {
		this.daOnechildNumber = daOnechildNumber;
	}

	public String getFkChildBonusId() {
		return this.fkChildBonusId;
	}

	public void setFkChildBonusId(String fkChildBonusId) {
		this.fkChildBonusId = fkChildBonusId;
	}

	public String getDaPensionInsurance() {
		return this.daPensionInsurance;
	}

	public void setDaPensionInsurance(String daPensionInsurance) {
		this.daPensionInsurance = daPensionInsurance;
	}

	public String getDaMedicalInsurance() {
		return this.daMedicalInsurance;
	}

	public void setDaMedicalInsurance(String daMedicalInsurance) {
		this.daMedicalInsurance = daMedicalInsurance;
	}

	public Boolean getDaOtherInfsurance() {
		return this.daOtherInfsurance;
	}

	public void setDaOtherInfsurance(Boolean daOtherInfsurance) {
		this.daOtherInfsurance = daOtherInfsurance;
	}

	public String getDaSocieties() {
		return this.daSocieties;
	}

	public void setDaSocieties(String daSocieties) {
		this.daSocieties = daSocieties;
	}

	public String getDaCommunitySchool() {
		return this.daCommunitySchool;
	}

	public void setDaCommunitySchool(String daCommunitySchool) {
		this.daCommunitySchool = daCommunitySchool;
	}

	public String getFkEmployeesId() {
		return this.fkEmployeesId;
	}

	public void setFkEmployeesId(String fkEmployeesId) {
		this.fkEmployeesId = fkEmployeesId;
	}

	public Boolean getDaLivingAlone() {
		return this.daLivingAlone;
	}

	public void setDaLivingAlone(Boolean daLivingAlone) {
		this.daLivingAlone = daLivingAlone;
	}

	public String getDaRemark() {
		return this.daRemark;
	}

	public void setDaRemark(String daRemark) {
		this.daRemark = daRemark;
	}

	public String getFkPopulationStatusId() {
		return this.fkPopulationStatusId;
	}

	public void setFkPopulationStatusId(String fkPopulationStatusId) {
		this.fkPopulationStatusId = fkPopulationStatusId;
	}

	public Timestamp getDaLogoutDate() {
		return this.daLogoutDate;
	}

	public void setDaLogoutDate(Timestamp daLogoutDate) {
		this.daLogoutDate = daLogoutDate;
	}

	public String getFkLogoutId() {
		return this.fkLogoutId;
	}

	public void setFkLogoutId(String fkLogoutId) {
		this.fkLogoutId = fkLogoutId;
	}

	public String getDaLogoutRemark() {
		return this.daLogoutRemark;
	}

	public void setDaLogoutRemark(String daLogoutRemark) {
		this.daLogoutRemark = daLogoutRemark;
	}

	public String getDaImgUrl() {
		return this.daImgUrl;
	}

	public void setDaImgUrl(String daImgUrl) {
		this.daImgUrl = daImgUrl;
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

	public Set getPmRegistrations() {
		return this.pmRegistrations;
	}

	public void setPmRegistrations(Set pmRegistrations) {
		this.pmRegistrations = pmRegistrations;
	}

	public Set getPmRegistrationtypesForFkTpopulationInformationId() {
		return this.pmRegistrationtypesForFkTpopulationInformationId;
	}

	public void setPmRegistrationtypesForFkTpopulationInformationId(
			Set pmRegistrationtypesForFkTpopulationInformationId) {
		this.pmRegistrationtypesForFkTpopulationInformationId = pmRegistrationtypesForFkTpopulationInformationId;
	}

	public Set getPmRegistrationtypesForFkFpopulationInformationId() {
		return this.pmRegistrationtypesForFkFpopulationInformationId;
	}

	public void setPmRegistrationtypesForFkFpopulationInformationId(
			Set pmRegistrationtypesForFkFpopulationInformationId) {
		this.pmRegistrationtypesForFkFpopulationInformationId = pmRegistrationtypesForFkFpopulationInformationId;
	}

	public Set getPmPopulationfocuses() {
		return this.pmPopulationfocuses;
	}

	public void setPmPopulationfocuses(Set pmPopulationfocuses) {
		this.pmPopulationfocuses = pmPopulationfocuses;
	}

	public Set getPmgmParties() {
		return this.pmgmParties;
	}

	public void setPmgmParties(Set pmgmParties) {
		this.pmgmParties = pmgmParties;
	}

}