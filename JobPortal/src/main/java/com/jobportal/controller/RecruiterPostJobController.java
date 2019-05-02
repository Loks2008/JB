package com.jobportal.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.model.DisabilityJob;
import com.jobportal.model.RecruiterJobPost;
import com.jobportal.model.WalkInJob;
import com.jobportal.service.RecruiterPostJobService;


@RestController
public class RecruiterPostJobController {

	@Autowired
	RecruiterPostJobService registerPostJobService;
	
	@CrossOrigin(origins="*")
	@PostMapping("insert/walkinjob")
	public void walkinjobInsert(@RequestBody WalkInJob wij)throws SQLException,IOException
	{
	
		registerPostJobService.walkinjobService(wij);
	}
	
	@PostMapping("insert/disabilityjob")
	public void disabilityjobInsert(@RequestBody DisabilityJob dj)throws SQLException,IOException
	{
	
		registerPostJobService.disabilityjobService(dj);
	}
	
	@PostMapping("insert/contractjob")
	public void disabilityjobInsert(@RequestBody RecruiterJobPost  rjp)throws SQLException,IOException
	{
	
		registerPostJobService.contractjobService(rjp);
	}
	
	@PostMapping("insert/fulltimejob")
	public void fulltimejobInsert(@RequestBody RecruiterJobPost  rjp)throws SQLException,IOException
	{
	
		registerPostJobService.fulltimejobService(rjp);
	}

}
