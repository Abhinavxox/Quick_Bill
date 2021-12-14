package com.service;

import java.util.List;

import com.model.cashier;

public interface cashierService {
	
	boolean addCashier(cashier c);
	
	boolean deleteCashier(int id);
	
	boolean updateCashier(cashier c);
	
	cashier getCashierById(int id);
	
	List<cashier> getAllCashier();
	
	List<cashier> searchCashier(String data);

}
