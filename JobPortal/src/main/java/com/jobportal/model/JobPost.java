package com.jobportal.model;

import java.util.List;

public class JobPost {
	String position,companyname,skills,joblocation;
	int experiencemin,experiencemax;

	
	
	public JobPost(String position,String companyname, String skills,String joblocation,int experiencemin,int experiencemax)
	{
		super();
		this.position=position;
		this.companyname=companyname;
		this.skills=skills;
		this.joblocation=joblocation;
		this.experiencemin=experiencemin;
		this.experiencemax=experiencemax;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getJoblocation() {
		return joblocation;
	}
	public void setJoblocation(String joblocation) {
		this.joblocation = joblocation;
	}
	public int getExperiencemin() {
		return experiencemin;
	}
	public void setExperiencemin(int experiencemin) {
		this.experiencemin = experiencemin;
	}
	public int getExperiencemax() {
		return experiencemax;
	}
	public void setExperiencemax(int experiencemax) {
		this.experiencemax = experiencemax;
	}
	
	

}
