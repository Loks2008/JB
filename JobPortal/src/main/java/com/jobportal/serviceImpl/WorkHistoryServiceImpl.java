package com.jobportal.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jobportal.dao.WorkHistoryDAO;
import com.jobportal.model.WorkHistory;
import com.jobportal.model.Response;
import com.jobportal.service.WorkHistoryService;

@Repository
public class WorkHistoryServiceImpl implements WorkHistoryService {

	@Autowired
	WorkHistoryDAO workhistoryDAO;
	
	@Override
	public Response enterWorkHistoryService(WorkHistory wh) {
		Response res=new Response();
		int i=workhistoryDAO.enterWorkHistoryDao(wh);
		if(i>=0)
		{
			res.setResponseValue("200");
		}
		else
			res.setResponseValue("500");
		return res;
	}

}
