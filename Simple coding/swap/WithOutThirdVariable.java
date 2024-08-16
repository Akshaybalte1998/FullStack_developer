package com.swap;

import java.util.Scanner;

public class WithOutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner scan=new Scanner(System.in);

			System.out.println("enter the two number for swapping: ");
			int number1=scan.nextInt();
			int number2=scan.nextInt();
			
			System.out.println("before swapping :");
			System.out.println("number 1: "+number1);
			System.out.println("number 2: "+number2);
			number1=number1+number2;
			number2=number1-number2;
			number1=number1-number2;
			System.out.println("after swapping :");
			System.out.println("number 1: "+number1);
			System.out.println("number 2: "+number2);
	}

}
