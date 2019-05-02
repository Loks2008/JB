package com.jobportal.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jobportal.dao.SkillsDAO;
import com.jobportal.model.Skill;
import com.jobportal.model.Response;
import com.jobportal.service.SkillsService;

@Repository
public class SkillsServiceImpl implements SkillsService {

	@Autowired
	SkillsDAO skillsDAO;
	
	@Override
	public Response enterSkillsService(Skill skill) {
		Response res=new Response();
		int i=skillsDAO.enterSkillsDao(skill);
		if(i>=0)
		{
			res.setResponseValue("200");
		}
		else
			res.setResponseValue("500");
		return res;
	}
}
