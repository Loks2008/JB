package com.jobportal.model;

import java.util.List;

public class Skill {
	
	String skills;
	int id;
	
	private List<JobPost> list;
	



	public List<JobPost> getList() {
		return list;
	}

	public void setList(List<JobPost> list) {
		this.list = list;
	}


	public Skill(String skills)
	{
		this.skills=skills;
		
	}
	
	
	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
