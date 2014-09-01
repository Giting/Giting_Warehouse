package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.Date;

/**
 * SmAnnouncement entity. @author MyEclipse Persistence Tools
 */

public class SmAnnouncement implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pkId;
	private SmUser smUser;
	private String daAnnouncementNumber;
	private String daAnnouncement;
	private String daConnent;
	private Date daPublished;
	private Date daEntTime;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;

	// Constructors

	/** default constructor */
	public SmAnnouncement() {
	}

	/** minimal constructor */
	public SmAnnouncement(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public SmAnnouncement(String pkId, SmUser smUser,
			String daAnnouncementNumber, String daAnnouncement,
			String daConnent, Date daPublished, Date daEntTime,
			Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime) {
		this.pkId = pkId;
		this.smUser = smUser;
		this.daAnnouncementNumber = daAnnouncementNumber;
		this.daAnnouncement = daAnnouncement;
		this.daConnent = daConnent;
		this.daPublished = daPublished;
		this.daEntTime = daEntTime;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
	}

	// Property accessors

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public SmUser getSmUser() {
		return this.smUser;
	}

	public void setSmUser(SmUser smUser) {
		this.smUser = smUser;
	}

	public String getDaAnnouncementNumber() {
		return this.daAnnouncementNumber;
	}

	public void setDaAnnouncementNumber(String daAnnouncementNumber) {
		this.daAnnouncementNumber = daAnnouncementNumber;
	}

	public String getDaAnnouncement() {
		return this.daAnnouncement;
	}

	public void setDaAnnouncement(String daAnnouncement) {
		this.daAnnouncement = daAnnouncement;
	}

	public String getDaConnent() {
		return this.daConnent;
	}

	public void setDaConnent(String daConnent) {
		this.daConnent = daConnent;
	}

	public Date getDaPublished() {
		return this.daPublished;
	}

	public void setDaPublished(Date daPublished) {
		this.daPublished = daPublished;
	}

	public Date getDaEntTime() {
		return this.daEntTime;
	}

	public void setDaEntTime(Date daEntTime) {
		this.daEntTime = daEntTime;
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

}