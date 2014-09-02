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
 * BfUnit entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "bf_unit", catalog = "wccams")
public class BfUnit implements java.io.Serializable {

	// Fields

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
	private Set<BfRoom> bfRooms = new HashSet<BfRoom>(0);

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
			Timestamp dtDate, Integer rkOrder, Timestamp ctTime,
			Set<BfRoom> bfRooms) {
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
	@Id
	@Column(name = "pk_Id", unique = true, nullable = false, length = 36)
	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_Buildings_id")
	public BfBuildings getBfBuildings() {
		return this.bfBuildings;
	}

	public void setBfBuildings(BfBuildings bfBuildings) {
		this.bfBuildings = bfBuildings;
	}

	@Column(name = "da_Unumber", length = 50)
	public String getDaUnumber() {
		return this.daUnumber;
	}

	public void setDaUnumber(String daUnumber) {
		this.daUnumber = daUnumber;
	}

	@Column(name = "da_UnitName", length = 50)
	public String getDaUnitName() {
		return this.daUnitName;
	}

	public void setDaUnitName(String daUnitName) {
		this.daUnitName = daUnitName;
	}

	@Column(name = "da_HouseNumber", length = 50)
	public String getDaHouseNumber() {
		return this.daHouseNumber;
	}

	public void setDaHouseNumber(String daHouseNumber) {
		this.daHouseNumber = daHouseNumber;
	}

	@Column(name = "da_Line")
	public Integer getDaLine() {
		return this.daLine;
	}

	public void setDaLine(Integer daLine) {
		this.daLine = daLine;
	}

	@Column(name = "da_Column")
	public Integer getDaColumn() {
		return this.daColumn;
	}

	public void setDaColumn(Integer daColumn) {
		this.daColumn = daColumn;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bfUnit")
	public Set<BfRoom> getBfRooms() {
		return this.bfRooms;
	}

	public void setBfRooms(Set<BfRoom> bfRooms) {
		this.bfRooms = bfRooms;
	}

}