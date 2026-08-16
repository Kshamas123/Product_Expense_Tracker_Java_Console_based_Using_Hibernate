package com.project.product_expense_tracker.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.product_expense_tracker.models.Budget;
import com.project.product_expense_tracker.models.Category;
import com.project.product_expense_tracker.models.TransactionTracker;
import com.project.product_expense_tracker.models.Wallet;

public class HibernateUtils {
	private static final SessionFactory sessionFactory;
	
    private HibernateUtils() {
    	
    }
    
    static {
    	Configuration cfg=new Configuration();
    	cfg.configure();
//    	

    	cfg.addAnnotatedClass(com.project.product_expense_tracker.models.User.class);
    	cfg.addAnnotatedClass(Category.class);
        cfg.addAnnotatedClass(Wallet.class);
        cfg.addAnnotatedClass(Budget.class);
        cfg.addAnnotatedClass(TransactionTracker.class);
    	
    	
    	sessionFactory=cfg.buildSessionFactory();
    }
    
    public static SessionFactory getSessionFactoryObject()
    {
    	return sessionFactory;
    }
    
    
}
