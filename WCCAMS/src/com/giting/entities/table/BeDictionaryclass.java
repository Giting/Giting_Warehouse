package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BeDictionaryclass entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "be_dictionaryclass", catalog = "wccams")
public class BeDictionaryclass implements java.io.Serializable {

	// Fields

	private String pkId;
	private String dictClassname;
	private String dictClassvalue;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set<BeDictionarydata> beDictionarydatas = new HashSet<BeDictionarydata>(
			0);

	// Constructors

	/** default constructor */
	public BeDictionaryclass() {
	}

	/** minimal constructor */
	public BeDictionaryclass(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public BeDictionaryclass(String pkId, String dictClassname,
			String dictClassvalue, Boolean isDelete, Timestamp dtDate,
			Integer rkOrder, Timestamp ctTime,
			Set<BeDictionarydata> beDictionarydatas) {
		this.pkId = pkId;
		this.dictClassname = dictClassname;
		this.dictClassvalue = dictClassvalue;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.beDictionarydatas = beDictionarydatas;
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

	@Column(name = "dict_Classname", length = 50)
	public String getDictClassname() {
		return this.dictClassname;
	}

	public void setDictClassname(String dictClassname) {
		this.dictClassname = dictClassname;
	}

	@Column(name = "dict_Classvalue", length = 30)
	public String getDictClassvalue() {
		return this.dictClassvalue;
	}

	public void setDictClassvalue(String dictClassvalue) {
		this.dictClassvalue = dictClassvalue;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "beDictionaryclass")
	public Set<BeDictionarydata> getBeDictionarydatas() {
		return this.beDictionarydatas;
	}

	public void setBeDictionarydatas(Set<BeDictionarydata> beDictionarydatas) {
		this.beDictionarydatas = beDictionarydatas;
	}

}