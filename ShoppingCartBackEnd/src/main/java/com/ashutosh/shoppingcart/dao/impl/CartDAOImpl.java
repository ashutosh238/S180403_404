package com.ashutosh.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.ashutosh.shoppingcart.dao.CartDAO;
import com.ashutosh.shoppingcart.domain.Cart;

public class CartDAOImpl implements CartDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public boolean save(Cart cart) {
		try {
			sessionFactory.getCurrentSession().save(cart);
			return true;
		} catch (HibernateException e) {
			 
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(Cart cart) {
		try {
			sessionFactory.getCurrentSession().update(cart);
			return true;
		} catch (HibernateException e) {
			 
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(int id) {
		try {
			sessionFactory.getCurrentSession().delete(id+"", Cart.class);
			return true;
		} catch (HibernateException e) {
			 
			e.printStackTrace();
			return false;
		}
	}

	public List<Cart> list(String emailID) {

		 

		return sessionFactory.getCurrentSession().createCriteria(Cart.class).add(Restrictions.eq("emailID", emailID))
				.add(Restrictions.eq("status", "N")).list();

	}

}