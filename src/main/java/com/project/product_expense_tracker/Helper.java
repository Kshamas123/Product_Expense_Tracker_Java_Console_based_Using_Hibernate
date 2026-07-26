package com.project.product_expense_tracker;

import java.util.Scanner;

public class Helper {
 private Helper() {
   /* This utility class should not be instantiated */
 }

	public static int menuReader(Scanner sc)
	{
		while(true)
		{
			if(!sc.hasNextInt())
			{
				System.out.println("Invalid Input.Enter a Number");
				sc.next();
				continue;
			}
			int choice = sc.nextInt();
	        sc.nextLine();     

	        return choice;
		}
	}
	public static boolean promptToContinue(Scanner sc) {
        System.out.println("Press 1 to try again or 0 to exit:");
        while (true) {
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice == 1) return true;
                if (choice == 0) return false;
            } else {
                sc.next(); 
            }
            System.out.println("Please enter 1 or 0.");
        }
    }
}
