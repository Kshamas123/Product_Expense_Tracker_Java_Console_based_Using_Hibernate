package com.project.product_expense_tracker.controllers;

import java.util.Scanner;

import com.project.product_expense_tracker.Helper;
import com.project.product_expense_tracker.models.User;
import com.project.product_expense_tracker.services.AuthService;

public class AuthController {
	private AuthService authService;
	
    public AuthController(AuthService authService) {
		this.authService = authService;
	}

	public User signUp(Scanner sc)
    {
    	while(true)
    	{
    		System.out.println("Enter your Username");
    		String userName=sc.nextLine();
    		System.out.println("Enter your Password");
    		String userPassword=sc.nextLine();
    		System.out.println("Enter your Email");
    		String userEmail=sc.nextLine();
    		User user=authService.validateUserData(userName,userPassword,userEmail);
    		if(user != null)
    		{
    			System.out.println("User created SUCCESSFULLY");
    			return user;
    		}
    		else
    		{
    		  if(!Helper.promptToContinue(sc))
    			 break; 
    		}
    	}
    	return null;
    }
}
