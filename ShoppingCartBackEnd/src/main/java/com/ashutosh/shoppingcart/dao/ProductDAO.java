package com.ashutosh.shoppingcart.dao;

import java.util.List;

import com.ashutosh.shoppingcart.domain.Product;

public interface ProductDAO {
	
	  
	public  boolean   save(Product product); 
	
	 
	public  boolean   update(Product product); 
	
 
	public boolean delete(String id);
	
	
	 
	public Product get(String id);
	
	 
	public List<Product>  list();
	
	
	 
	
	public List<Product> list(int amount);
	
	 
	
	public List<Product> list(int minAmount, int MaxAmout);
	
	 
	
	public List<Product> list(String productName, int minAmount, int MaxAmout);
	
	
	
	
}