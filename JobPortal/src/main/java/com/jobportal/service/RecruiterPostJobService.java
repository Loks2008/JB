package com.jobportal.service;

import com.jobportal.model.DisabilityJob;
import com.jobportal.model.RecruiterJobPost;
import com.jobportal.model.WalkInJob;

public interface RecruiterPostJobService {
	public void walkinjobService(WalkInJob wij);
	
	public void disabilityjobService(DisabilityJob dj);
	
	public void contractjobService(RecruiterJobPost  rjp);

	public void fulltimejobService(RecruiterJobPost  rjp);
	
	
}
