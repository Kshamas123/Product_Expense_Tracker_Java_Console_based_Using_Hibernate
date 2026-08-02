package com.project.product_expense_tracker.exceptions;

public class InvalidEmailException extends Exception{
    public InvalidEmailException(String message)
    {
    	super(message);
    }
}
