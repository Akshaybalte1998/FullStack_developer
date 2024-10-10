package validation;

import java.util.ArrayList;

import entity.Customer;
import entity.ServicePlan;
import exceptions.EmailDuplicateException;
import exceptions.EmailFormatException;
import exceptions.PlanAmountMismatchException;
import exceptions.PlanNotFoundException;

public class Validations {
	
	public static void checkEmailUniquenessAndEnding(String email,ArrayList<Customer>list) throws EmailDuplicateException, EmailFormatException {
		 for(Customer c : list) {
			 if(c != null && c.getEmail() == email) {
				throw new EmailDuplicateException("Email is duplicate"); 
			 }
		 }
		 System.out.println("Email is unique");
		 
		 if(email.endsWith(".com") || email.endsWith(".org") || email.endsWith(".net")) {
			 System.out.println("Correct format of Email");
		 }else {
			 throw new EmailFormatException("Email format incorrect");
		 }
	}
	public static ServicePlan planAvailabilty(String plan,  ArrayList<Customer>list) throws PlanNotFoundException{
		try {
            // Convert input string to uppercase for case-insensitive comparison
            String upperCaseInput = plan.toUpperCase();
            // Use valueOf() method to get enum constant
            return ServicePlan.valueOf(upperCaseInput);
        } catch (IllegalArgumentException e ) {
            // Throw exception if enum constant not found
            throw new PlanNotFoundException("Invalid enum value: " + plan);
        }

		
		
		
	
	}
	public static void checkPriceOfPlan(ServicePlan planName,double amount ) throws PlanAmountMismatchException {
	         if(planName.getAmount()!=amount) {
	        	 throw new PlanAmountMismatchException("Plan Amount does not match");
	         }
	}

}
