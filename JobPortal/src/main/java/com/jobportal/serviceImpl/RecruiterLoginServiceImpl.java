package com.jobportal.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jobportal.dao.RecruiterLoginDAO;
import com.jobportal.model.JsonResponseLogin;
import com.jobportal.model.RecruiterLogin;
import com.jobportal.service.RecruiterLoginService;



@Repository
public class RecruiterLoginServiceImpl implements RecruiterLoginService
{
	@Autowired
	
	RecruiterLoginDAO recruiterloginDAO;
	
	@Override
	public JsonResponseLogin doLogin(RecruiterLogin recriuter)
	

	{
		JsonResponseLogin status = recruiterloginDAO.doLoginDao(recriuter);
		
         return status;
                 
	}
	public String sendSuccess()
	{
		String a="200";
		return a;
		
	}
	
	public String sendFailure()
	{
		String a="500";
		return a;
			
	}
		
}
