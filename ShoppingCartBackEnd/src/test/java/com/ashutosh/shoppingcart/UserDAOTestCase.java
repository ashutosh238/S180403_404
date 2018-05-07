package com.ashutosh.shoppingcart;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashutosh.shoppingcart.dao.UserDAO;
import com.ashutosh.shoppingcart.domain.User;

public class UserDAOTestCase {

	 
	
	private static AnnotationConfigApplicationContext context;
	
	private static UserDAO userDAO;
	
	private static User user;
	
	
	@BeforeClass
	public static void initialize()
	{
		context= new AnnotationConfigApplicationContext();
		context.scan("com.ashutosh");
		context.refresh();
		
		userDAO = (UserDAO)context.getBean("userDAO");
		user = (User) context.getBean("user");
				
	}
	
	
	
	@Test
	public void saveUserTestCase()
	{
		user = new User();
		user.setEmailID("Shubam@gmail.com");
		user.setName("SHUBHAM KUMAR SHUKLA");
		user.setPassword("Shubam@123");
		user.setRole('C');
		user.setMobile("886666");
		user.setAddress(" Delhi");
		
		
		
		boolean result = userDAO.save(user);
		Assert.assertEquals("save user",true,result );
	}
	
	
}



