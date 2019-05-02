package com.jobportal.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.model.JsonResponseLogin;
import com.jobportal.model.LoginJob;

import com.jobportal.service.LoginService;


@RestController
public class LoginController
{
	
@Autowired	
LoginService loginservice;

@CrossOrigin(origins="*")
@PostMapping("/rest/employee/Login")
public JsonResponseLogin LoginJob(@RequestBody LoginJob job)throws SQLException,IOException
{
	JsonResponseLogin status;
	System.out.println(job.getEmail());
	System.out.println(job.getPassword());
	status=loginservice.doLogin(job);
	return status;
}
}
