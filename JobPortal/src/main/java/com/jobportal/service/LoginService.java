package com.jobportal.service;

import com.jobportal.model.JsonResponseLogin;
import com.jobportal.model.LoginJob;
public interface LoginService 
{	
public JsonResponseLogin doLogin(LoginJob job);

}
