package com.ashutosh.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//we have to define hadler mapping
	//Different types of mappings
	//@GetMapping - doGet
	//@PostMapping - doPost  - create
	//@PutMapping	-doPut   - update
	//@DeleteMapping - doDelete - delete
	
	
	//   http://localhost:8080/shoppingcart/
		@GetMapping("/")
	//@RequestMapping(value="/",   method = RequestMethod.GET)
	public String homePage()
	{
			System.out.println("The method homePage is called");
		return "home";
	}
		
	//http://localhost:8080/shoppingcart/login	
	@GetMapping("/login")	
	public ModelAndView login()
	{
		ModelAndView mv=new ModelAndView("home");
		return mv.addObject("isUserClickedLogin",true);
	
	}
	@GetMapping("/logout")	
	public ModelAndView logout()
	{ModelAndView mv=new ModelAndView("home");
	return mv.addObject("loginMessage","logout...bye..");
	
	}
	//http://localhost:8080/shoppingcart/register
		@GetMapping("/register")	
		
	public ModelAndView registration()
	
		{
			ModelAndView mv=new ModelAndView("home");
			return mv.addObject("isUserClickedRegister",true);
		 
	}
		@GetMapping("/myCart")	
		
		public ModelAndView cart()
		
			{
				ModelAndView mv=new ModelAndView("home");
				return mv.addObject("isUserClickedCart",true);
			 
		}
	
}