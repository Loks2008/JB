package com.jobportal.controller;



import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.jobportal.dao.RegisterDAO;
import com.jobportal.model.Job;
import com.jobportal.service.RegisterService;
@RestController
public class RegisterController 
{
	@Autowired
	RegisterService registerService;
	
	@CrossOrigin(origins="*")
	@PostMapping("/create")
	public String createJob(@RequestBody Job job)throws SQLException,IOException
	{
		String b="not registered";
		boolean status=false;
		System.out.println(job.getEmail());
		status=registerService.createUser(job);
		if(status==true)
		{
			b="registered";
		}
		return b;
	}
}