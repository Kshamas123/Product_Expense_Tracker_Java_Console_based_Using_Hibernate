package com.project.product_expense_tracker;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Welcome to Expense Tracker!");
        showAuthenticationMenu(sc);
    }

    private static void showAuthenticationMenu(Scanner sc) {
    	while(true)
    	{
    		System.out.println("Choose 1 for LOGIN");
        	System.out.println("Choose 2 for SIGNUP");
        	System.out.println("Choose 0 for CLOSE");
    	  int menuOption=Helper.menuReader(sc);
    	  switch(menuOption)
    	  {
    	  case 1:System.out.println("Login feature coming soon");
    	         break;
    	  case 2:ObjectManager.getAuthController().signUp(sc);
    	         break;
    	  case 0:
              System.out.println("Closing the Application");
              return;
    	  default:System.out.println("Invalid option entry");
    	    break;
    	  }
    	}
    }

}
