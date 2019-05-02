package com.jobportal.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jobportal.dao.ProfileDAO;
import com.jobportal.model.Profile;
import com.jobportal.model.Response;
import com.jobportal.service.ProfileService;

@Repository
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
	ProfileDAO profileDAO;
	
	@Override
	public Response enterProfileService(Profile pro) {
		Response res=new Response();
		int i=profileDAO.enterProfileDao(pro);
		if(i>=0)
		{
			res.setResponseValue("200");
		}
		else
			res.setResponseValue("500");
		return res;
	}

}
