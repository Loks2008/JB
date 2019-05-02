package com.jobportal.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jobportal.dao.RecruiterPostJobDAO;
import com.jobportal.model.DisabilityJob;
import com.jobportal.model.RecruiterJobPost;
import com.jobportal.model.WalkInJob;
import com.jobportal.service.RecruiterPostJobService;

@Repository
public class RecruiterPostJobServiceImpl implements RecruiterPostJobService {
	
	@Autowired
	RecruiterPostJobDAO recruiterpostjobDAO;
	
	@Override
	public void walkinjobService(WalkInJob wij)
	{
		recruiterpostjobDAO.walkinjobDao(wij);
	}
	
	@Override
	public void disabilityjobService(DisabilityJob dj)
	{
		recruiterpostjobDAO.disabilityjobDao(dj);
	}
	
	@Override
	public void contractjobService(RecruiterJobPost  rjp)
	{
		recruiterpostjobDAO.contractjobDao(rjp);
	}
	
	@Override
	public void fulltimejobService(RecruiterJobPost  rjp)
	{
		recruiterpostjobDAO.fulltimejobDao(rjp);
	}
}
