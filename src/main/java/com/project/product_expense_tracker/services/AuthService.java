package com.project.product_expense_tracker.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.project.product_expense_tracker.exceptions.EmptyFieldException;
import com.project.product_expense_tracker.exceptions.InvalidEmailException;
import com.project.product_expense_tracker.exceptions.InvalidPassswordException;
import com.project.product_expense_tracker.models.User;

public class AuthService {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);
	public User validateUserData(String userName, String userPassword, String userEmail) throws EmptyFieldException {
		if(userName==null || "".equals(userName) ||userPassword==null ||"".equals(userPassword)||userEmail==null ||"".equals(userEmail))
			throw new EmptyFieldException("username, userpassword or useremail cannot be empty");
		try {
			if(!isValidEmail(userEmail))
				throw new InvalidEmailException("Email is in invalid format");
			if(!isValidPassword(userPassword))
				throw new InvalidPassswordException("Password should have atleast 8 character, it should include atleast 1 uppercase ,1 lowercase, 1 digit , 1 special character no space is allowed ");
		}
		catch(InvalidEmailException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidPassswordException e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	//Method for email validation
	public static boolean isValidEmail(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
	
	//Method for password validation
	public static boolean isValidPassword(String password)
	{
		Matcher matcher=PASSWORD_PATTERN.matcher(password);
		return matcher.matches();
	}

}
