package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.model.User;
import com.revature.util.ConnectionUtil;

public class OrderDAO implements OrderDAOImp
{
	public  void addOrder(User user,int cans_avail)
	{
	Connection con = ConnectionUtil.getConnection();
	String sql="insert into order_det(user_id,order_cans) values(?,?)";
	PreparedStatement pst = null;
	try {
		pst = con.prepareStatement(sql);
		pst.setInt(1, user.getId());
		pst.setInt(2,cans_avail);
		//pst.setInt(3, User.getReserve_id());
		pst.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
		throw new RuntimeException("Unable to order");
	}
	finally {
		ConnectionUtil.close(con, pst);
	}
	}
public void addReserveOrder(User user,int order_cans) throws Exception {
		
		Connection con =null;
		PreparedStatement pst = null;
		con = ConnectionUtil.getConnection();
		String sql = "insert into order_det(user_id,reserve_id,order_cans) values"
				+ "(?,?,?) ";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, user.getId());
			pst.setInt(2, User.getReserve_id());
			pst.setInt(3,order_cans);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Unable to order Reserved Cans",e);
		}
		finally {
			ConnectionUtil.close(con, pst);
		}
	}
	
	
}
