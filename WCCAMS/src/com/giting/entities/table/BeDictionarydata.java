package com.giting.entities.table;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * BeDictionarydata entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "be_dictionarydata", catalog = "wccams", uniqueConstraints = @UniqueConstraint(columnNames = "fk_Dictionaryclass_id"))
public class BeDictionarydata implements java.io.Serializable {

	// Fields

	private String pkId;
	private BeDictionaryclass beDictionaryclass;
	private String dictdataName;
	private String dictdataValue;
	private Boolean isFixed;
	private Boolean isCancle;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;

	// Constructors

	/** default constructor */
	public BeDictionarydata() {
	}

	/** minimal constructor */
	public BeDictionarydata(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public BeDictionarydata(String pkId, BeDictionaryclass beDictionaryclass,
			String dictdataName, String dictdataValue, Boolean isFixed,
			Boolean isCancle, Boolean isDelete, Timestamp dtDate,
			Integer rkOrder, Timestamp ctTime) {
		this.pkId = pkId;
		this.beDictionaryclass = beDictionaryclass;
		this.dictdataName = dictdataName;
		this.dictdataValue = dictdataValue;
		this.isFixed = isFixed;
		this.isCancle = isCancle;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
	}

	// Property accessors
	@Id
	@Column(name = "pk_id", unique = true, nullable = false, length = 36)
	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_Dictionaryclass_id", unique = true)
	public BeDictionaryclass getBeDictionaryclass() {
		return this.beDictionaryclass;
	}

	public void setBeDictionaryclass(BeDictionaryclass beDictionaryclass) {
		this.beDictionaryclass = beDictionaryclass;
	}

	@Column(name = "dictdata_name", length = 50)
	public String getDictdataName() {
		return this.dictdataName;
	}

	public void setDictdataName(String dictdataName) {
		this.dictdataName = dictdataName;
	}

	@Column(name = "dictdata_value", length = 5)
	public String getDictdataValue() {
		return this.dictdataValue;
	}

	public void setDictdataValue(String dictdataValue) {
		this.dictdataValue = dictdataValue;
	}

	@Column(name = "is_Fixed")
	public Boolean getIsFixed() {
		return this.isFixed;
	}

	public void setIsFixed(Boolean isFixed) {
		this.isFixed = isFixed;
	}

	@Column(name = "is_Cancle")
	public Boolean getIsCancle() {
		return this.isCancle;
	}

	public void setIsCancle(Boolean isCancle) {
		this.isCancle = isCancle;
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