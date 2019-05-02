package com.jobportal.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.activation.DataSource;

import org.springframework.stereotype.Repository;

import com.jobportal.dao.DBConnectionDAO;
import com.jobportal.dao.ProjectDAO;
import com.jobportal.model.Project;

@Repository
public class ProjectDAOImpl implements ProjectDAO {
	
	DataSource dataSource;
	@Override
	public int enterProjectDao(Project proj) {
		int status=0;
		Connection connection = DBConnectionDAO.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into project values(?,?)");
			ps.setInt(1,proj.getId());
			ps.setString(2, proj.getProject());
			status=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
}