package com.jobportal.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.model.JsonResponseLogin;
import com.jobportal.model.RecruiterLogin;
import com.jobportal.service.RecruiterLoginService;

@RestController
public class RecruiterLoginRestController
{
	
@Autowired
RecruiterLoginService loginrecruiterservice;

	
	@CrossOrigin(origins= "*")
	
	@PostMapping("/rest/recrutier/Login")
	public JsonResponseLogin RecruiterLogincontro(@RequestBody RecruiterLogin recruiter)throws SQLException,IOException
	{
	
	
	JsonResponseLogin status;
	
	System.out.println(recruiter.getName());
	System.out.println(recruiter.getPassword());
	
	status=loginrecruiterservice.doLogin(recruiter);
	
	
	if(status!=null)
	{
	System.out.println("success");	  
	}
	
	else
	{
		System.out.println("lol");
	}
	return status;
	
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		

