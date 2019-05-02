package com.jobportal.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.activation.DataSource;

import org.springframework.stereotype.Repository;

import com.jobportal.dao.DBConnectionDAO;
import com.jobportal.dao.RecruiterLoginDAO;
import com.jobportal.model.JsonResponseLogin;
import com.jobportal.model.RecruiterLogin;


@Repository
public class RecruiterLoginDAOImpl implements RecruiterLoginDAO

{
	DataSource dataSource;

	@Override
	public JsonResponseLogin doLoginDao(RecruiterLogin recruiter)
	{
		
		JsonResponseLogin js = new JsonResponseLogin();
		// TODO Auto-generated method stub
		Connection con=null;
		ResultSet rs=null;
		
		try
		{
		
		con=DBConnectionDAO.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from expjob where name=? and password=?");
		
		ps.setString(1,recruiter.getName());
		ps.setString(2, recruiter.getPassword());		
		rs=ps.executeQuery();
		if(rs.next())
			
		{
			js.setResponse("200");
			
		}
		else
		{
			System.out.println("sonamuthapocha");
			js.setResponse("500");
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			finally
			{
				try
				{
					rs.close();
					con.close();
				}
			
			catch(SQLException e)
				{
				e.printStackTrace();
				}		
			}
				
		return js;
	}

}
