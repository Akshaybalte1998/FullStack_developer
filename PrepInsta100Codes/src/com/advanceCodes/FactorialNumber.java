package com.advanceCodes;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the  number to find factorial of that number :  ");
		int number=scan.nextInt();
		int fact=1 ;

		for(int i=1;i<=number;i++)
		{
			fact*=i;
		}
		System.out.println("factorial of "+number +" is : "+fact);

	}

}
