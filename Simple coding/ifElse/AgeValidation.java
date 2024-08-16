package com.ifElse;

import java.util.Scanner;

public class AgeValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scan=new Scanner(System.in);
		  System.out.println("enter the age : ");
		  int age=scan.nextInt();
		if(age>=18)
			System.out.println("yes! you are eligible for vote");
		else
			System.out.println("no ! you are not  eligible for vote");

		
	}

}
