package com.jobportal.dao;

import com.jobportal.model.DisabilityJob;
import com.jobportal.model.RecruiterJobPost;
import com.jobportal.model.WalkInJob;

public interface RecruiterPostJobDAO {

	void walkinjobDao(WalkInJob wij);
	
	void disabilityjobDao(DisabilityJob dj);
	
	void contractjobDao(RecruiterJobPost rjp);
	
	void fulltimejobDao(RecruiterJobPost rjp);
	
}
