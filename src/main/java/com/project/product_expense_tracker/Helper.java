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
}
