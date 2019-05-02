package com.jobportal.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.model.Project;
import com.jobportal.model.Response;
import com.jobportal.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	ProjectService projectservice;
	
	@PostMapping("/rest/employee/Project")
	public Response enterProject(@RequestBody Project proj)throws SQLException,IOException
	{
		Response response;
		response=projectservice.enterProjectService(proj);
		return response;
		
	}

}
