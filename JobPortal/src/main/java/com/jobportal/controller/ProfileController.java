package com.jobportal.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.model.Profile;
import com.jobportal.model.Response;
import com.jobportal.service.ProfileService;

@RestController
public class ProfileController {
	
	@Autowired
	ProfileService profileservice;
	
	@PostMapping("/rest/employee/Profile")
	public Response enterProfile(@RequestBody Profile pro)throws SQLException,IOException
	{
		Response response;
		response=profileservice.enterProfileService(pro);
		return response;
		
	}

}
