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
 * BfRoom entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "bf_room", catalog = "wccams")
public class BfRoom implements java.io.Serializable {

	// Fields

	private String pkId;
	private BfUnit bfUnit;
	private String daRnumber;
	private String daRoomName;
	private String daLevel;
	private Float daConstructionArea;
	private Float daComprisingArea;
	private Float daPoolArea;
	private Float daBalconyArea;
	private String fkTowardId;
	private Integer daStorey;
	private String fkApartmentId;
	private String daRemark;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set<PmFamilyroom> pmFamilyrooms = new HashSet<PmFamilyroom>(0);

	// Constructors

	/** default constructor */
	public BfRoom() {
	}

	/** minimal constructor */
	public BfRoom(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public BfRoom(String pkId, BfUnit bfUnit, String daRnumber,
			String daRoomName, String daLevel, Float daConstructionArea,
			Float daComprisingArea, Float daPoolArea, Float daBalconyArea,
			String fkTowardId, Integer daStorey, String fkApartmentId,
			String daRemark, Boolean isDelete, Timestamp dtDate,
			Integer rkOrder, Timestamp ctTime, Set<PmFamilyroom> pmFamilyrooms) {
		this.pkId = pkId;
		this.bfUnit = bfUnit;
		this.daRnumber = daRnumber;
		this.daRoomName = daRoomName;
		this.daLevel = daLevel;
		this.daConstructionArea = daConstructionArea;
		this.daComprisingArea = daComprisingArea;
		this.daPoolArea = daPoolArea;
		this.daBalconyArea = daBalconyArea;
		this.fkTowardId = fkTowardId;
		this.daStorey = daStorey;
		this.fkApartmentId = fkApartmentId;
		this.daRemark = daRemark;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.pmFamilyrooms = pmFamilyrooms;
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
	@JoinColumn(name = "fk_Unit_id")
	public BfUnit getBfUnit() {
		return this.bfUnit;
	}

	public void setBfUnit(BfUnit bfUnit) {
		this.bfUnit = bfUnit;
	}

	@Column(name = "da_Rnumber", length = 50)
	public String getDaRnumber() {
		return this.daRnumber;
	}

	public void setDaRnumber(String daRnumber) {
		this.daRnumber = daRnumber;
	}

	@Column(name = "da_RoomName", length = 100)
	public String getDaRoomName() {
		return this.daRoomName;
	}

	public void setDaRoomName(String daRoomName) {
		this.daRoomName = daRoomName;
	}

	@Column(name = "da_Level", length = 10)
	public String getDaLevel() {
		return this.daLevel;
	}

	public void setDaLevel(String daLevel) {
		this.daLevel = daLevel;
	}

	@Column(name = "da_ConstructionArea", precision = 12, scale = 0)
	public Float getDaConstructionArea() {
		return this.daConstructionArea;
	}

	public void setDaConstructionArea(Float daConstructionArea) {
		this.daConstructionArea = daConstructionArea;
	}

	@Column(name = "da_ComprisingArea", precision = 12, scale = 0)
	public Float getDaComprisingArea() {
		return this.daComprisingArea;
	}

	public void setDaComprisingArea(Float daComprisingArea) {
		this.daComprisingArea = daComprisingArea;
	}

	@Column(name = "da_PoolArea", precision = 12, scale = 0)
	public Float getDaPoolArea() {
		return this.daPoolArea;
	}

	public void setDaPoolArea(Float daPoolArea) {
		this.daPoolArea = daPoolArea;
	}

	@Column(name = "da_BalconyArea", precision = 12, scale = 0)
	public Float getDaBalconyArea() {
		return this.daBalconyArea;
	}

	public void setDaBalconyArea(Float daBalconyArea) {
		this.daBalconyArea = daBalconyArea;
	}

	@Column(name = "fk_Toward_id", length = 36)
	public String getFkTowardId() {
		return this.fkTowardId;
	}

	public void setFkTowardId(String fkTowardId) {
		this.fkTowardId = fkTowardId;
	}

	@Column(name = "da_Storey")
	public Integer getDaStorey() {
		return this.daStorey;
	}

	public void setDaStorey(Integer daStorey) {
		this.daStorey = daStorey;
	}

	@Column(name = "fk_Apartment_id", length = 36)
	public String getFkApartmentId() {
		return this.fkApartmentId;
	}

	public void setFkApartmentId(String fkApartmentId) {
		this.fkApartmentId = fkApartmentId;
	}

	@Column(name = "da_Remark", length = 100)
	public String getDaRemark() {
		return this.daRemark;
	}

	public void setDaRemark(String daRemark) {
		this.daRemark = daRemark;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bfRoom")
	public Set<PmFamilyroom> getPmFamilyrooms() {
		return this.pmFamilyrooms;
	}

	public void setPmFamilyrooms(Set<PmFamilyroom> pmFamilyrooms) {
		this.pmFamilyrooms = pmFamilyrooms;
	}

}