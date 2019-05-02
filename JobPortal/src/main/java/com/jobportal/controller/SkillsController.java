package com.jobportal.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.model.Skill;
import com.jobportal.model.Response;
import com.jobportal.service.SkillsService;

@RestController
public class SkillsController {

	@Autowired
	SkillsService Skillsservice;
	
	@PostMapping("/rest/employee/Skills")
	public Response enterSkills(@RequestBody Skill skill)throws SQLException,IOException
	{
		Response response;
		response=Skillsservice.enterSkillsService(skill);
		return response;
		
	}
}
