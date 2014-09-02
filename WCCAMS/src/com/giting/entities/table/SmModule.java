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
 * SmModule entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sm_module", catalog = "wccams")
public class SmModule implements java.io.Serializable {

	// Fields

	private String pkId;
	private String daRoleNumber;
	private String daRoleName;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set<SmRolesmodule> smRolesmodules = new HashSet<SmRolesmodule>(0);

	// Constructors

	/** default constructor */
	public SmModule() {
	}

	/** minimal constructor */
	public SmModule(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public SmModule(String pkId, String daRoleNumber, String daRoleName,
			Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime, Set<SmRolesmodule> smRolesmodules) {
		this.pkId = pkId;
		this.daRoleNumber = daRoleNumber;
		this.daRoleName = daRoleName;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.smRolesmodules = smRolesmodules;
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

	@Column(name = "da_RoleNumber", length = 20)
	public String getDaRoleNumber() {
		return this.daRoleNumber;
	}

	public void setDaRoleNumber(String daRoleNumber) {
		this.daRoleNumber = daRoleNumber;
	}

	@Column(name = "da_RoleName", length = 50)
	public String getDaRoleName() {
		return this.daRoleName;
	}

	public void setDaRoleName(String daRoleName) {
		this.daRoleName = daRoleName;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "smModule")
	public Set<SmRolesmodule> getSmRolesmodules() {
		return this.smRolesmodules;
	}

	public void setSmRolesmodules(Set<SmRolesmodule> smRolesmodules) {
		this.smRolesmodules = smRolesmodules;
	}

}