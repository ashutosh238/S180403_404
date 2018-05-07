package com.ashutosh.shoppingcart.dao.impl;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashutosh.shoppingcart.dao.UserDAO;
import com.ashutosh.shoppingcart.domain.User;


@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	 
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private User user;

	public boolean save(User user) {
		 
		try {
			 
			user.setAdded_date(new Date(System.currentTimeMillis()));
			sessionFactory.getCurrentSession().save(user);
		} catch (Exception e) {
			 
			e.printStackTrace();
			return false;
		}
		 
		return true;
	}

	public boolean delete(String emailID) {
		try {
			user = get(emailID);
			if(user==null)
			{
				return false;
			}
			sessionFactory.getCurrentSession().delete(user);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	public boolean update(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
		} catch (HibernateException e) {
			 
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public User get(String emailID) {
		 
		
	return	(User) sessionFactory.getCurrentSession().get(User.class,emailID);
		
	}

	public List<User> list() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}


	public User validate(String mail, String pwd) {
		 
	return	(User) sessionFactory.getCurrentSession().createCriteria(User.class)
			.add(Restrictions.eq("emailID", mail))
			.add(Restrictions.eq("password", pwd)).uniqueResult();
		
	}

}



