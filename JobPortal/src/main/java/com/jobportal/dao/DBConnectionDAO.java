package com.jobportal.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionDAO 
{
	public static Connection getConnection() 
	{
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/job_portal";
		String username = "root";
		String password = "root";
 try 
		{
		
	try 
			{
				Class.forName("com.mysql.jdbc.Driver");
			}
catch (ClassNotFoundException e) 
	{
	e.printStackTrace();
  }

con = DriverManager.getConnection(url, username, password);
} 
   catch (Exception e)
   {
	e.printStackTrace();
		}

		return con;
	}

}
