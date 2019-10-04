package com.zensar.jobcentral.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class JobApplications {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String applicationId;
	private String jobId;
	private int dateTimeOfApplication;
	@JoinColumn(name = "userId")
	private Login login;
	
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public int getDateTimeOfApplication() {
		return dateTimeOfApplication;
	}
	public void setDateTimeOfApplication(int dateTimeOfApplication) {
		this.dateTimeOfApplication = dateTimeOfApplication;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	
	@Override
	public String toString() {
		return "JobApplications [applicationId=" + applicationId + ", jobId=" + jobId + ", dateTimeOfApplication="
				+ dateTimeOfApplication + ", login=" + login + "]";
	}
	
}
