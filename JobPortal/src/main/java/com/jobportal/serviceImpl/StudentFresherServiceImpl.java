package com.jobportal.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jobportal.dao.StudentFresherDAO;
import com.jobportal.model.Student;
import com.jobportal.service.StudentFresherService;




@Repository
public class StudentFresherServiceImpl implements StudentFresherService {

	@Autowired
	StudentFresherDAO studentfresherdao;
	
	@Override
	public void createUser(Student stud) {
		
		studentfresherdao.docreate(stud);
		
	}


}
