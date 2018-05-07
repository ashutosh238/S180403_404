package com.ashutosh.shoppingcart.dao;

import java.util.List;

import com.ashutosh.shoppingcart.domain.User;

public interface UserDAO {
	
	
	public boolean  save(User user);
	
	
	
	
	public boolean delete(String emailID);
	
	 
	public boolean update(User user);
	
	
	 
	public  User    get(String emailID);
	
	
	 
	public  List<User>    list();
	
	 
	public User validate(String emailID, String password);
		
	
	

}