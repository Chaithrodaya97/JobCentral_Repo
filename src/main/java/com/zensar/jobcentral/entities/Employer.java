package com.zensar.jobcentral.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employer {
	
	@Id
	private String userId;
	private String name;
	private int contact;
	private String designation;
	private int companyId;
	private int locationId;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getContact() {
		return contact;
	}
	
	public void setContact(int contact) {
		this.contact = contact;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public int getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	public int getLocationId() {
		return locationId;
	}
	
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "Employer [userId=" + userId + ", name=" + name + ", contact=" + contact + ", designation=" + designation
				+ ", companyId=" + companyId + ", locationId=" + locationId + "]";
	}

}
