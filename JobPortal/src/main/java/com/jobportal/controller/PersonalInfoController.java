package com.jobportal.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.model.PersonalInfo;
import com.jobportal.model.Response;
import com.jobportal.service.PersonalInfoService;

@RestController
public class PersonalInfoController {

	@Autowired
	PersonalInfoService personalinfoservice;
	
	@PostMapping("/rest/employee/PersonalInfo")
	public Response enterPersonalInfo(@RequestBody PersonalInfo psf)throws SQLException,IOException
	{
		Response response;
		response=personalinfoservice.enterPersonalInfoService(psf);
		return response;
	}
}
