package com.giting.entities.table;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * PmFamily entity. @author MyEclipse Persistence Tools
 */

public class PmFamily implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	private Set pmFamilyrooms = new HashSet(0);
	private Set pmPopulationinformations = new HashSet(0);

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
			Timestamp ctTime, Set pmFamilyrooms, Set pmPopulationinformations) {
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

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public String getDaFnumber() {
		return this.daFnumber;
	}

	public void setDaFnumber(String daFnumber) {
		this.daFnumber = daFnumber;
	}

	public String getDaHouseheadName() {
		return this.daHouseheadName;
	}

	public void setDaHouseheadName(String daHouseheadName) {
		this.daHouseheadName = daHouseheadName;
	}

	public String getFkFamilyStatusId() {
		return this.fkFamilyStatusId;
	}

	public void setFkFamilyStatusId(String fkFamilyStatusId) {
		this.fkFamilyStatusId = fkFamilyStatusId;
	}

	public String getDaHomePhone() {
		return this.daHomePhone;
	}

	public void setDaHomePhone(String daHomePhone) {
		this.daHomePhone = daHomePhone;
	}

	public String getDaCellPhone() {
		return this.daCellPhone;
	}

	public void setDaCellPhone(String daCellPhone) {
		this.daCellPhone = daCellPhone;
	}

	public String getFkAccommodationTypeId() {
		return this.fkAccommodationTypeId;
	}

	public void setFkAccommodationTypeId(String fkAccommodationTypeId) {
		this.fkAccommodationTypeId = fkAccommodationTypeId;
	}

	public String getDaHomeAddress() {
		return this.daHomeAddress;
	}

	public void setDaHomeAddress(String daHomeAddress) {
		this.daHomeAddress = daHomeAddress;
	}

	public Boolean getDaIppf() {
		return this.daIppf;
	}

	public void setDaIppf(Boolean daIppf) {
		this.daIppf = daIppf;
	}

	public String getFkHousingStatusId() {
		return this.fkHousingStatusId;
	}

	public void setFkHousingStatusId(String fkHousingStatusId) {
		this.fkHousingStatusId = fkHousingStatusId;
	}

	public String getDaRoomNumber() {
		return this.daRoomNumber;
	}

	public void setDaRoomNumber(String daRoomNumber) {
		this.daRoomNumber = daRoomNumber;
	}

	public Float getDaLivingArea() {
		return this.daLivingArea;
	}

	public void setDaLivingArea(Float daLivingArea) {
		this.daLivingArea = daLivingArea;
	}

	public Float getDaConstructionArea() {
		return this.daConstructionArea;
	}

	public void setDaConstructionArea(Float daConstructionArea) {
		this.daConstructionArea = daConstructionArea;
	}

	public Integer getDaFamilySize() {
		return this.daFamilySize;
	}

	public void setDaFamilySize(Integer daFamilySize) {
		this.daFamilySize = daFamilySize;
	}

	public Integer getDaMan() {
		return this.daMan;
	}

	public void setDaMan(Integer daMan) {
		this.daMan = daMan;
	}

	public Integer getDaWoman() {
		return this.daWoman;
	}

	public void setDaWoman(Integer daWoman) {
		this.daWoman = daWoman;
	}

	public Integer getDaOutNumber() {
		return this.daOutNumber;
	}

	public void setDaOutNumber(Integer daOutNumber) {
		this.daOutNumber = daOutNumber;
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

	public Set getPmPopulationinformations() {
		return this.pmPopulationinformations;
	}

	public void setPmPopulationinformations(Set pmPopulationinformations) {
		this.pmPopulationinformations = pmPopulationinformations;
	}

}