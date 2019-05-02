package com.jobportal.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;


import com.jobportal.dao.DBConnectionDAO;
import com.jobportal.dao.RecruiterPostJobDAO;
import com.jobportal.model.DisabilityJob;
import com.jobportal.model.RecruiterJobPost;
import com.jobportal.model.WalkInJob;

@Repository
public class RecruiterPostJobDAOImpl implements RecruiterPostJobDAO {
	
	@Override
	 public void walkinjobDao(WalkInJob wij)
	{
		
		try{
			Connection con=DBConnectionDAO.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into walkinjob values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,wij.getAddress());
			ps.setString(2,wij.getCity());
			ps.setString(3,wij.getDate());
			ps.setString(4,wij.getTimefrom());
			ps.setString(5,wij.getTimeto());
			ps.setString(6,wij.getJobdescription());
			ps.setString(7,wij.getNumberofopenings());
			ps.setString(8,wij.getSkills());
			ps.setInt(9,wij.getExperiencemin());
			ps.setInt(10,wij.getExperiencemax());
			ps.setString(11,wij.getJoblocaton());
			ps.setString(12,wij.getIndustry());
			ps.setString(13,wij.getCategory());
			ps.setString(14,wij.getRole());
			ps.setString(15,wij.getEducation());
			ps.setString(16,wij.getBranch());
			ps.setString(17,wij.getNationality());
			ps.setString(18,wij.getRecruitername());
			ps.setString(19,wij.getRecruitermobileno());
			ps.setString(20,wij.getRecruiteremail());
			ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
	}
	
	@Override
	public void disabilityjobDao(DisabilityJob dj)
	{
		

		try{
			Connection con=DBConnectionDAO.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into disabilityjob values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,dj.getJobtitle());
			ps.setString(2,dj.getJobsummary());
			ps.setString(3,dj.getJobdetails());
			ps.setString(4,dj.getSkills());
			ps.setInt(5,dj.getExperiencemin());
			ps.setInt(6,dj.getExperiencemax());
			ps.setString(7,dj.getIndustry());
			ps.setString(8,dj.getCategory());
			ps.setString(9,dj.getRole());
			ps.setString(10,dj.getRecruitername());
			ps.setInt(11,dj.getRecruitermobileno());
			ps.setString(12,dj.getRecruiteremail());
			ps.setString(13,dj.getRecruitercompanyprofile());
			ps.setString(14,dj.getJoblocation());
			ps.setString(15,dj.getInterviewlocation());
			ps.setString(16,dj.getLanguage());
			ps.setString(17,dj.getNationality());
			ps.setString(18,dj.getDegree());
			ps.setString(19,dj.getSpecialization());
			ps.setInt(20,dj.getYearfrom());
			ps.setInt(21,dj.getYearto());
			ps.setString(22,dj.getCollegename());
			ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}	
	}
	
	@Override
	public void contractjobDao(RecruiterJobPost rjp)
	{
		
		try{
			Connection con=DBConnectionDAO.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into contractjob values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,rjp.getJobsummary());
			ps.setString(2,rjp.getJobdetail());
			ps.setString(3,rjp.getSkills());
			ps.setInt(4,rjp.getExperiencemin());
			ps.setInt(5,rjp.getExperiencemax());
			ps.setString(6,rjp.getJoblocation());
			ps.setString(7,rjp.getIndustry());
			ps.setString(8,rjp.getCateogry());
			ps.setString(9,rjp.getRole());
			ps.setString(10,rjp.getEducation());
			ps.setString(11,rjp.getBranch());
			ps.setString(12,rjp.getNationality());
			ps.setString(13,rjp.getRecruitername());
			ps.setString(14,rjp.getRecruitermobileno());
			ps.setString(15,rjp.getRecruiteremail());
			ps.setString(16,rjp.getRecruitercompanyprofile());
			ps.setString(17,rjp.getJobtype());
			ps.setInt(18,rjp.getSalarymin());
			ps.setInt(19,rjp.getSalarymax());
			
			ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		
	}
	
	
	
	public void fulltimejobDao(RecruiterJobPost rjp)
	{
		

		try{
			Connection con=DBConnectionDAO.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into fulltimejob values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	
			ps.setString(1,rjp.getJobsummary());
			ps.setString(2,rjp.getJobdetail());
			ps.setString(3,rjp.getSkills());
			ps.setInt(4,rjp.getExperiencemin());
			ps.setInt(5,rjp.getExperiencemax());
			ps.setString(6,rjp.getJoblocation());
			ps.setString(7,rjp.getIndustry());
			ps.setString(8,rjp.getCateogry());
			ps.setString(9,rjp.getRole());
			ps.setString(10,rjp.getEducation());
			ps.setString(11,rjp.getBranch());
			ps.setString(12,rjp.getNationality());
			ps.setString(13,rjp.getRecruitername());
			ps.setString(14,rjp.getRecruitermobileno());
			ps.setString(15,rjp.getRecruiteremail());
			ps.setString(16,rjp.getRecruitercompanyprofile());
			ps.setString(17,rjp.getJobtype());
			ps.setInt(18,rjp.getSalarymin());
			ps.setInt(19,rjp.getSalarymax());
			
			ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
	}
}
