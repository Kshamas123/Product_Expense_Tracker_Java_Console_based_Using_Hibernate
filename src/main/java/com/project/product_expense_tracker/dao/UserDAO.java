package com.project.product_expense_tracker.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.project.product_expense_tracker.models.User;

public class UserDAO {
	
	public boolean existsByEmail(String userEmail,SessionFactory sessionFactory)
	{
		Session session=sessionFactory.openSession();
		
		String hql = "FROM User u WHERE u.userEmail = :userEmail";
		List<User> results = session.createQuery(hql, User.class)
		                                  .setParameter("userEmail", userEmail)
		                                  .getResultList();
		session.close();
		return results.isEmpty();
	}

	public UserDAO() {
	}
     
}
