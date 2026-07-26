package com.project.product_expense_tracker;

import com.project.product_expense_tracker.controllers.AuthController;
import com.project.product_expense_tracker.services.AuthService;

public class ObjectManager {
	private ObjectManager()
    {
    	
    }
    private static AuthService authService=new AuthService();
    private static AuthController authController=new AuthController(authService);
    public static AuthService getAuthService() {
		return authService;
	}
	public static AuthController getAuthController() {
		return authController;
	}
    
}
