package com.jobportal.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.activation.DataSource;
import org.springframework.stereotype.Repository;
import com.jobportal.dao.DBConnectionDAO;
import com.jobportal.dao.RegisterDAO;
import com.jobportal.model.Job;

@Repository
public class RegisterDAOImpl implements RegisterDAO 
{
	DataSource dataSource;
	@Override
public boolean docreate(Job job)
	{
	Connection connection = DBConnectionDAO.getConnection();
	int c=1;
	 boolean status=true;
	 String email=job.getEmail();
	 String mobileno=job.getMobileno();
	 if(checkEmail(email)||checkMobileno(mobileno))
	 {
		 status=false;
	 }
	 else
	 {
	 try 
	 {	 
    PreparedStatement ps = connection.prepareStatement("insert into expjob(name,email,password,mobileno,totalworkexperience,uploadresume,highestqualification,currentdesignation,currentcompany,annualsalary,worksince,currentlocation,noticeperiod,skills,designation,company,duration,highestqualifications,course,specialization,institutename,coursetype,passingyear,areasofexpertise) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	System.out.println("Task:"+job.getName());
	
	
	ps.setString(c++, job.getName());
	ps.setString(c++,job.getEmail());
	ps.setString(c++,job.getPassword());
	ps.setString(c++,job.getMobileno());
	ps.setInt(c++,job.getTotalworkexperience());
	ps.setString(c++,job.getUploadresume());
	ps.setString(c++,job.getHighestqualification());
	ps.setString(c++,job.getCurrentdesignation());
	ps.setString(c++,job.getCurrentcompany());
	ps.setString(c++,job.getAnnualsalary());
	ps.setInt(c++,job.getWorksince());
	ps.setString(c++,job.getCurrentlocation());
	ps.setString(c++,job.getNoticeperiod());
	ps.setString(c++,job.getSkills());
	ps.setString(c++,job.getDesignation());
	ps.setString(c++,job.getCompany());
	ps.setString(c++,job.getDuration());
	ps.setString(c++,job.getHighestqualifications());
	ps.setString(c++,job.getCourse());
	ps.setString(c++,job.getSpecialization());
	ps.setString(c++,job.getInstitutename());
	ps.setString(c++,job.getCoursetype());
	ps.setString(c++,job.getPassingyear());
	ps.setString(c++,job.getAreasofexpertise());
	ps.executeUpdate();
	}
	 catch (SQLException e)
	 {
	e.printStackTrace();
  }
	 }
	return status;
}
	boolean  checkEmail(String email)
	 {
		 boolean status=false;
		 Connection connection = DBConnectionDAO.getConnection();
		 try
		 {
			PreparedStatement ps=connection.prepareStatement("select * from expjob where email=?");
			
			ps.setString(1,email);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				status=true;
				
			}
			
		} 
		 catch (SQLException e)
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	 }
	 
	 boolean checkMobileno(String mobileno)
	 {
		 boolean status=false;
		 Connection connection = DBConnectionDAO.getConnection();
		
			 PreparedStatement ps;
			try 
			{
				ps = connection.prepareStatement("select * from expjob where mobileno=?");
				ps.setString(1,mobileno);
				 ResultSet rs=ps.executeQuery();
				 
				 if(rs.next())
				 {
					 
					 status=true;
				 }
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return status; 
	 }	 
}