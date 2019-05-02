
package com.jobportal.controller;


import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.jobportal.dao.StudentFresherDAO;
import com.jobportal.model.Student;
import com.jobportal.service.StudentFresherService;


@RestController
public class StudentFresherController {
	
	@Autowired	
	StudentFresherService std;
	

	@Autowired
	private StudentFresherDAO repository;
	
	@Autowired
	ServletContext context;
	
	@PostMapping(path ="/StudentFresher/create")
	public Student createEmployee(@RequestBody Student stud)
	{
		System.out.println(stud.getName());
	
		repository.docreate(stud);
		return stud;
	}
	
	
	
	/*
	@PostMapping("/StudentFresher/login")
	//Returning is List is supported with JSON response only
	//If you want XML, then add a wrapper class as Root XML element, for example EmployeeList
	public List<Student> getLogindetails(@RequestBody StudentLoginCredential stud) {
	
		System.out.println(stud.getUserName());
		
		List<Student> getLogin=repository.getLogin(stud);
		return 	getLogin;

		
		
	}
*/	
	
	
  
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

