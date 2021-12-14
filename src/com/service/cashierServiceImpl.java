package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.database;

import com.model.cashier;
import com.mysql.jdbc.PreparedStatement;

public class cashierServiceImpl implements cashierService {
	
	Connection con = null;
	public cashierServiceImpl() {
		con = database.getDbObject();
	}

	@Override
	public boolean addCashier(cashier c) {	
		try {
			String sql = "insert into cashier(id,name,number,address,email,password)values(?,?,?,?,?,?)";
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setInt(1, c.getId());
			pstm.setString(2, c.getName());
			pstm.setString(3, c.getNumber());
			pstm.setString(4, c.getAddress());
			pstm.setString(5, c.getEmail());
			pstm.setString(6, c.getPassword());
			pstm.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteCashier(int id) {
		String sql = "delete from cashier where id = "+id;
		try {
			Statement stm = con.createStatement();
			stm.execute(sql);
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateCashier(cashier c) {
		try {
			String sql = "update cashier set name = ?,number = ?,address = ?,email = ?,password = ? where id = ?";		
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setString(1, c.getName());
			pstm.setString(2, c.getNumber());
			pstm.setString(3, c.getAddress());
			pstm.setString(4, c.getEmail());
			pstm.setString(5, c.getPassword());		
			pstm.setInt(6, c.getId());
			pstm.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public cashier getCashierById(int id) {
		cashier c = new cashier();
		String sql = "select * from cashier where id ="+id;
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			if(rs.next()) {
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("name"));
				c.setNumber(rs.getString("number"));
				c.setAddress(rs.getString("address"));
				c.setEmail(rs.getString("email"));
				c.setPassword(rs.getString("password"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public List<cashier> getAllCashier() {
		List<cashier> slist = new ArrayList<>();
		String sql = "select * from cashier";
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while(rs.next()) {
			cashier c = new cashier();
			c.setId(rs.getInt("id"));
			c.setName(rs.getString("name"));
			c.setNumber(rs.getString("number"));
			c.setAddress(rs.getString("address"));
			c.setEmail(rs.getString("email"));	
			c.setPassword(rs.getString("password"));
			slist.add(c);			
			}	
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return slist;
	}

	@Override
	public List<cashier> searchCashier(String data) {
		return null;
	}

}
