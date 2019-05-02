package com.jobportal.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.activation.DataSource;

import org.springframework.stereotype.Repository;

import com.jobportal.dao.DBConnectionDAO;
import com.jobportal.dao.PersonalInfoDAO;
import com.jobportal.model.PersonalInfo;

@Repository
public class PersonalInfoDAOImpl implements PersonalInfoDAO {

	DataSource dataSource;
	@Override
	public int enterPersonalInfoDao(PersonalInfo psf) {
		int status=0;
		Connection connection = DBConnectionDAO.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into personalinfo values(?,?,?,?,?,?)");
			ps.setInt(1,psf.getId());
			ps.setString(2,psf.getName());
			ps.setString(3,psf.getMobileno());
			ps.setString(4,psf.getEmail());
			ps.setString(5, psf.getSpecialization());
			ps.setString(6, psf.getPassingyear());
			status=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
}
}