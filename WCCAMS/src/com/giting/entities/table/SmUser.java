package com.giting.entities.table;

import java.sql.Timestamp;
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

/**
 * SmUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sm_user", catalog = "wccams")
public class SmUser implements java.io.Serializable {

	// Fields

	private String pkId;
	private SmEmployees smEmployees;
	private SmRole smRole;
	private String daUserNumber;
	private String daLoginName;
	private String daPwd;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set<SmCommunityusers> smCommunityuserses = new HashSet<SmCommunityusers>(
			0);
	private Set<SmAnnouncement> smAnnouncements = new HashSet<SmAnnouncement>(0);

	// Constructors

	/** default constructor */
	public SmUser() {
	}

	/** minimal constructor */
	public SmUser(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public SmUser(String pkId, SmEmployees smEmployees, SmRole smRole,
			String daUserNumber, String daLoginName, String daPwd,
			Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime, Set<SmCommunityusers> smCommunityuserses,
			Set<SmAnnouncement> smAnnouncements) {
		this.pkId = pkId;
		this.smEmployees = smEmployees;
		this.smRole = smRole;
		this.daUserNumber = daUserNumber;
		this.daLoginName = daLoginName;
		this.daPwd = daPwd;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.smCommunityuserses = smCommunityuserses;
		this.smAnnouncements = smAnnouncements;
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
	@JoinColumn(name = "fk_Employees_id")
	public SmEmployees getSmEmployees() {
		return this.smEmployees;
	}

	public void setSmEmployees(SmEmployees smEmployees) {
		this.smEmployees = smEmployees;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_Roles_id")
	public SmRole getSmRole() {
		return this.smRole;
	}

	public void setSmRole(SmRole smRole) {
		this.smRole = smRole;
	}

	@Column(name = "da_UserNumber", length = 20)
	public String getDaUserNumber() {
		return this.daUserNumber;
	}

	public void setDaUserNumber(String daUserNumber) {
		this.daUserNumber = daUserNumber;
	}

	@Column(name = "da_LoginName", length = 50)
	public String getDaLoginName() {
		return this.daLoginName;
	}

	public void setDaLoginName(String daLoginName) {
		this.daLoginName = daLoginName;
	}

	@Column(name = "da_Pwd", length = 50)
	public String getDaPwd() {
		return this.daPwd;
	}

	public void setDaPwd(String daPwd) {
		this.daPwd = daPwd;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "smUser")
	public Set<SmCommunityusers> getSmCommunityuserses() {
		return this.smCommunityuserses;
	}

	public void setSmCommunityuserses(Set<SmCommunityusers> smCommunityuserses) {
		this.smCommunityuserses = smCommunityuserses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "smUser")
	public Set<SmAnnouncement> getSmAnnouncements() {
		return this.smAnnouncements;
	}

	public void setSmAnnouncements(Set<SmAnnouncement> smAnnouncements) {
		this.smAnnouncements = smAnnouncements;
	}

}