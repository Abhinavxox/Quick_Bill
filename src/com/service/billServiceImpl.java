package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.database;
import com.model.bill;
import com.mysql.jdbc.PreparedStatement;

public class billServiceImpl implements billService{
	
	Connection con = null;
	
	public billServiceImpl() {
		con = database.getDbObject();
	}

	@Override
	public boolean addbill(bill b) {
		try {
			String sql = "insert into bill(billno,customername,amount,date)values(?,?,?,?)";
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setInt(1, b.getBillNo());
			pstm.setString(2, b.getCustomerName());
			pstm.setFloat(3, b.getAmount());
			pstm.setDate(4, b.getDate());
			pstm.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deletebill(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatebill(bill b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public bill getBillById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<bill> getAllBill() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<bill> searchBill(String data) {
		List<bill> slist = new ArrayList<>();
		String sql = "select * from bill where customername like '"+data+"%' OR billno like'%"+data+"%'";
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while(rs.next()) {
			bill b = new bill();
			b.setBillNo(rs.getInt("billno"));
			b.setCustomerName(rs.getString("customername"));
			b.setAmount(rs.getFloat("amount"));
			b.setDate(rs.getDate("date"));
			slist.add(b);			
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return slist;
	}

}
