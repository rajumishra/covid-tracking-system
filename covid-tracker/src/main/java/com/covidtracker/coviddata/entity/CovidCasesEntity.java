package com.covidtracker.coviddata.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="covid_cases")
public class CovidCasesEntity {
	
	@Id
	private int id;
	@Column(name="case_type")
	private String caseType;
	
	@Column(name="country_id")
	private int countryID;
	
	@Column(name="state_id")
	private int stateID;
	
	@Column(name="citi_id")
	private int citiID;
	
	@Column(name="date_updated")
	private Date dateUpdated;
	
	@Column(name="case_count")
	private Integer caseCount;
	
	
	

	public Integer getCaseCount() {
		return caseCount;
	}
	public void setCaseCount(Integer caseCount) {
		this.caseCount = caseCount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCitiID() {
		return citiID;
	}
	public void setCitiID(int citiID) {
		this.citiID = citiID;
	}
	public String getCaseType() {
		return caseType;
	}
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}
	public int getCountryID() {
		return countryID;
	}
	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}
	public int getStateID() {
		return stateID;
	}
	public void setStateID(int stateID) {
		this.stateID = stateID;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	
	
	

}
