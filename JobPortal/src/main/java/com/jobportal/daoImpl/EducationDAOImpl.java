package com.jobportal.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.activation.DataSource;

import org.springframework.stereotype.Repository;

import com.jobportal.dao.DBConnectionDAO;
import com.jobportal.dao.EducationDAO;
import com.jobportal.model.Education;

@Repository
public class EducationDAOImpl implements EducationDAO {

	DataSource dataSource;
	@Override
	public int enterEducationDao(Education edu) {
		int status=0;
		Connection connection = DBConnectionDAO.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into education values(?,?)");
			ps.setInt(1,edu.getId());
			ps.setString(2, edu.getEducation());
			status=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
}
