package com.giting.entities.table;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SmCommunityusers entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sm_communityusers", catalog = "wccams")
public class SmCommunityusers implements java.io.Serializable {

	// Fields

	private String pkId;
	private BfAcommunity bfAcommunity;
	private SmUser smUser;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;

	// Constructors

	/** default constructor */
	public SmCommunityusers() {
	}

	/** minimal constructor */
	public SmCommunityusers(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public SmCommunityusers(String pkId, BfAcommunity bfAcommunity,
			SmUser smUser, Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime) {
		this.pkId = pkId;
		this.bfAcommunity = bfAcommunity;
		this.smUser = smUser;
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
	@JoinColumn(name = "fk_Acommunity_id")
	public BfAcommunity getBfAcommunity() {
		return this.bfAcommunity;
	}

	public void setBfAcommunity(BfAcommunity bfAcommunity) {
		this.bfAcommunity = bfAcommunity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_User_id")
	public SmUser getSmUser() {
		return this.smUser;
	}

	public void setSmUser(SmUser smUser) {
		this.smUser = smUser;
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