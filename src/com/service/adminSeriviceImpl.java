package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.db.database;
import com.model.admin;
import com.mysql.jdbc.PreparedStatement;

public class adminSeriviceImpl implements adminService{
	
	Connection con = null;
	public adminSeriviceImpl() {
		con = database.getDbObject();
	}

	@Override
	public boolean addAdmin(admin a) {
		try {
			String sql = "insert into admin(fname,lname,username,password,dob,address)values(?,?,?,?,?,?)";
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setString(1, a.getFname());
			pstm.setString(2, a.getLname());
			pstm.setString(3, a.getUsername());
			pstm.setString(4, a.getPassword());
			pstm.setDate(5, a.getDob());
			pstm.setString(6, a.getAddress());
			pstm.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return false;
	}

	@Override
	public boolean deleteAdmin(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAdmin(admin a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public admin getAdmintById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<admin> getAllAdmin() {
		List<admin> slist = new ArrayList<>();
		String sql = "select * from admin";
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while(rs.next()) {
			admin a = new admin();
			a.setUsername(rs.getString("username"));
			a.setPassword(rs.getString("password"));		
			slist.add(a);			
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return slist;
	}

	@Override
	public List<admin> searchAdmin(String data) {
		// TODO Auto-generated method stub
		return null;
	}

}
