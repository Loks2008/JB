package com.jobportal.dao;

import com.jobportal.model.JsonResponseLogin;
import com.jobportal.model.RecruiterLogin;

public interface RecruiterLoginDAO 
{
	public JsonResponseLogin doLoginDao(RecruiterLogin recruiter);

}
