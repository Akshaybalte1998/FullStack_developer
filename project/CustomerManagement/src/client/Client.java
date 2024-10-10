package client;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Customer;
import exceptions.EmailDuplicateException;
import exceptions.EmailFormatException;
import exceptions.LoginFailedException;
import exceptions.PlanAmountMismatchException;
import exceptions.PlanNotFoundException;
import utility.Utility;

public class Client {
       public static void main(String [] args) {
    	   Scanner sc = new Scanner(System.in);
    	   ArrayList<Customer> list = new ArrayList<>();
    	   boolean flag = true;
    	   while(flag) {
    		   System.out.println("Enter your choice \n 1. To add User"
    		   		+ " \n 2. To Login" + " \n 3. To Change Password" 
    				   + " \n 4. To Remove Customer" + " \n 5. To Display All Customer");
    		   int choice = sc.nextInt();
    		   switch (choice) {
			case 1:
				try {
					Utility.addCustomer(list);
				} catch (EmailDuplicateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (PlanAmountMismatchException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch (PlanNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (EmailFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			
			case 2:
				    System.out.println("Enter email: ");
				    String email = sc.next();
				    System.out.println("Enter password: ");
				    String password = sc.next();
				try {
					Utility.signUp(email,password,list);
				} catch (LoginFailedException e) {
					e.printStackTrace();
				}
                    break;
			case 3:
				 System.out.println("Enter email: ");
				    String oldemail = sc.next();
				    System.out.println("Enter old password: ");
				    String oldpassword = sc.next();
				    System.out.println("Enter new password: ");
				    String newpassword = sc.next();
				    try {
						Utility.signUp(oldemail,oldpassword,list);
						Utility.changePassword(oldemail,oldpassword,newpassword,list);
					} catch (LoginFailedException e) {
						e.printStackTrace();
					}
				    break;
			case 4:
				 System.out.println("Enter email: ");
				    String emailToRemove = sc.next();
				    Utility.removeCustomer(emailToRemove,list);
				    
				break;
				
			case 5:
				 Utility.displayAllCustomer(list);
				 break;
				    
			default:
				System.out.println("Exiting from app");
				flag = !flag;
				break;
			}
    	   }
       }
}
