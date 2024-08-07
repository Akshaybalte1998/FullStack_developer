package com.simpleCodes;

import java.util.Scanner;

public class PostiveNeagativeNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to check number is postive or neagtive ot zero ");
		int number=scan.nextInt();
		
		//brute force
		
		if(number>0)
			System.out.println("Number is positive number : "+number);
		else if(number<0)
			System.out.println("Number is negative number"+number);
		else
			System.out.println("zero");

		
	}

}
