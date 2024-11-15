package utility;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Customer;
import entity.ServicePlan;
import exceptions.EmailDuplicateException;
import exceptions.EmailFormatException;
import exceptions.LoginFailedException;
import exceptions.PlanAmountMismatchException;
import exceptions.PlanNotFoundException;
import validation.Validations;

public class Utility {
	
	public static void addCustomer(ArrayList<Customer>list) throws EmailDuplicateException, PlanNotFoundException, PlanAmountMismatchException, EmailFormatException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first name ");
		String fname = sc.next();
		System.out.println("Enter your last name ");
		String lname = sc.next();
		System.out.println("Enter your email ");
		String email = sc.next();
		System.out.println("Enter your password ");
		String password = sc.next();
		System.out.println("Enter your dob ");
		String dob = sc.next();
		System.out.println("Enter your plan name 	SILVER(1000) \r\n"
				+ "	,GOLD(2000)\r\n"
				+ "	,DIAMOND(5000)\r\n"
				+ "	,PLATINUM(10000);");
		String plan = sc.next();
		System.out.println("Enter your registration amount ");
		double amount = sc.nextDouble();
		
		int id = Customer.getCounter()+1000;
		Customer customer = validateCustomer(id,fname,lname,email,password,dob,plan,amount,list);
		list.add(customer);
				
	}
	
	public static Customer validateCustomer(int id,
			String fname,String lname,String email,String password,
			String dob,String plan,double amount,ArrayList<Customer>list) throws EmailDuplicateException, PlanNotFoundException, PlanAmountMismatchException, EmailFormatException {
		Validations.checkEmailUniquenessAndEnding(email,list);
		ServicePlan planName =Validations.planAvailabilty(plan,list);
		Validations.checkPriceOfPlan(planName,amount);
		LocalDate dateOfBirth = LocalDate.parse(dob);
		Customer customer = new Customer(id,fname,lname,amount,dateOfBirth,planName,email,password);
		return customer;
	}

	public static void signUp(String email, String password,ArrayList<Customer>list) throws LoginFailedException {
		boolean flag = false;
		for(Customer c : list) {
			String email1 = c.getEmail();
			String password1 = c.getPassword();
			if(email1.equals(email) && password1.equals(password)) {
				System.out.println("Login Succesfully");
				flag = true;
				break;
			}
		}
		if(flag==false) {
			throw new LoginFailedException("Incorrect email or password");
		}
		
	}

	public static void changePassword(String oldemail,String oldPassword, String newpassword, ArrayList<Customer> list) {
		boolean flag = false;
		for(Customer c : list) {
			String email1 = c.getEmail();
			String password1 = c.getPassword();
			if(email1.equals(oldemail) && password1.equals(oldPassword)) {
				c.setPassword(newpassword);
				System.out.println("Password changed to "+ newpassword);
				flag = true;
				break;
			}
		}
	}

	public static void removeCustomer(String email, ArrayList<Customer> list) {
	   	
		boolean flag = false;
		for(Customer c : list) {
			String emailFromList = c.getEmail();
			if(emailFromList.equals(email)) {
				list.remove(c);
				System.out.println("Customer removed!!");
				flag=true;
				return;
			}
		}
		if(flag==false) {
			System.out.println("Customer not found!!!");
		}	
	}
	
   public static void displayAllCustomer(ArrayList<Customer> list) {
		for(Customer c : list) {
		   System.out.println(c);
		}
	}

}
