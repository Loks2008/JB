package com.jobportal.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jobportal.dao.ProjectDAO;
import com.jobportal.model.Project;
import com.jobportal.model.Response;
import com.jobportal.service.ProjectService;

@Repository
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectDAO projectDAO;
	
	@Override
	public Response enterProjectService(Project proj) {
		Response res=new Response();
		int i=projectDAO.enterProjectDao(proj);
		if(i>=0)
		{
			res.setResponseValue("200");
		}
		else
			res.setResponseValue("500");
		return res;
	}

}
