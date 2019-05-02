package com.jobportal.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jobportal.dao.PersonalInfoDAO;
import com.jobportal.model.PersonalInfo;
import com.jobportal.model.Response;
import com.jobportal.service.PersonalInfoService;

@Repository
public class PersonalInfoServiceImpl implements PersonalInfoService {
	
	@Autowired
	PersonalInfoDAO personalinfoDAO;
	
	@Override
	public Response enterPersonalInfoService(PersonalInfo psf) {
		Response res=new Response();
		int i=personalinfoDAO.enterPersonalInfoDao(psf);
		if(i>=0)
		{
			res.setResponseValue("200");
		}
		else
			res.setResponseValue("500");
		return res;
	}
}
