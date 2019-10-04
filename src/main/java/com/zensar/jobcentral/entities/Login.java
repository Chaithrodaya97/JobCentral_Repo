package com.zensar.jobcentral.entities;

import javax.persistence.EmbeddedId;

/**
 * @author Gourab Sarkar
 * @modification_date 04 Oct 2019 09:18
 * @creation_date 01 Oct 2019 21:02
 * @version 0.2
 * @copyright Zensar Technologies 2019. All Rights Reserved.
 * @description This is the persistent Login Class (operates in Persistence layer)
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Login {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	
	@EmbeddedId
	private AllUserGroupId userPassId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public AllUserGroupId getUserPassId() {
		return userPassId;
	}

	public void setUserPassId(AllUserGroupId userPassId) {
		this.userPassId = userPassId;
	}

	@Override
	public String toString() {
		return "Login [userId=" + userId + ", userPassId=" + userPassId + "]";
	}
	
}
