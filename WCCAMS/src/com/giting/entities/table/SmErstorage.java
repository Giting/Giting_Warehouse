package com.giting.entities.table;

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
 * SmErstorage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sm_erstorage", catalog = "wccams")
public class SmErstorage implements java.io.Serializable {

	// Fields

	private String pkId;
	private String daErstorage;
	private Set<SmElectronicrecord> smElectronicrecords = new HashSet<SmElectronicrecord>(
			0);

	// Constructors

	/** default constructor */
	public SmErstorage() {
	}

	/** minimal constructor */
	public SmErstorage(String pkId) {
		this.pkId = pkId;
	}

	/** full constructor */
	public SmErstorage(String pkId, String daErstorage,
			Set<SmElectronicrecord> smElectronicrecords) {
		this.pkId = pkId;
		this.daErstorage = daErstorage;
		this.smElectronicrecords = smElectronicrecords;
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

	@Column(name = "da_ERStorage")
	public String getDaErstorage() {
		return this.daErstorage;
	}

	public void setDaErstorage(String daErstorage) {
		this.daErstorage = daErstorage;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "smErstorage")
	public Set<SmElectronicrecord> getSmElectronicrecords() {
		return this.smElectronicrecords;
	}

	public void setSmElectronicrecords(
			Set<SmElectronicrecord> smElectronicrecords) {
		this.smElectronicrecords = smElectronicrecords;
	}

}