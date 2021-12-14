package com.service;

import java.util.List;
import com.model.bill;

public interface billService {
	
	boolean addbill(bill b);
	
	boolean deletebill(int id);
	
	boolean updatebill(bill b);
	
	bill getBillById(int id);
	
	List<bill> getAllBill();
	
	List<bill> searchBill(String data);


}
