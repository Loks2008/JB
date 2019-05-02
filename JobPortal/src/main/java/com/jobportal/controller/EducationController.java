package com.jobportal.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.model.Education;
import com.jobportal.model.Response;
import com.jobportal.service.EducationService;

@RestController
public class EducationController {

	@Autowired
	EducationService educationservice;
	
	@CrossOrigin(origins="*")
	@PostMapping("/rest/employee/Education")
	public Response enterEducation(@RequestBody Education edu)throws SQLException,IOException
	{
		Response response;
		response=educationservice.enterEducationService(edu);
		return response;
	}
}
