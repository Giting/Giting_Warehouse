package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * SmDepartment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sm_department", catalog = "wccams")
public class SmDepartment implements java.io.Serializable {

	// Fields

	private String pkId;
	private String daDepartmentNumber;
	private String daDepartmentName;
	private String fkAcommunityId;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set<SmEmployees> smEmployeeses = new HashSet<SmEmployees>(0);

	// Constructors

	/** default constructor */
	public SmDepartment() {
	}

	/** minimal constructor */
	public SmDepartment(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public SmDepartment(String pkId, String daDepartmentNumber,
			String daDepartmentName, String fkAcommunityId, Boolean isDelete,
			Timestamp dtDate, Integer rkOrder, Timestamp ctTime,
			Set<SmEmployees> smEmployeeses) {
		this.pkId = pkId;
		this.daDepartmentNumber = daDepartmentNumber;
		this.daDepartmentName = daDepartmentName;
		this.fkAcommunityId = fkAcommunityId;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.smEmployeeses = smEmployeeses;
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

	@Column(name = "da_DepartmentNumber", length = 20)
	public String getDaDepartmentNumber() {
		return this.daDepartmentNumber;
	}

	public void setDaDepartmentNumber(String daDepartmentNumber) {
		this.daDepartmentNumber = daDepartmentNumber;
	}

	@Column(name = "da_DepartmentName", length = 20)
	public String getDaDepartmentName() {
		return this.daDepartmentName;
	}

	public void setDaDepartmentName(String daDepartmentName) {
		this.daDepartmentName = daDepartmentName;
	}

	@Column(name = "fk_Acommunity_id", length = 36)
	public String getFkAcommunityId() {
		return this.fkAcommunityId;
	}

	public void setFkAcommunityId(String fkAcommunityId) {
		this.fkAcommunityId = fkAcommunityId;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "smDepartment")
	public Set<SmEmployees> getSmEmployeeses() {
		return this.smEmployeeses;
	}

	public void setSmEmployeeses(Set<SmEmployees> smEmployeeses) {
		this.smEmployeeses = smEmployeeses;
	}

}