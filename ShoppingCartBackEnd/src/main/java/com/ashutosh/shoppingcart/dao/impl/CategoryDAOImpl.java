package com.ashutosh.shoppingcart.dao.impl;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashutosh.shoppingcart.dao.CategoryDAO;
import com.ashutosh.shoppingcart.domain.Category;


//@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl  implements CategoryDAO{
	
	
	 
	@Autowired
	private SessionFactory sessionFactory;

	public boolean save(Category category) {
		try {
			 
			category.setAdded_date(new Date(System.currentTimeMillis()));
			sessionFactory.getCurrentSession().save(category);
			return true;
		} catch (HibernateException e) {
			 
			e.printStackTrace();
			return false;
		}
		
		
	}

	public boolean update(Category category) {

		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	
		
	}

	public boolean delete(String name) {

		try {
			 
			Category category = get(name);
			if(category==null)
			{
				return false;
			}
			
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} catch (HibernateException e) {
			 
			e.printStackTrace();
			return false;
		}
		
		
	
		
	}

	public Category get(String name) {
		
	return	(Category) sessionFactory.getCurrentSession().get(Category.class,name);
		
	}

	public List<Category> list() {
		
	return	sessionFactory.getCurrentSession().createQuery("from Category").list();
		
	}

}

