package com.zensar.jobcentral.entities;

/**
 * @author Gourab Sarkar
 * @modification_date 04 Oct 2019 20:08
 * @creation_date 01 Oct 2019 21:02
 * @version 0.1
 * @copyright Zensar Technologies 2019. All Rights Reserved.
 * @description This is the persistent Login Class (operates in Persistence layer)
 */

import javax.persistence.Entity;

@Entity
public class Admin {
	
	private int locationId;
	private String branch;
	private String userId;
	
	public Admin() 
	{
		// This is the default constructor.
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {			// TODO :: Ask UI team
		return "AdminBean [locationId=" + locationId + ", branch=" + branch + ", userId=" + userId + "]";
	}

}
