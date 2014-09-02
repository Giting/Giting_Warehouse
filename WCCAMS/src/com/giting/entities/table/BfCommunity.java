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
 * BfCommunity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "bf_community", catalog = "wccams")
public class BfCommunity implements java.io.Serializable {

	// Fields

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
	private Set<BfBuildings> bfBuildingses = new HashSet<BfBuildings>(0);

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
			Integer rkOrder, Timestamp ctTime, Set<BfBuildings> bfBuildingses) {
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
	@Id
	@Column(name = "pk_Id", unique = true, nullable = false)
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

	@Column(name = "da_Cnumber", length = 50)
	public String getDaCnumber() {
		return this.daCnumber;
	}

	public void setDaCnumber(String daCnumber) {
		this.daCnumber = daCnumber;
	}

	@Column(name = "da_ConName", length = 50)
	public String getDaConName() {
		return this.daConName;
	}

	public void setDaConName(String daConName) {
		this.daConName = daConName;
	}

	@Column(name = "da_ResidentialAddress", length = 100)
	public String getDaResidentialAddress() {
		return this.daResidentialAddress;
	}

	public void setDaResidentialAddress(String daResidentialAddress) {
		this.daResidentialAddress = daResidentialAddress;
	}

	@Column(name = "da_Phone", length = 20)
	public String getDaPhone() {
		return this.daPhone;
	}

	public void setDaPhone(String daPhone) {
		this.daPhone = daPhone;
	}

	@Column(name = "da_CommunityWebsite", length = 100)
	public String getDaCommunityWebsite() {
		return this.daCommunityWebsite;
	}

	public void setDaCommunityWebsite(String daCommunityWebsite) {
		this.daCommunityWebsite = daCommunityWebsite;
	}

	@Column(name = "fk_Subscriber_id", length = 36)
	public String getFkSubscriberId() {
		return this.fkSubscriberId;
	}

	public void setFkSubscriberId(String fkSubscriberId) {
		this.fkSubscriberId = fkSubscriberId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_Date", length = 10)
	public Date getDaDate() {
		return this.daDate;
	}

	public void setDaDate(Date daDate) {
		this.daDate = daDate;
	}

	@Column(name = "da_Mark", length = 100)
	public String getDaMark() {
		return this.daMark;
	}

	public void setDaMark(String daMark) {
		this.daMark = daMark;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bfCommunity")
	public Set<BfBuildings> getBfBuildingses() {
		return this.bfBuildingses;
	}

	public void setBfBuildingses(Set<BfBuildings> bfBuildingses) {
		this.bfBuildingses = bfBuildingses;
	}

}