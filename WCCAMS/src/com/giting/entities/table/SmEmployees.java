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
 * SmEmployees entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sm_employees", catalog = "wccams")
public class SmEmployees implements java.io.Serializable {

	// Fields

	private String pkId;
	private SmDepartment smDepartment;
	private String daEmployeesNumber;
	private String daEmployeesName;
	private String fkSexId;
	private Date daBirthDate;
	private String daHomeAddress;
	private String daPhone;
	private String daMobilePhones;
	private String daEmail;
	private String daQq;
	private String daSpecialties;
	private String daHobbies;
	private String fkEducationId;
	private Date daHireDate;
	private Date daSolutiondate;
	private Date daContractPeriod;
	private String daRemark;
	private Date daDate;
	private String fkPopulationInformationId;
	private String daSubscriberId;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set<SmUser> smUsers = new HashSet<SmUser>(0);

	// Constructors

	/** default constructor */
	public SmEmployees() {
	}

	/** minimal constructor */
	public SmEmployees(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public SmEmployees(String pkId, SmDepartment smDepartment,
			String daEmployeesNumber, String daEmployeesName, String fkSexId,
			Date daBirthDate, String daHomeAddress, String daPhone,
			String daMobilePhones, String daEmail, String daQq,
			String daSpecialties, String daHobbies, String fkEducationId,
			Date daHireDate, Date daSolutiondate, Date daContractPeriod,
			String daRemark, Date daDate, String fkPopulationInformationId,
			String daSubscriberId, Boolean isDelete, Timestamp dtDate,
			Integer rkOrder, Timestamp ctTime, Set<SmUser> smUsers) {
		this.pkId = pkId;
		this.smDepartment = smDepartment;
		this.daEmployeesNumber = daEmployeesNumber;
		this.daEmployeesName = daEmployeesName;
		this.fkSexId = fkSexId;
		this.daBirthDate = daBirthDate;
		this.daHomeAddress = daHomeAddress;
		this.daPhone = daPhone;
		this.daMobilePhones = daMobilePhones;
		this.daEmail = daEmail;
		this.daQq = daQq;
		this.daSpecialties = daSpecialties;
		this.daHobbies = daHobbies;
		this.fkEducationId = fkEducationId;
		this.daHireDate = daHireDate;
		this.daSolutiondate = daSolutiondate;
		this.daContractPeriod = daContractPeriod;
		this.daRemark = daRemark;
		this.daDate = daDate;
		this.fkPopulationInformationId = fkPopulationInformationId;
		this.daSubscriberId = daSubscriberId;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.smUsers = smUsers;
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
	@JoinColumn(name = "fk_Department_id")
	public SmDepartment getSmDepartment() {
		return this.smDepartment;
	}

	public void setSmDepartment(SmDepartment smDepartment) {
		this.smDepartment = smDepartment;
	}

	@Column(name = "da_EmployeesNumber", length = 50)
	public String getDaEmployeesNumber() {
		return this.daEmployeesNumber;
	}

	public void setDaEmployeesNumber(String daEmployeesNumber) {
		this.daEmployeesNumber = daEmployeesNumber;
	}

	@Column(name = "da_EmployeesName", length = 20)
	public String getDaEmployeesName() {
		return this.daEmployeesName;
	}

	public void setDaEmployeesName(String daEmployeesName) {
		this.daEmployeesName = daEmployeesName;
	}

	@Column(name = "fk_sex_id", length = 36)
	public String getFkSexId() {
		return this.fkSexId;
	}

	public void setFkSexId(String fkSexId) {
		this.fkSexId = fkSexId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_BirthDate", length = 10)
	public Date getDaBirthDate() {
		return this.daBirthDate;
	}

	public void setDaBirthDate(Date daBirthDate) {
		this.daBirthDate = daBirthDate;
	}

	@Column(name = "da_HomeAddress", length = 100)
	public String getDaHomeAddress() {
		return this.daHomeAddress;
	}

	public void setDaHomeAddress(String daHomeAddress) {
		this.daHomeAddress = daHomeAddress;
	}

	@Column(name = "da_Phone", length = 20)
	public String getDaPhone() {
		return this.daPhone;
	}

	public void setDaPhone(String daPhone) {
		this.daPhone = daPhone;
	}

	@Column(name = "da_MobilePhones", length = 20)
	public String getDaMobilePhones() {
		return this.daMobilePhones;
	}

	public void setDaMobilePhones(String daMobilePhones) {
		this.daMobilePhones = daMobilePhones;
	}

	@Column(name = "da_Email", length = 30)
	public String getDaEmail() {
		return this.daEmail;
	}

	public void setDaEmail(String daEmail) {
		this.daEmail = daEmail;
	}

	@Column(name = "da_qq", length = 20)
	public String getDaQq() {
		return this.daQq;
	}

	public void setDaQq(String daQq) {
		this.daQq = daQq;
	}

	@Column(name = "da_Specialties", length = 30)
	public String getDaSpecialties() {
		return this.daSpecialties;
	}

	public void setDaSpecialties(String daSpecialties) {
		this.daSpecialties = daSpecialties;
	}

	@Column(name = "da_Hobbies", length = 30)
	public String getDaHobbies() {
		return this.daHobbies;
	}

	public void setDaHobbies(String daHobbies) {
		this.daHobbies = daHobbies;
	}

	@Column(name = "fk_Education_id", length = 36)
	public String getFkEducationId() {
		return this.fkEducationId;
	}

	public void setFkEducationId(String fkEducationId) {
		this.fkEducationId = fkEducationId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_HireDate", length = 10)
	public Date getDaHireDate() {
		return this.daHireDate;
	}

	public void setDaHireDate(Date daHireDate) {
		this.daHireDate = daHireDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_Solutiondate", length = 10)
	public Date getDaSolutiondate() {
		return this.daSolutiondate;
	}

	public void setDaSolutiondate(Date daSolutiondate) {
		this.daSolutiondate = daSolutiondate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_ContractPeriod", length = 10)
	public Date getDaContractPeriod() {
		return this.daContractPeriod;
	}

	public void setDaContractPeriod(Date daContractPeriod) {
		this.daContractPeriod = daContractPeriod;
	}

	@Column(name = "da_Remark", length = 100)
	public String getDaRemark() {
		return this.daRemark;
	}

	public void setDaRemark(String daRemark) {
		this.daRemark = daRemark;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_Date", length = 10)
	public Date getDaDate() {
		return this.daDate;
	}

	public void setDaDate(Date daDate) {
		this.daDate = daDate;
	}

	@Column(name = "fk_PopulationInformation_id", length = 36)
	public String getFkPopulationInformationId() {
		return this.fkPopulationInformationId;
	}

	public void setFkPopulationInformationId(String fkPopulationInformationId) {
		this.fkPopulationInformationId = fkPopulationInformationId;
	}

	@Column(name = "da_Subscriber_id", length = 36)
	public String getDaSubscriberId() {
		return this.daSubscriberId;
	}

	public void setDaSubscriberId(String daSubscriberId) {
		this.daSubscriberId = daSubscriberId;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "smEmployees")
	public Set<SmUser> getSmUsers() {
		return this.smUsers;
	}

	public void setSmUsers(Set<SmUser> smUsers) {
		this.smUsers = smUsers;
	}

}