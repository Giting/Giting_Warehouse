package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SmEmployees entity. @author MyEclipse Persistence Tools
 */

public class SmEmployees implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	private Set smUsers = new HashSet(0);

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
			Integer rkOrder, Timestamp ctTime, Set smUsers) {
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

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public SmDepartment getSmDepartment() {
		return this.smDepartment;
	}

	public void setSmDepartment(SmDepartment smDepartment) {
		this.smDepartment = smDepartment;
	}

	public String getDaEmployeesNumber() {
		return this.daEmployeesNumber;
	}

	public void setDaEmployeesNumber(String daEmployeesNumber) {
		this.daEmployeesNumber = daEmployeesNumber;
	}

	public String getDaEmployeesName() {
		return this.daEmployeesName;
	}

	public void setDaEmployeesName(String daEmployeesName) {
		this.daEmployeesName = daEmployeesName;
	}

	public String getFkSexId() {
		return this.fkSexId;
	}

	public void setFkSexId(String fkSexId) {
		this.fkSexId = fkSexId;
	}

	public Date getDaBirthDate() {
		return this.daBirthDate;
	}

	public void setDaBirthDate(Date daBirthDate) {
		this.daBirthDate = daBirthDate;
	}

	public String getDaHomeAddress() {
		return this.daHomeAddress;
	}

	public void setDaHomeAddress(String daHomeAddress) {
		this.daHomeAddress = daHomeAddress;
	}

	public String getDaPhone() {
		return this.daPhone;
	}

	public void setDaPhone(String daPhone) {
		this.daPhone = daPhone;
	}

	public String getDaMobilePhones() {
		return this.daMobilePhones;
	}

	public void setDaMobilePhones(String daMobilePhones) {
		this.daMobilePhones = daMobilePhones;
	}

	public String getDaEmail() {
		return this.daEmail;
	}

	public void setDaEmail(String daEmail) {
		this.daEmail = daEmail;
	}

	public String getDaQq() {
		return this.daQq;
	}

	public void setDaQq(String daQq) {
		this.daQq = daQq;
	}

	public String getDaSpecialties() {
		return this.daSpecialties;
	}

	public void setDaSpecialties(String daSpecialties) {
		this.daSpecialties = daSpecialties;
	}

	public String getDaHobbies() {
		return this.daHobbies;
	}

	public void setDaHobbies(String daHobbies) {
		this.daHobbies = daHobbies;
	}

	public String getFkEducationId() {
		return this.fkEducationId;
	}

	public void setFkEducationId(String fkEducationId) {
		this.fkEducationId = fkEducationId;
	}

	public Date getDaHireDate() {
		return this.daHireDate;
	}

	public void setDaHireDate(Date daHireDate) {
		this.daHireDate = daHireDate;
	}

	public Date getDaSolutiondate() {
		return this.daSolutiondate;
	}

	public void setDaSolutiondate(Date daSolutiondate) {
		this.daSolutiondate = daSolutiondate;
	}

	public Date getDaContractPeriod() {
		return this.daContractPeriod;
	}

	public void setDaContractPeriod(Date daContractPeriod) {
		this.daContractPeriod = daContractPeriod;
	}

	public String getDaRemark() {
		return this.daRemark;
	}

	public void setDaRemark(String daRemark) {
		this.daRemark = daRemark;
	}

	public Date getDaDate() {
		return this.daDate;
	}

	public void setDaDate(Date daDate) {
		this.daDate = daDate;
	}

	public String getFkPopulationInformationId() {
		return this.fkPopulationInformationId;
	}

	public void setFkPopulationInformationId(String fkPopulationInformationId) {
		this.fkPopulationInformationId = fkPopulationInformationId;
	}

	public String getDaSubscriberId() {
		return this.daSubscriberId;
	}

	public void setDaSubscriberId(String daSubscriberId) {
		this.daSubscriberId = daSubscriberId;
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

	public Set getSmUsers() {
		return this.smUsers;
	}

	public void setSmUsers(Set smUsers) {
		this.smUsers = smUsers;
	}

}