package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PmPopulationinformation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pm_populationinformation", catalog = "wccams")
public class PmPopulationinformation implements java.io.Serializable {

	// Fields

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
	private Set<PmRegistration> pmRegistrations = new HashSet<PmRegistration>(0);
	private Set<PmRegistrationtype> pmRegistrationtypesForFkTpopulationInformationId = new HashSet<PmRegistrationtype>(
			0);
	private Set<PmRegistrationtype> pmRegistrationtypesForFkFpopulationInformationId = new HashSet<PmRegistrationtype>(
			0);
	private Set<PmPopulationfocus> pmPopulationfocuses = new HashSet<PmPopulationfocus>(
			0);
	private Set<PmgmParty> pmgmParties = new HashSet<PmgmParty>(0);

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
	public PmPopulationinformation(
			String pkId,
			PmFamily pmFamily,
			String daName,
			String daIdCard,
			String daBirthDate,
			String fkAccountTypeId,
			Date fkSexId,
			String fkMovedId,
			String fkHouseRelationId,
			String fkNationalId,
			String fkEducationId,
			String fkPersonnelCategoryId,
			String daWorkUnits,
			String fkMaritalStatusId,
			Date daMaritalDate,
			String fkPoliticalAffiliationId,
			String fkVeteranStatusId,
			String daDomicile,
			String daBirthplace,
			String daCurrentAddress,
			String fkHealthStatusId,
			Boolean daWhetherOut,
			Date daIntoComDate,
			String fkUnemploymentId,
			String fkDisabilityRatingId,
			String fkDisadvantagedGroupsId,
			String fkDemographicId,
			String fkReligionId,
			String daOnechildNumber,
			String fkChildBonusId,
			String daPensionInsurance,
			String daMedicalInsurance,
			Boolean daOtherInfsurance,
			String daSocieties,
			String daCommunitySchool,
			String fkEmployeesId,
			Boolean daLivingAlone,
			String daRemark,
			String fkPopulationStatusId,
			Timestamp daLogoutDate,
			String fkLogoutId,
			String daLogoutRemark,
			String daImgUrl,
			Boolean isDelete,
			Timestamp dtDate,
			Integer rkOrder,
			Timestamp ctTime,
			Set<PmRegistration> pmRegistrations,
			Set<PmRegistrationtype> pmRegistrationtypesForFkTpopulationInformationId,
			Set<PmRegistrationtype> pmRegistrationtypesForFkFpopulationInformationId,
			Set<PmPopulationfocus> pmPopulationfocuses,
			Set<PmgmParty> pmgmParties) {
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
	@Id
	@Column(name = "pk_Id", unique = true, nullable = false, length = 36)
	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_Family_id")
	public PmFamily getPmFamily() {
		return this.pmFamily;
	}

	public void setPmFamily(PmFamily pmFamily) {
		this.pmFamily = pmFamily;
	}

	@Column(name = "da_Name", length = 20)
	public String getDaName() {
		return this.daName;
	}

	public void setDaName(String daName) {
		this.daName = daName;
	}

	@Column(name = "da_IdCard", length = 36)
	public String getDaIdCard() {
		return this.daIdCard;
	}

	public void setDaIdCard(String daIdCard) {
		this.daIdCard = daIdCard;
	}

	@Column(name = "da_BirthDate", length = 36)
	public String getDaBirthDate() {
		return this.daBirthDate;
	}

	public void setDaBirthDate(String daBirthDate) {
		this.daBirthDate = daBirthDate;
	}

	@Column(name = "fk_AccountType_id", length = 20)
	public String getFkAccountTypeId() {
		return this.fkAccountTypeId;
	}

	public void setFkAccountTypeId(String fkAccountTypeId) {
		this.fkAccountTypeId = fkAccountTypeId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fk_Sex_id", length = 10)
	public Date getFkSexId() {
		return this.fkSexId;
	}

	public void setFkSexId(Date fkSexId) {
		this.fkSexId = fkSexId;
	}

	@Column(name = "fk_Moved_id", length = 36)
	public String getFkMovedId() {
		return this.fkMovedId;
	}

	public void setFkMovedId(String fkMovedId) {
		this.fkMovedId = fkMovedId;
	}

	@Column(name = "fk_HouseRelation_id", length = 36)
	public String getFkHouseRelationId() {
		return this.fkHouseRelationId;
	}

	public void setFkHouseRelationId(String fkHouseRelationId) {
		this.fkHouseRelationId = fkHouseRelationId;
	}

	@Column(name = "fk_National_id", length = 36)
	public String getFkNationalId() {
		return this.fkNationalId;
	}

	public void setFkNationalId(String fkNationalId) {
		this.fkNationalId = fkNationalId;
	}

	@Column(name = "fk_Education_id", length = 36)
	public String getFkEducationId() {
		return this.fkEducationId;
	}

	public void setFkEducationId(String fkEducationId) {
		this.fkEducationId = fkEducationId;
	}

	@Column(name = "fk_PersonnelCategory_id", length = 36)
	public String getFkPersonnelCategoryId() {
		return this.fkPersonnelCategoryId;
	}

	public void setFkPersonnelCategoryId(String fkPersonnelCategoryId) {
		this.fkPersonnelCategoryId = fkPersonnelCategoryId;
	}

	@Column(name = "da_WorkUnits", length = 50)
	public String getDaWorkUnits() {
		return this.daWorkUnits;
	}

	public void setDaWorkUnits(String daWorkUnits) {
		this.daWorkUnits = daWorkUnits;
	}

	@Column(name = "fk_MaritalStatus_id", length = 36)
	public String getFkMaritalStatusId() {
		return this.fkMaritalStatusId;
	}

	public void setFkMaritalStatusId(String fkMaritalStatusId) {
		this.fkMaritalStatusId = fkMaritalStatusId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_MaritalDate", length = 10)
	public Date getDaMaritalDate() {
		return this.daMaritalDate;
	}

	public void setDaMaritalDate(Date daMaritalDate) {
		this.daMaritalDate = daMaritalDate;
	}

	@Column(name = "fk_PoliticalAffiliation_id", length = 36)
	public String getFkPoliticalAffiliationId() {
		return this.fkPoliticalAffiliationId;
	}

	public void setFkPoliticalAffiliationId(String fkPoliticalAffiliationId) {
		this.fkPoliticalAffiliationId = fkPoliticalAffiliationId;
	}

	@Column(name = "fk_VeteranStatus_id", length = 36)
	public String getFkVeteranStatusId() {
		return this.fkVeteranStatusId;
	}

	public void setFkVeteranStatusId(String fkVeteranStatusId) {
		this.fkVeteranStatusId = fkVeteranStatusId;
	}

	@Column(name = "da_Domicile", length = 80)
	public String getDaDomicile() {
		return this.daDomicile;
	}

	public void setDaDomicile(String daDomicile) {
		this.daDomicile = daDomicile;
	}

	@Column(name = "da_Birthplace", length = 80)
	public String getDaBirthplace() {
		return this.daBirthplace;
	}

	public void setDaBirthplace(String daBirthplace) {
		this.daBirthplace = daBirthplace;
	}

	@Column(name = "da_CurrentAddress", length = 80)
	public String getDaCurrentAddress() {
		return this.daCurrentAddress;
	}

	public void setDaCurrentAddress(String daCurrentAddress) {
		this.daCurrentAddress = daCurrentAddress;
	}

	@Column(name = "fk_HealthStatus_id", length = 36)
	public String getFkHealthStatusId() {
		return this.fkHealthStatusId;
	}

	public void setFkHealthStatusId(String fkHealthStatusId) {
		this.fkHealthStatusId = fkHealthStatusId;
	}

	@Column(name = "da_WhetherOut")
	public Boolean getDaWhetherOut() {
		return this.daWhetherOut;
	}

	public void setDaWhetherOut(Boolean daWhetherOut) {
		this.daWhetherOut = daWhetherOut;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_IntoComDate", length = 10)
	public Date getDaIntoComDate() {
		return this.daIntoComDate;
	}

	public void setDaIntoComDate(Date daIntoComDate) {
		this.daIntoComDate = daIntoComDate;
	}

	@Column(name = "fk_Unemployment_id", length = 36)
	public String getFkUnemploymentId() {
		return this.fkUnemploymentId;
	}

	public void setFkUnemploymentId(String fkUnemploymentId) {
		this.fkUnemploymentId = fkUnemploymentId;
	}

	@Column(name = "fk_DisabilityRating_id", length = 36)
	public String getFkDisabilityRatingId() {
		return this.fkDisabilityRatingId;
	}

	public void setFkDisabilityRatingId(String fkDisabilityRatingId) {
		this.fkDisabilityRatingId = fkDisabilityRatingId;
	}

	@Column(name = "fk_DisadvantagedGroups_id", length = 36)
	public String getFkDisadvantagedGroupsId() {
		return this.fkDisadvantagedGroupsId;
	}

	public void setFkDisadvantagedGroupsId(String fkDisadvantagedGroupsId) {
		this.fkDisadvantagedGroupsId = fkDisadvantagedGroupsId;
	}

	@Column(name = "fk_Demographic_id", length = 36)
	public String getFkDemographicId() {
		return this.fkDemographicId;
	}

	public void setFkDemographicId(String fkDemographicId) {
		this.fkDemographicId = fkDemographicId;
	}

	@Column(name = "fk_Religion_id", length = 36)
	public String getFkReligionId() {
		return this.fkReligionId;
	}

	public void setFkReligionId(String fkReligionId) {
		this.fkReligionId = fkReligionId;
	}

	@Column(name = "da_OnechildNumber", length = 50)
	public String getDaOnechildNumber() {
		return this.daOnechildNumber;
	}

	public void setDaOnechildNumber(String daOnechildNumber) {
		this.daOnechildNumber = daOnechildNumber;
	}

	@Column(name = "fk_ChildBonus_id", length = 36)
	public String getFkChildBonusId() {
		return this.fkChildBonusId;
	}

	public void setFkChildBonusId(String fkChildBonusId) {
		this.fkChildBonusId = fkChildBonusId;
	}

	@Column(name = "da_PensionInsurance", length = 50)
	public String getDaPensionInsurance() {
		return this.daPensionInsurance;
	}

	public void setDaPensionInsurance(String daPensionInsurance) {
		this.daPensionInsurance = daPensionInsurance;
	}

	@Column(name = "da_MedicalInsurance", length = 50)
	public String getDaMedicalInsurance() {
		return this.daMedicalInsurance;
	}

	public void setDaMedicalInsurance(String daMedicalInsurance) {
		this.daMedicalInsurance = daMedicalInsurance;
	}

	@Column(name = "da_OtherInfsurance")
	public Boolean getDaOtherInfsurance() {
		return this.daOtherInfsurance;
	}

	public void setDaOtherInfsurance(Boolean daOtherInfsurance) {
		this.daOtherInfsurance = daOtherInfsurance;
	}

	@Column(name = "da_Societies", length = 50)
	public String getDaSocieties() {
		return this.daSocieties;
	}

	public void setDaSocieties(String daSocieties) {
		this.daSocieties = daSocieties;
	}

	@Column(name = "da_CommunitySchool", length = 50)
	public String getDaCommunitySchool() {
		return this.daCommunitySchool;
	}

	public void setDaCommunitySchool(String daCommunitySchool) {
		this.daCommunitySchool = daCommunitySchool;
	}

	@Column(name = "fk_Employees_id", length = 36)
	public String getFkEmployeesId() {
		return this.fkEmployeesId;
	}

	public void setFkEmployeesId(String fkEmployeesId) {
		this.fkEmployeesId = fkEmployeesId;
	}

	@Column(name = "da_LivingAlone")
	public Boolean getDaLivingAlone() {
		return this.daLivingAlone;
	}

	public void setDaLivingAlone(Boolean daLivingAlone) {
		this.daLivingAlone = daLivingAlone;
	}

	@Column(name = "da_Remark", length = 100)
	public String getDaRemark() {
		return this.daRemark;
	}

	public void setDaRemark(String daRemark) {
		this.daRemark = daRemark;
	}

	@Column(name = "fk_PopulationStatus_id", length = 36)
	public String getFkPopulationStatusId() {
		return this.fkPopulationStatusId;
	}

	public void setFkPopulationStatusId(String fkPopulationStatusId) {
		this.fkPopulationStatusId = fkPopulationStatusId;
	}

	@Column(name = "da_LogoutDate", nullable = false, length = 19)
	public Timestamp getDaLogoutDate() {
		return this.daLogoutDate;
	}

	public void setDaLogoutDate(Timestamp daLogoutDate) {
		this.daLogoutDate = daLogoutDate;
	}

	@Column(name = "fk_Logout_id", length = 36)
	public String getFkLogoutId() {
		return this.fkLogoutId;
	}

	public void setFkLogoutId(String fkLogoutId) {
		this.fkLogoutId = fkLogoutId;
	}

	@Column(name = "da_LogoutRemark", length = 100)
	public String getDaLogoutRemark() {
		return this.daLogoutRemark;
	}

	public void setDaLogoutRemark(String daLogoutRemark) {
		this.daLogoutRemark = daLogoutRemark;
	}

	@Column(name = "da_ImgUrl", length = 80)
	public String getDaImgUrl() {
		return this.daImgUrl;
	}

	public void setDaImgUrl(String daImgUrl) {
		this.daImgUrl = daImgUrl;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pmPopulationinformation")
	public Set<PmRegistration> getPmRegistrations() {
		return this.pmRegistrations;
	}

	public void setPmRegistrations(Set<PmRegistration> pmRegistrations) {
		this.pmRegistrations = pmRegistrations;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pmPopulationinformationByFkTpopulationInformationId")
	public Set<PmRegistrationtype> getPmRegistrationtypesForFkTpopulationInformationId() {
		return this.pmRegistrationtypesForFkTpopulationInformationId;
	}

	public void setPmRegistrationtypesForFkTpopulationInformationId(
			Set<PmRegistrationtype> pmRegistrationtypesForFkTpopulationInformationId) {
		this.pmRegistrationtypesForFkTpopulationInformationId = pmRegistrationtypesForFkTpopulationInformationId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pmPopulationinformationByFkFpopulationInformationId")
	public Set<PmRegistrationtype> getPmRegistrationtypesForFkFpopulationInformationId() {
		return this.pmRegistrationtypesForFkFpopulationInformationId;
	}

	public void setPmRegistrationtypesForFkFpopulationInformationId(
			Set<PmRegistrationtype> pmRegistrationtypesForFkFpopulationInformationId) {
		this.pmRegistrationtypesForFkFpopulationInformationId = pmRegistrationtypesForFkFpopulationInformationId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pmPopulationinformation")
	public Set<PmPopulationfocus> getPmPopulationfocuses() {
		return this.pmPopulationfocuses;
	}

	public void setPmPopulationfocuses(
			Set<PmPopulationfocus> pmPopulationfocuses) {
		this.pmPopulationfocuses = pmPopulationfocuses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pmPopulationinformation")
	public Set<PmgmParty> getPmgmParties() {
		return this.pmgmParties;
	}

	public void setPmgmParties(Set<PmgmParty> pmgmParties) {
		this.pmgmParties = pmgmParties;
	}

}