package com.jobportal.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.jobportal.dao.DBConnectionDAO;
import com.jobportal.dao.StudentFresherDAO;
import com.jobportal.model.Student;


@Repository
public class StudentFresherDAOImpl implements StudentFresherDAO {

	
	DataSource dataSource ;
	
	private Connection connection;
	
	 public StudentFresherDAOImpl() {
		  connection = DBConnectionDAO.getConnection();
		 }
	
	
	 @Override
		public void docreate(Student stud) {
		 try {
			   PreparedStatement preparedStatement = connection.prepareStatement("insert into studentfresher(name,email,password,mobileno,location,fileupload,qualification,course,specialization,collegename,coursetype,passingyear,skills) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			   System.out.println("Task:"+stud.getName());
			   
			   int count=1;
			   
			   preparedStatement.setString(count++, stud.getName());
			   preparedStatement.setString(count++, stud.getEmail());
			   preparedStatement.setString(count++, stud.getPassword());   
			   preparedStatement.setString(count++, stud.getMobileno());   
			   preparedStatement.setString(count++, stud.getLocation());   
			   preparedStatement.setString(count++, stud.getFileupload()); 
			   preparedStatement.setString(count++, stud.getQualification());
			   preparedStatement.setString(count++, stud.getCourse());
			   preparedStatement.setString( count++,stud.getSpecialization());
			   preparedStatement.setString(count++, stud.getCollegename());
			   preparedStatement.setString(count++, stud.getCoursetype());
			   preparedStatement.setString(count++, stud.getPassingyear());
			   preparedStatement.setString(count++, stud.getSkills());
			  
			   
			   
			   
			   preparedStatement.executeUpdate();
			   System.out.println("success");
			  } catch (SQLException e) {
			   e.printStackTrace();
			  }

	} 
	 
	 
	
	
}
