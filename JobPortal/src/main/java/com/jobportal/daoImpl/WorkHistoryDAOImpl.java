package com.jobportal.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.activation.DataSource;

import org.springframework.stereotype.Repository;

import com.jobportal.dao.DBConnectionDAO;
import com.jobportal.dao.WorkHistoryDAO;
import com.jobportal.model.WorkHistory;

@Repository
public class WorkHistoryDAOImpl implements WorkHistoryDAO  {
	
	DataSource dataSource;
	@Override
	public int enterWorkHistoryDao(WorkHistory wh) {
		int status=0;
		Connection connection = DBConnectionDAO.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into workhistory values(?,?,?,?,?,?)");
			ps.setInt(1,wh.getId());
			ps.setString(2,wh.getCurrentcompany());
			ps.setString(3,wh.getAnnualsalary());
			ps.setString(4, wh.getCompany());
			ps.setString(5, wh.getDuration());
			ps.setInt(6,wh.getWorksince());
			status=ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return status;
	}	

}
