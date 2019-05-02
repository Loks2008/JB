package com.jobportal.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jobportal.dao.EducationDAO;
import com.jobportal.model.Education;
import com.jobportal.model.Response;
import com.jobportal.service.EducationService;

@Repository
public class EducationServiceImpl implements EducationService{

	@Autowired
	EducationDAO educationDAO;
	
	@Override
	public Response enterEducationService(Education edu) {
		Response res=new Response();
		int i=educationDAO.enterEducationDao(edu);
		if(i>=0)
		{
			res.setResponseValue("200");
		}
		else
			res.setResponseValue("500");
		return res;
	}

}
