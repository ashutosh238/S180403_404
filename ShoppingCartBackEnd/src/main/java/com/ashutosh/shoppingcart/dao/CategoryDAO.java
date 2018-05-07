package com.ashutosh.shoppingcart.dao;

import java.util.List;

import com.ashutosh.shoppingcart.domain.Category;

public interface CategoryDAO {
	
	 
	public  boolean   save(Category category); 
	
	 
	public  boolean   update(Category category); 
	
	 
	public boolean delete(String name);
	
	
	 
	public Category get(String name);
	
	 
	public List<Category>  list();
	
	
	
	
	

}