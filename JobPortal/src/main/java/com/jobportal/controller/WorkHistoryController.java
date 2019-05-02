package com.jobportal.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.model.WorkHistory;
import com.jobportal.model.Response;
import com.jobportal.service.WorkHistoryService;

@RestController
public class WorkHistoryController {

	@Autowired
	WorkHistoryService workhistoryservice;
	
	@PostMapping("/rest/employee/WorkHistory")
	public Response enterWorkHistory(@RequestBody WorkHistory wh)throws SQLException,IOException
	{
		Response response;
		response=workhistoryservice.enterWorkHistoryService(wh);
		return response;
		
	}
	
}
