package com.ashutosh.shoppingcart.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

 
@Component    
@Table        
@Entity      
public class User {
	
	 
	
	@Id    //this is primary key
	private String emailID;
	
	
	 
	private String password;
	
	private String name;
	
	private String address;
	
	private String mobile;
	
	private Date  added_date;
	
	private Character role;

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getAdded_date() {
		return added_date;
	}

	public void setAdded_date(Date added_date) {
		this.added_date = added_date;
	}

	public Character getRole() {
		return role;
	}

	public void setRole(Character role) {
		this.role = role;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}





