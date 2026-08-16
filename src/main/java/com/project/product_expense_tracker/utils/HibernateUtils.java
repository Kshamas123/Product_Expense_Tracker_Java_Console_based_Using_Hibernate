package com.project.product_expense_tracker.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static final SessionFactory sessionFactory;
	
    private HibernateUtils() {
    	
    }
    
    static {
    	Configuration cfg=new Configuration();
    	cfg.setProperty(
    		    "hibernate.connection.url",
    		    System.getenv("DB_URL")
    		);
    	
    	cfg.setProperty(
    		    "hibernate.connection.username",
    		    System.getenv("DB_USERNAME")
    		);

    		cfg.setProperty(
    		    "hibernate.connection.password",
    		    System.getenv("DB_PASSWORD")
    		);
    	cfg.addAnnotatedClass(com.project.product_expense_tracker.models.User.class);
    	
    	
    	sessionFactory=cfg.buildSessionFactory();
    }
    
    public static SessionFactory getSessionFactoryObject()
    {
    	return sessionFactory;
    }
    
    
}
