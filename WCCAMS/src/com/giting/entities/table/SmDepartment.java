package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * SmDepartment entity. @author MyEclipse Persistence Tools
 */

public class SmDepartment implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pkId;
	private String daDepartmentNumber;
	private String daDepartmentName;
	private String fkAcommunityId;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set smEmployeeses = new HashSet(0);

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
			Set smEmployeeses) {
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

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public String getDaDepartmentNumber() {
		return this.daDepartmentNumber;
	}

	public void setDaDepartmentNumber(String daDepartmentNumber) {
		this.daDepartmentNumber = daDepartmentNumber;
	}

	public String getDaDepartmentName() {
		return this.daDepartmentName;
	}

	public void setDaDepartmentName(String daDepartmentName) {
		this.daDepartmentName = daDepartmentName;
	}

	public String getFkAcommunityId() {
		return this.fkAcommunityId;
	}

	public void setFkAcommunityId(String fkAcommunityId) {
		this.fkAcommunityId = fkAcommunityId;
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

	public Set getSmEmployeeses() {
		return this.smEmployeeses;
	}

	public void setSmEmployeeses(Set smEmployeeses) {
		this.smEmployeeses = smEmployeeses;
	}

}