package com.zensar.jobcentral.entities;

/**
 * @author Gourab Sarkar
 * @modification_date 04 Oct 2019 09:18
 * @creation_date 01 Oct 2019 21:02
 * @version 0.1
 * @copyright Zensar Technologies 2019. All Rights Reserved.
 * @description This is the persistent Login Class (operates in Persistence layer)
 */

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class JobSeeker {
	
	@Id
	@JoinColumn(name = "userId")
	private Login login;
	
	private String name;
	private int dob;
	private int mobile;
	private int locationId;
	private int sscYear;
	private double sscPercent;
	private int hscYear;
	private double hscPercent;
	private String qualification;
	private int qualificationYear;
	private double cgpa;
	private String summary;
	private String lastRole;
	private int fromDateLastRole;
	private int toDateLastRole;
	private String skillset;
	private Blob resume;
	
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public int getSscYear() {
		return sscYear;
	}
	public void setSscYear(int sscYear) {
		this.sscYear = sscYear;
	}
	public double getSscPercent() {
		return sscPercent;
	}
	public void setSscPercent(double sscPercent) {
		this.sscPercent = sscPercent;
	}
	public int getHscYear() {
		return hscYear;
	}
	public void setHscYear(int hscYear) {
		this.hscYear = hscYear;
	}
	public double getHscPercent() {
		return hscPercent;
	}
	public void setHscPercent(double hscPercent) {
		this.hscPercent = hscPercent;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getQualificationYear() {
		return qualificationYear;
	}
	public void setQualificationYear(int qualificationYear) {
		this.qualificationYear = qualificationYear;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getLastRole() {
		return lastRole;
	}
	public void setLastRole(String lastRole) {
		this.lastRole = lastRole;
	}
	public int getFromDateLastRole() {
		return fromDateLastRole;
	}
	public void setFromDateLastRole(int fromDateLastRole) {
		this.fromDateLastRole = fromDateLastRole;
	}
	public int getToDateLastRole() {
		return toDateLastRole;
	}
	public void setToDateLastRole(int toDateLastRole) {
		this.toDateLastRole = toDateLastRole;
	}
	public String getSkillset() {
		return skillset;
	}
	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
	public Blob getResume() {
		return resume;
	}
	public void setResume(Blob resume) {
		this.resume = resume;
	}
	
	@Override
	public String toString() {
		return "JobSeeker [login=" + login + ", name=" + name + ", dob=" + dob + ", mobile=" + mobile + ", locationId="
				+ locationId + ", sscYear=" + sscYear + ", sscPercent=" + sscPercent + ", hscYear=" + hscYear
				+ ", hscPercent=" + hscPercent + ", qualification=" + qualification + ", qualificationYear="
				+ qualificationYear + ", cgpa=" + cgpa + ", summary=" + summary + ", lastRole=" + lastRole
				+ ", fromDateLastRole=" + fromDateLastRole + ", toDateLastRole=" + toDateLastRole + ", skillset="
				+ skillset + ", resume=" + resume + "]";
	}
	
}
