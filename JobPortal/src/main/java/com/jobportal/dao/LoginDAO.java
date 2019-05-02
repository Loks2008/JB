package com.jobportal.dao;



import com.jobportal.model.JsonResponseLogin;
import com.jobportal.model.LoginJob;

public interface LoginDAO 
{

public JsonResponseLogin doLoginDao(LoginJob job);

}
