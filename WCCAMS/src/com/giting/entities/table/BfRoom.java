package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * BfRoom entity. @author MyEclipse Persistence Tools
 */

public class BfRoom implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	private Set pmFamilyrooms = new HashSet(0);

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
			Integer rkOrder, Timestamp ctTime, Set pmFamilyrooms) {
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

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public BfUnit getBfUnit() {
		return this.bfUnit;
	}

	public void setBfUnit(BfUnit bfUnit) {
		this.bfUnit = bfUnit;
	}

	public String getDaRnumber() {
		return this.daRnumber;
	}

	public void setDaRnumber(String daRnumber) {
		this.daRnumber = daRnumber;
	}

	public String getDaRoomName() {
		return this.daRoomName;
	}

	public void setDaRoomName(String daRoomName) {
		this.daRoomName = daRoomName;
	}

	public String getDaLevel() {
		return this.daLevel;
	}

	public void setDaLevel(String daLevel) {
		this.daLevel = daLevel;
	}

	public Float getDaConstructionArea() {
		return this.daConstructionArea;
	}

	public void setDaConstructionArea(Float daConstructionArea) {
		this.daConstructionArea = daConstructionArea;
	}

	public Float getDaComprisingArea() {
		return this.daComprisingArea;
	}

	public void setDaComprisingArea(Float daComprisingArea) {
		this.daComprisingArea = daComprisingArea;
	}

	public Float getDaPoolArea() {
		return this.daPoolArea;
	}

	public void setDaPoolArea(Float daPoolArea) {
		this.daPoolArea = daPoolArea;
	}

	public Float getDaBalconyArea() {
		return this.daBalconyArea;
	}

	public void setDaBalconyArea(Float daBalconyArea) {
		this.daBalconyArea = daBalconyArea;
	}

	public String getFkTowardId() {
		return this.fkTowardId;
	}

	public void setFkTowardId(String fkTowardId) {
		this.fkTowardId = fkTowardId;
	}

	public Integer getDaStorey() {
		return this.daStorey;
	}

	public void setDaStorey(Integer daStorey) {
		this.daStorey = daStorey;
	}

	public String getFkApartmentId() {
		return this.fkApartmentId;
	}

	public void setFkApartmentId(String fkApartmentId) {
		this.fkApartmentId = fkApartmentId;
	}

	public String getDaRemark() {
		return this.daRemark;
	}

	public void setDaRemark(String daRemark) {
		this.daRemark = daRemark;
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

	public Set getPmFamilyrooms() {
		return this.pmFamilyrooms;
	}

	public void setPmFamilyrooms(Set pmFamilyrooms) {
		this.pmFamilyrooms = pmFamilyrooms;
	}

}