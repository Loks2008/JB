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
import com.jobportal.dao.SkillsDAO;
import com.jobportal.model.Skill;

@Repository
public class SkillsDAOImpl implements SkillsDAO {
	
	DataSource dataSource;
	@Override
	public int enterSkillsDao(Skill skill) {
		int status=0;
		Connection connection = DBConnectionDAO.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into skills values(?,?)");
			ps.setInt(1,skill.getId());
			ps.setString(2,skill.getSkills());
			status=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	public List<Skill> fetchskill()
	{
		List<Skill> list=new ArrayList<Skill>();
		Connection con=DBConnectionDAO.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("select * from Skills");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
			Skill skill=new Skill(rs.getString("skills"));
			list.add(skill);
			}
			con.close();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return list;
		
	}
	
	
	

}
