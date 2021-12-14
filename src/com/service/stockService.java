package com.service;

import java.util.List;
import com.model.stock;

public interface stockService {
	
	boolean addstock(stock s);
	
	boolean deletestock(int id);
	
	boolean updatestock(stock s);
	
	stock getStockById(int id);
	
	List<stock> getAllStock();
	
	List<stock> searchStock(String data);

}
