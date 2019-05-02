package com.jobportal.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.activation.DataSource;

import org.springframework.stereotype.Repository;

import com.jobportal.dao.DBConnectionDAO;
import com.jobportal.dao.ProfileDAO;
import com.jobportal.model.Profile;

@Repository
public class ProfileDAOImpl implements ProfileDAO {
	
	DataSource dataSource;
	@Override
	public int enterProfileDao(Profile pro) {
		int status=0;
		Connection connection = DBConnectionDAO.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into profile values(?,?,?,?,?)");
			ps.setInt(1,pro.getId());
			ps.setString(2,pro.getName());
			ps.setString(3,pro.getMobileno());
			ps.setString(4,pro.getEmail());
			ps.setInt(5,pro.getTotalworkexperience());
			status=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
}
