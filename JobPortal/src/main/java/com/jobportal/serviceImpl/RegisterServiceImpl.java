package com.jobportal.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.jobportal.dao.LoginDAO;
import com.jobportal.dao.RegisterDAO;
import com.jobportal.model.Job;
import com.jobportal.service.RegisterService;

@Repository
public class RegisterServiceImpl implements RegisterService
{
	@Autowired
	RegisterDAO registerDAO;
	
	@Override
	public boolean createUser(Job job) 
	{
		boolean b=false;
		 b=registerDAO.docreate(job);
	return b;			
	}
}