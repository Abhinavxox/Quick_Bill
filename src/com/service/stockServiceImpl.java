package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.db.database;
import com.model.cashier;
import com.model.stock;
import com.mysql.jdbc.PreparedStatement;

public class stockServiceImpl implements stockService{
	
	Connection con = null;
	
	public stockServiceImpl() {
		con = database.getDbObject();
	}

	@Override
	public boolean addstock(stock s) {
		try {
			String sql = "insert into stock(id,company,model,available,mrp)values(?,?,?,?,?)";
			
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setInt(1, s.getId());
			pstm.setString(2, s.getCompany());
			pstm.setString(3, s.getModel());
			pstm.setInt(4, s.getAvailable());
			pstm.setInt(5, s.getMrp());		
			pstm.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deletestock(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatestock(stock s) {
		try {
			String sql = "update stock set company = ?,model = ?,available = ?,mrp = ? where id = ?";		
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setString(1, s.getCompany());
			pstm.setString(2, s.getModel());
			pstm.setInt(3, s.getAvailable());
			pstm.setInt(4, s.getMrp());		
			pstm.setInt(5, s.getId());
			pstm.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public stock getStockById(int id) {
		stock s = new stock();
		String sql = "select * from stock where id ="+id;
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			if(rs.next()) {
				s.setId(rs.getInt("id"));
				s.setCompany(rs.getString("company"));
				s.setModel(rs.getString("model"));
				s.setAvailable(rs.getInt("available"));
				s.setMrp(rs.getInt("mrp"));
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

	@Override
	public List<stock> getAllStock() {
		List<stock> slist = new ArrayList<>();
		String sql = "select * from stock";
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while(rs.next()) {
			stock s = new stock();
			s.setId(rs.getInt("id"));
			s.setCompany(rs.getString("company"));
			s.setModel(rs.getString("model"));
			s.setAvailable(rs.getInt("available"));
			s.setMrp(rs.getInt("mrp"));
			slist.add(s);			
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return slist;
	}

	@Override
	public List<stock> searchStock(String data) {
		List<stock> slist = new ArrayList<>();
		String sql = "select * from stock where company like '"+data+"%' OR model like '"+data+"%' OR id = '"+data+"'"  ;
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while(rs.next()) {
			stock s = new stock();
			s.setId(rs.getInt("id"));
			s.setCompany(rs.getString("company"));
			s.setModel(rs.getString("model"));
			s.setAvailable(rs.getInt("available"));
			s.setMrp(rs.getInt("mrp"));
			slist.add(s);			
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return slist;
	}

}
