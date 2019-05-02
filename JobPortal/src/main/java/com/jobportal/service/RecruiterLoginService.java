package com.jobportal.service;

import com.jobportal.model.JsonResponseLogin;
import com.jobportal.model.RecruiterLogin;

public interface RecruiterLoginService
{
	public JsonResponseLogin doLogin(RecruiterLogin recriuter);

public String sendSuccess();
public String sendFailure();
}
