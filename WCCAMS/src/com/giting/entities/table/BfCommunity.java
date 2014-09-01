package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BfCommunity entity. @author MyEclipse Persistence Tools
 */

public class BfCommunity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String pkId;
	private BfAcommunity bfAcommunity;
	private String daCnumber;
	private String daConName;
	private String daResidentialAddress;
	private String daPhone;
	private String daCommunityWebsite;
	private String fkSubscriberId;
	private Date daDate;
	private String daMark;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set bfBuildingses = new HashSet(0);

	// Constructors

	/** default constructor */
	public BfCommunity() {
	}

	/** minimal constructor */
	public BfCommunity(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public BfCommunity(String pkId, BfAcommunity bfAcommunity,
			String daCnumber, String daConName, String daResidentialAddress,
			String daPhone, String daCommunityWebsite, String fkSubscriberId,
			Date daDate, String daMark, Boolean isDelete, Timestamp dtDate,
			Integer rkOrder, Timestamp ctTime, Set bfBuildingses) {
		this.pkId = pkId;
		this.bfAcommunity = bfAcommunity;
		this.daCnumber = daCnumber;
		this.daConName = daConName;
		this.daResidentialAddress = daResidentialAddress;
		this.daPhone = daPhone;
		this.daCommunityWebsite = daCommunityWebsite;
		this.fkSubscriberId = fkSubscriberId;
		this.daDate = daDate;
		this.daMark = daMark;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.bfBuildingses = bfBuildingses;
	}

	// Property accessors

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public BfAcommunity getBfAcommunity() {
		return this.bfAcommunity;
	}

	public void setBfAcommunity(BfAcommunity bfAcommunity) {
		this.bfAcommunity = bfAcommunity;
	}

	public String getDaCnumber() {
		return this.daCnumber;
	}

	public void setDaCnumber(String daCnumber) {
		this.daCnumber = daCnumber;
	}

	public String getDaConName() {
		return this.daConName;
	}

	public void setDaConName(String daConName) {
		this.daConName = daConName;
	}

	public String getDaResidentialAddress() {
		return this.daResidentialAddress;
	}

	public void setDaResidentialAddress(String daResidentialAddress) {
		this.daResidentialAddress = daResidentialAddress;
	}

	public String getDaPhone() {
		return this.daPhone;
	}

	public void setDaPhone(String daPhone) {
		this.daPhone = daPhone;
	}

	public String getDaCommunityWebsite() {
		return this.daCommunityWebsite;
	}

	public void setDaCommunityWebsite(String daCommunityWebsite) {
		this.daCommunityWebsite = daCommunityWebsite;
	}

	public String getFkSubscriberId() {
		return this.fkSubscriberId;
	}

	public void setFkSubscriberId(String fkSubscriberId) {
		this.fkSubscriberId = fkSubscriberId;
	}

	public Date getDaDate() {
		return this.daDate;
	}

	public void setDaDate(Date daDate) {
		this.daDate = daDate;
	}

	public String getDaMark() {
		return this.daMark;
	}

	public void setDaMark(String daMark) {
		this.daMark = daMark;
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

	public Set getBfBuildingses() {
		return this.bfBuildingses;
	}

	public void setBfBuildingses(Set bfBuildingses) {
		this.bfBuildingses = bfBuildingses;
	}

}