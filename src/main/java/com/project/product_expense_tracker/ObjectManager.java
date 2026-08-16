package com.project.product_expense_tracker;

import org.hibernate.SessionFactory;

import com.project.product_expense_tracker.controllers.AuthController;
import com.project.product_expense_tracker.services.AuthService;
import com.project.product_expense_tracker.utils.HibernateUtils;

public class ObjectManager {
	private ObjectManager()
    {
    	
    }
	
	private static SessionFactory sessionFactory=HibernateUtils.getSessionFactoryObject();
    private static AuthService authService=new AuthService(sessionFactory);
    private static AuthController authController=new AuthController(authService);
    public static AuthService getAuthService() {
		return authService;
	}
	public static AuthController getAuthController() {
		return authController;
	}
    
}
