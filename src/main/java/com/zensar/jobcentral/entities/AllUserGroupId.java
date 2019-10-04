package com.zensar.jobcentral.entities;

/**
 * @author Gourab Sarkar
 * @modification_date 04 Oct 2019 09:18
 * @creation_date 01 Oct 2019 21:02
 * @version 0.1
 * @copyright Zensar Technologies 2019. All Rights Reserved.
 * @description This is the persistent Login Class (operates in Persistence layer)
 */

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * @author Gourab Sarkar
 * @modification_date 04 Oct 2019 09:18
 * @creation_date 04 Oct 2019 10:09
 * @version 0.1
 * @description This is the persistent Login Class.
 */

@Embeddable
public class AllUserGroupId implements Serializable {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AllUserGroupId [username=" + username + ", password=" + password + "]";
	}

}
