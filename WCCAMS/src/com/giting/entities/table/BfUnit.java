package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * BfUnit entity. @author MyEclipse Persistence Tools
 */

public class BfUnit implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pkId;
	private BfBuildings bfBuildings;
	private String daUnumber;
	private String daUnitName;
	private String daHouseNumber;
	private Integer daLine;
	private Integer daColumn;
	private String daMark;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set bfRooms = new HashSet(0);

	// Constructors

	/** default constructor */
	public BfUnit() {
	}

	/** minimal constructor */
	public BfUnit(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public BfUnit(String pkId, BfBuildings bfBuildings, String daUnumber,
			String daUnitName, String daHouseNumber, Integer daLine,
			Integer daColumn, String daMark, Boolean isDelete,
			Timestamp dtDate, Integer rkOrder, Timestamp ctTime, Set bfRooms) {
		this.pkId = pkId;
		this.bfBuildings = bfBuildings;
		this.daUnumber = daUnumber;
		this.daUnitName = daUnitName;
		this.daHouseNumber = daHouseNumber;
		this.daLine = daLine;
		this.daColumn = daColumn;
		this.daMark = daMark;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.bfRooms = bfRooms;
	}

	// Property accessors

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public BfBuildings getBfBuildings() {
		return this.bfBuildings;
	}

	public void setBfBuildings(BfBuildings bfBuildings) {
		this.bfBuildings = bfBuildings;
	}

	public String getDaUnumber() {
		return this.daUnumber;
	}

	public void setDaUnumber(String daUnumber) {
		this.daUnumber = daUnumber;
	}

	public String getDaUnitName() {
		return this.daUnitName;
	}

	public void setDaUnitName(String daUnitName) {
		this.daUnitName = daUnitName;
	}

	public String getDaHouseNumber() {
		return this.daHouseNumber;
	}

	public void setDaHouseNumber(String daHouseNumber) {
		this.daHouseNumber = daHouseNumber;
	}

	public Integer getDaLine() {
		return this.daLine;
	}

	public void setDaLine(Integer daLine) {
		this.daLine = daLine;
	}

	public Integer getDaColumn() {
		return this.daColumn;
	}

	public void setDaColumn(Integer daColumn) {
		this.daColumn = daColumn;
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

	public Set getBfRooms() {
		return this.bfRooms;
	}

	public void setBfRooms(Set bfRooms) {
		this.bfRooms = bfRooms;
	}

}