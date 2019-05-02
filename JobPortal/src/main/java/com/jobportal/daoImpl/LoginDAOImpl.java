package com.jobportal.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.activation.DataSource;
import org.springframework.stereotype.Repository;
import com.jobportal.dao.DBConnectionDAO;
import com.jobportal.dao.LoginDAO;
import com.jobportal.model.JobPost;
import com.jobportal.model.JsonResponseLogin;
import com.jobportal.model.LoginJob;
import com.jobportal.model.Skill;

@Repository
public class LoginDAOImpl implements LoginDAO {

	int id;
	DataSource dataSource;

	@Override
	public JsonResponseLogin doLoginDao(LoginJob job) {
		JsonResponseLogin js = new JsonResponseLogin();
		try {
			Connection con = DBConnectionDAO.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"SELECT id,name,mobileno,email,currentlocation,skills FROM expjob WHERE email=? AND password=?");
			ps.setString(1, job.getEmail());
			ps.setString(2, job.getPassword());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				js.setResponse("200");
				js.setName(rs.getString("name"));
				js.setMobileno(rs.getString("mobileno"));
				js.setEmail(rs.getString("email"));
				js.setCurrentlocation(rs.getString("currentlocation"));
				id = rs.getInt("id");
			} else {
				js.setResponse("500");
				System.out.println("wrong username or password");

			}
			con.close();
			List<Skill> listskill = fetchskill(id);
			List<JobPost> list = fetchJobPost(listskill);

			js.setList(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return js;
	}
	
//used to create a list for skill to fetch particular skill
	
	public List<Skill> fetchskill(int id) {
		List<Skill> listskill = new ArrayList<Skill>();
		Connection con = DBConnectionDAO.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select * from Skills where id=" + id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Skill skill = new Skill(rs.getString("skills"));
				listskill.add(skill);
			}
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return listskill;
	}

//created list to search jobs from 6 tables of the job post based on skills
	public List<JobPost> fetchJobPost(List<Skill> listskill) {
		List<JobPost> list = new ArrayList<JobPost>();
		Connection con = DBConnectionDAO.getConnection();
		try {

			PreparedStatement ps = con.prepareStatement(
					"SELECT position,companyname,skills,joblocation,experiencemin,experiencemax FROM walkinjob WHERE skills=? UNION SELECT position,companyname,skills,joblocation,experiencemin,experiencemax FROM disabilityjob WHERE skills=? UNION SELECT position,companyname,skills,joblocation,experiencemin,experiencemax FROM fulltimejob WHERE skills=? UNION SELECT position,companyname,skills,joblocation,experiencemin,experiencemax FROM jobsconnect WHERE skills=? UNION SELECT position,companyname,skills,joblocation,experiencemin,experiencemax FROM contractjob WHERE skills=? UNION SELECT position,companyname,skills,joblocation,experiencemin,experiencemax FROM campusjob WHERE skills=?");
			for (Skill skill : listskill) {
				ps.setString(1, skill.getSkills());
				ps.setString(2, skill.getSkills());
				ps.setString(3, skill.getSkills());
				ps.setString(4, skill.getSkills());
				ps.setString(5, skill.getSkills());
				ps.setString(6, skill.getSkills());
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					JobPost jp = new JobPost(rs.getString("position"), rs.getString("companyname"),
							rs.getString("skills"), rs.getString("joblocation"), rs.getInt("experiencemin"),
							rs.getInt("experiencemax"));
					System.out.println(rs.getString("position"));
					list.add(jp);
				}
			}
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}
}
