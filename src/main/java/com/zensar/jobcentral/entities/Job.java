package com.zensar.jobcentral.entities;

import java.sql.Clob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String jobId;
	private String jobName;
	private int companyId;
	private String jobType;
	private int numberOfVacancies;
	private Clob jobDescription;
	private String skillsRequired;
	@Column(name = "userId")
	private String employerUserId;
	private String category;
	@Column(name = "userId")
	private String jobseekerUserId;
	private int locationId;
	
	public String getJobId() {
		return jobId;
	}
	
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	
	public String getJobName() {
		return jobName;
	}
	
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public int getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	public String getJobType() {
		return jobType;
	}
	
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	
	public int getNumberOfVacancies() {
		return numberOfVacancies;
	}
	
	public void setNumberOfVacancies(int numberOfVacancies) {
		this.numberOfVacancies = numberOfVacancies;
	}
	
	public Clob getJobDescription() {
		return jobDescription;
	}
	
	public void setJobDescription(Clob jobDescription) {
		this.jobDescription = jobDescription;
	}
	
	public String getSkillsRequired() {
		return skillsRequired;
	}
	
	public void setSkillsRequired(String skillsRequired) {
		this.skillsRequired = skillsRequired;
	}
	
	public String getEmployerUserId() {
		return employerUserId;
	}
	
	public void setEmployerUserId(String employerUserId) {
		this.employerUserId = employerUserId;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getJobseekerUserId() {
		return jobseekerUserId;
	}
	
	public void setJobseekerUserId(String jobseekerUserId) {
		this.jobseekerUserId = jobseekerUserId;
	}
	
	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobName=" + jobName + ", companyId=" + companyId + ", jobType=" + jobType
				+ ", numberOfVacancies=" + numberOfVacancies + ", jobDescription=" + jobDescription
				+ ", skillsRequired=" + skillsRequired + ", employerUserId=" + employerUserId + ", category=" + category
				+ ", jobseekerUserId=" + jobseekerUserId + ", locationId=" + locationId + "]";
	}
	
}
