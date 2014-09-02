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
 * PmFamily entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pm_family", catalog = "wccams")
public class PmFamily implements java.io.Serializable {

	// Fields

	private String pkId;
	private String daFnumber;
	private String daHouseheadName;
	private String fkFamilyStatusId;
	private String daHomePhone;
	private String daCellPhone;
	private String fkAccommodationTypeId;
	private String daHomeAddress;
	private Boolean daIppf;
	private String fkHousingStatusId;
	private String daRoomNumber;
	private Float daLivingArea;
	private Float daConstructionArea;
	private Integer daFamilySize;
	private Integer daMan;
	private Integer daWoman;
	private Integer daOutNumber;
	private String daRemark;
	private Boolean isDelete;
	private Timestamp dtDate;
	private Integer rkOrder;
	private Timestamp ctTime;
	private Set<PmFamilyroom> pmFamilyrooms = new HashSet<PmFamilyroom>(0);
	private Set<PmPopulationinformation> pmPopulationinformations = new HashSet<PmPopulationinformation>(
			0);

	// Constructors

	/** default constructor */
	public PmFamily() {
	}

	/** minimal constructor */
	public PmFamily(String pkId, Timestamp dtDate, Timestamp ctTime) {
		this.pkId = pkId;
		this.dtDate = dtDate;
		this.ctTime = ctTime;
	}

	/** full constructor */
	public PmFamily(String pkId, String daFnumber, String daHouseheadName,
			String fkFamilyStatusId, String daHomePhone, String daCellPhone,
			String fkAccommodationTypeId, String daHomeAddress, Boolean daIppf,
			String fkHousingStatusId, String daRoomNumber, Float daLivingArea,
			Float daConstructionArea, Integer daFamilySize, Integer daMan,
			Integer daWoman, Integer daOutNumber, String daRemark,
			Boolean isDelete, Timestamp dtDate, Integer rkOrder,
			Timestamp ctTime, Set<PmFamilyroom> pmFamilyrooms,
			Set<PmPopulationinformation> pmPopulationinformations) {
		this.pkId = pkId;
		this.daFnumber = daFnumber;
		this.daHouseheadName = daHouseheadName;
		this.fkFamilyStatusId = fkFamilyStatusId;
		this.daHomePhone = daHomePhone;
		this.daCellPhone = daCellPhone;
		this.fkAccommodationTypeId = fkAccommodationTypeId;
		this.daHomeAddress = daHomeAddress;
		this.daIppf = daIppf;
		this.fkHousingStatusId = fkHousingStatusId;
		this.daRoomNumber = daRoomNumber;
		this.daLivingArea = daLivingArea;
		this.daConstructionArea = daConstructionArea;
		this.daFamilySize = daFamilySize;
		this.daMan = daMan;
		this.daWoman = daWoman;
		this.daOutNumber = daOutNumber;
		this.daRemark = daRemark;
		this.isDelete = isDelete;
		this.dtDate = dtDate;
		this.rkOrder = rkOrder;
		this.ctTime = ctTime;
		this.pmFamilyrooms = pmFamilyrooms;
		this.pmPopulationinformations = pmPopulationinformations;
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

	@Column(name = "da_Fnumber", length = 100)
	public String getDaFnumber() {
		return this.daFnumber;
	}

	public void setDaFnumber(String daFnumber) {
		this.daFnumber = daFnumber;
	}

	@Column(name = "da_HouseheadName", length = 20)
	public String getDaHouseheadName() {
		return this.daHouseheadName;
	}

	public void setDaHouseheadName(String daHouseheadName) {
		this.daHouseheadName = daHouseheadName;
	}

	@Column(name = "fk_FamilyStatus_id", length = 36)
	public String getFkFamilyStatusId() {
		return this.fkFamilyStatusId;
	}

	public void setFkFamilyStatusId(String fkFamilyStatusId) {
		this.fkFamilyStatusId = fkFamilyStatusId;
	}

	@Column(name = "da_HomePhone", length = 20)
	public String getDaHomePhone() {
		return this.daHomePhone;
	}

	public void setDaHomePhone(String daHomePhone) {
		this.daHomePhone = daHomePhone;
	}

	@Column(name = "da_CellPhone", length = 20)
	public String getDaCellPhone() {
		return this.daCellPhone;
	}

	public void setDaCellPhone(String daCellPhone) {
		this.daCellPhone = daCellPhone;
	}

	@Column(name = "fk_AccommodationType_id", length = 36)
	public String getFkAccommodationTypeId() {
		return this.fkAccommodationTypeId;
	}

	public void setFkAccommodationTypeId(String fkAccommodationTypeId) {
		this.fkAccommodationTypeId = fkAccommodationTypeId;
	}

	@Column(name = "da_HomeAddress", length = 100)
	public String getDaHomeAddress() {
		return this.daHomeAddress;
	}

	public void setDaHomeAddress(String daHomeAddress) {
		this.daHomeAddress = daHomeAddress;
	}

	@Column(name = "da_IPPF")
	public Boolean getDaIppf() {
		return this.daIppf;
	}

	public void setDaIppf(Boolean daIppf) {
		this.daIppf = daIppf;
	}

	@Column(name = "fk_HousingStatus_id", length = 36)
	public String getFkHousingStatusId() {
		return this.fkHousingStatusId;
	}

	public void setFkHousingStatusId(String fkHousingStatusId) {
		this.fkHousingStatusId = fkHousingStatusId;
	}

	@Column(name = "da_RoomNumber", length = 20)
	public String getDaRoomNumber() {
		return this.daRoomNumber;
	}

	public void setDaRoomNumber(String daRoomNumber) {
		this.daRoomNumber = daRoomNumber;
	}

	@Column(name = "da_LivingArea", precision = 12, scale = 0)
	public Float getDaLivingArea() {
		return this.daLivingArea;
	}

	public void setDaLivingArea(Float daLivingArea) {
		this.daLivingArea = daLivingArea;
	}

	@Column(name = "da_ConstructionArea", precision = 12, scale = 0)
	public Float getDaConstructionArea() {
		return this.daConstructionArea;
	}

	public void setDaConstructionArea(Float daConstructionArea) {
		this.daConstructionArea = daConstructionArea;
	}

	@Column(name = "da_FamilySize")
	public Integer getDaFamilySize() {
		return this.daFamilySize;
	}

	public void setDaFamilySize(Integer daFamilySize) {
		this.daFamilySize = daFamilySize;
	}

	@Column(name = "da_Man")
	public Integer getDaMan() {
		return this.daMan;
	}

	public void setDaMan(Integer daMan) {
		this.daMan = daMan;
	}

	@Column(name = "da_Woman")
	public Integer getDaWoman() {
		return this.daWoman;
	}

	public void setDaWoman(Integer daWoman) {
		this.daWoman = daWoman;
	}

	@Column(name = "da_OutNumber")
	public Integer getDaOutNumber() {
		return this.daOutNumber;
	}

	public void setDaOutNumber(Integer daOutNumber) {
		this.daOutNumber = daOutNumber;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pmFamily")
	public Set<PmFamilyroom> getPmFamilyrooms() {
		return this.pmFamilyrooms;
	}

	public void setPmFamilyrooms(Set<PmFamilyroom> pmFamilyrooms) {
		this.pmFamilyrooms = pmFamilyrooms;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pmFamily")
	public Set<PmPopulationinformation> getPmPopulationinformations() {
		return this.pmPopulationinformations;
	}

	public void setPmPopulationinformations(
			Set<PmPopulationinformation> pmPopulationinformations) {
		this.pmPopulationinformations = pmPopulationinformations;
	}

}