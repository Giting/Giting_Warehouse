package com.giting.entities.table;

import java.util.HashSet;
import java.util.Set;

/**
 * SmErstorage entity. @author MyEclipse Persistence Tools
 */

public class SmErstorage implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pkId;
	private String daErstorage;
	private Set smElectronicrecords = new HashSet(0);

	// Constructors

	/** default constructor */
	public SmErstorage() {
	}

	/** minimal constructor */
	public SmErstorage(String pkId) {
		this.pkId = pkId;
	}

	/** full constructor */
	public SmErstorage(String pkId, String daErstorage, Set smElectronicrecords) {
		this.pkId = pkId;
		this.daErstorage = daErstorage;
		this.smElectronicrecords = smElectronicrecords;
	}

	// Property accessors

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public String getDaErstorage() {
		return this.daErstorage;
	}

	public void setDaErstorage(String daErstorage) {
		this.daErstorage = daErstorage;
	}

	public Set getSmElectronicrecords() {
		return this.smElectronicrecords;
	}

	public void setSmElectronicrecords(Set smElectronicrecords) {
		this.smElectronicrecords = smElectronicrecords;
	}

}