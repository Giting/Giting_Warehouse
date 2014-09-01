package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BfBuildings entity. @author MyEclipse Persistence Tools
 */

public class BfBuildings implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	private Set bfUnits = new HashSet(0);

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
			Timestamp ctTime, Set bfUnits) {
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

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public BfCommunity getBfCommunity() {
		return this.bfCommunity;
	}

	public void setBfCommunity(BfCommunity bfCommunity) {
		this.bfCommunity = bfCommunity;
	}

	public String getDaBnumber() {
		return this.daBnumber;
	}

	public void setDaBnumber(String daBnumber) {
		this.daBnumber = daBnumber;
	}

	public String getDaBuildingName() {
		return this.daBuildingName;
	}

	public void setDaBuildingName(String daBuildingName) {
		this.daBuildingName = daBuildingName;
	}

	public String getFkCategoryId() {
		return this.fkCategoryId;
	}

	public void setFkCategoryId(String fkCategoryId) {
		this.fkCategoryId = fkCategoryId;
	}

	public Integer getDaFloors() {
		return this.daFloors;
	}

	public void setDaFloors(Integer daFloors) {
		this.daFloors = daFloors;
	}

	public String getFkHousingTypeId() {
		return this.fkHousingTypeId;
	}

	public void setFkHousingTypeId(String fkHousingTypeId) {
		this.fkHousingTypeId = fkHousingTypeId;
	}

	public String getDaMark() {
		return this.daMark;
	}

	public void setDaMark(String daMark) {
		this.daMark = daMark;
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

	public Set getBfUnits() {
		return this.bfUnits;
	}

	public void setBfUnits(Set bfUnits) {
		this.bfUnits = bfUnits;
	}

}