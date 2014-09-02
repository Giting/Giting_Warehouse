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
 * PmFamilyroom entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pm_familyroom", catalog = "wccams")
public class PmFamilyroom implements java.io.Serializable {

	// Fields

	private String pkId;
	private BfRoom bfRoom;
	private PmFamily pmFamily;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;

	// Constructors

	/** default constructor */
	public PmFamilyroom() {
	}

	/** minimal constructor */
	public PmFamilyroom(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public PmFamilyroom(String pkId, BfRoom bfRoom, PmFamily pmFamily,
			Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime) {
		this.pkId = pkId;
		this.bfRoom = bfRoom;
		this.pmFamily = pmFamily;
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
	@JoinColumn(name = "fk_Room_id")
	public BfRoom getBfRoom() {
		return this.bfRoom;
	}

	public void setBfRoom(BfRoom bfRoom) {
		this.bfRoom = bfRoom;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_Family_id")
	public PmFamily getPmFamily() {
		return this.pmFamily;
	}

	public void setPmFamily(PmFamily pmFamily) {
		this.pmFamily = pmFamily;
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