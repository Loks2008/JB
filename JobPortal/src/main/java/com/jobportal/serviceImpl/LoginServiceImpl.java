package com.jobportal.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jobportal.dao.LoginDAO;
import com.jobportal.model.JsonResponseLogin;
import com.jobportal.model.LoginJob;
import com.jobportal.service.LoginService;

@Repository
public class LoginServiceImpl implements LoginService
{
    @Autowired
    LoginDAO loginDAO;

	@Override	
	public JsonResponseLogin doLogin(LoginJob job)
	{
		JsonResponseLogin status=loginDAO.doLoginDao(job);
		if(status.getResponse().equals("200"))
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("failure");
		}
		return status;
	}
	
}

