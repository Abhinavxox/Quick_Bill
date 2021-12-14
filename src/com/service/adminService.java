package com.service;

import java.util.List;

import com.model.admin;

public interface adminService {
	
	boolean addAdmin(admin a);
	
	boolean deleteAdmin(int id);
	
	boolean updateAdmin(admin a);
	
	admin getAdmintById(int id);
	
	List<admin> getAllAdmin();
	
	List<admin> searchAdmin(String data);

}
