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
 * BfBuildings entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "bf_buildings", catalog = "wccams")
public class BfBuildings implements java.io.Serializable {

	// Fields

	private String pkId;
	private BfCommunity bfCommunity;
	private String daBnumber;
	private String daBuildingName;
	private String fkCategoryId;
	private Integer daFloors;
	private String fkHousingTypeId;
	private String daMark;
	private String fkSubscriberId;
	private Date daDate;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set<BfUnit> bfUnits = new HashSet<BfUnit>(0);

	// Constructors

	/** default constructor */
	public BfBuildings() {
	}

	/** minimal constructor */
	public BfBuildings(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public BfBuildings(String pkId, BfCommunity bfCommunity, String daBnumber,
			String daBuildingName, String fkCategoryId, Integer daFloors,
			String fkHousingTypeId, String daMark, String fkSubscriberId,
			Date daDate, Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime, Set<BfUnit> bfUnits) {
		this.pkId = pkId;
		this.bfCommunity = bfCommunity;
		this.daBnumber = daBnumber;
		this.daBuildingName = daBuildingName;
		this.fkCategoryId = fkCategoryId;
		this.daFloors = daFloors;
		this.fkHousingTypeId = fkHousingTypeId;
		this.daMark = daMark;
		this.fkSubscriberId = fkSubscriberId;
		this.daDate = daDate;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.bfUnits = bfUnits;
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
	@JoinColumn(name = "fk_community_id")
	public BfCommunity getBfCommunity() {
		return this.bfCommunity;
	}

	public void setBfCommunity(BfCommunity bfCommunity) {
		this.bfCommunity = bfCommunity;
	}

	@Column(name = "da_BNumber", length = 50)
	public String getDaBnumber() {
		return this.daBnumber;
	}

	public void setDaBnumber(String daBnumber) {
		this.daBnumber = daBnumber;
	}

	@Column(name = "da_BuildingName", length = 50)
	public String getDaBuildingName() {
		return this.daBuildingName;
	}

	public void setDaBuildingName(String daBuildingName) {
		this.daBuildingName = daBuildingName;
	}

	@Column(name = "fk_category_id", length = 36)
	public String getFkCategoryId() {
		return this.fkCategoryId;
	}

	public void setFkCategoryId(String fkCategoryId) {
		this.fkCategoryId = fkCategoryId;
	}

	@Column(name = "da_Floors")
	public Integer getDaFloors() {
		return this.daFloors;
	}

	public void setDaFloors(Integer daFloors) {
		this.daFloors = daFloors;
	}

	@Column(name = "fk_housingType_id", length = 36)
	public String getFkHousingTypeId() {
		return this.fkHousingTypeId;
	}

	public void setFkHousingTypeId(String fkHousingTypeId) {
		this.fkHousingTypeId = fkHousingTypeId;
	}

	@Column(name = "da_Mark", length = 100)
	public String getDaMark() {
		return this.daMark;
	}

	public void setDaMark(String daMark) {
		this.daMark = daMark;
	}

	@Column(name = "fk_subscriber_id", length = 36)
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bfBuildings")
	public Set<BfUnit> getBfUnits() {
		return this.bfUnits;
	}

	public void setBfUnits(Set<BfUnit> bfUnits) {
		this.bfUnits = bfUnits;
	}

}