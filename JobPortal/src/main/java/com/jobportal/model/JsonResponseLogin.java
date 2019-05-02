package com.jobportal.model;

import java.util.List;

public class JsonResponseLogin 
{

	private String response;
	private String name;
	private String mobileno;
	private String email;
	private String currentlocation;
	private List<JobPost> list;
	



	public List<JobPost> getList() {
		return list;
	}

	public void setList(List<JobPost> list) {
		this.list = list;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getMobileno() 
	{
		return mobileno;
	}

	public void setMobileno(String mobileno) 
	{
		this.mobileno = mobileno;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getCurrentlocation() 
	{
		return currentlocation;
	}

	public void setCurrentlocation(String currentlocation)
	{
		this.currentlocation = currentlocation;
	}	
	
}
