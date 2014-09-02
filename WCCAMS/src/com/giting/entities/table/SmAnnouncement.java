package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SmAnnouncement entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sm_announcement", catalog = "wccams")
public class SmAnnouncement implements java.io.Serializable {

	// Fields

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
	@Id
	@Column(name = "pk_Id", unique = true, nullable = false, length = 36)
	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_User_id")
	public SmUser getSmUser() {
		return this.smUser;
	}

	public void setSmUser(SmUser smUser) {
		this.smUser = smUser;
	}

	@Column(name = "da_AnnouncementNumber", length = 30)
	public String getDaAnnouncementNumber() {
		return this.daAnnouncementNumber;
	}

	public void setDaAnnouncementNumber(String daAnnouncementNumber) {
		this.daAnnouncementNumber = daAnnouncementNumber;
	}

	@Column(name = "da_Announcement", length = 30)
	public String getDaAnnouncement() {
		return this.daAnnouncement;
	}

	public void setDaAnnouncement(String daAnnouncement) {
		this.daAnnouncement = daAnnouncement;
	}

	@Column(name = "da_Connent", length = 300)
	public String getDaConnent() {
		return this.daConnent;
	}

	public void setDaConnent(String daConnent) {
		this.daConnent = daConnent;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_Published", length = 10)
	public Date getDaPublished() {
		return this.daPublished;
	}

	public void setDaPublished(Date daPublished) {
		this.daPublished = daPublished;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "da_EntTime", length = 10)
	public Date getDaEntTime() {
		return this.daEntTime;
	}

	public void setDaEntTime(Date daEntTime) {
		this.daEntTime = daEntTime;
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